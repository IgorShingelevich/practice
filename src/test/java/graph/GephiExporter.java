package graph;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class GephiExporter {

    public static void exportToGEXF(List<RandomGraphGenerator.Node> nodes, String fileName) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n");
            writer.write("<gexf xmlns=\"http://www.gexf.net/1.2draft\" version=\"1.2\">\n");
            writer.write("  <graph mode=\"static\" defaultedgetype=\"directed\">\n");
            writer.write("    <nodes>\n");
            for (RandomGraphGenerator.Node node : nodes) {
                writer.write(String.format("      <node id=\"%d\" label=\"Node %d\" />\n", node.id, node.id));
            }
            writer.write("    </nodes>\n");
            writer.write("    <edges>\n");
            int edgeId = 0;
            for (RandomGraphGenerator.Node node : nodes) {
                for (RandomGraphGenerator.Bridge bridge : node.bridges) {
                    writer.write(String.format("      <edge id=\"%d\" source=\"%d\" target=\"%d\" weight=\"%d\" />\n",
                            edgeId++, node.id, bridge.node2.id, bridge.length));
                }
            }
            writer.write("    </edges>\n");
            writer.write("  </graph>\n");
            writer.write("</gexf>\n");
        }
    }

    public static void main(String[] args) throws IOException {
        List<RandomGraphGenerator.Node> graph = RandomGraphGenerator.generateGraph();
        exportToGEXF(graph, "graph.gexf");
    }
}
