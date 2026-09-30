import java.util.Scanner;
class BuzzNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n value");
        int n=sc.nextInt();
        System.out.println(buzzNo(n));
    }
    public static String buzzNo(int n){
        if(n%7==0 || n%10==7)
            return "Buzz Number";
        else
            return "Not a Buzz Number";
    }
}
