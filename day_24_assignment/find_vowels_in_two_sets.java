package day_24_assignment;

import java.util.HashSet;
import java.util.Set;

public class find_vowels_in_two_sets {

	public static void main(String[] args) {
	Set<Character> x=new HashSet<>();
	Set<Character> x1=new HashSet<>();
	x.add('a');
	x.add('e');
	x.add('i');
	x.add('o');
	x.add('u');
	
	x1.add('i');
	x1.add('o');
	x1.add('u');
	x1.add('y');
	
	Set<Character> find_vowels_in_two_sets=new HashSet<>(x);
	find_vowels_in_two_sets.retainAll(x1);
	System.out.println(find_vowels_in_two_sets);
	
	
	

	}

}
