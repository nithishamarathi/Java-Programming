import java.util.Scanner;
class LeapYear {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a year");
        int year=sc.nextInt();
        String res=leapYear(year);
        System.out.println(res);
    }
    public static String leapYear(int year){
        if(year%4==0 || year%400 ==0 && year%100!=0)
            return "Leap Year";
        else
            return "Not a Leap Year";
    }
}
