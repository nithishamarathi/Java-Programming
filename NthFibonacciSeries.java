import java.util.Scanner;
class NthFibonacciSeries {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n value");
        int n=sc.nextInt();
        // nthFibonacciSeries(n);
        System.out.println(nthFibonacciSeries(n));
    }

    //*By uisng int returntype */
    
    public static int nthFibonacciSeries(int n){
        int a=0,b=1,c=1;
        
        for(int i=1;true;i++){
            if(i==n)
                return c;
            c=a+b;
            a=b;
            b=c;
        }
    }

    //*By using void returntype */

    // public static void nthFibonacciSeries(int n){
    //     int a=0,b=1,c=1;
    //     for(int i=1;true;i++){
    //         if(i==n){
    //             System.out.println(c);
    //             break;
    //         }
    //         c=a+b;
    //         a=b;
    //         b=c;
    //     }
    // }
}
