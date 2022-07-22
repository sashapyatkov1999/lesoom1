package Lesson3;

import java.util.ArrayList;
import java.util.Scanner;

public class Lesson4HomeWork2 {
    private int[] massive;

    public Lesson4HomeWork2(int[] massive){
        this.massive = massive;

    }
   public int[] setMassive() {
        for (int i = 0; i<this.massive.length;i++ ){
            if (i%2 == 0) {
                this.massive[i] = 0;

            }
            System.out.print(this.massive[i]);
        }
        return this.massive;
    }

}
