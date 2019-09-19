//Laboratorijas darbs 1-2
package imperative;
	import java.util.*;
	import java.util.stream.Collectors;
	import java.util.stream.IntStream;

public class PerfectNumber_1_2 {

	        public enum STATE {
			 
			ABUNDANT,DEFICIENT,PERFECT;
			}
		
	        
	       public static STATE process(int i){    	 
	          Set<Integer> h = new LinkedHashSet<Integer>();
	          h = divisors(i);
	          Integer integerSum = h.stream().mapToInt(Integer::intValue).sum();
		        System.out.println("summation: " + integerSum/2);
	         return  integerSum/2 == i ? STATE.PERFECT:((integerSum/2 <i) ? STATE.DEFICIENT:STATE.ABUNDANT);
	         // return STATE.PERFECT;
	        }
	       
	      static Set <Integer> divisors(int x){    	   
	    	   Set<Integer> s1 = IntStream.rangeClosed(1, (int)Math.sqrt(x)) 
	  		.filter(num -> x % num == 0) 
	           .boxed()
	           .collect(Collectors.toSet());
	  		Set<Integer> s2 = s1.stream()
	  			.map(num -> x / num)
	  			.collect(Collectors.toSet());
	  		 s1.addAll(s2);
	 		 System.out.println(s1);
	       		return s1;
	       }
	       public static void main (String[] args) {
	    	   int checkNum=6;
	    	   STATE state = process(checkNum);
	    	   System.out.println(state);
	       }
	       
	}


