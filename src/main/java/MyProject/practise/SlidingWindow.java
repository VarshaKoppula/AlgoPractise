package MyProject.practise;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class SlidingWindow {

	//buy and sell stock
	public static int buyAndSell() {
	int[]prices= {7,1,5,3,6,4};
	int max=0;
	int min=Integer.MAX_VALUE;
    for(int i=0;i<prices.length;i++) {
	if(prices[i]<min) {
	 min=prices[i];
	}
	else {
	max=Math.max(max,prices[i]-min);	
	}		
	}
	return max;
	}
	public static void removeDup() {
		int[]arr= {1,1,2,3,5,5,9,9};
		int[]nums=new int[arr.length];
	   Set<Integer>hs =new HashSet<Integer>();
		for(int i=1;i<arr.length;i++) {
			
			hs.add(arr[i]);
		}
		System.out.println(hs.toString());
	}
	public static int firstUniqueChar(String s) {
		HashMap<Character,Integer>hm =new HashMap();
		for(int i=0;i<s.length();i++) {
			if(!hm.containsKey(s.charAt(i))) {
			hm.put(s.charAt(i), i);	
			}
			else {
				hm.put(s.charAt(i), -1);
			}
		}
		int min=Integer.MAX_VALUE;
		for(char c:hm.keySet()) {
		if(hm.get(c)>-1 && hm.get(c)<min) {
			min=hm.get(c);
		}
		}
		return min==Integer.MAX_VALUE?-1:min;
	}
	
	public static void rotateArray(int k) {
		int[]arr= {1,2,3,4,5,6,7,8,9};
	    int n=arr.length;
        for(int i=0;i<k;i++) {
		int temp=arr[n-k-1];
		
		}
	}
	   public static int lengthOfLongestSubstring(String s) {
		     int a_pointer=0;
		     int b_pointer=0;
		     int max=0;
		     Set<Character> hs=new HashSet();
		    while(b_pointer<s.length()){
		         if(!hs.contains(s.charAt(b_pointer))){
		         hs.add(s.charAt(b_pointer));
		         b_pointer++;
		         max=Math.max(max,hs.size());        
		         }
		         else{
		          hs.remove(s.charAt(a_pointer));
		          a_pointer++; 
		         }
		         
		     } 
		     return max;  
		    }
	  
public static void main(String[] args) {
	int Profit=buyAndSell();
	System.out.println(Profit);
	removeDup();
	int len=lengthOfLongestSubstring("pwwkew");
	System.out.println(len);
	int min=firstUniqueChar("eettccooddee");
	System.out.println(min);
}
}
