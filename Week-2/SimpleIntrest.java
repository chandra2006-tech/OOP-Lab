import java.util.Scanner;

class SimpleIntrest{

    public static void main(String args[])
    {
        
        Scanner sc = new Scanner(System.in);
        float intrest;
        System.out.println("Principal amount:");
        int principal = sc.nextInt();
        System.out.println("no of years:");
        int years = sc.nextInt();
        System.out.println("rate of interest:");
        float rate = sc.nextFloat();
        intrest = (principal*years*rate)/100;
        System.out.println("Simple interest is :"+intrest);
   
}
}