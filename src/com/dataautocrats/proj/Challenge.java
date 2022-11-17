package com.dataautocrats.proj;

import java.time.LocalTime;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Challenge {
	static String[] words = {"again","bought","catch","eight","island","black","white",
            "there","chips","rumble","robot","wizard","walk","lemon","ronaldo","charlie","romeo"
            +"girrafe","zebra"};			 //Words for use in the typing test

	static String[] easywords = {"cat","done","mad","full","go","eat","dog",
            "war","chip","toy","milk","joy","fox","easy","fish","hi","sun"
            +"fun","hug"};
	
	static String[] hardwords = {"excellent","neibhour","is","definitely","demolish","humble","dog",
            "exaggerate","magazine","grumpy","selfish","beautiful","schedule","conscience","restaurant","embarrass","appearance"
            +"pilgrimage","moustache"};
	
public static void chal(int n) throws InterruptedException {
	
//	if(n!=8 && n!=11 && n!=15) {				//A gate to make sure no numbers other than these nos. occur
//		System.out.println("internal error");
//		System.exit(0);
//	}
	
	Scanner scan = new Scanner(System.in);
	System.out.print("3");
	TimeUnit.SECONDS.sleep(1);
	
	System.out.print(" 2");
	TimeUnit.SECONDS.sleep(1);
	
	System.out.println(" 1");
	TimeUnit.SECONDS.sleep(1);
	

	
	Random rand = new Random(); 
	
	if(n==8 || n==11 || n==15) {
	for(int i = 0; i < n; i++ ) {		
	switch(n) {
		case 8: System.out.print(easywords[rand.nextInt(18)]+" ");	//rand.nextInt, gives any random integer from 0-18
				break;
		case 11: System.out.print(words[rand.nextInt(18)]+" ");
				 break;
		case 15: System.out.print(hardwords[rand.nextInt(18)]+" "); 
				 break;
			}
		}
	}
	/* Numbers 8,11 and 15 are the predefined number of words in the particular level
		numbers other than these 3 wont go inside switch statement
	*/
	else {
		for(int i=0;i<n;i++) {
			int r=rand.nextInt(2);
			switch (r) {
			case 0: System.out.print(easywords[rand.nextInt(18)]+" ");
					break;
			case 1: System.out.print(words[rand.nextInt(18)]+" ");
					break;
			case 2: System.out.print(hardwords[rand.nextInt(18)]+" "); 
					break;
			}
		}
	}
	//else block of code prints n random words from array

	System.out.println();

	System.out.println("TYPE!: ");
	
	
	double start = LocalTime.now().toNanoOfDay();

	String typedWords = scan.nextLine();
	
	double end = LocalTime.now().toNanoOfDay();
	double elapsedTime = end -start;
	double seconds = elapsedTime / 1000000000.0;
	int numChars = typedWords.length();
	
	int wpm = (int)((((double)numChars/5) / seconds) * 60);
	System.out.println("Your words per minute is: " + wpm + "!");
	scan.close();
	System.exit(1);

}
}
