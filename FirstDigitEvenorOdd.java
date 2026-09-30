import java.util.Scanner;
class FirstDigitEvenorOdd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n value");
        int n=sc.nextInt();
        System.out.println(digitEvenorOdd(n));
    }
    public static String digitEvenorOdd(int n){
        while (n>9) {
            n=n/10;
        

        }
        if(n%2==0)
            return "Even digit";
        else
            return "Odd digit";
    }
}
