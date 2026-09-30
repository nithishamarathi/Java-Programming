 import java.util.Scanner;
 class AreaOfSquare_03 {
    Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the square: ");
        int length = sc.nextInt();
        
        String result = areaOfSquare(length);
        System.out.println(result);
    }
    
    public static String areaOfSquare(int length) {
        int area = length * length;
        int perimeter = 4 * length;
        return "The area of the square is: " + area + " and the perimeter is: " + perimeter;
    }
}
