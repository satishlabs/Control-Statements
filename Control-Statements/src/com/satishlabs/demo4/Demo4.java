/**
 * 
 */
package com.satishlabs.demo4;

/**
 * @author Admin
 *
 */
public class Demo4 {
	public static void main(String[] args) {
		int a=10;
		int b=20;
		int c=15;
		int max=0;
		
		if(a>b && a>c)
			max =a;
		else if(b>a && b>c)
			max = b;
		else 
			max = c;
		
		System.out.println("Max is : "+max);
	}
}
