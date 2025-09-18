public class FixDebugOne { //FixDebug One --> FixDebugOne

/* This program displays a greeting */
    public static void Main(String[] args) { //Main --> main ; (String args) --> (String[] args)
        System.out.println("Hello World!");   //Systm --> System ; ("Hello Wold!") --> ("Hello Wold!");
    }
}  //no '}' --> put '}'
/*
List down the spotted bugs below:
e.g.
- // wrong syntax for access modifier "publlic" instead of "public"
Bugs:
1. Invalid classname, it must not contain spaces
2. wrong syntax for the method "Main" instead of "main"
3. worng construction of the parameter "String args" instead of "String[] args"
4. wrong syntax for the class "Systm" instead of "System"
5. lack of ';' at the end of the java statement
6. missing of closing brace '}' at the end of the class FixDebugOne
*/

