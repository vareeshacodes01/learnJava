abstract class Shape{
    public abstract double getArea();
    public abstract double getPerimeter();
    public void display(){
        System.out.println("area= "+getArea());
        System.out.println("perimeter= "+getPerimeter());
    }
}
 class Circle extends Shape  {
    double radius;
    Circle(double radius ){
        this.radius=radius;
    }
    public double getArea(){
        return Math.PI*radius*radius;
    } 
    public double getPerimeter(){
        return 2*3.14*radius;
    }
}
 class Rectangle extends Shape  {
    double length,breadth;
    Rectangle(double length,double breadth ){
        this.length=length;
        this.breadth=breadth;
    }
    public double getArea(){
        return length*breadth;
    } 
    public double getPerimeter(){
        return 2*(length+breadth);
    }
}
 class Triangle extends Shape  {
    double h,p,b;
    Triangle(double h,double p,double b ){
        this.h=h;
        this.p=p;
        this.b=b;
    }
    public double getArea(){
        return (b*p)/2.0;
    } 
    public double getPerimeter(){
        return h+p+b;
    }
}

public class ShapeHierarchy {
    public static void main(String[] args) {
        Shape[] arr=new Shape
         [3];
        arr[0]=new Circle(2.5);
        arr[1]=new Rectangle(1.2, 1.3);
        arr[2]=new Triangle(5,4, 3);
        for(Shape obj:arr){
            System.out.println(obj.getArea());
            System.out.println(obj.getPerimeter());
        }

    }
}
