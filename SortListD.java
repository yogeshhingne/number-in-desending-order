package SortListInDecending;

import java.util.*;
import java.util.stream.Collectors;

public class SortListD {
	public static void main(String args[]) {
		List<Integer> numbers=Arrays.asList(1,12,23,77,2,100);
		System.out.println("unsorted list : "+numbers);
		List<Integer> sortedList=numbers.stream().sorted((i1,i2)->-i1.compareTo(i2)).collect(Collectors.toList());
		System.out.println("number in desending order : "+sortedList);
	}

}
