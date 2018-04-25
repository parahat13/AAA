package List.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListExample {
	
	public static void main(String[] args) {
		//Test
		
		List<String> list= new ArrayList<>();
		list.add("water");
		list.add("coffee");
		list.add("bottle");
		list.add("cup");
		list.add("APPLE");
		list.add("ORANGE");
		
		list.add("water");
		list.add("coffee");
		list.add("bottle");
		list.add("cup");
		list.add("APPLE");
		list.add("ORANGE");
		
		
		
		System.out.println(list.indexOf("coffee"));
		
		
		String[] array=list.toArray(new String[4]);
		Arrays.sort(array);
		System.out.println(Arrays.binarySearch(array, "bottle"));
		
		List<List<Integer>> lis= new ArrayList<>();
		
		list.clear();
		
		String[] array=list.toArray(new String[4]);
		Arrays.sort(array);
		System.out.println(Arrays.binarySearch(array, "bottle"));
		
		List<List<Integer>> lis= new ArrayList<>();
		
		list.clear();
		
		
		
		
		
	}

}
