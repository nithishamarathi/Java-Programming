import java.util.Scanner;
class SumOfEvenNo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter start value");
        int start=sc.nextInt();
        System.out.println("Enter end value");
        int end=sc.nextInt();
        System.out.println(sumOfEven(start, end));
    }
    public static String sumOfEven(int start,int end){
        int sum=0;
        for(int i=start;i<=end;i++){
            if(i%2==0)
                sum=sum+i;
        }
        return "Sum of Even No is:"+sum;
    }
}
