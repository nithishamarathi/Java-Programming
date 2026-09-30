import java.util.Scanner;
class SunnyNo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n value");
        int n=sc.nextInt();
        System.out.println(sunny(n));
    }
    public static String sunny(int n){
        int res=n+1;
        for(int i=1;i<=res/2;i++){
            if(i*i==res){
                return "Sunny No";
            }
        }
        return "Not a Sunny NO";
    }
}
