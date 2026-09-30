import java.util.Scanner;
class PalindromeNumber{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
       System.out.println( palindromeNo(n));
    }
    public static String palindromeNo(int n){
        int temp=n;
        int rev=0;
        while(n>0){
            int rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        if(temp==rev)
            return "PalindromeNo";
        else
            return "Not a PalindromeNo";
        
    }
}