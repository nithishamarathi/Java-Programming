import java.util.Scanner;
class Spy {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n value");
        int n=sc.nextInt();
        System.out.println(spy(n));
    }
    public static String spy(int n){
        int sum=0;
        int product=1;
        while (n>0) {
            int rem=n%10;
            sum=sum+rem;
            product=product*rem;
            n=n/10;
        }
        if(sum==product)
            return "Spy No";
        else
            return "Not a Spy No";
    }
}
