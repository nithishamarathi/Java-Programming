import java.util.Scanner;
class BiggestDigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n value");
        int n=sc.nextInt();
        System.out.println(biggestDigit(n));
    }
    public static int biggestDigit(int n){
        int max=0;
        while(n>0){
           int rem=n%10;
           if(rem>max){
            max=rem;
           }
           n=n/10;  
        }
        return max;
    }
}
