import java.util.Scanner;
class SumOfN {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n value");
        int n=sc.nextInt();
        System.out.println(sumOfN(n));
    }
    public static int sumOfN(int n){
        int sum=0;
        for(int i=0;i<=n;i++){
            sum=sum+i;
        }
        return sum;
    }
}
