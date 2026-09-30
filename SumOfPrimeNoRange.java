import java.util.Scanner;
class SumOfPrimeNoRange {
    
        public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter start value");
        int start=sc.nextInt();
        System.out.println("Enter end value");
        int end=sc.nextInt();
        System.out.println(sumOfPrimeNoRange(start, end));
    }
    public static int sumOfPrimeNoRange(int start,int end)
    {
        int sum=0;
        for(int i=start;i<=end;i++)
        {
            int count=0;
            for(int j=1;j<=i;j++)
            {
            if(i%j==0)
                count++;
            }
        if(count==2)
            sum=sum+i;;
          
        }
        return sum;
    }
}
    

