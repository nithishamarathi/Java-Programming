import java.util.Scanner;
class PerfectNo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number");
        int n=sc.nextInt();
        System.out.println(perfectNo(n));
    }
    public static String perfectNo(int n){
        int sum=0;
        for(int i=1;i<n;i++){
            if(n%i==0){
                sum=sum+i;
            }
        }
        if(sum==n)
            return "Perfect No";
            else
                return "Not a Perfect No";
        
    }
}
