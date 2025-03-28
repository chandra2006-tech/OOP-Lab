class Shape {
    
    void CalArea(double side){
        System.out.println("Area of the Square: "+side*side);
    }
    
     void CalArea(double length, double width){
        System.out.println("Area of the Rectangle:"+length*width);
    }
    
}

class Circle extends Shape {
    
     void CalArea(double radius){
        System.out.println("Area of the Circle: "+radius*radius*3.14);
    }
}

class Main {
    
    public static void main(String[] args) {
        
        Shape s = new Shape();
        s.CalArea(7.2);
        s.CalArea(3.1,4);
        
        Circle c = new Circle();
        c.CalArea(9);
        
    }
}

