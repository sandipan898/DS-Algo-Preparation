package CoreJava.collections;

import java.util.stream.Collectors;
import java.util.Collections;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Arrays;

public class ArrayListPrac {
	public static void main(String[] args) {
		String[] names = {"Sandipan", "Suresh", "Pritam", "Harsh", "Bikash"};
		String[] namesCom = {"Suresh", "Sandipan", "Pritam", "Harsh", "Bikash"};
		Integer[] arrObj = {10, 54, 12, 34, 76, 21, 54, 78, 90, 19, 32, 54};
		int[] arrPrem = {10, 54, 12, 34, 76, 21, 54, 78, 90, 19, 32, 54};

		Map<Integer, Character> map = new HashMap<>();
		char c = 'I';
		
		// 1. Convert a normal array to list
		// List<String> nameList = convertToList2(names);
		// System.out.println(nameList);
		
		// 2. making a list unmodifiable
		// nameList.add("Anil");
		// System.out.println(nameList);
		// nameList = Collections.unmodifiableList(nameList);
		// nameList.remove("Pritam");

		// 3. Compare Elements in a Collection
		// printMinMax(arrObj);

		// 4. Add an Element in Java ArrayList
		// addElement(arrObj, 15);
		// addElementAtIndex(arrObj, 15, 5);

		// 5. Remove a Specific Element From a Collection
		// removeElementByValue(arrObj, 19);
		// removeElementByIndex(arrObj, 4);

		// 6. Replace an Element
		// replaceElementByIndex(arrObj, 4, 44);
		// replaceElementByValue(arrPrem, 54, 5);

		// 7. Comparing two ArrayList
		// compareArrayList(names, namesCom);

	}
	
	public static List<String> convertToList1(String[] arr) {
		List<String> list = new ArrayList<>();
		Collections.addAll(list, arr);
		return list;
	}

	public static List<String> convertToList2(String[] arr) {
		return new ArrayList<>(Arrays.asList(arr));
	}

	public static void printMinMax(Integer[] arr) {
		List<Integer> nums = new ArrayList<>();
		Collections.addAll(nums, arr);
		System.out.println(nums);
		int max = nums.stream().max((e1, e2) -> e1-e2).orElse(-1);
		int min = nums.stream().min((e1, e2) -> e1-e2).orElse(-1);
		System.out.println("Maximum value: " + max);
		System.out.println("Minimum value: " + min);
	}

	public static void removeElementByValue(Integer[] arr, int num) {
		List<Integer> nums = new ArrayList<>();
		Collections.addAll(nums, arr);
		System.out.println(nums);

		// nums.remove(new Integer(num)); // Remove by value 
		nums.removeIf(n -> n == num); // Can remove by value also
		
		System.out.println(nums);
	}

	public static void removeElementByIndex(Integer[] arr, int index) {
		List<Integer> nums = new ArrayList<>();
		Collections.addAll(nums, arr);
		System.out.println(nums);

		nums.remove(index); // Only removes by index
		
		System.out.println(nums);
	}

	public static void addElement(Integer[] arr, int val) {
		List<Integer> nums = Arrays.stream(arr).collect(Collectors.toList());
		System.out.println(nums);
		nums.add(val);
		System.out.println(nums);
	}

	public static void addElementAtIndex(Integer[] arr, int val, int index) {
		List<Integer> nums = Arrays.stream(arr).collect(Collectors.toList());
		System.out.println(nums);
		nums.add(index, val);
		System.out.println(nums);
	}

	public static void replaceElementByIndex(Integer[] arr, int index, int val) {
		List<Integer> nums = Arrays.stream(arr).collect(Collectors.toList());
		System.out.println(nums);
		nums.set(index, val);
		System.out.println(nums);
	}

	public static void replaceElementByValue(int[] arr, int replacable, int replacement) {
		List<Integer> nums = new ArrayList<>();
		for(int n : arr) {
			nums.add(n);
		}
		System.out.println(nums);
		nums.replaceAll(n -> n == replacable ? replacement : n);
		// nums = nums.stream().map(n -> n == replacable ? replacement : n).collect(Collectors.toList());
		System.out.println(nums);
	}

	public static void compareArrayList(String [] arr1, String[] arr2) {
		List<String> names1 = convertToList1(arr1);
		List<String> names2 = convertToList1(arr2);
		System.out.println("The lists are " + (names1.equals(names2) ? "Equal" : "Not Equal"));
	}
}