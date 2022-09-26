package reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Comparator;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class ReflectionExample {

    public static void main(String[] args) throws Exception {

        Cat myCat = new Cat("Pesho", 15);

        Field[] catFields = myCat.getClass().getDeclaredFields();

        Arrays.stream(catFields).forEach(f -> System.out.println(f.getName()));

        for(Field filed : catFields){
            if (filed.getName().equals("name")){
                filed.setAccessible(true);
                filed.set(myCat, "Jimmy");
            }
        }

        System.out.println(myCat.getName());

        System.out.println("==============================================");


        Method[] declaredMethods = myCat.getClass().getDeclaredMethods();

        for (Method method : declaredMethods){
            System.out.println(method.getName());
        }

        System.out.println("==============================================");

        Arrays.stream(declaredMethods).sorted((f,s) -> s.getName().compareTo(f.getName()))
                .forEach(m-> System.out.println(m.getName()));

//        Arrays.stream(members).filter(e -> e.getName().contains(filter))
//                .collect(Collectors.toCollection(() -> new TreeSet<>(Comparator.comparing(Member::getName))));


        Arrays.stream(declaredMethods).filter(m->m.getName().equals("heyThisIsPrivate"))
                .findFirst().get().setAccessible(true);
        Arrays.stream(declaredMethods).filter(m->m.getName().equals("heyThisIsPrivate"))
                .findFirst().get().invoke(myCat);


        Arrays.stream(declaredMethods).filter(m->m.getName().equals("thisIsPublicAndStatic"))
                .findFirst().get().setAccessible(true);
        Arrays.stream(declaredMethods).filter(m->m.getName().equals("thisIsPublicAndStatic"))
                .findFirst().get().invoke(null);



    }
}
