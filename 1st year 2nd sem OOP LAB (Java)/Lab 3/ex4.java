import java.util.Scanner;
public class ex4 {
    
public static void main(String[] args){

ex4 input = new ex4(); //create a new object called input

Scanner newInput = new Scanner(System.in); //create the method to get inputs

 System.out.println("Enter the weight of a person:");
 int weight = newInput.nextInt();
 System.out.println("Enter the number of people:");
 int no = newInput.nextInt();


 input.Calculate(weight,no);  // calling the Calculate method
 input.printDetail(input.Calculate(weight,no), no); //calling the printDetail method 
}


int Calculate(int x, int y)
{
    int total_Weight = x*y;
    int difference =  1320 -total_Weight;
    int rest_people = difference/x;  
    return rest_people;
}

void printDetail(int a, int b)
{
    System.out.println("There are " + a +" people in the lift by now");
    System.out.println("You can fit more "+ b + " Peopele ");   
}
}
