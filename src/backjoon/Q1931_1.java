package backjoon;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

public class Q1931_1 {
	public static void main(String[] args) {
		int end=-1;
		int count=0;
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int[][] list=new int[n][2];
		for(int i=0;i<n; i++) {
			list[i][0]=sc.nextInt();
			list[i][1]=sc.nextInt();
		}
		Arrays.sort(list,new MyCompare1());
		
		for (int i=0; i<n; i++) {
			if(list[i][0]>=end) {
				end=list[i][1];
				count++;
				continue;
			}
			
		}
		for(int i=0; i<n;i++) {
			System.out.println("i : "+list[i][0]+"  "+list[i][1]);
		}
		System.out.println(count);
	}
}

class MyCompare1 implements Comparator<int[]>{

	@Override
	public int compare(int[] a, int[] b) {
		if(a[1]==b[1]) {
			return Integer.compare(a[0], b[0]);
		}
		return Integer.compare(a[1], b[1]);
		
	}
	
}