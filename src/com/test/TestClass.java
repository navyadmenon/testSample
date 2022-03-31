package com.test;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class TestClass {
	
	public static void main(String args[]) {
		method1();
		
	}
	
	private static void method1() {
		//Scanner s = new Scanner(System.in);
		//String name = s.nextLine();
		String bob = "101100";
		String ali = "011001";
		int like=0;
		int dislike=0;
		for(int i=0;i<bob.length();i++) {
			if(bob.charAt(i)==ali.charAt(i) && ali.charAt(i)=='0') like ++;
			if(bob.charAt(i)==ali.charAt(i) && ali.charAt(i)=='1') dislike ++;
		}
		System.out.println(like+dislike);
		
	}
	
	private static void method2() {
		
	}
	
private static void method3() {
		
	}

}
