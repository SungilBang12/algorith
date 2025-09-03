/*
- 피보나치 수열 출력해라
- An = An-1 + An-2 
- n > 2
- 1 1 2 3 5 8 13 21 34
 */


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class algorithm_002 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		List<Integer> arr = new ArrayList();
		
		arr.add(1);
		arr.add(2);
		
		if (n <= 2) {
			System.out.print(1);
		}else {
			System.out.print("1 1 2 ");
			for (int i=2 ; i <= n-2 ; i++) {
				int an = arr.get(i-2) + arr.get(i-1);
				arr.add(an);
				System.out.print(an + " ");
			}
		}
	}
//	{
//		int[] arr = new int[20];
//		
//		arr[0] = 1;
//		arr[1] = 1;
//		for (int i=2 ; i <=19; i++) {
//			arr[i] = arr[i-2] + arr[i-1];
//		}
//		String resultArray = Arrays.toString(arr);
//		System.out.println(resultArray);
//;
//	}
}
