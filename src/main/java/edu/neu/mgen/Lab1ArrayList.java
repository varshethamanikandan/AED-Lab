package edu.neu.mgen;

import java.util.ArrayList;

public class Lab1ArrayList {

    public static void main(String[] args) {
        // Initialize ArrayList containing 5 names
        ArrayList<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("David");
        names.add("Eve");

        // Switch the first and last letters in each name
        ArrayList<String> switchedNames = switchFirstAndLastLetters(names);

        // Format output
        String originalNames = joinList(names);
        String switchedOriginalNames = joinList(switchedNames);

        // Print formatted output
        System.out.println("Names = {" + originalNames + "}");
        System.out.println("Names (switched) = {" + switchedOriginalNames + "}");
    }

    // Method to switch first and last letters in each name
    public static ArrayList<String> switchFirstAndLastLetters(ArrayList<String> names) {
        ArrayList<String> switchedNames = new ArrayList<>();
        for (String name : names) {
            char firstChar = name.charAt(0);
            char lastChar = name.charAt(name.length() - 1);
            String switchedName = lastChar + name.substring(1, name.length() - 1) + firstChar;
            switchedNames.add(switchedName);
        }
        return switchedNames;
    }

    // Method to join elements of ArrayList into a string
    public static String joinList(ArrayList<String> list) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i));
            if (i < list.size() - 1) {
                sb.append(", ");
            }
        }
        return sb.toString();
    }
}
