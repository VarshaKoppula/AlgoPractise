package MyProject.practise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Random;

public class Sort {
	
public int[] selectionSort(int[]arr) {
	int n = arr.length;
	 
    // One by one move boundary of unsorted subarray
    for (int i = 0; i < n; i++)
    {
    int min_pos=i;
    for(int j=i+1;j<n;j++) {
    	if(arr[j]<arr[min_pos]) {
    		min_pos=j;	
    	}
    }
    int temp=arr[i];
    arr[i]=arr[min_pos];
    arr[min_pos]=temp;
       }
	return arr;
    	
}

public void bubbleSort(int[] arr) {
	int n=arr.length;
for(int i=0;i<n;i++) {
for(int j=n-1;j>i;j--) {
	if(arr[j]<arr[j-1]) {
	int temp=arr[j];
	arr[j]=arr[j-1];
	arr[j-1]=temp;
	}
	}
}
}
public void insertionSort(int[] arr) {
	for(int i=1;i<arr.length;i++) {
	int temp=arr[i];
	int j=i-1;
	while(j>=0 && arr[j]>temp) {
		arr[j+1]=arr[j];
		j=j-1;
	}	
	arr[j+1]=temp; 
}
}
public void mergeSort(int[]arr, int start, int end,int len) {
  if(len<2) {
	return;  
  }
  int mid=(end-start)/2+start;
  int k=0;
  int[] leftArray=new int[mid];
  int[] rightArray=new int[len-mid];
  for(int i=0;i<len;i++) {
	 if(i<mid) {
		 leftArray[i]=arr[i];		 }
	 else {
		 rightArray[k]= arr[i];
		 k++;
	 }
  }
  mergeSort(leftArray,mid);
  mergeSort(rightArray,len-mid);
  merge(arr,mid,len-mid,leftArray,rightArray);
  
	
}

public void merge(int[] arr, int left, int right,int[] leftArray,int[] rightArray) {
	int i=0;int l=0;int r=0;
	while(l<left && r<right) {
		if(leftArray[l]<rightArray[r]) {
			arr[i++]=leftArray[l++];
		}
		else {
			arr[i++]=rightArray[r++];
		}
	}
	while(l<left) {
		arr[i++]=leftArray[l++];
	}
	while(r<right) {
		arr[i++]=rightArray[r++];
	}
}

public int[] twoSum(int[]arr) {
	int target=10;
	int j=0;
	for(int i=0;i<arr.length-1;i++) {
		j=i-1;
		if(arr[j]==target-arr[i]) {
			return new int[] {j,i};
		}

	}
	return new int[] {};
}
public int[] twoSumHash(int[]arr) {
	HashMap<Integer,Integer>hm=new HashMap<Integer,Integer>();
	int target=3;
	for(int i=0;i<arr.length-1;i++) {		
		int compliment=target-arr[i];
		if(hm.containsKey(compliment)) {
			return new int[] {hm.get(compliment),i};
		}
		else {
			hm.put(arr[i], i);
		}
		
	}
	return new int[] {};
}
public void swaptwoNumbers(int[] arr,int a,int b) {

	int temp=arr[a];
	arr[a]=arr[b];
	arr[b]=temp;	
}
public void quickSort(int[]arr,int low , int high) {
	if (low < high) 
    {
          
        int pi = helperQuick(arr, low, high);
  
        // Separately sort elements before
        // partition and after partition
        quickSort(arr, low, pi - 1);
        quickSort(arr, pi + 1, high);
    }
}

public int helperQuick(int[]arr,int start,int end) {
if(start>=end) {
	return -1;//LEAF NODE
}
int pivot=arr[start];//assuming pivot as the lowest element

Random rand=new Random();
int randomIndex=rand.nextInt((end-start)+1)+start;
int temp1=arr[start];
arr[start]=arr[randomIndex];
arr[randomIndex]=temp1;	
int low=start;
for(int high=start+1;high<=end;high++) {
if(arr[high]<=pivot) {
	low++;
	int temp=arr[low];
	arr[low]=arr[high];
	arr[high]=temp;	
}
}
int temp=arr[start];
arr[start]=arr[low];
arr[low]=temp;	
//swaptwoNumbers(arr,start,low);

return low-1;
}

public void exercise(ArrayList<Integer>l1) {
	int left=0;
	int right =l1.size()-1;
	int temp=0;
	while(left<right) {
		if(l1.get(left)%2==0) {	
			left++;
		}
		else if (l1.get(right)%2!=0){
			right--;
		}
		else {		
			temp=l1.get(left);
			l1.set(left, l1.get(right));
			l1.set(right, temp);
			left++;
			right--;
		
		}
	}
	System.out.println(l1.toString());
}

public ArrayList<Integer> mergeOneIntoAnother(ArrayList<Integer> first, ArrayList<Integer> second) {
	 
     
     int i = first.size() - 1;
     int j =i; // same number of entries in both array are populated //but in the second array-- last non zero in second aray
     
     
    /* while (k >= 0 && i >= 0) {
         
         if (j >= 0 && second.get(j) >= first.get(i)) {
             second.set(k, second.get(j));
             j--;
         } else {
             second.set(k, first.get(i));
             i--;
         }
         k--;*/
     for(int k = second.size() - 1;k>=i;k--) {
    	if(j>=0 && second.get(j) >= first.get(i)) {
    		 second.set(k, second.get(j));
    		 j--;
    	}
    	else {
    		 second.set(k, first.get(i));
             i--;
    	}
     }
     
     return second;
 }


}