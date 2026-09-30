import java.util.Scanner;
class PrimeNoRange 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter start value");
        int start=sc.nextInt();
        System.out.println("Enter end value");
        int end=sc.nextInt();
        primerNoRange(start, end);
    }
    public static void primerNoRange(int start,int end)
    {
        
        for(int i=start;i<=end;i++)
        {
            int count=0;
            for(int j=1;j<=i;j++)
            {
            if(i%j==0)
                count++;
            }
        if(count==2)
            System.out.println(i);
          
        }
    }
}
