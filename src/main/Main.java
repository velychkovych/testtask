package main;

public class Main {
    public static void main(String[] args) {
        Test1();
        Test2();
    }

    public static void Test1(){
        String[] arr = new String[]{"1","2","3"};
        MyArrayListImpl myArrayList = new MyArrayListImpl(arr);
        myArrayList.print("Constructor");
        myArrayList.addElem("4");
        myArrayList.print("Added 4");
        System.out.println("getelembyindex: " + myArrayList.getElemByIndex(3));
        System.out.println("deleteelembyindex: " + myArrayList.deleteElemByIndex(3));
        myArrayList.print("After delete by index");
        System.out.println("deleteelembyvalue: " + myArrayList.deleteElemByValue("1"));
        myArrayList.print("After delete by value");
        System.out.println("find index: " + myArrayList.findIndex("2"));
        System.out.println("exist: " + myArrayList.exists("2"));
    }

    public static void Test2(){
        MyArrayListImpl myArrayList = new MyArrayListImpl();
        myArrayList.print("Constructor");
        myArrayList.addElem("4");
        myArrayList.addElem("3");
        myArrayList.addElem("51");
        myArrayList.addElem("8");
        myArrayList.print("Added 4");

    }
}

//requirements:
//        Constructor: default, from array
//
//        methods:
//        add element
//        get element by index
//        delete element by index
//        delete element by value
//        findIndex
