package data_structures.hashmap;

import java.util.Arrays;

public class HashMapController {

    public static void main(String[] args) {


        //create a hasmap of size 7
        HashMap myHashMap = new HashMap(8);

        //seven student objects
        Student s1 = new Student("123","Felix", "Brown");
        Student s2 = new Student("245", "Charles", "Clay");
        Student s3 = new Student("678", "Mike", "O'shay");
        Student s4 = new Student("122", "John", "Flannigan");
        Student s5 = new Student("754", "Paul", "Glass");
        Student s6 = new Student("876", "Juan", "Hernadnez");
        Student s7 = new Student("432", "Ben", "Carroll");


        //put method each student in the hashmap at the key value
        myHashMap.put("123", s1);
        myHashMap.put("245", s2);
        myHashMap.put("678", s3);
        myHashMap.put("122", s4);
        myHashMap.put("754", s5);
        myHashMap.put("876", s6);
        myHashMap.put("432", s7);


        //print out the first name of each student by inserting the key value
        System.out.println("The name of the first student in the hash map is " +  myHashMap.get("123").getFirst_name());
        System.out.println("The name of the second student in the hash map is " + myHashMap.get("245").getFirst_name());
        System.out.println("The name of the third student in the hash map is " +  myHashMap.get("678").getFirst_name());
        System.out.println("The name of the fourth student in the hash map is " + myHashMap.get("122").getFirst_name());
        System.out.println("The name of the fifth student in the hash map is " +  myHashMap.get("754").getFirst_name());
        System.out.println("The name of the sixth student in the hash map is " +  myHashMap.get("876").getFirst_name());
        System.out.println("The name of the seven student in the hash map is " +  myHashMap.get("432").getFirst_name());
        System.out.println("*************************************************");

        //remove the 4th student in the array
        myHashMap.removeStudent("122");

        System.out.println(myHashMap.get("122"));


















    }

}
