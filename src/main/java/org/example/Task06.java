package org.example;
/*
Napisz program, w którym zadeklarujesz dwie zmienne typu int o nazwach x oraz y. Przypisz do nich dowolne liczby, a następnie za pomocą operatorów logicznych i matematycznych wyświetl wynik następujących zdań logicznych:

Czy x jest większe od y?
Czy x pomnożone przez 2 jest większe od y?
Czy y jest mniejsze od sumy x+3 i jednocześnie większe od x pomniejszonego o 2?
Czy iloczyn liczb x i y jest parzysty? (Wykorzystaj do sprawdzenia operację modulo)
Wynik każdego zdania logicznego przypisuj przed wypisaniem do zmiennej typu boolean o nazwie result.

W zadaniu możesz wykorzystać losowanie liczb. W podpowiedzi znajdziesz sposób jak to zrobić, ale zachęcam Cię najpierw do skorzystania z Google. Umiejętność sprawnego korzystania z wyszukiwarki internetowej to też ważna umiejętność każdego programisty.
 */
public class Task06 {
    public static void main(String[] args) {
    int x = 77;
    int y = 4;
        System.out.println("Czy X > Y >> " + (x > y));
        System.out.println("Czy X * 2 jest większe od y? >> " + (x * 2 == y ));
        System.out.println("Czy y jest mniejsze od sumy x+3 i jednocześnie większe od x pomniejszonego o 2? >> " + (y < (x+3) && y > (x - 2)));
        System.out.println("Czy iloczyn liczb x i y jest parzysty? " + (x * y % 2 == 0));
    }
}
