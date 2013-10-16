package com.idocs.interview;

import java.io.BufferedReader;
import java.io.BufferedWriter;

public class SingletonClass {
	
	private static BufferedReader bufferedReader1;
	private static BufferedReader bufferedReader2;
	private static BufferedWriter bufferedWriter;
	
	public static BufferedReader getBufferedReader1() {
		return bufferedReader1;
	}
	
	public static void setBufferedReader1(BufferedReader bufferedReader1) {
		SingletonClass.bufferedReader1 = bufferedReader1;
	}
	
	public static BufferedReader getBufferedReader2() {
		return bufferedReader2;
	}
	
	public static void setBufferedReader2(BufferedReader bufferedReader2) {
		SingletonClass.bufferedReader2 = bufferedReader2;
	}
	
	public static BufferedWriter getBufferedWriter() {
		return bufferedWriter;
	}
	
	public static void setBufferedWriter(BufferedWriter bufferedWriter) {
		SingletonClass.bufferedWriter = bufferedWriter;
	}
}
