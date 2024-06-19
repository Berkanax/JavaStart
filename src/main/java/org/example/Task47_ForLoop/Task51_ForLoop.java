package org.example.Task47_ForLoop;

public class Task51_ForLoop {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++){
            if(i % 2 == 0){
                continue;
            }
            System.out.println("Pierwsza pętla " + i);
        }

        for (int i = 0; i < 10; i++){
            if(i == 5)
                break;
            System.out.println("Druga pętla " + i);
        }
        System.out.println("Koniec programu");
    }
}
// FOR Gdy wiemy ile razy chcemy powtórzych pętle
// FOReach - Najlepiej gdy chcemy wyświetlić tylko dane