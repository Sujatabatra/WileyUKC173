package com.sujata.demo;

public class Matrix {

	private int arr[][]=new int[3][3];

	public int[][] getArr() {
		return arr;
	}

	public void setArr(int[][] arr) {
		this.arr = arr;
	}

	public void input(int row,int col,int value) {
		arr[row][col]=value;
	}
	
	public int getElement(int row,int col) {
		return arr[row][col];
	}
	
	public Matrix add(Matrix matrix2) {
		Matrix sumMatrix=new Matrix();
		for(int row=0;row<=2;row++) {
			for(int col=0;col<=2;col++) {
				sumMatrix.arr[row][col]=arr[row][col]+matrix2.arr[row][col];
			}
		}
		return sumMatrix;
	}
	
}
