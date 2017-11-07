package data_structures.hashmap;

public class HashMap {

    //student array that will be our hashmap of linkedlist student objects
    Student[] map;
    //int representing the size of the array
    int size;

    //constructor
    HashMap(int size) {

        this.size = size;
        map = new Student[size];
    }


    //put method to add another student object in the hashmap
    public void put(String key, String first_name, String last_name) {

        //get the hash code
        int hash = Math.abs(key.hashCode() % size);
        //create the student to add to the linked list
        Student head = new Student(key, first_name, last_name);


        //insert the student at the hash index
        if (map[hash] == null) {
            map[hash] = head;

        } else {

            //collision - this can happen because the array has a limited number of indexes,
            //and even if the key is different, the has number can turn out the same;
            //in this case we have to put object at the end of the linkedlist at index [hash]
            Student current = map[hash];

            //loop through the currentStudent linked list until reaching end
            while (current.nextStudent != null) {

                //check if the key already exists; this is because it is assumed
                //that they key will never be duplicated
                if (current.getKey().equals(head.getKey())) {

                    //replace the key's value with the new one if the key
                    //is duplicated
                    current.setFirst_name(head.getFirst_name());
                    current.setLast_name(head.getLast_name());
                    return;
                }

                //go on to next link in linked list
                current = current.nextStudent;
            }

            //when reached end of linked list, the next link in the
            //list becomes the newly created object
            current.nextStudent = head;

        }
    }

    //get method
    public Student get(String key) {

        //get the has value
        int hash = Math.abs(key.hashCode() % size);
        //search for the key in the linked list
        Student s = map[hash];
        //if the key is not there
        if (map[hash] == null) {

            System.out.println("Key value not found");

        } else {
            //while the key value is found in the hashmap
            while (map[hash] != null) {

                if (s.getKey().equals(key)) {
                    //return the student object, which contains all its values
                    return s;

                }

                //set the student object equal to the next student
                s = s.getNextStudent();
            }

        }
        //Else return null
        return null;
    }
}





