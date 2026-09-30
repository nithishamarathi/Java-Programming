import java.util.Scanner;
class TechNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n value");
        int n=sc.nextInt();
        System.out.println(techNo(n));
    }
    public static int count(int n){
        int c=0;
        while(n>0){
            c++;
            n/=10;
        }
        return c;
        
    }
    public static String techNo(int n){
        int res=0;
        int temp=n;
        int c=count(n);
        if(c%2!=0){
            return "Not Tech Number";

        }
        else{
            int power=1;
            for(int i=1;i<=c/2;i++){
                power=power*10;
            }
            int n1=n%power;
            int n2=n/power;
            int sum=n1+n2;
            res=sum*sum;
        }
        if(temp==res)
            return "Tech Number";
        else
            return "Not a Tech Number";
    }
}
