import java.util.HashMap;
import java.util.Set;

public class algorithm_003 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 2, 2, 3, 1, 4, 2, 2, 4, 3, 5, 3, 2};
		int[] count = new int[10];
		
		for (int i =0; i < 10 ; i ++) {
			int n = 0;
			for (int j : arr) {
				if (i == j) {
					count[i]++;
				}
				
			
		}
		}
	
		System.out.println(count);
		int k = 0; 
		int l = 0;
		for(int i = 0 ; i < count.length ; i++) {
			System.out.println(count[i]);
			if (l<count[i]) {
				l = count[i];
				k = i;
				System.out.println("+" + k);
			}
		}
		System.out.println(k);
	}
}
