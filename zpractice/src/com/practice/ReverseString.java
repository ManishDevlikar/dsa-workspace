package com.practice;

public class ReverseString {
	public static void main(String[] args) {
		String str = "my name is";
		String res = reverse(str);
		System.out.println(res);
	}

	public static String reverse(String str) {
		String[] res = str.split(" ");
		String out = "";
		for (int i = 0; i < res.length; i++) {
			out = " " + res[i] + out;
		}
		return out.strip();
	}

	public static String reverse2(String str) {
		String stream[] = str.split(" ");
		int start = 0;
		int end = stream.length - 1;

		while (start < end) {
			String temp = stream[start];
			stream[start] = stream[end];
			stream[end] = temp;
			start++;
			end--;
		}
		String revStream = String.join(" ", stream);
//		String res="";
//		for(int i=0;i<revStream.length();i++) {
//			res=revStream.charAt(i)+res;
//		}

		return revStream;
	}
}
