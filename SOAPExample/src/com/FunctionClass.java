package com;

public class FunctionClass {
	
	public Integer LCM_Method(int FirstNumber, int SecondNumber) {
		int lcm;
        // maximum number between n1 and n2 is stored in lcm
        lcm = (FirstNumber > SecondNumber) ? FirstNumber : SecondNumber;
        // Always true
        while(true)
        {
            if( lcm % FirstNumber == 0 && lcm % SecondNumber == 0 )
            {
                System.out.printf("The LCM of %d and %d is %d.", FirstNumber, SecondNumber, lcm);
                break;
            }
            ++lcm;
        } 
        return lcm;
	}
	
	public Integer GCD_Method(int FirstNumber, int SecondNumber) {
		int gcd = 1;
        for(int i = 1; i <= FirstNumber && i <= SecondNumber; ++i)
        {
            // Checks if i is factor of both integers
            if(FirstNumber % i==0 && SecondNumber % i==0)
                gcd = i;
        }
        return gcd;
	}

}
