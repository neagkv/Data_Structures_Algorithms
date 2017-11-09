package data_structures.hashmap;

public class HashMapController {

    public static void main(String[] args) {


        //create a hasmap of size 7
        HashMap myHashMap = new HashMap(7);

        //seven student objects
        Student s1 = new Student("123","Felix", "Brown");
        Student s2 = new Student("245", "Charles", "Clay");
        Student s3 = new Student("678", "Mike", "O'shay");
        Student s4 = new Student("854", "John", "Flannigan");
        Student s5 = new Student("976", "Paul", "Glass");
        Student s6 = new Student("876", "Juan", "Hernadnez");
        Student s7 = new Student("432", "Ben", "Carroll");

        System.out.println("The name of the first student in the hash map is " +  myHashMap.get("123").getFirst_name());






    }

}
