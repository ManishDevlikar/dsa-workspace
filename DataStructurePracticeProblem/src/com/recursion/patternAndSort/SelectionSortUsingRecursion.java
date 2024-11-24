package com.recursion.patternAndSort;

import java.util.Arrays;

public class SelectionSortUsingRecursion {
	static void selectionSort(int arr[],int row ,int col,int max) {
		if(row==0) {
			return;
		}
		if(col<row) {
			if(arr[col]>arr[max]) {
				selectionSort(arr,row,col+1,col);
			}else {
			selectionSort(arr,row,col+1,max);
			}
		}else {
			int temp=arr[max];
			arr[max]=arr[row-1];
			arr[row-1]=temp;
			
			selectionSort(arr,row-1,0,0);
		}
	}
	public static void main(String[] args) {
		int arr[]= {1,4,6,2,3};
	
		selectionSort(arr,arr.length,0,0);
		System.out.println(Arrays.toString(arr));
	
	}
}