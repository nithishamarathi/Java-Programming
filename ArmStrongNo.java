import java.util.Scanner;
class ArmStrongNo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n value");
        int n=sc.nextInt();
        System.out.println(armStrong(n));
    }
        public static String armStrong(int n){
        int temp=n;
        int count=0;
        int sum=0;
        while(temp>0){
            temp=temp/10;
            count++;
        }
        temp=n;
        while(temp>0){
            int rem=temp%10;
            int power=1;
            for(int i=1;i<=count;i++){
                power=power*rem;
            }
            sum=sum+power;
            temp=temp/10;
        }
        if(sum==n)
            return "ArmStrong No";
        else
            return "Not a ArmStrong No";
    }
}
