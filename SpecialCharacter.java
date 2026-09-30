import java.util.Scanner;
class SpecialCharacter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a character");
        char ch=sc.next().charAt(0);
        String res=specialCharacter(ch);
        System.out.println(res);
    }
    public static  String specialCharacter(char ch){
        if(!(ch>='A'&& ch<='Z'|| ch>='a'&& ch<='z'||ch>='0'&& ch<='9'))
            return "Special Character";
        else
            return "Not a Special Charcater";
    }
}
