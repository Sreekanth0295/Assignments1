package com.creatio.crm.language.basics;

import java.util.logging.Logger;

public class Helloworld {

	public static void main(String[] args) {
		System.out.println("Hello world!");
		System.out.print("Hello ");
		System.out.println();
		System.out.print("world");
		System.out.println();
		System.out.printf("My Mame is %s and My Age is %d and My Visa Status is %b.%n","Sreekanth",30,true);

		System.out.format("pi values is approx %.2f",3.14159);
		System.out.println();
		
		Logger.getLogger("MyLogger").info("Currently I'm in line 18, Program is executing well");
	
		System.err.println("Getting error in line 20");
	}

}
