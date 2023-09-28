package day_24_assignment;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

//Create a set calculator which takes 2 sets as input and the operation( in, not in, &,
//|, ^,
//<, <=, >, >=, ==, !=, etc) to be performed on the sets. Display the result.
public class set_Calculator {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the element for set1");
		Set<Integer> set1=readSet(sc);
		
		System.out.println("enter the element for set2");
		Set<Integer> set2=readSet(sc);
		
		System.out.println("enter the operation (&, |, ^, <, <=, >, >=, ==, !=): ");
		String operation=sc.next();
		
		switch(operation)
		{
		case "&" :
				set1.retainAll(set2);
				break;
		case "|" :
				set1.addAll(set2);
				break;
		case "^" :
				set1.removeAll(set2);
				break;
		case "<=" :
			 	System.out.println("set 1 is subset of 2"+ set1.containsAll(set2));
			 	break;
		case ">=" :
			System.out.println("set 2 is subset of 1"+set2.containsAll(set1));
			break;
		case "==":
			System.out.println("set 1 is equal to set2"+set1.equals(set2));
			break;
		case "!=":
			System.out.println("set 1 is not equal to set2"+!set1.equals(set2));
			break;
		default:
			System.out.println("invalid operations");
		}
		System.out.println("result"+set1);
		
	}
	private static Set<Integer> readSet(Scanner sc) {
		Set <Integer> set=new HashSet<>();
		String input=sc.next();
		String [] elements=input.split(",");
		for (String element : elements)
		{
			set.add(Integer.parseInt(element.trim()));
		}
		return set;
	}

}
