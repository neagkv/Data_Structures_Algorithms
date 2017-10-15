package data_structures.array_based;


public class Queue {

// Define initial array to hold queue data

    private int[] quequeArray;

    //Define put location and get location variables
   private  int putloc;
   private  int getloc;

    //define queque constructor that takes in a size argument for the array

   Queue(int sizeYouWantYourQueueToBe){

       quequeArray = new int [sizeYouWantYourQueueToBe];
       putloc =0;
       getloc =0;
   }

    //write put method that takes in an element ie int char and adds it to the array, incrementing put location afterwards

    void put(int index){
       if (putloc == quequeArray.length) {
           System.out.println("Your Queue is full");
           return;
       }
       quequeArray[putloc++] = index;
    }

    //get method that returns the value at the location of getlocation
     int get(){
        if(getloc == putloc){

            System.out.println("Your Queue is empty");
            return 0;
        }
        return quequeArray[getloc++];

    }

}
