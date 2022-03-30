package com.firstpack;

public class First_No {

	public static void main(String[] args) {
		int count =0;
		for(int i=10; i<=40; i++) {
			isPrime(i);
			
			if(isPrime(i) == true) {
				count++;
			}
			else {
				continue;
			}
		}
		System.out.println(count);
	}
public static boolean isPrime(int n) {
        
        if (n==1) {
            return false;
        }
        
        for (int i=2; i<= n/2; i++) {
            if (n % i == 0)
                return false;
        }
        
        return true;
        
    }
}
