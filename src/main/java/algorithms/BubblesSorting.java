package algorithms;

import java.util.Arrays;
import java.util.Random;

public class BubblesSorting {

    public static void main(String[] args) {
        Random rand = new Random();

        int [] input = new int[1000];

        for (int i = 0; i <input.length ; i++) {
            input[i] = rand.nextInt(0,10000);
            System.out.print(input[i] + " ");
        }
        System.out.println();

        boolean swap = true;

        while(swap){
            swap = false;

            for (int i = 0; i < input.length -1 ; i++) {

                if (input[i] > input[i+1]){
                    swap = true;
                    int temp = input[i];
                    input[i] = input[i+1];
                    input[i+1] = temp;
                }

            }
        }

        Arrays.stream(input).forEach(in -> System.out.print(in + " "));

    }




}
