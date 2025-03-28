class vehicle {
    
    void DisplayInfo() {
        System.out.println("VEHICLE");
        System.out.println("Model");
        System.out.println("fuel");
        System.out.println("color");
        System.out.println("seats");
        System.out.println("engine");
        System.out.println("price");
        System.out.println("milage\n");
        
    }
}

class car extends vehicle {
    
    void DisplayInfo() {
        System.out.println("CAR");
        System.out.println("Model: maruti Swift 2024");
        System.out.println("fuel: petrol");
        System.out.println("color: red");
        System.out.println("seats: 4 seater");
        System.out.println("engine: german engine");
        System.out.println("price: 8 lakhs");
        System.out.println("milage: 32km/l");
    }
}

class Main {
    public static void main(String[] args) {
        vehicle v = new vehicle();
        v.DisplayInfo();
        
        car c = new car();
        c.DisplayInfo();
    }
}
