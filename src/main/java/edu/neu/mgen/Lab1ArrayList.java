package edu.neu.mgen;

import java.util.ArrayList;

public class Lab1ArrayList {
    public static void main(String[] args) {
        // Initialize ArrayList containing 5 names
        ArrayList<String> names = new ArrayList<>();
        names.add("Pooja");
        names.add("Noodhan");
        names.add("Varshetha");
        names.add("Lokanya");
        names.add("Kashvitha");

        // Switch the first and last letters in each name
        ArrayList<String> switchedNames = switchFirstAndLastLetters(names);

        // Format and print output
        printNames("Names", names);
        printNames("Names (switched)", switchedNames);
    }

    // Method to switch the first and last letters in each name
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

    // Method to print the names in a formatted manner
    public static void printNames(String label, ArrayList<String> names) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < names.size(); i++) {
            sb.append(names.get(i));
            if (i < names.size() - 1) {
                sb.append(", ");
            }
        }
        System.out.println(label + " = {" + sb.toString() + "}");
    }
}
