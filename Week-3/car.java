import java.util.Scanner;
class car
{

    public String Car_color;
    public String Car_brand;
    public String fuel_type;
    public int mileage;
   public void start()
   {

       System.out.println("Car Started:");
       System.out.println("Car color is :"+Car_color);
       System.out.println("Car Brand is:"+Car_brand);
       System.out.println("Car fuel type is:"+fuel_type);
       System.out.println("Car mileage is:"+mileage);
   }
    public void service()
    
   {
       System.out.println("The Car has been serviced");
     
   }
    public void stop()
    
   {
       System.out.println("The Car has stopped");
    
   }
   public static void main(String args[])
   {   System.out.println("Chandra TEj\n\n\n");
       car car1 = new car();
       car1.Car_color = "Blue";
       car1.Car_brand = "hundai";
       car1.fuel_type = "Deisel";
       car1.mileage = 150;
       car1.start();
       car1.service();
       car1.stop();
     
       car car2 = new car();
       car2.Car_color = "Red";
       car2.Car_brand = "maruti";
       car2.fuel_type = "petrol";
       car2.mileage = 20;
       car2.start();
       car2.service();
       car2.stop();

       car car3 = new car();
       car3.Car_color = "Yellow";
       car3.Car_brand = "TATA";
       car3.fuel_type = "EV";
       car3.mileage = 100;
       car3.start();
       car3.service();
       car3.stop();
      
    }
}
       
    