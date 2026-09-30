import java.util.Scanner;
public class CountPrimeNo {
     public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter start value");
        int start=sc.nextInt();
        System.out.println("Enter end value");
        int end=sc.nextInt();
        System.out.println(countOfPrimeNo(start, end));
    }
    public static int countOfPrimeNo(int start,int end)
    {
        int count1=0;
        for(int i=start;i<=end;i++)
        {
            int count=0;
            for(int j=1;j<=i;j++)
            {
            if(i%j==0)
                count++;
            }
        if(count==2)
            count1++;
          
        }
        return count1;
    }
}
