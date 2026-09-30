import java.util.Scanner;
class Digit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a character");
        char ch=sc.next().charAt(0);
        String res=digit(ch);
        System.out.println(res);
    }
    public static String digit(char ch){
        if(ch>='0' && ch<='9')
            return "Digit";
        else
            return "Not a digit";
    }
}
