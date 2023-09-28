package day_24_assignment;


import java.util.HashSet;
import java.util.Set;

public class finding_union_intersection_difference {

	public static void main(String[] args) {
		Set<Integer>set1=new HashSet<>();
		for(int i=5;i<30;i+=5)
		{
			set1.add(i);
		}
		
		Set<Integer>set2=new HashSet<>();
		for(int i=3;i<20;i+=3)
		{
			set2.add(i);
		}
		
		Set<Integer> union=new HashSet<>(set1);
		union.addAll(set2);
		System.out.println("the union is: "+union);
		System.out.println("the size of union is: "+union.size());
		
		Set<Integer> intersection=new HashSet<>(set1);
		intersection.retainAll(set2);
		System.out.println("the intersection is: "+intersection);
		System.out.println("the intersection size is: "+intersection.size());
		
		Set<Integer> differnce=new HashSet<>(set1);
		differnce.removeAll(set2);
		System.out.println("the differnce is: "+differnce);
		System.out.println("the difference size is: "+differnce.size());
		
		
		
	}

}
