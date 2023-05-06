package MyProject.practise;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.xml.stream.events.Characters;

public class PermutationsAndCombo {
	static List<String> result=new ArrayList();
	static List<List<Integer>> ressubset=new ArrayList();
	public static List<String> letterCasePerm(String s) {
		backtrack(0,s,new StringBuilder());
		return result;

	}
	public static List<List<Integer>> generateSubsets(ArrayList<Integer> nums) {
		
		subsetHelper(ressubset,new ArrayList(),0,nums);
		return ressubset;
		
		
	}
	public static void backtrack(int index,String s,StringBuilder sb) {
		int n = s.length();
		if(index == n) {
			result.add(sb.toString());
			return;
		}
		Character ch=s.charAt(index);
		if(Character.isLetter(ch)) {
			sb.append(Character.toLowerCase(ch));
			backtrack(index+1,s,sb);
			sb.deleteCharAt(sb.length()-1);
			
			sb.append(Character.toUpperCase(ch));
			backtrack(index+1,s,sb);
			sb.deleteCharAt(sb.length()-1);
		}
		else {
			sb.append(ch);
			backtrack(index+1,s,sb);
			sb.deleteCharAt(sb.length()-1);
		}

	}
	public static Integer sumOfList(List<Integer>current) {
		int sum =0;
		for(int i=0;i<current.size();i++) {
		sum=sum+current.get(i);
		}
		return sum;
	}
	
 public static List<List<Integer>> subsetHelper(List<List<Integer>> result,ArrayList<Integer>current,int index,ArrayList<Integer>nums) {
	 current=new ArrayList<Integer>(current);
	 if(sumOfList(current)==11 && current.size()==2) {
		 result.add(current);	 
	 }
	 for(int i=index;i<nums.size();i++) {
		current.add(nums.get(i));
		subsetHelper(result,current,index+1,nums);
		current.remove(current.size()-1);
	}
	return null ;
 }
	public static void main (String[] args) {
		ArrayList<Integer>arr2=new ArrayList<Integer>();
		arr2.add(6);
		arr2.add(5);
		arr2.add(7);
		arr2.add(4);
		
		
		System.out.println(generateSubsets(arr2));


	}
}
