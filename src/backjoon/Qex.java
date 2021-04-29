package backjoon;

import java.util.Scanner;

public class Qex {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int endIdx =0;
		int k = scan.nextInt();
		int total = 0; // 합계
		int[] arr = new int[k]; // 배열 생성, 입력 받은 만큼 만들기
		// 0일 때, 0이 아닐때 (if)
		for (int i = 0; i < k; i++) {
			int a = scan.nextInt();
			if (a == 0) {
				endIdx--;
				if(endIdx<=0) {
					endIdx=0;
				}
				arr[endIdx] = 0;
				
				 // 0이 나오고 지우기
			}
			else {
				arr[endIdx] = a; // 최근 값 그대로 나오고
				endIdx++; // 다시 증가하기
			}
		}

		for (int i = 0; i < endIdx; i++) {
			total = total + arr[i];
			
		}
		System.out.println(total);
	}
}