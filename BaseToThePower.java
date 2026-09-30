import java.util.Scanner;
class BaseToThePower {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter base value");
        int base=sc.nextInt();
        System.out.println("Enter power");
        int power=sc.nextInt();
        System.out.println(power(base,power));

        
    }
    public static int power(int base,int power ){
        int prod=1;
        // for(int i=1;i<=power;i++){
        //     prod=prod*base;
        // }
        
        while(power>0){
            prod=prod*base;
            power--;
        }
        return prod;
    }
    
}
