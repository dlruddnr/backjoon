package backjoon;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
public class Q1946 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int count=0;
		int caseNum=sc.nextInt();
		for(int i=0; i<caseNum; i++) {
			int caseLength=sc.nextInt();
			int[][] list=new int[caseLength][2];
			for(int k=0; k<caseLength;k++) {
				list[k][0]=sc.nextInt();
				list[k][1]=sc.nextInt();
			}
			Arrays.sort(list,new MyCompare2());
			
			count=list[0][1];
			Arrays.sort(list,new MyCompare3());
			for(int j=0; j<((count<list[0][1])?count:list[0][1]);j++) {
				if(list[0][0]<list[j][0]) {
					count--;
				}
			}
			System.out.println(count);
//			for(int j=0; j<caseLength;j++) {
//				System.out.println("j : "+list[j][0]+" "+list[j][1]);
//			}
			
		}

	}

}

class MyCompare2 implements Comparator<int[]>{

	@Override
	public int compare(int[] a, int[] b) {
		
		return Integer.compare(a[0], b[0]);
	}
	
}

class MyCompare3 implements Comparator<int[]>{

	@Override
	public int compare(int[] a, int[] b) {
		
		return Integer.compare(a[1], b[1]);
	}
	
}