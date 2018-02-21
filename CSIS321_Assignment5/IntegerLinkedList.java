//IntegerLinkedList.java -- Inserts 25 random integers into a LinkedList, sorts them, sums them, and calculates the average
//CSIS 312-B01

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;

public class IntegerLinkedList
{
	public static void main(String[] args)
	{
		System.out.println("Luke Craven – Assignment #5-1\n");
		
		int sumOfList = 0;
		
		Random rand = new Random();
		rand.setSeed(System.currentTimeMillis());
		
		List<Integer> list = new LinkedList<Integer>();
		
		for(int i = 0; i < 25; i++)
			list.add(rand.nextInt(101));
		
		System.out.println("Unsorted list of integers:");
		System.out.println(Arrays.toString(list.toArray()));
		
		Collections.sort(list);
		
		System.out.println("\nSorted list of integers:");
		System.out.println(Arrays.toString(list.toArray()));
		
		for(ListIterator<Integer> iter = list.listIterator(); iter.hasNext();)
		{
			sumOfList += iter.next();
		}
		
		System.out.println("\nSum of the list: " + sumOfList);
		
		System.out.println("\nFloating-point average of elements: " + (float)sumOfList/25);
	}
}