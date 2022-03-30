package com.InheritencePractice;

public class Main {
	public static void main(String[] args) {
		HumanBeing h = new HumanBeing(2 , "Sanal" , 'M');
		Male m = new Male();
		Female f = new Female();
		HumanBeing m1 = new Male();
		m.Activity();
		f.Enjoys();
		
		
		
	}
}
