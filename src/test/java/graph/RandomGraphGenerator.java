package graph;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class RandomGraphGenerator {

    public static class Node {
        public int id;
        public List<Bridge> bridges = new ArrayList<>();

        public Node(int id) {
            this.id = id;
        }
    }

    public static class Bridge {
        public Node node1;
        public Node node2;
        public int length;
        public String color;

        public Bridge(Node node1, Node node2, int length, String color) {
            this.node1 = node1;
            this.node2 = node2;
            this.length = length;
            this.color = color;
        }
    }

    public static List<Node> generateGraph() {
        Random random = new Random();
        int nodeCount = 10 + random.nextInt(6);  // Random number of nodes between 10 and 15
        List<Node> nodes = new ArrayList<>(nodeCount);
        for (int i = 0; i < nodeCount; i++) {
            nodes.add(new Node(i));
        }

        for (Node node : nodes) {
            int bridgeCount = 2 + random.nextInt(3);  // Random number of bridges between 2 and 4
            Set<String> usedColors = new HashSet<>();
            int totalLength = 0;

            for (int i = 0; i < bridgeCount && totalLength < 10; i++) {
                Node otherNode = findOtherNode(node, nodes, random, nodeCount);
                if (otherNode == null) break;  // Exit loop if no suitable other node found

                int remainingLength = 10 - totalLength;
                int bridgeLength = 1 + random.nextInt(Math.min(5, remainingLength));  // Random length between 1 and 5 or remaining length
                totalLength += bridgeLength;

                String color;
                do {
                    color = getRandomColor(random);
                } while (usedColors.contains(color) && usedColors.size() < 3);  // Ensuring at most 3 different colors are used

                usedColors.add(color);
                Bridge bridge = new Bridge(node, otherNode, bridgeLength, color);
                node.bridges.add(bridge);
                otherNode.bridges.add(bridge);  // Assuming bridges are bidirectional
            }
        }

        return nodes;
    }

    private static Node findOtherNode(Node node, List<Node> nodes, Random random, int nodeCount) {
        for (int attempts = 0; attempts < nodeCount; attempts++) {
            Node otherNode = nodes.get(random.nextInt(nodeCount));
            boolean isSuitable = otherNode != node && node.bridges.stream().noneMatch(b -> b.node2 == otherNode);
            if (isSuitable) {
                return otherNode;
            }
        }
        return null;  // Return null if no suitable other node found after all attempts
    }

    private static String getRandomColor(Random random) {
        switch (random.nextInt(4)) {
            case 0: return "white";
            case 1: return "green";
            case 2: return "red";
            default: return "black";
        }
    }

    public static void main(String[] args) {
        List<Node> graph = generateGraph();
        // TODO: Visualize the graph using the GraphVisualizer class
    }
}
