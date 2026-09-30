import java.util.Scanner;
class StrongNoOrNot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n value");
        int n=sc.nextInt();
        //sumOfFactorial(n);
        System.out.println(extract(n));

    }
    public static int fact(int n){
    int fact=1;
    for(int i=n;i>0;i--){
        fact=fact*i;
    }
    return fact;
}
public static String extract(int n){
    int sum=0;
    int temp=n;
    while(n>0){
        int d=n%10;
        sum=sum+fact(d);
        n=n/10;
    }
    
if(temp==sum)
    return "Strong Number";
else
    return "Not a Strong Number";
}
}
