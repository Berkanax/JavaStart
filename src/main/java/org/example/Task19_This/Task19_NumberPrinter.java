package org.example.Task19_This;

public class Task19_NumberPrinter  {
    void printNumber(int a){
        System.out.println(a);
    }
    void printNumber(int x, int b){
        printNumber(x);
        System.out.println(b);
    }
    void printNumber(int x, int b, int z){
        printNumber(x,b);
        System.out.println(z);
    }
}
