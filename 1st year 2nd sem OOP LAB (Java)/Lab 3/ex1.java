public class ex1 {
    
    public static void main(String[] args)
    {
        double Input = Double.parseDouble(args[0]);

        double Doller = Math.round(Input/129.26);
        double Pound = Math.round(Input/132.74);
        double Euro = Math.round(Input/206.36);
  
        ex1 obj = new ex1();
        obj.printDetail(Input,Doller,Pound,Euro);
    }

    void printDetail(double Input, double Dollera, double Pound, double Euro)
    {
        System.out.println(Input + "LKR = " + Dollera + " $");
        System.out.println(Input + "LKR = " + Pound + " Pounds");
        System.out.println(Input + "LKR = " + Euro + " Euros");

    }

}
