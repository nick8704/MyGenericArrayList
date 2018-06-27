package com.company;

public class Main {

    public static void main(String[] args) {

        GenericList<String> names = new GenericArrayList<>();

        System.out.println(names.size());
        System.out.println(names.isEmpty());

        names.add("Ivan");
        names.add("Dmitry");
        names.add("Oleg");
        names.add("Andrey");
        names.add("Igor");
        names.add(1, "Maksim");
        names.set(3, "Anton");

        System.out.println();
        System.out.println(names.size());
        System.out.println(names.isEmpty());
        System.out.println();
        System.out.println(names);
    }

}