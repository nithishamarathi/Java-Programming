import java.util.Scanner;
class AtomorphicNo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n value");
        int n=sc.nextInt();
        System.out.println(atomorphicNo(n));
    }
    public static String atomorphicNo(int n){
        int sq=n*n;
        while (n>0) {
            if(n%10!=sq%10)
                return "Not a Atomorphic No";
            n/=10;
            sq/=10;  
        }
        return "Automorphic No";

        
    }
}
