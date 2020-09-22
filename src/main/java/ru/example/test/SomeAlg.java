package ru.example.test;

import java.util.function.Supplier;

public class SomeAlg {
    public void someLogic(Supplier<String> sup){

        System.out.println("Логика алгоритма до вызова функционального интерфейса.");
        System.out.println(sup.get());
        System.out.println("Логика алгоритма после вызова функционального интерфейса.");
    }
}
