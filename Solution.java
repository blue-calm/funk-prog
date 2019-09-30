package ld2;

import java.util.Scanner;

public class Solution {
	public static long superDigit1(long x) {
		if (x<11){
			return x;
			}
		else return ((x%10)+superDigit1(x/10));		
		}

	public static void main(String[] args) {
	Scanner sn = new Scanner(System.in);
	System.out.print("Ievadiet skaitli: ");
	long m = superDigit1(sn.nextLong());
	m = superDigit1(superDigit1(m));
	System.out.println("Summa: ");
	System.out.print(m);
	sn.close();
	}
	
}
