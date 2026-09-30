import java.util.Scanner;
class PrimeNo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a value");
        int a=sc.nextInt();
        System.out.println("Enter b value");
        int b=sc.nextInt();
        primeNo(a,b);
    }
    public static void primeNo(int a,int b){
        int count=0;
        for(int i=a;i<=b;i++){
            if(b%i==0){
                count++;
            }
        
        if(count==2)
            System.out.println(i);

    }  
        
    }
}
