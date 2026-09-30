import java.util.Scanner;
class SumOfFactorialofIndividualDigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n value");
        int n=sc.nextInt();
        //sumOfFactorial(n);
        System.out.println(extract(n));

    }
    //!By using one method
//     public static void sumOfFactorial(int n){
//         int sum=0;
//         while(n>0){
//             int d=n%10;
//             int fact=1;
            
//         for(int i=1;i<=d;i++){
//             fact=fact*i;      
//         }
//         sum=sum+fact; 
//         n=n/10;  
        
//     }  
//    System.out.println(sum);
//     }

//!By using 2 methods

public static int fact(int n){
    int fact=1;
    for(int i=n;i>0;i--){
        fact=fact*i;
    }
    return fact;
}
public static int extract(int n){
    int sum=0;
    while(n>0){
        int d=n%10;
        sum=sum+fact(d);
        n=n/10;
    }
    return sum;
}
}
