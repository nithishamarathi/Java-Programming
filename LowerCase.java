import java.util.Scanner;
class LowerCase {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a character");
        char ch=sc.next().charAt(0);
        String res=lower(ch);
        System.out.println(res);
    }
    public static String lower(char ch){
        if(ch>='a'&& ch<='z')
            return "LowerCase";
        else
            return "Not a LowerCase";
    }
}
