package dailyTask;

public class Task1{
    public static void main(String[] args) {
        Animal animal=new Animal();
        Dog dog =new Dog();
        Cat cat =new Cat();
        Bird bird=new Bird();
        animal.makesound();
        dog.makesound();
        cat.makesound();
        animal.name();
        animal.name(2);
    
    }
    

}
class Animal{
    public void makesound(){
        System.out.println("i am an animal");
    }
    public void name(){
        System.out.println("animal name is dog");
    }
    public void name(int a){
        System.out.println("animal name is cat");
    }
}
class Dog extends Animal{
    public void makesound(){
        System.out.println("i am a dog");
    }
}
class Cat {
    public void makesound(){
        System.out.println("i am a cat");

    }
}
class Bird {
    public void makesound(){
        System.out.println("i am a bird");
    }
}

