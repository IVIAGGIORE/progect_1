package com.traning;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		Random rond = new Random ();
		int b = rond.nextInt(100) + 1;
		Counter counter1 = new Counter();
		Counter counter2 = new Counter(0, 0, b);
		
		for (int i = 0; i < b - 1; i++) {
		counter2.increase();
		counter2.outputDisplay();
		}
		
	}

}
