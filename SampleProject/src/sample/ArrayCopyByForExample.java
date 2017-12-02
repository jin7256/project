package sample;

import java.util.Arrays;

public class ArrayCopyByForExample {
	public static void main(String[] args) {
		int[] oldIntArray = { 1, 2, 3 };
		int[] newIntArray = new int[5];
		
		for(int i=0; i<oldIntArray.length; i++) {
			newIntArray[i] = oldIntArray[i];
		}
		
		for(int i=0; i<newIntArray.length; i++) {
			System.out.print(newIntArray[i] + ", ");
		}
		
		//배열복사 효율적인 방법
		int[] newArr=Arrays.copyOf(oldIntArray,oldIntArray.length);
		for(int i:newArr) {
			System.out.print(i+" ");
		}
		
	}
	public void sum() {
		System.out.println("3 + 4 ="+(3+4));
	}
}