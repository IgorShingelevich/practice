package frameworkCollections;

import java.util.ArrayList;
import java.util.List;

public class ListExample {

    public static void main(String[] args) {
        // Create a new ArrayList
        List<String> list = new ArrayList<>();

        // 1. add(E element) - Appends the element at the end of the list
        list.add("apple");
        list.add("banana");
        list.add("cherry");

        // 2. add(int index, E element) - Inserts the element at the specified position
        list.add(1, "avocado");

        // 3. get(int index) - Retrieves the element at the specified position
        String fruit = list.get(2);
        System.out.println("Fruit at index 2: " + fruit);  // Output: Fruit at index 2: banana

        // 4. set(int index, E element) - Replaces the element at the specified position
        list.set(2, "blueberry");

        // 5. remove(int index) - Removes the element at the specified position
        String removedFruit = list.remove(0);
        System.out.println("Removed fruit: " + removedFruit);  // Output: Removed fruit: apple

        // 6. contains(Object o) - Returns true if the list contains the specified element
        boolean hasCherry = list.contains("cherry");
        System.out.println("Contains cherry: " + hasCherry);  // Output: Contains cherry: true

        // 7. size() - Returns the number of elements in the list
        int size = list.size();
        System.out.println("Size: " + size);  // Output: Size: 3

        // 8. isEmpty() - Returns true if the list is empty
        boolean isEmpty = list.isEmpty();
        System.out.println("Is empty: " + isEmpty);  // Output: Is empty: false

        // 9. clear() - Removes all elements from the list
        list.clear();
        System.out.println("Size after clear: " + list.size());  // Output: Size after clear: 0
    }
}
