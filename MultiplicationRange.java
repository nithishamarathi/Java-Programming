import java.util.Scanner;

class MultiplicationRange {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter m value");
        int m=sc.nextInt();
        System.out.println("Enter n value");
        int n=sc.nextInt();
        multiply(m,n);
    }
    public static void multiply(int m,int n){
        for(int i=1;i<=n;i++){
            System.out.println(m + "*" + i + "=" + m*i);
        }
        
    }
}
