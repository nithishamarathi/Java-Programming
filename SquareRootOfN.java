import java.util.Scanner;
class SquareRootOfN {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n value");
        int n=sc.nextInt();
        System.out.println(squareRoot(n));
    }
    public static int squareRoot(int n){
        for(int i=1;i<=n/2;i++){
            if(i*i==n)
                return i;
        }
        return -1;
    }
}
