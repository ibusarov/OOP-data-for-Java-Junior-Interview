package innerClass;

public class OuterClass {

    int number = 6;

    public void heyThere() {
        System.out.println("Hey there!");

        class LocalInnerClass {
            final String localClassVariable = "Hey there from Local Inner Class";

            public void printLocalInnerClassVariable(){
                System.out.println(localClassVariable);
            }
        }
        LocalInnerClass cls = new LocalInnerClass();
        cls.printLocalInnerClassVariable();
    }

    public class InnerClass {
        int innerNumber = 8;

        public void whatsUp() {
            System.out.println("What's up from inner class....");
        }
    }

    public static class InnerClassNew {
        int innerNumber = 8;

        public void whatsUp() {
            System.out.println("What's up from static inner class....");
        }
    }

}
