package com.tnsif.dayten.MLdimensiondemo;


class MultiDeminsionArray
{
	//single in a single row 
		// multi rows and columns 
		
		
		
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


 class MLArray {
	 
	 public static void main(String[] args) {
		
		 int c[][]= { {12,45}, {10,20} ,{5,7} ,{10,20} ,{5,7}};  //new int [5][2]
		 
		 System.out.println("No of row in c array : "+ c.length);
		 
		 MultiDeminsionArray.printArray(c);
	}
 }

	

