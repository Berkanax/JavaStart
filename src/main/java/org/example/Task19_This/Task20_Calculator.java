package org.example.Task19_This;

public class Task20_Calculator {
double a;
double b;
double c;
double sum;

Task20_Calculator(double a, double b, double c){
    this(a,b);
    this.sum = a + b + c;
    System.out.println("Kontruktor v1");
    System.out.println(sum);
}
Task20_Calculator(double a, double b){
    this.c += a += b;
    System.out.println(c);
    System.out.println("Kontruktor v2");
}

}
