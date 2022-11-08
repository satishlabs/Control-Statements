package com.satishlabs.demo13;
/*
 continue is a keyword. 
 It can be used within any looping statements. 
 It is used to continue the execution of the current looping statement with 
next iteration. 
 continue can be used in two ways: 
o continue; 
o continue <label>; 
 * */
public class Demo13 {
	public static void main(String as[]) {
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			continue;
			//System.out.println("---Inside Loop---");
		}
		System.out.println("---Outside Loop---");
	}
}