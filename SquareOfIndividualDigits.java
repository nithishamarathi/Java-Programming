import java.util.Scanner;
class SquareOfIndividualDigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n value");
        int n=sc.nextInt();
        squareOfIndividualDigits(n);
    }
    public static void squareOfIndividualDigits(int n){
        while(n>0){
           int d=n%10;
            System.out.println(d*d);
            n=n/10;
        }
    }
}
