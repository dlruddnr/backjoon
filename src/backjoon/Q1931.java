package backjoon;
import java.util.*;
public class Q1931 {

	public static void main(String[] args) {
		int[][] list =new int[3][2];
		list[0][0]=1;
		list[0][1]=2;
		list[1][0]=3;
		list[1][1]=4;
		list[2][0]=5;
		list[2][1]=6;
		
		Arrays.sort(list,new MyCompare());
		System.out.println(Arrays.deepToString(list));
		for(int i=0; i<3;i++) {
			System.out.println(list[i][0]);
			System.out.println(list[i][1]);
		}
	}

}

class MyCompare implements Comparator<int[]>{

	@Override
	public int compare(int[] a, int[] b) {
//		if(a[0]>b[0]) {
//			return 1;
//		}
//		for(int i=0; i<a.length; i++) {
//			System.out.println("a: "+a[i]);
//			
//		}
//		for(int i=0; i<b.length; i++) {
//			
//			System.out.println("b: "+b[i]);
//		}
		if(a[0]>=b[0]) {
			if(a[1]>b[1]) {
				return 1;
			}
		}
		return 0;
	}
	
}
