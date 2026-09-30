import java.util.Scanner;
class NthPrimeNo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter nth value");
        int n=sc.nextInt();
        
        int c1=0;
        for(int i=1;true;i++)
        {
            int count=0;
            for(int j=1;j<=i;j++)
            {
                if(i%j==0)
                {
                    count++;
                }
            }
            if(count==2)
            {
                c1++;
                if(c1==n)
                {
                System.out.println(i);
                break;
               }
           }
        }
    }
}
         