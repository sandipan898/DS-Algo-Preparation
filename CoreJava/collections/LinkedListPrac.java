package CoreJava.collections;

import java.util.List;
import java.util.LinkedList;
import java.util.Iterator;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.Set;
import java.util.LinkedHashSet;
import java.util.Collections;
import java.util.ArrayList;

public class LinkedListPrac {
    public static void main(String[] args) {
        List<Integer> linkedList = new LinkedList<>(Arrays.asList(1, 2, 5, 4, 7, 2, 6, 3, 8, 2, 10));

        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 5, 4, 7, 2, 6, 3, 8, 2, 10));

        Integer[] arr = new Integer[]{1, 2, 5, 4, 7, 2, 6, 3, 8, 2, 10};

        // 1. Iterate LinkedList
        // iterateArray(linkedList);

        // 2. Convert to Set
        // convertToSet(linkedList);

        // 3. Convert ArrayList to LinkedList
        // convertFromArrayList(list);

        // 4. Convert Array to LinkedList
        convertFromArray(arr);

    }

    public static void iterateArray(List<Integer> list) {
        Iterator<Integer> it = list.iterator();

        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }

    public static void convertToSet(List<Integer> list) {
        // 1. Method first
        // Set<Integer> set = new LinkedHashSet<>();
        // set = list.stream().collect(Collectors.toSet());

        // 2. Method second
        // Set<Integer> set = new LinkedHashSet<>(list);
        
        // 3. Method third
        // Set<Integer> set = new LinkedHashSet<>();
        // set.addAll(list);

        // 4. Method fourth
        // var set = Set.copyOf(list);

        // System.out.println("Set: " + set);
    }

    public static void convertFromArrayList(List<Integer> list) {
        // Way 1
        // List<Integer> linkedList = new LinkedList<>(list);

        // Way 2
        // List<Integer> linkedList = new LinkedList<>();
        // linkedList.addAll(list);

        // Way 3
        // List<Integer> linkedList = list.stream().collect(Collectors.toCollection(LinkedList::new));

        // System.out.println(linkedList);
    }

    public static void convertFromArray(Integer[] arr) {
        // Way 1
        // List<Integer> linkedList = new LinkedList<>(Arrays.asList(arr));
        
        // Way 2
        // List<Integer> linkedList = new LinkedList<>();
        // Collections.addAll(linkedList, arr);

        // System.out.println(linkedList);
    }

    
}
