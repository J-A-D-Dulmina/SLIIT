public class ex6 {

    public static void main(String[] args) {
        
        String set1=args[0];
        double fahrenheit;

       int celsius = Integer.parseInt(set1);
       System.out.println(celsius + " celsius");

       System.out.println("-------------------------------------------------------");

       fahrenheit = (celsius*1.8)+5;
       System.out.println( celsius + " celsius have "+ fahrenheit + " fahrenheit");


    }
    
}
