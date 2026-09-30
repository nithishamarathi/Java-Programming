import java.util.Scanner;
class FactorOfNOrNot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n value");
        int n=sc.nextInt();
        System.out.println("Enter factor");
        int factor=sc.nextInt();
        System.out.println(factor(factor,n));
    }
    public static String factor(int factor,int n ){
        if(n%factor==0)
            return "Factor of N";
        else
            return "Not factor of N";
    }
}
 