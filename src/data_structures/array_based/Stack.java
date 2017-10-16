package data_structures.array_based;

public class Stack {

    private int[] stackArray;

    //Define put location and get location variables
    private  int location;

    //define queque constructor that takes in a size argument for the array

    Stack(int sizeYouWantYourDataStuctureToBe){
        stackArray = new int [sizeYouWantYourDataStuctureToBe];
    }
    //write put method that takes in an element ie int char and adds it to the array, incrementing put location afterwards
    void put(int index) {
        if (location == stackArray.length) {
            System.out.println("Your Stack is full");
            return;
        }
            stackArray[location++] = index;
            return;
        }

    int get(int index) {
            if(location ==0) {
                System.out.println("Your Stack if empty");
                return 0;
            }
            return stackArray[--location];
         }
}
