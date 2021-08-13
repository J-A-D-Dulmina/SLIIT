public class ex4 {
    public static void main(String[] args) {
        
        String str1 = args[0];
        String str2 = args[1];
        String str3 = args[2];
        String name = args[3];
        int length=args.length;

        double answer=Double.parseDouble(str1)+Double.parseDouble(str2);

        int answer2=Integer.parseInt(str1)+Integer.parseInt(str3);

        System.out.println("Answer is " + answer);
        System.out.println("Answer is " + answer2);
        System.out.println("Welcome " + name);
        System.out.println("Nuumber of inputs " + length);
    }
}
