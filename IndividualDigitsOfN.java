import java.util.Scanner;
class IndividualDigitsOfN {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n value");
        int n=sc.nextInt();
        extractIndividualDigits(n);
    }
    public static void extractIndividualDigits(int n){
        while(n>0){
            int d=n%10;
            System.out.println(d);
            n=n/10;
        }
    }
}
