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
		
		//�迭���� ȿ������ ���
		int[] newArr=Arrays.copyOf(oldIntArray,oldIntArray.length);
		for(int i:newArr) {
			System.out.print(i+" ");
		}
		
	}
}