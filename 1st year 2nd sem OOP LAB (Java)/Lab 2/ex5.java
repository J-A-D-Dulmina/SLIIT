public class ex5 {
    public static void main(String[] args) {
        
        String set1=args[0];
        String set2=args[1];
        double kilometers;
        int length=args.length;

       double miles = Double.parseDouble(set1);
       System.out.println(miles + "miles");
       double yards = Double.parseDouble(set2);
       System.out.println(yards + "yards");

       kilometers = miles*1.609;
       System.out.println( miles + " miles have "+ kilometers + "km");

       kilometers = yards*385;
       System.out.println( yards + " yards have "+ kilometers + "km");

       System.out.println(length);

    }
    
}
