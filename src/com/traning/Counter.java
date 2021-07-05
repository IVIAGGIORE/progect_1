package com.traning;

public class Counter {
	private int begin;
	private int end;
	private int score;
	
	public Counter() {
		this.begin = 0;
		this.score = 0;
		this.end = 10;
	}
	
	public Counter(int begin, int score, int end) {
		if ( begin == end) {
			throw new RuntimeException("begin equally end!");
		}
		if (score < begin || score > end) {
			throw new RuntimeException("error!");
		}
		this.begin = begin;
		this.score = score;
		this.end = end;	
	}
	
	public void setBegin(int begin) {
		this.begin = begin;
	}
	public int getBegin() {
		return this.begin;
	}
	
	public void setEnd(int end) {
		this.end = end;
	}
	public int getEnd () {
		return this.end;
	}
	
	public void setScore(int score) {
		this.score = score;
	}
	public int getScore() {
		return this.score;
	}
	
	public void increase() {
		if (this.score++ > this.end) {
			throw new RuntimeException("cannot be increased");
		}
		this.score++;
	}
	
	public void decrease() {
		if (this.score-- < this.begin) {
			throw new RuntimeException("cannot be reduced");
		}
		this.score--;
	}
	
	public void outputDisplay () {
		System.out.printf("counter value %d \n", this.score);
	}
}
