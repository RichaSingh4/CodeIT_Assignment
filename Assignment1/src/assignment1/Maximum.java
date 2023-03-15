package assignment1;

import java.util.Scanner;

public class Maximum {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		//taking input from user...
		System.out.println("enter length of array");
		int n=sc.nextInt();
		int[]arr=new int[n];
		
		//taking input from user...
		System.out.println("enter element of array");
		for(int i=0;i<n;i++) {
			//storing value in array..
			arr[i]=sc.nextInt();
		}
		
		//printing and calling max method....
		System.out.println(max(arr));
	sc.close();

	}
	
	//method to find maximum element of array....
	public static int max(int[] arr) {
		int max=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		return max;
	}


}
