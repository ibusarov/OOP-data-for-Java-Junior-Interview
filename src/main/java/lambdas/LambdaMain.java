package lambdas;

public class LambdaMain {

    public static void main(String[] args) {


        Printable lambdaPrintable = (i) -> {
            System.out.println("Meow" + i);
            return "Meow" + i;
        };
        printThing(lambdaPrintable);

    }

    private static void printThing(Printable thing) {
        thing.print(" Pesho!");
    }
}
