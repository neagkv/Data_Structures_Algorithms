package data_structures.array_based;

import java.util.Scanner;

public class Controller {


    public static void main(String[] args) throws java.io.IOException {

        //System asks you to enter enter the size of your data structure
        System.out.println("Please Enter the size you would like your collection to be");
        //scanner input = takes in a number from the user
        Scanner input = new Scanner(System.in);
        //sets the user generated input to the size of the data structure
        int sizeYouWantYourDataStructureToBe = input.nextInt();
        //declare a myQueue object in order to use methods from the queue class
        Queue myQueue;
        //declare a myStack object in order to use methods from the stack class
        Stack myStack;
        int j; //temporary variable

        //if the size you want your data structure to be is less than zero
        if (sizeYouWantYourDataStructureToBe <= 0) {
            //print out please enter a valid size
            System.out.println("Please enter a valid size");
            //break out of the the statement
            return;
        }
        //else if the size of your queque >= 2000000
        else if (sizeYouWantYourDataStructureToBe >= 2000000) {
            //The data structure is too big to run
            System.out.println("Please enter a valid int for the size");
            //break out of the statement
            return;
        } else {
            // the Queue object becomes an int array the size of the user input
            myQueue = new Queue(sizeYouWantYourDataStructureToBe);
            //the stack object becomes an int array the size of the user input
            myStack = new Stack(sizeYouWantYourDataStructureToBe);

        }

        // use the temporary variable j to iterate over the array.
        for (j = 0; j < sizeYouWantYourDataStructureToBe; j++) {
            //call the put method on j to populate the array for both the queue an stack
            myQueue.put(j);
            myStack.put(j);
        }

        // use the temporary variable j to iterate over the array and use the getMethod to print out the values
        for (j = 0; j < sizeYouWantYourDataStructureToBe; j++) {
            System.out.println("Queue Results" + myQueue.get());
            System.out.println("Stack Results" + myStack.get(j));
            System.out.println("**************************");
        }
    }
}

