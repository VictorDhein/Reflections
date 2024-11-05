package Animais;

import java.lang.reflect.Field;

public class ReflectionExample {
    public static void main(String[] args) {
        try {
            Class<?> animalClass = Animal.class;

            if (animalClass.isAnnotationPresent(Entidade.class)) {
                System.out.println("A classe Animal é uma entidade.");
            }

            for (Field field : animalClass.getDeclaredFields()) {
                if (field.isAnnotationPresent(Id.class)) {
                    System.out.println("Campo " + field.getName() + " é um ID.");
                } else if (field.isAnnotationPresent(Nome.class)) {
                    System.out.println("Campo " + field.getName() + " é um Nome.");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
