public class HelloWorld {
    public static void main (String [] args){
        System.out.print("Hello World!");

        short days = 365;
        System.out.println(days);

        System.out.println('I');

        System.out.println();



//        type data type in place of var
//        String is the data type
//        greeting is the variable
        String greeting = "Hello there";
        System.out.println(greeting);

//        final is java's version of const. it can not be reassigned another value.
        final String APIKEY = "sdfkljssg0943098";

//        You need the f at the end to indicate that it is a float number.
//        float will only show up to 7 digits after the decimal.
        float pi = 3.1478879f;
        System.out.println(pi);

        int firstNumber = 20;
        int secondNumber = 25;

        System.out.println(firstNumber + secondNumber);


        int firstNumber1 = 27888808;
        int secondNumber1 = 2588888;

        System.out.println(firstNumber1 + secondNumber1);
//        this code will result in an overflow and negative number due to the int not being a long to hold the value of
//        firstNumber1 + secondNumber1.

        int increment = 0;
        increment++;
        System.out.println(increment);
//        this is how you increment in java

        int decrement = 0;
        decrement--;
        System.out.println(decrement);
//        this is how you decrement in java



//        CASTING

        byte dayOfMonth = 14;
        byte birthday = 24;
        System.out.println(dayOfMonth * birthday);


//        Implicit Casting - less specific data, to a more specific data type.
        int result = dayOfMonth * birthday;

//        Explicit Casting - more specific data type to less specific data type
//        int x = 900;
//        int y = 800;
//
//        int difference = (byte)(x-y);
//        System.out.println(difference);




//        Java Exercise

//        1.
        int myFavoriteNumber = 13;
        System.out.println(myFavoriteNumber);

//      2.
        String myString = "Go Spurs";
        System.out.println(myString);

//        3.
//
//        Java is looking for a string.

//        4.
//        String myString = 3.14;
//        variable type needs to be changed to double or float.
        float myNumber = (float) 3.14;
        System.out.print(myNumber);

//

//            long mynumber =;
//        5. variable myNumber was not have been initialized


//        6. java: incompatible types: possible lossy conversion from double to long


//        7.
//            long myNumber = 123L;
//            System.out.println(myNumber);
//        L did not show in the print out.


//        8. Why does assigning the value 3.14 to a variable declared as a long not compile,
//          but assigning an integer value does?
//          The types are incompatible when converting.

//        9.
//            float myNumber = (float) 3.14;
//              System.out.println(myNumber);
//        java: incompatible types: possible lossy conversion from double to long
//        You can cast it to float or change variable to double.

//      10.
//        int x = 5;
//        System.out.println(x++);
//        System.out.println(x);
//        post increment - x is printed and incremented and then printed again after the increment.

//        int x = 5;
//        System.out.println(++x);
//        System.out.println(x);
//        pre-increment - x is incremented  and then printed again.

//        11.
//        String class = "hello"
//        Class is a reserved word, so it can not be used as a variable.

//        12.
//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) o;
//        System.out.println(three);
//        String incompatible with Integer

//        int three = (int) "three";
//        System.out.println("three");
//      String can not be converted to int

//        13.
//        int x = 4;
//        x = x + 5;

//      x += 5;

//        int x = 3;
//        int y = 4;
//        y = y * x;

//        y *= x
//
//        int x = 10;
//        int y = 2;
//        x = x / y;
//          x /= y


//        y = y - x;
//        y -= x

//      14. What happens if you assign a value to a numerical variable that is larger (or smaller) than the type can hold?
//      What happens if you increment a numeric variable past the type's capacity?
//      You would get a compile error.









    }
}
