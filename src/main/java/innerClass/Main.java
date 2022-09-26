package innerClass;

public class Main {
    public static void main(String[] args) {

        OuterClass outer = new OuterClass();

        outer.heyThere();

        OuterClass.InnerClass inner = outer.new InnerClass();

        inner.whatsUp();

        OuterClass.InnerClassNew newInner = new OuterClass.InnerClassNew();
        newInner.whatsUp();
    }
}
