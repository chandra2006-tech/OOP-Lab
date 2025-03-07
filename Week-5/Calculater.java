import java.util.Scanner;

class Calculater {

    public double num1;
    public double num2;
    Scanner sc = new Scanner(System.in);

    void input() {
       
        System.out.println("Enter the first number: ");
        this.num1 = sc.nextDouble();
        System.out.println("Enter the second number: ");
        this.num2 = sc.nextDouble();
        
    
    }

}

class Add extends Calculater {
    
    public double add() {
    return num1+num2;
    }

}

class Sub extends Add {
    
    public double sub() {
    return num1-num2;
    }
    
}

class Mul extends Sub {
    
    public double mul() {
    return num1*num2;
    }
    
}

class Div extends Mul {
    
    public double div() {
    return num1/num2;
    }
    
}

class main {
    public static void main(String[] args) {
        Div object = new Div();
        object.input();
        System.out.println("Addition: "+object.add());
        System.out.println("Subraction: "+object.sub());
        System.out.println("Multiplication: "+object.mul());
        System.out.println("Division: "+object.div());

    }   
}
