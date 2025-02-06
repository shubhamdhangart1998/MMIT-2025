package com.tnsif.dayten.Jaggedarraydimensiondemo;

class JaggedArray{
	

	static void printArray(int c[][] )
	{
		System.out.println("Array Elements are as follow");
		
		for(int i=0; i<c.length; i++)
		{
			for(int j=0; j<c[i].length;j++) //column
			{
				System.out.print(c[i][j]+ " ");
			}
			
			System.out.println();
		}
		
	}
}




//

public class JaggedArrayDemo {

	public static void main(String[] args) {
		
		int d[][]= { {10,20,30,40,50} , {20}, {1,2,3} , {6,8} };
		System.out.println(d.length);
		
		JaggedArray.printArray(d);
	}

}
