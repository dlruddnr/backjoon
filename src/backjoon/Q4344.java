package backjoon;
import java.util.*;
public class Q4344 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int count =sc.nextInt();
		for(int i=0; i<count; i++) {
			int n= sc.nextInt();
			int sum=0;
			int count1=0;
			ArrayList<Integer> asd=new ArrayList<>();
			for(int j=0; j<n; j++) {
				int m=sc.nextInt();
				asd.add(m);
				sum+=m;
			}
			double mean=(double)sum/n;
			for(int k=0; k<n; k++) {
				if(asd.get(k)>mean) {
					count1++;
				}
			}
			System.out.printf("%.3f%%\n",(double)count1*100/n);
		}
	}
}
