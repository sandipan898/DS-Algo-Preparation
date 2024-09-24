package CoreJava.collections;

import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Collections;

public class HashSetPrac {
    public static void main(String[] args) {
        int[] arrPrem = new int[]{10, 54, 12, 34, 76, 21, 54, 78, 90, 19, 32, 54};
        Integer[] arrObj = new Integer[]{10, 54, 12, 34, 76, 21, 54, 78, 90, 19, 32, 54};
        String[] names = {"Sandipan", "Arjun", "Shayam", "Harsh", "Rahul", "Piyush", "Yamini"};
        Set<String> nameSet = new HashSet<>(Arrays.asList(names));
        // 1. Converting to HashSet
        // convertToHashSet(arrObj);

        // 2. Sort HashSet
        // sortHash(names);

        // 3. Sort Reverse Order
        // sortReverseSet(nameSet);

        // 4. Print HashSet Elements
        // displayHashSet(nameSet);
    }

    public static void convertToHashSet(Integer[] arr) {
        // Way 1:
        // Set<Integer> set = new HashSet<>(Arrays.asList(arr));

        // Way 2:
        // Set<Integer> set = new HashSet<>();
        // Collections.addAll(set, arr);

        // Way 3:
        // Set<Integer> set = new HashSet<>();
        // set = Arrays.stream(arr).collect(Collectors.toSet());

        // System.out.println(set);
    }

    public static void sortHash(String[] names) {
        // Way 1:
        // Set<String> set = new HashSet<>(Arrays.asList(names));
        // List<String> sortedNames = new ArrayList<>(set);        
        // Collections.sort(sortedNames);
        
        // Way 2:
        // Set<String> sortedNames = new TreeSet<>(Arrays.asList(names));

        // Way 3:
        Set<String> set = new HashSet<>(Arrays.asList(names));
        Set<String> sortedNames = new TreeSet<>((e1, e2) -> e1.compareTo(e2));
        sortedNames.addAll(set);

        System.out.println(sortedNames);
    }

    public static void sortReverseSet(Set<String> names) {
        // Way 1:
        // TreeSet<String> sortedNames = new TreeSet<>((e1, e2) -> e2.compareTo(e1));
        // sortedNames.addAll(names);

        // Way 2:
        // List<String> sortedNames = new ArrayList<>(names);
        // Collections.sort(sortedNames, (e1, e2) -> e2.compareTo(e1));

        // System.out.println(sortedNames);
    }

    public static void displayHashSet(Set<String> names) {
        // Way 1
        // names.stream().forEach(System.out::println);

        // Way 2
        // names.forEach(System.out::println);

        // Way 3:
        // for(String name : names) {
        //     System.out.println(name);
        // }

        // Way 4:
        Iterator<String> iterator = names.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
