import java.util.*;
public class ex3 {
    public static void main(String[] args)
{
    Scanner input = new Scanner(System.in); //creating method for getting input
    ex3 obj1 = new ex3();   //creating a new object

    System.out.print("Enter the item name: \n");
    String name = input.nextLine();
    System.out.print("Enter the Unit price: \n");
    int unit = input.nextInt();
    System.out.print("Enter the Quantity: \n");
    int Quantity =  input.nextInt();

    
    System.out.println("Total cost will be " + obj1.Calculate(unit,Quantity) + " Rupees."); //print the total using the method of Calculate
}

int Calculate(int x, int y) //create a new method called Calculate in order to find the total
{
   int total = x*y;
   return total;
}

    
}
