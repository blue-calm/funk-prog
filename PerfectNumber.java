//Laboratorijas darbs 1-1
package imperative;
import java.util.Scanner;
import java.util.*;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class PerfectNumber {
        
        public enum STATE {
		 
		ABUNDANT,DEFICIENT,PERFECT;
		}
	
        
       public static STATE process(int i){    	 
          Set<Integer> h = new LinkedHashSet<Integer>();
          h = divisors(i);
          int sum = 0;
          Iterator<Integer> iter = h.iterator();
          while (iter.hasNext()) {
        	  sum+= (int)iter.next();
          };
          sum-=i;
          if (sum <i) return STATE.DEFICIENT;
          else if (sum == i) return STATE.PERFECT;
          else return STATE.ABUNDANT;
        }
       
      static Set <Integer> divisors(int x){    	   
    	   Set<Integer> s = new LinkedHashSet<Integer>(); 
   			for (int k=1;k<=x;k++) {
   			if (x%k==0) {
   				s.add(k);		
   				}
   		}
   			System.out.println("The Set: " + s); 
       		return s;
       }
       public static void main (String[] args) {
    	   int checkNum=28;
    	   STATE state = process(checkNum);
    	   System.out.println(state);
       }
       
}
