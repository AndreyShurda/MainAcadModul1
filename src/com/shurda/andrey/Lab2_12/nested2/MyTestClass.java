package com.shurda.andrey.Lab2_12.nested2;

public class MyTestClass {

    //    MyStaticNested myStaticNested = new MyStaticNested();
//    MyInner myInner = new MyInner();
//
//    {
//        new MyTestClass().someMothod();
//    }
    {
        System.out.println("initialization MyTestClass");
    }

    void test() {
        System.out.println("MyTestClass method test()");
    }

    static class MyStaticNested {
        {
            System.out.println("initialization MyStaticNested");
        }
    }

    class MyInner {
        {
            System.out.println("initialization MyInner");
        }
    }

    void someMothod() {
        System.out.println("method someMothod() MyLocal");

         class MyLocal {
            {
                System.out.println("initialization MyLocal");
            }
        }

        MyLocal myLocal = new MyLocal();
    }
}
