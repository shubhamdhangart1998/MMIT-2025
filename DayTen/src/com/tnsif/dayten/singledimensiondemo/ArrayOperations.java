package com.tnsif.dayten.singledimensiondemo;



class ArrayDemoOne{
	
	
	//print int array
		static void printArray(int[] arr)
		{
			for(int i=0; i<arr.length; i++)
			{
				System.out.print(arr[i] +"\t"); // provide blank space  "  " 6 length
				
			}
			System.out.println();
		}
		//varible argument function 
		
		public static int getSum(int... n )
		{
			int sum=0;
			for (int no: n )
			{
				sum +=no;   //sum=10  no =20      sum =sum+no=10+20=30  sum =30
				
			}
			return sum;
		}
		
		//count no.odd element 
		public static int getOddCount(int b[])
		{
			int count =0;
			for(int i=0;i<b.length; i++)
			{
				if(b[i] % 2 !=0)
					count ++;
			}
			return count;
		}
		
		//count no. even elements
		
		public static int getEvenCount(int b[])
		{
			return b.length-getOddCount(b);
		}
		
}
public class ArrayOperations {

	public static void main(String[] args) {
		
		
		int n=10;
		int a[]; //declaration 
		a=new int[n]; // instantiation 
		
		//displaying the array 
		ArrayDemoOne.printArray(a);
		//assiging the array
	for(int i=0; i<a.length;i++)
		a[i]=5*i;
	ArrayDemoOne.printArray(a);
	
	int b[]= {10,20,30,40,50} ; // initialization at the time of declaration 
	
	ArrayDemoOne.printArray(b);
	//calling of varibles argument function 
	System.out.println("Sum of array elements is : "+ ArrayDemoOne.getSum(b));
	System.out.println("SUm of array elemts is : "+ ArrayDemoOne.getSum(10,20,30,40,50,60,70));
	
	b[2] = 999;
	ArrayDemoOne.printArray(b);
	
	//display odd no and ecven no 
	
	System.out.println("Odd number : "+ ArrayDemoOne.getOddCount(b));
	System.out.println("even number : "+ ArrayDemoOne.getEvenCount(b));
	
	int c[];
	//ArrayDemoOne.printArray(c);  //CTE
	
	
	}

}
