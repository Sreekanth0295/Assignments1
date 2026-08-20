package assignments;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Arraysandcollections {

	public static void main(String[] args) {
		
		//Arraylist
		List<String> topcountries = new ArrayList <String> ();
		topcountries.add ("India");
		topcountries.add("China");
		topcountries.add("Russia");
		topcountries.add("US");
		topcountries.add("US");
		System.out.println(topcountries.get(1));
		
		//Hash set
		Set<String> topTencities = new HashSet <String>();
		topTencities.add("Tirupati");
		topTencities.add("Hyderabad");
		topTencities.add("Banglore");
		topTencities.add("Mumbai");
		topTencities.add("Chennai");
		topTencities.add("Delhi");
		topTencities.add("Benaras");
		topTencities.add("Newyork");
		topTencities.add("London");
		topTencities.add("Paris");
		System.out.println(topTencities.size());
		
		//Hash map
		Map<String,Integer> CitiesinUspopulation = new HashMap <>();
		CitiesinUspopulation.put("New York", 8584629);
		CitiesinUspopulation.put("Los Angeles", 3869089);
		CitiesinUspopulation.put("Chicago", 2731585);
		CitiesinUspopulation.put("Houston", 2397315);
		CitiesinUspopulation.put("Phoenix",1665481);
		System.out.println(CitiesinUspopulation);
		
		int[] number = {1,2,3,4,5,6,7,8,9,10};
		System.out.println((+ number[2] + number[4]));
		
		List<String> top5movies = new ArrayList ();
		top5movies.add("Titanic");
		top5movies.add("Bahubali2");
		top5movies.add("Puspha2");
		top5movies.add("Dhurandar2");
		top5movies.add("Stree2");
    	System.out.println(top5movies.get(2));

		
	
		
	
		
		
		
		
		
		
		
		

	}

}
