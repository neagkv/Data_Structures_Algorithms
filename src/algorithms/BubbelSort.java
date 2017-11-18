package algorithms;

import java.util.Arrays;

//sort the array in descending order
public class BubbelSort {

    public static void main(String[] args) {

        int[] myArray = {34, 56, 78, 555, 3, 23, 10};


        for (int i = 0; i < myArray.length - 1; i++) {

            for (int j = 0; j < myArray.length -i -1; j++) {


                if (myArray[j + 1] > myArray[j]) {

                    //compares adjacent elements in the array untill a larger value is found and then switched
                    int temp = myArray[j + 1];

                    myArray[j + 1] = myArray[j];

                    myArray[j] = temp;
                }

                System.out.println(Arrays.toString(myArray));

            }
        }


    }
}



