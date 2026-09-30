import java.util.Scanner;
class HarshadNo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n value");
        int n=sc.nextInt();
        System.out.println(harshadNo(n));
    }
    public static String harshadNo(int n){
        int sum=0;
        int temp=0;
        while(n>0){
            int d=n%10;
            sum=sum+d;
            n/=10;
        }
        if(temp%sum==0)
            return "Harshad Number";
        else
            return "Not a Harshad Number";
    }
}
