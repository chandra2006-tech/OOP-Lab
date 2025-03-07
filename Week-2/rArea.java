import java.util.Scanner;
class rArea
{
   public static void main(String args[])
   {
         int area;
        Scanner sc = new Scanner(System.in);
        System.out.println("Length of Rectngle:");
        int length = sc.nextInt();
        System.out.println("breadth of Rectngle:");
        int breadth = sc.nextInt();
        area = length*breadth;
        System.out.println("Area of rectangle:"+area);
   }
} 