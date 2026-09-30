import java.util.Scanner;
class EvenNoRange{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a value");
        int a=sc.nextInt();
        System.out.println("Enter b value");
        int b=sc.nextInt();
        even(a,b);
    }
    public static void even(int a,int b){
        for(int i=a;i<=b;i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
    }
}