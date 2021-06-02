/*
MapProgram.java
------------------------------------------------------------------------------------------------------------------------
Created by Eldr@e@
------------------------------------------------------------------------------------------------------------------------
The MapProgram Class
------------------------------------------------------------------------------------------------------------------------
Created on : 02/06/2021
------------------------------------------------------------------------------------------------------------------------
Last Update on: 02/06/2021
------------------------------------------------------------------------------------------------------------------------
 */

package myjava.exercises;

import java.util.HashMap;
import java.util.Map;

public class MapProgram {

    public static void main(String[] args) {
        Map<String, String> languages = new HashMap<>();
        languages.put("Java", " a compiled high-level, object-oriented, platform independent language");
        languages.put("Python", "an interpreted, oriented-object, high-level programming language with dynamic semantics");
        languages.put("Algol", "an algorithmic language");
        languages.put("BASIC","Beginners All purposes Semantics Instruction Code");
        languages.put("Lisp", "Therein lies madness");

        System.out.println(languages.get("Java"));
    }
}
