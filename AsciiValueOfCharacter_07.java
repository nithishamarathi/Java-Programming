import java.util.Scanner;
class AsciiValueOfCharacter_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character: ");
        char ch = sc.next().charAt(0);
        int asciiValue = getAsciiValue(ch);
        System.out.println("The ASCII value of " + ch + " is: " + asciiValue);
    }
    public static int getAsciiValue(char ch) {
        return (int) ch;
    }
}
