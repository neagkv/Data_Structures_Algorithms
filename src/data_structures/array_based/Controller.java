package data_structures.array_based;

import java.util.Scanner;

public class Controller {


    public static void main(String[] args) throws java.io.IOException {


        System.out.println("Please Enter 1 for queque or 2 for stack");

        //System asks you to enter enter the size of the queque
        System.out.println("Please Enter the size you would like your queque to be");
        //scanner input = takes in a number from the user
        Scanner input = new Scanner(System.in);
        //sets the scanner in put to the variable size of the queque
        int sizeYouWantYourQueueToBe = input.nextInt();
        //declare a myQueue object in order to uses methods from the queclass
        Queue myQueue;
        int j; //temporary variable


        //if the size you want your queue to be is less than zero
        if (sizeYouWantYourQueueToBe <= 0) {
            //print out please enter a valid size
            System.out.println("Please enter a valid size");
            //break out of the the statement
            return;
        }
        //else if the size of your queque >= 2000000
        else if (sizeYouWantYourQueueToBe >= 2000000) {
            //The queue is too big to run
            System.out.println("Please enter a valid int for the size");
            //break out of the statement
            return;
        } else {
            // the Queue object becomes and int array the size of the user input
            myQueue = new Queue(sizeYouWantYourQueueToBe);

        }

        // use the temporary variable j to iterate over the array j
        for (j = 0; j < sizeYouWantYourQueueToBe; j++) {
            //call the put method on j and set the location up to the users size input
            myQueue.put(j);
        }

        // use the temporary variable j to reiterate over the array and use the getMethod to print out the values
        for (j = 0; j < sizeYouWantYourQueueToBe; j++) {
            System.out.println(myQueue.get());
        }
    }
}

