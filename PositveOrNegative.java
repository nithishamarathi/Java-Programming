import java.util.Scanner;
class PositveOrNegative {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        String res=positiveOrNegative(n);
        System.out.println(res);
    }
    public static String positiveOrNegative(int n){
        if(n>=0)
            return "Positive";
        else
            return "Negative";
    }
}
