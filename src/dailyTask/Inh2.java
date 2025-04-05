package dailyTask;

public class Inh2 {
    public class Vehcile {
    public void move(){
        System.out.print("the vehcile is moving");
    }
    }
    class Car extends Vehcile{
        public void move(){
            System.out.println("the car is moving fast");
        }  
    }
    public static void main(String[] args) {
        Vehcile v=new Vehcile();
        v.move();


    }
}
