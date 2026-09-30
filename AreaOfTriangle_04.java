import java.util.Scanner;
class AreaOfTriangle_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base of the triangle: ");
        int base = sc.nextInt();
        System.out.println("Enter the height of the triangle: ");
        int height = sc.nextInt();
        System.out.println("Enter the length of the first side of the triangle: ");
        int side1 = sc.nextInt();
        System.out.println("Enter the length of the second side of the triangle: ");
        int side2 = sc.nextInt();
        System.out.println("Enter the length of the third side of the triangle: ");
        int side3 = sc.nextInt();

        String result = areaOfTriangle(base, height, side1, side2, side3);
        System.out.println(result);
    }

    public static String areaOfTriangle(int base, int height, int side1, int side2, int side3) {
        double area = 0.5 * base * height;
        double perimeter = side1 + side2 + side3;
        return "The area of the triangle is: " + area + " and the perimeter is: " + perimeter;
    }
}
