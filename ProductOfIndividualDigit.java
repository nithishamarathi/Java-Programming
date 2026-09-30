import java.util.Scanner;
class ProductOfIndividualDigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n value");
        int n=sc.nextInt();
        productOfIndividualDigit(n);

    }
    public static void productOfIndividualDigit(int n){
        int product=1;
        while(n>0){
            int d=n%10;
            System.out.println(n);
            n=n/10;
            product=product*d;
        }
        System.out.println(product);
    }
}
