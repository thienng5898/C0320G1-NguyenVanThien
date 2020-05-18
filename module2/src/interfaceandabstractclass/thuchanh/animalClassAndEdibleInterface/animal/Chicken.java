package interfaceandabstractclass.thuchanh.animalClassAndEdibleInterface.animal;

import interfaceandabstractclass.thuchanh.animalClassAndEdibleInterface.Edible;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "cục tác" ;
    }

    @Override
    public String howtoEat() {
        return "could be fried";
    }
}
