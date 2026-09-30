import java.util.Scanner;
class UpperCase {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a character");
        char ch=sc.next().charAt(0);
        String res=upper(ch);
        System.out.println(res);
    }
    public static String upper(char ch){
        if(ch>='A'&& ch<='Z')
            return "UpperCase";
        else
            return "Not a UpperCase";
    }
}
