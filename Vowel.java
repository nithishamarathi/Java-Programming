 import java.util.Scanner;
 class Vowel {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a character");
        char ch=sc.next().charAt(0);
        String res=vowel(ch);
        System.out.println(res);

        

    }
    public static String vowel(char ch){
        switch(ch){
            case 'A','E','I','O','U','a','e','o','i','u':{
                return "Vowel";
            }
            default:{
                return "Not a vowel";
            }
        }
    }
    
}
