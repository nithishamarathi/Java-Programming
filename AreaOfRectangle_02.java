import java.util.Scanner;
public class AreaOfRectangle_02 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the rectangle: ");
        int length = sc.nextInt();
        System.out.println("Enter the breadth of the rectangle: ");
        int breadth = sc.nextInt();
        
        String result = areaOfRectangle(length, breadth);
        System.out.println(result);
    }
    
    public static String areaOfRectangle(int length, int breadth) {
        int area = length * breadth;
        int perimeter = 2 * (length + breadth);
        return "The area of the rectangle is: " + area + " and the perimeter is: " + perimeter;
    }
    
}
