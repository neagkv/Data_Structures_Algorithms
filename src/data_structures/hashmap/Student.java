package data_structures.hashmap;


//Student object will be the object in the linkedlist inside of the hashmap
public class Student {


    //the key value that will be used to search for inside the hashmap
    String key;

    //value in the linkedlist
    String first_name;

    //other value in the linkedlist
    String last_name;

    //a student object in the student class that links to the next student object in the linked list
    Student nextStudent;

    //student constructor
    public Student(String key, String first_name, String last_name) {
        this.key = key;
        this.first_name = first_name;
        this.last_name = last_name;
    }

    //getters and setters
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public Student getNextStudent() {
        return nextStudent;
    }

    public void setNextStudent(Student nextStudent) {
        this.nextStudent = nextStudent;
    }
}
