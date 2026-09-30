import java.util.Scanner;
class XylemorPhloemNo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n Value");
        int n=sc.nextInt();
        System.out.println(xylemOrPhlorem(n));
    }
    public static String xylemOrPhlorem(int n){
        int d=n%10;
        int sum=0;
        n=n/10;
        while(n>9){
            int d1=n%10;
            sum=sum+d1;
            n=n/10;
        }
        n=n+d;
        if(n==sum)
            return "Xylem No";
        else
            return "Phloem No";
        
    }
}
