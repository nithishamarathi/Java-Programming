import java.util.Scanner;
class NeonNo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n value");
        int n=sc.nextInt();
        System.out.println(neon(n));
    }
    public static String neon(int n){
        int prod=n*n;
        int sum=0;
        while(prod>0){
            int rem=prod%10;
            sum=sum+rem;
            prod=prod/10;
        }
        if(sum==n)
            return "Neon No";
        else
            return "Not a Neon No";
    }
}
