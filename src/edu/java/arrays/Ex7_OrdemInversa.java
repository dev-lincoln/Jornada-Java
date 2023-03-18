package edu.java.arrays;

public class Ex7_OrdemInversa {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50, 60};

        //Utilizando o WHILE:
        /*int count = array.length -1;

        System.out.print("Array: ");

        while(count >= 0){
            System.out.print(array[count] + ", ");
            count--;
        }*/

        //Utilizando o FOR:

        System.out.print("Array: ");
        for(int count = array.length -1; count >=0; count--){
            System.out.print(array[count] + ", ");
        }
    }
}
