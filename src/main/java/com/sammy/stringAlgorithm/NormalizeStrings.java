package com.sammy;

public class NormalizeStringsAlgorithms {

    public static String normalizeString(String value){
        return value.toLowerCase().trim().replace(",", "");
    }

    public static void main(String[] args) {
        System.out.println(normalizeString("   Hello There, BUDDY "));
    }
}
