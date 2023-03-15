package assignment1;

import java.util.Scanner;

public class Maximum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter length of array");
		int n=sc.nextInt();
		int[]arr=new int[n];
		System.out.println("enter element of array");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println(max(arr));
	sc.close();

	}
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
