package backjoon;
import java.util.*;

public class Q15997 {
	public static void main(String[] args) {
		HashMap<String,Double[]> team=new HashMap<>(4);
		Double[] doubleList=new Double[2];
		Scanner sc=new Scanner(System.in);
		String teamName;
		int count=6;
		double rate;
		ArrayList<String> list=new ArrayList<>();
		for(int i=0;i<4;i++) {
			teamName=sc.next();
			team.put(teamName,doubleList);
		}
		while(count>0) {
			for(int i=0; i<5; i++) {
				teamName=sc.next();
				list.add(teamName);
			}
			for(int i=0;i<2;i++) {
				doubleList[0]=doubleList[0]+Double.parseDouble(list.get(2+(2*i)));
				doubleList[1]=doubleList[1]+Double.parseDouble(list.get(3));
				team.put(list.get(i), doubleList);
			}
			count--;
		}
		
	}
}

