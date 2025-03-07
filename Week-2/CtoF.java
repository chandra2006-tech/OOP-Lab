import java.util.Scanner;
class CtoF
{
     public static void main(String args[])
     {
         Scanner sc = new Scanner(System.in);
         float fahrenheit;
         System.out.println("temperature in celsius :");
         float celsius = sc.nextFloat();
          fahrenheit= (celsius*9/5)+32;
         System.out.println("temperatue in Fahrenheit :"+fahrenheit);
      }
}