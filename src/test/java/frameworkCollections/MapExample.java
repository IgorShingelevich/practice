package frameworkCollections;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

    public static void main(String[] args) {
        // Create a new HashMap
        Map<String, Integer> map = new HashMap<>();

        // 1. put(K key, V value) - Insert a key-value pair into the map
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);

        // 2. get(Object key) - Retrieve the value associated with a key
        int valueOne = map.get("one");
        System.out.println("Value for key 'one': " + valueOne);  // Output: Value for key 'one': 1

        // 3. remove(Object key) - Remove the entry for the specified key and return the removed value
        int removedValue = map.remove("two");
        System.out.println("Removed value: " + removedValue);  // Output: Removed value: 2

        // 4. containsKey(Object key) - Check if a key exists in the map
        boolean containsTwo = map.containsKey("two");
        System.out.println("Contains key 'two': " + containsTwo);  // Output: Contains key 'two': false

        // 5. containsValue(Object value) - Check if a value exists in the map
        boolean containsValueThree = map.containsValue(3);
        System.out.println("Contains value 3: " + containsValueThree);  // Output: Contains value 3: true

        // 6. size() - Return the number of key-value mappings in the map
        int size = map.size();
        System.out.println("Size: " + size);  // Output: Size: 2

        // 7. isEmpty() - Check if the map is empty
        boolean isEmpty = map.isEmpty();
        System.out.println("Is empty: " + isEmpty);  // Output: Is empty: false

        // 8. clear() - Remove all mappings from the map
        map.clear();
        System.out.println("Size after clear: " + map.size());  // Output: Size after clear: 0
    }
}
