package alg;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FilterArrayElements {

    public static Set<String> processList(List<String> listContainingDuplicates) {
        final Set<String> resultSet = new HashSet<>();
        final Set<String> tempSet = new HashSet<>();
        for (String element : listContainingDuplicates) {
            if (!tempSet.add(element)) {
                resultSet.add(element);
            }
        }
        return resultSet;
    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        // Populate the list with numbers from 0 to 9.
        for (int i = 0; i < 10; i++) {
            list.add(String.valueOf(i));
        }
        // Insert a new set of numbers from 0 to 5.
        for (int i = 0; i < 5; i++) {
            list.add(String.valueOf(i));
        }

        Set<String> duplicates = processList(list);
        System.out.println("Duplicate elements are: " + duplicates);
    }
}
