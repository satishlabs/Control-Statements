package com.satishlabs.demo12;
/*
 break is a keyword. 
 It can be used within switch or any looping statements. 
 It is used to terminate the execution of the current looping/switch statement. 
 break can be used in two ways: 
o break; 
o break <label>
 * */
public class Demo12 {
	public static void main(String as[]) {
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			break;
			//System.out.println("---Inside Loop---");
		}
		System.out.println("---Outside Loop---");
	}
}
