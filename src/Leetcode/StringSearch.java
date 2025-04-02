package Leetcode;

/*
 Find the Index of the First Occurrence in a String
Solved
Easy
Topics
Companies
Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.



Example 1:

Input: haystack = "sadbutsad", needle = "sad"
Output: 0
Explanation: "sad" occurs at index 0 and 6.
The first occurrence is at index 0, so we return 0.
 */
public class StringSearch {
    public static int strStr(String haystack, String needle) {
        // Edge case: if needle is empty, return 0
        if (needle.isEmpty()) {
            return 0;
        }

        // Edge case: if haystack length is less than needle length, return -1
        if (haystack.length() < needle.length()) {
            return -1;
        }

        // Iterate through the haystack to find the first occurrence of the needle
        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            // Check if the substring of haystack matches the needle
            if (haystack.substring(i, i + needle.length()).equals(needle)) {
                return i; // Return the starting index of the first occurrence
            }
        }

        return -1; // Return -1 if needle is not found
    }

    public static void main(String[] args) {
        String haystack = "a";
        String needle = "a";

        System.out.println(strStr(haystack, needle)); // Output: 0
    }
}
