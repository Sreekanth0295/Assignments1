package assignments;

public class Arrays {

	public static void main(String[] args) {
	String [][][] semester = {
			{
			//	semester 1 & Marks
				{"Mathematics 1", "78"},
				{"Physics", "85"},
				{"Chemistry", "74"},
				{"Computer programming", "74"},
				{"Engineering Drawing","88"},
				{"Basic Electrical eng.","79"},
			},
			
			{
				
				//semester 2 & Marks
				{"Mathematics 2", "82"},
				{"Mechnaics ", "77"},
				{"Environmental sci.", "93"},
				{"Basic Electronics","69"},
				{"Engineering physics", "84"},
				{"Engineering graphics", "90"},
				
			},
			
			
			{
				//semester 3 & Marks
		    	{"Data structures", "88"},
			    {"Discrete mathematics","81"},
		    	{"Digital economics","76"},
			    {"Operating systems","92"},
		    	{"Signals and systems","85"},
		    	{"Object oriented program","78"},
			},
			
			{
		    	
			//	semester 4 & Marks		    
				{"Algorithms", "91"},
		    	{"Computer networks", "73"},
		    	{"Database systems", "89"},
		    	{"Microprocessors", "80"},
		    	{"Communication Eng.", "76"},
		    	{"Software Enginnering", "87"},
			},
			
			
			{
			// semester 5 & Marks
		    	{"Probability & Stats", "86"},
		    	{"Machine learning", "88"},
		    	{"Compiler design", "84"},
		    	{"Theory of applications", "95"},
		    	{"Embedded systems", "73"},
		    	{"Computer graphics", "90"},
			},
			
	};
	
	System.out.println("semester 3 - subject 4 Name and Subject 5 Names : "+semester [2][3][0]+", "+semester [2][4][0]);
	System.out.println("semester 5 - subject 3 and Subject 6 marks : "+semester [4][2][1]+", "+semester [4][5][1]);
	}
	};
			
			
	

