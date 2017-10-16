package data_structures.array_based;

public class Stack {

    private int[] stackArray;

    //Define  a location variable
    private  int location;

    //define stack constructor that takes in a size argument for the array
    Stack(int sizeYouWantYourDataStuctureToBe){
        stackArray = new int [sizeYouWantYourDataStuctureToBe];
    }
    // put method that takes in an element and adds it to the array, incrementing the location afterwards
    void put(int index) {
        //if the location is equal to the length of the stack, then the stack is full.
        if (location == stackArray.length) {
            System.out.println("Your Stack is full");
            return;
        }
            //if the stack is not full, increment the location index in the stack array, set that equal to index
            stackArray[location++] = index;
            return;
        }
    //get method on the stack array that takes in the index and returns an int
    int get(int index) {
            //if the location is equal to zero than the stack is empty
            if(location ==0) {
                System.out.println("Your Stack if empty");
                return 0;
            }
            //If not equal to zero decrement the location variable along the stack array.
            return stackArray[--location];
         }
}
