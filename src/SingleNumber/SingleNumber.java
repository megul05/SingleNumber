package SingleNumber;

import java.util.Scanner;

public class SingleNumber {
	
	public static int unique(int[] arr)
	{
		int result =0;
		for(int i=0;i<arr.length;i++)
		{
			result = result^arr[i];
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		int[] arr = new int[number];
		for(int i=0;i<number;i++)
		{
			arr[i] = scan.nextInt();
		}
		int print = unique(arr);
		System.out.println(print);
	}

}
