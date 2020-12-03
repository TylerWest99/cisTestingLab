package cis350Testing;

public class SimpleCalculator {
	public int add(int a, int b) {
		return a + b;
}
	public int sub(int a, int b) {
		return a - b;
	}
	public int mul(int a, int b) {
		return a * b;
	}
	public int div(int a, int b) {
		return a / b;
	}
	public int pow(int a, int b) {
		int total = a;
		for(int i = 0; i < b-1; i++) {
			total = total * a;
		}
		return total;
	}
	public int fact(int n) {
		int total = 1;
		for(int i = n; i > 1; i--) {
			total = total * i;
		}
		return total;
	}
	public static final void main(String[] args) {
		System.out.println("Hey there CIS350.");
	}
}
