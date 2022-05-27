package fisrtproject;

import java.util.Scanner;

class Calculator {
	void operations() {
	
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("select the operation");
		System.out.println("\n 1.addition "
			           	+ "\n 2.subtraction "
				        + "\n 3.division  "
			          	+ "\n 4.multiplication "
				        + "\n 5.exit");
		
		int op=sc.nextInt();
		if(op==5)
		{
			System.exit(0);	
		}
		
		System.out.println("enter the numbers");
		
		
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		
		if(op==1)
		{
			int sum=num1+num2;
			System.out.println("addition result is "+sum);
		}
		
		else if(op==2)
		{
			int sum=num1-num2;
			System.out.println("subtraction result is "+sum);
		}
		
		else if(op==3)
		{
			int sum=num1/num2;
			System.out.println("division result is "+sum);
		}
		
		else if(op==4)
		{
			int sum=num1*num2;
			System.out.println("multiplication result is "+sum);
		}
		
		
		System.out.println("............................................");
		
	}

}

public class Project {
	public static void main(String[] args) {
		Calculator cl=new Calculator();
		for(;;)
		{
		cl.operations();
		}
		
		}
	}