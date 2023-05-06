package MyProject.practise;

import java.util.ArrayList;
import java.util.Arrays;

public class main {
	public static void main (String[] args) {
		/*
		 * LinkedList l1 = new LinkedList(); l1.addNode(1); l1.addNode(2);
		 * l1.addNode(3); l1.addNode(3); l1.addNode(3); l1.display(); LinkedList l2 =
		 * new LinkedList(); l2.addNode(3); l2.addNode(2); l2.addNode(3); l2.addNode(3);
		 * l2.addNode(3); l2.display(); LinkedList l3 = new LinkedList(); Node
		 * sum=l3.sumofList(l1.head, l2.head); System.out.print(sum); l3.display();
		 */
		Sort s1=new Sort();
		int[]arr1={4,2,3,6,1,9,8,7};
		s1.selectionSort(arr1);
		System.out.println(Arrays.toString(arr1));	
		BalancedParanthesis bp=new BalancedParanthesis();
		Boolean v=bp.balanced("({[]})");
		System.out.println((v));
//		ArrayList<Integer>arr2=new ArrayList<Integer>();
//		arr2.add(6);
//		arr2.add(5);
//		arr2.add(41);
//		arr2.add(2);
//		arr2.add(1);
//		arr2.add(3);
//		arr2.add(7);
//		arr2.add(18);
//		arr2.add(20);
//		
//		
//		//s1.quickSort(arr1,0,arr1.length-1);
//		
//		System.out.println(Arrays.toString(arr1));
//		s1.exercise(arr2);
//		ArrayList<Integer> A1=new ArrayList<Integer>();
//		A1.add(1);
//		A1.add(3);
//		A1.add(5);
//		ArrayList<Integer>A2 = new ArrayList<Integer>();
//		A2.add(1);
//		A2.add(0);
//		A2.add(1);
//		A1.add(2);
//		A1.add(0);
//		A1.add(2);
//		ArrayList<Integer>A3 = new ArrayList<Integer>();
//		A3=s1.mergeOneIntoAnother(A1,A2);
//		System.out.println(A3);
//		
		
	}

}
