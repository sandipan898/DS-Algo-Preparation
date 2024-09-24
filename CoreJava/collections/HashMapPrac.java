package CoreJava.collections;

import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.HashMap;
import java.util.Set;
import java.util.Iterator;
import java.util.Collections;
import java.util.TreeMap;

public class HashMapPrac {
    public static void main(String[] args) {
        Map<String, Integer> marks = new HashMap<>();
        marks.put("Rahul", 89);
        marks.put("Sandipan", 95);
        marks.put("Harsh", 78);
        marks.put("Sunil", 66);
        marks.put("Rakesh", 71);
        marks.put("Ramesh", 55);

        // 1. Iterate HashMap
        // iterateHashMap(marks);

        // 2. Check if a Key exists in a HashMap
        // checkKey(marks, "Sandipan");
        // checkKey(marks, "Suresh");

        // 3. Find the Occurrence of characters in a String
        // findCharOccurance("Alice is girl and Bob is boy");
        // findWordOccurance("Alice is girl and Bob is boy");

        // 4. Copy One HashMap to Another HashMap
        // copyHashMap(marks);

        // 5. Print all Duplicate characters in a String
        // printDuplicateChar("geeksforgeeks");

        // 6. Convert HashMap to TreeMap
        convertToTreeMap(marks);
    }

    public static void iterateHashMap(Map<String, Integer> map) {
        // Way 1:
        // Set<String> keys = map.keySet(); // var keys = map.keySet();
        // for(String key : keys) {
        //     System.out.println("Marks of " + key + " : " + map.get(key));
        // }

        // Way 2:
        // map.forEach((k, v) -> System.out.println("Marks of " + k + " : " + v));
        
        // Way 3:
        // map.entrySet().forEach((e) -> System.out.println("Marks of " + e.getKey() + " : " + e.getValue()));

        // Way 4:
        Set<Entry<String, Integer>> entries = map.entrySet(); // var entries = map.entrySet();
        Iterator<Entry<String, Integer>> mapIt = entries.iterator();// var mapIt = entries.iterator();

        while(mapIt.hasNext()) {
            Entry<String, Integer> entry = mapIt.next();
            System.out.println("Marks of " + entry.getKey() + " : " + entry.getValue());
        }
    }

    public static void checkKey(Map<String, Integer> map, String key) {
        System.out.println("The key " + key + " is " + (map.containsKey(key) ? "Present" : "Not Present"));
    }

    public static void findCharOccurance(String sentance) {
        Map<Character, Integer> countMap = new HashMap<>();
        for(char c : sentance.toCharArray()) {
            if(countMap.containsKey(c)) {
                countMap.put(c, countMap.get(c)+1);
            } else if(c != ' ') {
                countMap.put(c, 1);
            }
        }
        System.out.println(countMap);
    }

    public static void findWordOccurance(String sentance) {
        Map<String, Integer> countMap = new HashMap<>();
        for(String s : sentance.split(" ")) {
            if(countMap.containsKey(s)) {
                countMap.put(s, countMap.get(s)+1);
            } else {
                countMap.put(s, 1);
            }
        }
        System.out.println(countMap);
    }

    public static void copyHashMap(Map<String, Integer> map) {
        // Way 1
        // Map<String, Integer> copyMap = new HashMap<>();
        // copyMap.putAll(map);

        // Way 2
        // Map<String, Integer> copyMap = new HashMap<>(map);

        // Way 3
        // Map<String, Integer> copyMap = map;

        // System.out.println(copyMap);
    }

    public static void printDuplicateChar(String word) {
        var countMap = new HashMap<Character, Integer>();
        for(char c : word.toCharArray()) {
            if(countMap.containsKey(c)) {
                countMap.put(c, countMap.get(c)+1);
            } else {
                countMap.put(c, 1);
            }
        }
        countMap.forEach((k, v) -> {
            if(v > 1) System.out.println(k + " : " + v);
        });
    }

    public static void convertToTreeMap(Map<String, Integer> map) {
        // Way 1
        // Map<String, Integer> treeMap = new TreeMap<>(map);
        
        // Way 2
        // Map<String, Integer> treeMap = new TreeMap<>();
        // treeMap.putAll(map);

        // Way 3
        // Map<String, Integer> treeMap = map
        //                     .entrySet()
        //                     .stream()
        //                     // .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (oldValue, newValue) -> newValue, TreeMap::new));
        //                     .collect(Collectors.toMap(e -> e.getKey(), e -> e.getValue(), (oldValue, newValue) -> newValue, TreeMap::new));

        // System.out.println(treeMap);
    }
}
