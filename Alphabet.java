import java.util.Scanner;
class Alphabet {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a character");
        char ch=sc.next().charAt(0);
        String res=alphabet(ch);
        System.out.println(res);

    }
    public static String alphabet(char ch){
        if(ch>='A'&& ch<='Z'|| ch>='a'&& ch<='z')
            return "Alphabet";
        else
            return "Not a Alphabet";
    }
}
