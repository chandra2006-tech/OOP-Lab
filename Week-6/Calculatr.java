class Calculater {
    
    void addition(int num1, int num2) {
        System.out.println(num1+num2);
    }
    
        void addition(double num1, double num2) {
        System.out.println(num1+num2);
    }
    
        void addition(int num1, int num2, int num3) {
        System.out.println(num1+num2+num3);
    }
    
    public static void main(String[] args) {
        
        Calculater c = new Calculater();
        c.addition(4,5);
        c.addition(4.5,5.64);
        c.addition(4,5,6);
    }
}

