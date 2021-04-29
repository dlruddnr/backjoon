package backjoon;
import java.util.*;

public class adsdad {
	public static void main(String[] args) {
		ArrayList<Integer> asd=new ArrayList<>();
		asd.add(1);
		asd.add(2);
		asd.add(2,3);
		for(int i:asd) {
			System.out.println(i);
		}
		asd.add(1,6);
		for(int i:asd) {
			System.out.println(i);
		}
		String a="1.333";
		double aad=Double.parseDouble(a);
		System.out.println(aad);
		String aaa="123";
		String bbb="456";
		System.out.println((aaa+bbb).compareTo(bbb+aaa));//-3
	}
}
