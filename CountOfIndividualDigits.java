import java.util.Scanner;
class CountOfIndividualDigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n value");
        int n=sc.nextInt();
        countIndividualDigits(n);
    }
    public static void countIndividualDigits(int n){
        int count=0;
        while(n>0){
            count++;
            n=n/10;
        }
        System.out.println(count);
    }
}
