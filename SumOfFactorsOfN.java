import java.util.Scanner;
class SumOfFactorsOfN {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n value");
        int n=sc.nextInt();
        sumOfFactorsOfN(n);
}
public static void sumOfFactorsOfN(int n){
    int sum=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                sum=sum+i;
            }
        }
        System.out.println(sum);
    }
}
