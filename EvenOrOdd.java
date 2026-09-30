import java.util.Scanner;
class EvenOrOdd
{
    public static void main(String [] args){

Scanner sc=new Scanner(System.in);
System.out.println("Enter n value");
int n=sc.nextInt();
String res= (evenOrOdd(n));
System.out.println(res);

    }
    public static String evenOrOdd(int n){
        if(n%2==0)
        return "Even";
        else
            return "Odd";
    }
}