import java.util.Scanner;
class LoweToUpper_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a lowercase character: ");
        char ch = sc.next().charAt(0);
        convertToUpperCase(ch);
    }

    public static void convertToUpperCase(char ch) {
        System.out.println("The uppercase character is: " + (char)(ch - 32));
    }
}
