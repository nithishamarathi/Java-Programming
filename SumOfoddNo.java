import java.util.Scanner;
class SumOfOddNo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter start value");
        int start=sc.nextInt();
        System.out.println("Enter end value");
        int end=sc.nextInt();
        System.out.println(sumOfOdd(start, end));
    }
    public static String sumOfOdd(int start,int end){
        int sum=0;
        for(int i=start;i<=end;i++){
            if(i%2!=0)
                sum=sum+i;
        }
        return "Sum of Odd No is:"+sum;
    }
}

