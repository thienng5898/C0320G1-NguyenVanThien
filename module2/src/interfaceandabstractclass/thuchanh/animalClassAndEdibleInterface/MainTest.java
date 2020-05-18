package interfaceandabstractclass.thuchanh.animalClassAndEdibleInterface;

import interfaceandabstractclass.thuchanh.animalClassAndEdibleInterface.animal.Animal;
import interfaceandabstractclass.thuchanh.animalClassAndEdibleInterface.animal.Chicken;
import interfaceandabstractclass.thuchanh.animalClassAndEdibleInterface.animal.Tiger;
import interfaceandabstractclass.thuchanh.animalClassAndEdibleInterface.fruit.Fruit;
import interfaceandabstractclass.thuchanh.animalClassAndEdibleInterface.fruit.Orange;

public class MainTest {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2] ;
        animals[0] = new Tiger();
        animals[1] = new Chicken() ;
        for (Animal animal : animals){
            System.out.println( animal.makeSound()) ;
            if (animal instanceof Chicken){
                Edible edible = (Chicken) animal ;
                System.out.println(edible.howtoEat());
            }

        }
        Fruit[] fruits =new Fruit[2] ;
        fruits[0] = new Orange() ;
        fruits[1] =new Orange() ;
        for (Fruit fruit : fruits) {
            System.out.println(fruit.howtoEat());
        }
    }
}
