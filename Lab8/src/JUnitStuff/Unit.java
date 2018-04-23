package JUnitStuff;

import java.util.stream.IntStream;

public class Unit {
	public int AddInts(int x, int y) {
		return x+y;
		
	}
	public String AddString(String x, String y ) {
		return x+y;
	}
	
	public String findLen(String x) {
		return x;
	}
	
	public int divXByY (int x, int y) {
		return x/y;
	}
	
	int[] numbers = {1,2,3,4,5};
	public int[] reverseintArray ( int[] numbers) {
		for(int i=0;i< numbers.length/2;i++)
		{
			int temp = numbers[i];
			numbers[i] = numbers[numbers.length -i-1];
			numbers[numbers.length-i-1]=temp;
		}
		return numbers;
	}
	
	public int range(int x,int y,int z) {
		IntStream.range(x,y).forEach(i -> System.out.print(i + " "));
		return range(x,y,z);
	}
}
