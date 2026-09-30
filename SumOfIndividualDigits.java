import java.util.Scanner;
class SumOfIndividualDigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n value");
        int n=sc.nextInt();
        sumOfIndividualDigit(n);

    }
    public static void sumOfIndividualDigit(int n){
        int sum=0;
        while(n>0){
            int d=n%10;
            System.out.println(n);
            n=n/10;
            sum=sum+d;
        }
        System.out.println(sum);
    }
}
