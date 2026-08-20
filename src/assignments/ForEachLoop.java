package assignments;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ForEachLoop {

	public static void main(String[] args) {
		int[] empIds = new int[3];
		empIds[0]=1234;
		empIds[1]=1235;
		empIds[2]=1236;
		
	//	System.out.println(empIds[0]);
	//	System.out.println(empIds[1]);
	//	System.out.println(empIds[2]);
		
//	//For Loop	
//	for (int i =0;i<empIds.length ;i++) {
//			System.out.println(empIds[i]);
		
//			//For Each Loop
     			for(int value : empIds) {
				System.out.println(value);
			}
		
		
		List<String> empNameArrayList = new ArrayList<String>();
		empNameArrayList.add("Sreekanth");
		empNameArrayList.add("Srujan");
		empNameArrayList.add("Charan");
		empNameArrayList.add("Honey");
		empNameArrayList.add("kathi");
		empNameArrayList.add(null);
		empNameArrayList.remove("Sreekanth");
		empNameArrayList.add(1,"Sadasiva");
	
//	for (int i = 0; i<empNameArrayList.size(); i++ ) {
//		System.out.println(empNameArrayList.get(i) );
		for(String value : empNameArrayList) {
			System.out.println(value);
	
	}
	
	    

   Set<String> empNameHashSet = new HashSet<String>();
      empNameHashSet.add("Sreekanth");
    empNameHashSet.add("Srujan");
    empNameHashSet.add("Charan");
    empNameHashSet.add("Honey");
    empNameHashSet.add("kathi");
    empNameHashSet.add(null);
    empNameHashSet.remove("Sreekanth");
    
//    for (int i = 0; i<empNameHashSet.size(); i++ ) {
//		System.out.println(empNameHashSet.get(i) );    
	
	
	
		
	

	}


}
    	   
  
       
















