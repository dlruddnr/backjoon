package backjoon;

import java.util.*;

public class Q2164 {
	public static void main(String[] args) {
		Stack<Integer> cardDeck = new Stack<>();
		Scanner sc = new Scanner(System.in);
		int n = 7;
		// 1~n까지 카드덱생성
		for (int i = n; i >= 1; i--) {
			cardDeck.push(i);
		}
//		System.out.println(cardDeck);
		MyStack asd=new MyStack();
		asd.getLastCard(cardDeck);
		System.out.println(cardDeck.pop());
	}
}

class MyStack {

	Stack<Integer> getLastCard(Stack<Integer> a) {
		int lastNum;
		int size;
		Stack<Integer> cardDeck2 = new Stack<>();
		if (a.size() > 2) {
			a.pop();
			lastNum = a.pop();
			size=a.size();
			for (int i = 0; i < size; i++) {
				cardDeck2.push(a.pop());
			}
			a.clear();
			a.push(lastNum);
			for (int i = 0; i < size; i++) {
				a.push(cardDeck2.pop());
			}
//			System.out.println(a);
			getLastCard(a);
		}
		return a;
	}
}