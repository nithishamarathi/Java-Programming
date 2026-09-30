
class First10FibonacciSeries {
    public static void main(String[] args) {
        
        first10FibonacciSeries(10);
        
    }
    public static void first10FibonacciSeries(int n)
    {

    int a=0,b=1,c=1 ;//c=1 or 0
        for(int i=1;i<=n;i++)
        {
            System.out.println(c);
            c=a+b;
            a=b;
            b=c;
        }
    }
}
