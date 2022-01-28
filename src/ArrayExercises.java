import java.util.Arrays;

public class ArrayExercises {
static Person[] addPerson(Person[] people, Person personToAdd){
Person[] newArray = Arrays.copyOf(people, people.length +1);
newArray[newArray.length-1] = personToAdd;
return newArray;
}

    public static void main(String[] args){
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));


//Create an array that holds 3 Person objects. Assign a new instance of the Person class to each element. Iterate through the array and print out the name of each person in the array.
//

        Person[] people = new Person[3];
        people[0] = new Person("mike");
        people[1] = new Person("sonya");
        people[2] = new Person("dominik");

        for(int i = 0; i < people.length; i++){
            System.out.println(people[i].getName());
        }
        people = addPerson(people, new Person("jeff"));
        for(int i = 0; i < people.length; i++){
            System.out.println(people[i].getName());
        }


        }

    }

