package pack1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;



public class Lecture9Main {

	public static void main(String[] args) {
		
//		Obj<Integer> ob=new Obj<>(8);
//		
//		Obj<String> ob2=new Obj<>("Hello World!!!");
//		
//		ob.setSomeObj(100);
//		
//		int c=25+(Integer)ob.getSomeObj();
//		
//		System.out.println(c);
//		
//		Integer[] in= {5,38,56,89,2};
//		
//		String[] str= {"a","B","c"};
//		
//		String minStr=getMin(str);
//		
//		System.out.println(minStr);
//		
//		Integer min=getMin(in);
//		
//		System.out.println(min);
		
//		List<Integer> myList=new ArrayList<>();
//		
//		myList.add(8);
//		myList.add(9);
//		myList.add(11);
//		
//		myList.add(0, 10);
//		
//		System.out.println(myList);
//		System.out.println(myList.get(1));
////		myList.remove(1);
//		System.out.println(myList);
//		myList.set(0,99);
//		System.out.println(myList);
//		
//		List<Integer> smallList=myList.subList(0, 2);
//		
//		System.out.println(smallList);
//		
//		for (Integer integer : myList) {
//			System.out.println(integer);
//		}
//		
//		Collections.sort(myList);
//		System.out.println(myList);
//		
//		Iterator<Integer> it=myList.iterator();
//		System.out.println();
//		
//		for(;it.hasNext();) {
//			Integer temp=it.next();
//			
//			if(temp%2==0) {
//				it.remove();
//			}
//			
//			System.out.println(temp);
//		}
//
//		System.out.println(myList);
		
		Map<Integer,String> myMap=new HashMap<>();
		
		myMap.put(5, "Five");
		myMap.put(9, "nine");
		myMap.put(4, "Foure");
		
		System.out.println(myMap);
		
		String text=myMap.get(19);
		System.out.println(text);
		
		myMap.put(9, "NINE");
		
		System.out.println(myMap);
		
		Set<Integer> keySet=myMap.keySet();
		for (Integer integer : keySet) {
			System.out.println(integer+"->"+myMap.get(integer));
		}
		
		
//		myMap.forEach((key,value)->);
		
		Random rn=new Random();
		
		Integer[] arr=new Integer[100];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i]=rn.nextInt(10);
		}
		
		
		
		
		
	}
	
	public static Map<Integer,Integer> getStatistics(Integer[] arr2){
		
		Map<Integer, Integer> myMap=new HashMap<>();
				
		for (Integer integer : arr2) {
		
			int count=0;	
			
			if(myMap.containsKey(integer)) {
				
				myMap.put(integer, integer);
				
			}
			
			
			
		}
		return null;
		
	}
	public static <T extends Comparable<T>> T getMin(T[] arr) {
		T min=arr[0];
		
		for (int i = 0; i < arr.length; i++) {
			if(min.compareTo(arr[i])>0) {
				min=arr[i];
			}
		}
		
		
		return min;
		
	}

}
