import java.util.Scanner;
class UpperToLower_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an uppercase character: ");
        char ch = sc.next().charAt(0);
        convertToLowerCase(ch);
    }

    public static void  convertToLowerCase(char ch) {
        System.out.println("The lowercase character is: " + (char)(ch + 32));
    }
}
