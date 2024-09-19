import java.util.Scanner;

public class IT24103629Lab7Q1B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        for (int customer = 1; customer <= 5; customer++) {
            System.out.println("Customer " + customer);
            
            System.out.print("Enter total bill amount: ");
            double amount = input.nextDouble();  
            
            System.out.print("Enter mode of payment (C for cash, O for other): ");
            char pMethod = input.next().charAt(0);  
            
            if (pMethod == 'C') {  
                double disPrice = amount * 5 / 100;  
                double total = amount - disPrice;
                
                System.out.println("Discount is: " + disPrice);
                System.out.println("Amount to be paid: " + total);
            } else if(pMethod == 'O') {
                System.out.println("No discount applied. Amount to be paid: " + amount);
            } else {
                System.out.println("Payment mode is not valid");
            }

            
            System.out.println();
        } 
        
        input.close();  
    }
}
