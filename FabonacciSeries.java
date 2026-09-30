import java.util.Scanner;
class FabonacciSeries {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n value");
        int n=sc.nextInt();
        fibonacciSeries(n);
    }
    public static void fibonacciSeries(int n){
        int a=0,b=1,c=1 ;//c=1 or 0
        while(a<=n){
            System.out.println(a);
            c=a+b;
            a=b;
            b=c;
        }
    }
}
