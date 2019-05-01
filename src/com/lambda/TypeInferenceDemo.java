package com.lambda;

public class TypeInferenceDemo {
	public static void main(String[] args) {
		StringLengthLambda lambda = s -> s.length();
		System.out.println(lambda.getLength("Hello lambda"));
	}
}

interface StringLengthLambda {
	int getLength(String s);
}
