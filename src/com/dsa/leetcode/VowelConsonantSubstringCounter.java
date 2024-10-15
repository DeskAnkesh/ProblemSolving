package com.dsa.leetcode;
import java.util.HashSet;
import java.util.Set;

public class VowelConsonantSubstringCounter {

    // Function to check if the given character is a vowel
    private static boolean isVowel(char c) {
        return "aeiou".indexOf(c) != -1;
    }

    public static int countSubstringsWithVowelsAndKConsonants(String word, int k) {
        int n = word.length();
        int result = 0;

        // A set to track vowels in the current window
        Set<Character> vowelSet = new HashSet<>();
        int consonantCount = 0; // To track number of consonants in the window

        // Sliding window approach
        for (int i = 0; i < n; i++) {
            vowelSet.clear();  // Clear the vowel set for each starting position
            consonantCount = 0; // Reset the consonant count for each starting position

            // Expand the window from i to j
            for (int j = i; j < n; j++) {
                char c = word.charAt(j);

                if (isVowel(c)) {
                    vowelSet.add(c);  // Add vowel to the set
                } else {
                    consonantCount++;  // Increment consonant count
                }

                // Check if we have exactly k consonants and all 5 vowels
                if (consonantCount == k && vowelSet.size() == 5) {
                    result++;  // Valid substring found
                }
            }
        }

        return result;  // Return the total count of valid substrings
    }

    public static void main(String[] args) {
        // Test cases
        String word1 = "aeioqq";
        int k1 = 1;
        System.out.println(countSubstringsWithVowelsAndKConsonants(word1, k1));  // Output: 0

        String word2 = "aeiou";
        int k2 = 0;
        System.out.println(countSubstringsWithVowelsAndKConsonants(word2, k2));  // Output: 1

        String word3 = "ieaouqqieaouqq";
        int k3 = 1;
        System.out.println(countSubstringsWithVowelsAndKConsonants(word3, k3));  // Output: 3
    }
}
/*
* Q2. Count of Substrings Containing Every Vowel and K Consonants I
Medium
4 pt.
You are given a string word and a non-negative integer k.

Return the total number of
substrings
 of word that contain every vowel ('a', 'e', 'i', 'o', and 'u') at least once and exactly k consonants.



Example 1:

Input: word = "aeioqq", k = 1

Output: 0

Explanation:

There is no substring with every vowel.

Example 2:

Input: word = "aeiou", k = 0

Output: 1

Explanation:

The only substring with every vowel and zero consonants is word[0..4], which is "aeiou".

Example 3:

Input: word = "ieaouqqieaouqq", k = 1

Output: 3

Explanation:

The substrings with every vowel and one consonant are:

word[0..5], which is "ieaouq".
word[6..11], which is "qieaou".
word[7..12], which is "ieaouq".


Constraints:

5 <= word.length <= 250
word consists only of lowercase English letters.
0 <= k <= word.length - 5
*
*
* */
