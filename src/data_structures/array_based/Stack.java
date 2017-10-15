package data_structures.array_based;

public class Stack {

    private int[] stackArray;

    //Define put location and get location variables
    private  int putloc;
    private  int getloc;

    //define queque constructor that takes in a size argument for the array

    Stack(int sizeYouWantYourQueueToBe){

        stackArray = new int [sizeYouWantYourQueueToBe];
        putloc = 0;
        getloc = 0;
    }

    //write put method that takes in an element ie int char and adds it to the array, incrementing put location afterwards

    void put(int index){
        if (putloc == stackArray.length) {
            System.out.println("Your Stack is full");
            return;
        }
        stackArray[putloc++] = index;
    }

    //get method that returns the value at the location of getlocation
    int get(){
        if(getloc == putloc){

            System.out.println("Your stack is empty");
            return 0;
        }
        return stackArray[getloc++];

    }

}
