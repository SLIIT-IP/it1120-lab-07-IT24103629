import java.util.Scanner;
 public class IT24103629Lab7Q1A
 {
	 public static void main(String[] args)
	 {
		Scanner numin = new Scanner(System.in); 
		int mark, sum=0, count = 1;
		double avg;
		
		System.out.println("Enter marks four subjects: ");
		while(count<=4)
		{
			System.out.print("Enter Subject Mark "+count+":");
			 mark = numin.nextInt();
			 sum = sum + mark;
			count = count + 1;
		}
		avg = sum/4; 
		
			System.out.println("Average is "+avg);
		
		if(avg >= 100 && avg >= 75 )
		{
		    System.out.print("Overall grade is : Distinction");
		}
		else if (avg >= 50 && avg <= 74)
		{
		     System.out.print("Overall grade is : Credit");
		}
		else 
		{
		     System.out.print("Overall grade is : Fail");
		}
		
	
	 }
 }