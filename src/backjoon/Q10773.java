package backjoon;
import java.util.*;

public class Q10773 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Stack<Integer> stack1=new Stack<>(); 
		int n=sc.nextInt();
		int num;
		int sum=0;
		for(int i=0; i<n;i++) {
			System.out.print("ют╥б :");
			num=sc.nextInt();
			if(num==0) {
				num=stack1.pop();
				sum-=num;
				continue;
			}
			sum+=num;
			stack1.push(num);
		}
		System.out.println(sum);
		
	}
}
