import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class CharacterLinkedList
{
	public static void main(String[] args)
	{
		Random rand = new Random();
		rand.setSeed(System.currentTimeMillis());
		
		List<Character> list = new ArrayList<Character>();
		List<Character> reverseList = new ArrayList<Character>();
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