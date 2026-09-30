import java.util.Scanner;
class DisariumNo{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n value");
        int n=sc.nextInt();
        System.out.println(disariumNo(n));
    }
    public static String disariumNo(int n){
        int temp=n;
        int count=0;
        int sum=0;
        while (temp>0) {
            count ++;
            temp=temp/10;
        }
        temp=n;
        while (temp>0) {
            int digit =temp%10;
            int power=1;
            for(int i=1;i<=count;i++){
                power=power*digit;

            }
            sum=sum+power;
            count--;
            temp=temp/10;
        }
        if(sum==n)
            return "Disarium No";
        else
            return "Not a Disarium No";
    }
}