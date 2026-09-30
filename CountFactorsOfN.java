import java.util.Scanner;
class CountFactorsOfN {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n value");
        int n=sc.nextInt();
        System.out.println(countOfFactorsOfN(n));
}
public static int countOfFactorsOfN(int n){
    int count=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                count++;
            }
        }
        return count;
    }
}
