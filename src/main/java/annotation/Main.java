package annotation;

import reflection.RunImmediately;
import reflection.VeryImportant;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {

        @SuppressWarnings("unused")
        Cat myCat = new Cat();

        System.out.println(myCat.getClass().isAnnotationPresent(VeryImportant.class));

        Arrays.stream(myCat.getClass().getDeclaredMethods())
                .filter(m -> m.isAnnotationPresent(RunImmediately.class))
                .forEach(m -> {
                    try {
                        m.invoke(myCat);
                    } catch (IllegalAccessException e) {
                        throw new RuntimeException(e);
                    } catch (InvocationTargetException e) {
                        throw new RuntimeException(e);
                    }
                });


        Method[] declaredMethods = myCat.getClass().getDeclaredMethods();

        for (Method method : declaredMethods){
            if (method.isAnnotationPresent(RunImmediately.class)){
                RunImmediately annotation = method.getAnnotation(RunImmediately.class);

                for (int i = 0; i < annotation.times() ; i++) {
                    method.invoke(myCat);
                }
            }
        }


    }
}
