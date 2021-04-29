package backjoon;

import java.util.*;

public class Q1018 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // 세로
		int m = sc.nextInt(); // 가로
		int odd = 0;
		String[] asd = new String[m]; // W시작
		String[] asd1 = new String[m]; // B시작
		for (int i = 0; i < m; i++) {
			if (odd == 0) {
				asd[i] = "W";
				asd1[i] = "B";
				odd = 1;
				continue;
			}
			asd1[i] = "W";
			asd[i] = "B";
			odd = 0;
		}
		//System.out.println(Arrays.toString(asd));
		//System.out.println(Arrays.toString(asd1));
		String[][] aa =new String[n][m]; 
//			{ { "W", "B", "W", "B", "W", "B", "W", "B" }, { "B", "W", "B", "W", "B", "W", "B", "W" },
//				{ "W", "B", "W", "B", "W", "B", "W", "B" }, { "B", "W", "B", "B", "B", "W", "B", "W" },
//				{ "W", "B", "W", "B", "W", "B", "W", "B" }, { "B", "W", "B", "W", "B", "W", "B", "W" },
//				{ "W", "B", "W", "B", "W", "B", "W", "B" }, { "B", "W", "B", "W", "B", "W", "B", "W" } };
//		for (int i = 0; i < n; i++) {
//			for (int j = 0; j < m; j++) {
//				System.out.println("입력");
//				String val = sc.next();
//				aa[i][j] = val;
//			}
//		}
		int[] result = Compare.compare(aa, asd, asd1, n, m);
		if (result[0] >= result[1]) {
			System.out.println(result[1]);
		} else {
			System.out.println(result[0]);
		}
	}
}

class Compare {
	static int count1;
	static int count2;

	static public int[] compare(String[][] aa, String[] asd, String[] asd1, int n, int m) {
		count1 = 0;
		count2 = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (i%2 == 0) {
					if (aa[i][j].equals(asd[j])) {
						//System.out.printf("%s , %s 맞았다\n", aa[i][j],asd[j]);
						count2++;
						continue;
					}
					//System.out.printf("%s , %s 틀렸다\n", aa[i][j],asd[j]);
					count1++;
				} else {
					if (aa[i][j].equals(asd1[j])) {
						//System.out.printf("%s , %s 맞았다\n", aa[i][j],asd1[j]);
						count2++;
						continue;
					}
					//System.out.printf("%s , %s 틀렸다\n", aa[i][j],asd1[j]);
					count1++;
				}
			}
			
			//System.out.println("=============================");
		}
		int[] result = { count1, count2 };
		//System.out.println(Arrays.toString(result));
		return result;
	}
}