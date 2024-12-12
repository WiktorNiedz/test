import java.util.*;
abstract class Animal{
    abstract void  makesound();
    String name;
    int age;
    public Animal(String name,int age){
        this.name = name;
        this.age = age;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }

}

interface Adoptable{
 boolean adopt();


}
class Dog extends Animal implements Adoptable {

    public void makesound() {
        System.out.println("Dog makesound");
    }

    public Dog(String name, int age) {
        super(name, age);

    }
    public boolean adopt() {
        if (age > 1) {
            return true;

        } else {
            return false;
        }

    }
}

class Cat extends Animal implements Adoptable{
    public Cat(String name, int age) {
        super(name, age);
    }


    public boolean adopt() {
         if (age>1){
             return true;
         }
         else{
             return false;
         }
    }

    public void makesound(){
        System.out.println("Cat makesound");

    }

}

class Horse extends Animal implements Adoptable{
    public Horse(String name, int age) {
        super(name, age);
    }

    public void makesound(){
        System.out.println("Horse makesound");
    }

      public boolean adopt() {
            if (age>1){
            return true;
            }
            else{
                return false;
            }
      }

    }



public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("rex",10);
        Cat cat = new Cat("kot",10);
        Horse horse = new Horse("zywiec zdruj",10);

        ArrayList<Animal> animal = new ArrayList<>();
        animal.add(new Dog("rex",10));
        animal.add(new Cat("kot",10));
        animal.add(new Horse("zywiec zdruj",10));

        for (Animal a : animal) {
            System.out.println("name  " + a.getName());
            System.out.println("wiek  " + a.getAge());
        }
        double srednia=(cat.age+horse.age+dog.age)/3;
        System.out.println(srednia);



    }

}

