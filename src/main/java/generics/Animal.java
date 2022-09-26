package generics;

public class Animal {

    private int walkingDistance;

    public Animal() {
    }

    public Animal(int walkingDistance) {
        this.walkingDistance = walkingDistance;
    }

    public void walk(){
        System.out.println("Let`s walk!!!");
    }
}
