//Java Program to Display Fibonacci Series using loops
public class FibonacciSeries{
    public static void main(String[] args){
        int num1=0, num2=1;
        Scanner scan= new Scanner(System.in); //System.in is a standard input stream.
        System.out.print("Enter an integer: ");
        int n = scan.nextInt(); //reads integer.
        System.out.println(num1);
        System.out.println(num2);
        for (int i=3; i<=n; i++){
            int num3=num1+num2;
            System.out.println(num3);
            num1=num2;
            num2=num3;
        }
    }
}
