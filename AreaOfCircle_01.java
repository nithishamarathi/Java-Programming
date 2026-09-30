import java.util.Scanner;
class AreaOfCircle_01
{
    public static void main(String args[])
    {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the circle: ");
        int radius = sc.nextInt();
        
        String result = areaOfCircle(radius);
        System.out.println(result);
    }
    public static String areaOfCircle(int radius)
    { 
        double pie = 3.14;
        double area = pie * radius * radius;
        double perimeter = 2 * pie * radius;
        return "The area of the circle is: " + area + " and the perimeter is: " + perimeter;
    }
}