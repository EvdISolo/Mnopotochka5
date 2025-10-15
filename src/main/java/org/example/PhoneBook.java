package org.example;


import java.util.*;

public class PhoneBook {

    private Map<String, String> contacts = new HashMap<>();

    public int add(String name, String number) {
        if (!contacts.containsKey(name)) {
            contacts.put(name, number);
        }
        return contacts.size();
    }

    public String findByNumber(String number) {
        for (HashMap.Entry<String, String> entry : contacts.entrySet()) {
            if (entry.getValue().equals(number)) {
                return entry.getKey();
            }

        }
        return null;
    }

    public String findByName(String name) {

        return contacts.get(name);
    }

    public List<String> printAllNames() {
        List<String> names = new ArrayList<>(contacts.keySet());
        Collections.sort(names);

        return names;
    }


    public static void main(String[] args) {
    }

}
