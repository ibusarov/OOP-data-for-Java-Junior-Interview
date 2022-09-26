package annotation;

import reflection.RunImmediately;
import reflection.VeryImportant;

@VeryImportant
public class Cat {
    String name;
    int age;

    public Cat() {
    }

    public Cat(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @RunImmediately(times = 3)
    public void meow(){
        System.out.println("Meow..........");
    }

    private void heyThisIsPrivate(){
        System.out.println("I am private method....");
    }

    private static void thisIsPublicAndStatic(){
        System.out.println("I am private and static method.....");
    }
}
