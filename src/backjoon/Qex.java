package backjoon;

import java.util.Scanner;

public class Qex {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int endIdx =0;
		int k = scan.nextInt();
		int total = 0; // �հ�
		int[] arr = new int[k]; // �迭 ����, �Է� ���� ��ŭ �����
		// 0�� ��, 0�� �ƴҶ� (if)
		for (int i = 0; i < k; i++) {
			int a = scan.nextInt();
			if (a == 0) {
				endIdx--;
				if(endIdx<=0) {
					endIdx=0;
				}
				arr[endIdx] = 0;
				
				 // 0�� ������ �����
			}
			else {
				arr[endIdx] = a; // �ֱ� �� �״�� ������
				endIdx++; // �ٽ� �����ϱ�
			}
		}

		for (int i = 0; i < endIdx; i++) {
			total = total + arr[i];
			
		}
		System.out.println(total);
	}
}