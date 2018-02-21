//CharacterLinkedList.java -- Adds 10 characters to a LinkedList, creates a second list and reverses the order of the first
//CSIS 312-B01

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class CharacterLinkedList
{
	public static void main(String[] args)
	{
		System.out.println("Luke Craven – Assignment #5-2\n");
		
		Random rand = new Random();
		rand.setSeed(System.currentTimeMillis());
		
		List<Character> list = new LinkedList<Character>();
		List<Character> reverseList = new LinkedList<Character>();
		reverseList = list;
		
		for(int i = 0; i < 10; i++)
			list.add((char)(rand.nextInt(26) + 'a'));
		
		System.out.println("List order:");
		System.out.println(Arrays.toString(list.toArray()));
		
		Collections.reverse(reverseList);
		
		System.out.println("\nReverse list order:");
		System.out.println(Arrays.toString(reverseList.toArray()));
	}
}