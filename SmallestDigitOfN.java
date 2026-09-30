import java.util.Scanner;
class SmallestDigitOfN {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n value");
        int n=sc.nextInt();
        System.out.println(smallestDigit(n));
    }
    public static int smallestDigit(int n){
        int min=9;
        while(n>0){
           int rem=n%10;
           if(rem<min){
            min=rem;
           }
           n=n/10;  
        }
        return min;
    }
}
