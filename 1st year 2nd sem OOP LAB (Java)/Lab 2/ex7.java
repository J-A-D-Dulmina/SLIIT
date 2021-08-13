public class ex7 {
    
    public static void main(String[] args) {
        
        String set1=args[0];
        String set2=args[1];
        String set3=args[2];
        double cube;

       double height = Double.parseDouble(set1);
       System.out.println("height is " + height + "cm");
       double width = Double.parseDouble(set2);
       System.out.println("width is " + width + "cm");
       double length = Double.parseDouble(set3);
       System.out.println("lenght is " + length + "cm");

       cube = height*width*length;
       System.out.println("cube is "+ cube + "cm");


    }
    
}
