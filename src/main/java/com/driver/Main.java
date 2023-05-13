package com.driver;

public class Main {
    public static class A {
        public String meth() {
            return "Invoking method from class A";
        }
    }
    public static class B extends A {
        public B(){
            System.out.println(new A().meth());
        }

        @Override
        public String meth() {
            return "Method is overridden in Extendend class B";
        }
    }

    public static void main(String[] args) {
        B B = new B();
        System.out.println(B.meth());
    }

}