package day_24_assignment;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
public class string_array_of_the_banned_words
{
	 public static String mostCommonWord(String pa, String[] banned) 
	 {
	        Set<String> set1 = new HashSet<>(Arrays.asList(banned));
	        pa = pa.replaceAll("[^a-zA-Z ]", "").toLowerCase();
	        String[] words = pa.split("\\s+");
	        Map<String, Integer> wofrequency = new HashMap<>();
	        
	        for (String word : words) 
	        {
	            if (!set1.contains(word)) 
	            {
	                wofrequency.put(word, wofrequency.getOrDefault(word, 0) + 1);
	            }
	        }
	        return Collections.max(wofrequency.entrySet(), Map.Entry.comparingByValue()).getKey();
	    }
	    public static void main(String[] args) {
	        String pa = "Bob hit a ball, the hit BALL flew far after it was hit.";
	        String[] banned = {"hit"};
	        System.out.println(mostCommonWord(pa, banned)); 
	    }
}