package com.firstpack;

public class DemoCasting {
	public static void main(String[] args) {
		int a =5;
		float f = (float) a;
		System.out.println(f);
		
		char c = 'A';
		int b = (int) c;
		System.out.println(b);
		
		double d = 5.90d;
		char h = (char) d;
		System.out.println(h);
		
		double g = f;
		System.out.println(g);
		
		try {
			String s = "45";
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
		
	}
}
