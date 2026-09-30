import java.util.Scanner;
class CubeOfIndividualDigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n value");
        int n=sc.nextInt();
        cubeOfIndividualDigits(n);
    }
    public static void cubeOfIndividualDigits(int n){
        while(n>0){
           int d=n%10;
            System.out.println(d*d*d);
            n=n/10;
        }
    }
}
