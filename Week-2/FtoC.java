import java.util.Scanner;
class FtoC
{
     public static void main(String args[])
     {
         Scanner sc = new Scanner(System.in);
         float celsius;
         System.out.println("temperature in Fahrenheit :");
         float fahrenheit = sc.nextFloat();
         celsius = (fahrenheit-32)*5/9;
         System.out.println("temperatue in celsius :"+celsius);
      }
}