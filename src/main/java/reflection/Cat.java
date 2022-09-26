package reflection;

public class Cat {
    String name;
    int age;

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
