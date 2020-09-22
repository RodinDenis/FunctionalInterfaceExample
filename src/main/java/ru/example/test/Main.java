package ru.example.test;

public class Main {
    public static void main(String[] args) {

        SomeAlg alg = new SomeAlg();

        // можно так
        alg.someLogic(()->"Лямбда");

        //ссылка на метод
        SomeExample exmpl = new SomeExample();
        alg.someLogic(exmpl::get);

        // ссылка на статический метод
        alg.someLogic(SomeStaticExample::get);

    }
}
