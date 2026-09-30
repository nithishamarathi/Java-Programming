import java.util.Scanner;
class ProductOfN {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n value");
        int n=sc.nextInt();
        System.out.println(prod(n));
    }
    public static int prod(int n){
        int prod=1;
        for(int i=1;i<=n;i++){
            prod=prod*i;

        }
        return prod;
    }
}
