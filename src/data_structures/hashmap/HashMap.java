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
    public void put(String key, Student student) {

        //get the hash code
        int hash = Math.abs(key.hashCode() % size);

        //insert the student at the hash index
        try {

            if (map[hash] == null) {

                map[hash] = student;

            } else {

                //collision - this can happen because the array has a limited number of indexes,
                //and even if the key is different, the hash number can turn out the same;
                //in this case we have to put object at the end of the linkedlist at index [hash]
                Student current = map[hash];

                //loop through the currentStudent linked list until reaching end
                while (current.nextStudent != null) {

                    //check if the key already exists; this is because it is assumed
                    //that they key will never be duplicated
                    if (current.getKey().equals(student.getKey())) {

                        //replace the key's value with the new one if the key
                        //is duplicated
                        current.setFirst_name(student.getFirst_name());
                        current.setLast_name(student.getLast_name());
                        return;
                    }

                    //go on to next link in linked list
                    current = current.nextStudent;
                }

                //when reached end of linked list, the next link in the
                //list becomes the newly created object
                current.nextStudent = student;
                student.previousStrudent = current;

            }
            //will change to make null pointer exception tighter in the future
        } catch (NullPointerException e) {

            System.out.println("Null Pointer Exception");
        }
    }

    //get method
    public Student get(String key) {


        //get the hash value
        int hash = Math.abs(key.hashCode() % size);

        //if the key is not there
        if (map[hash] == null) {

            System.out.println("Key value not found");
            return null;

        } else {

            Student s;

            do {

                s = map[hash];


                if (s.getKey().equals(key)) {

                    return s;

                } else {

                    s = s.getNextStudent();
                }
            }
            while (s != null);
        }
        //Else return null
        return null;
    }

    //remove method
    public String removeStudent(String key) {

        int hash = Math.abs(key.hashCode() % size);

        // check the array at the index of hash

        Student s = map[hash];

        // if null - nothing to do - nothing to remove - might need try catch

        try {

            if (s.getKey().isEmpty()) {

                return "index already empty";
            }
        } catch(NullPointerException npe) {
            return "index already empty";
        }

        // to see if element has a nextStudent() element
        if (map[hash].nextStudent == null) {
            // if they do not delete the initial element from array - set map[hash] = null
            map[hash] = null;

            // if student does have a next student - go into linkedlist mode
        } else {

            // while student.nextStudent() != null

            while (s.nextStudent != null) {

                // check to see if the student you current have is the one you're supposed to delete
                if (s.getKey() == key) {

                    s = s.nextStudent;

                    // you'll need two nodes so you can unlink the one that needs to be deleted
                    s.previousStrudent = s.nextStudent;

                }
            }
        }

        return "Done";
    }
}









