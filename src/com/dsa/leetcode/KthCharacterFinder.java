package com.dsa.leetcode;

public class KthCharacterFinder {
    public static char kthCharacter(int k) {
        StringBuilder word = new StringBuilder("a");
        while (word.length() < k) {
            StringBuilder nextWord = new StringBuilder();
            for (int i = 0; i < word.length(); i++) {
                char nextChar = (char) ((word.charAt(i) - 'a' + 1) % 26 + 'a');
                nextWord.append(nextChar);
            }
            word.append(nextWord);
        }
        return word.charAt(k - 1);
    }
    public static void main(String[] args) {

        int k = 5; // You can change this value to test different positions
        System.out.println("The " + k + "-th character is: " + kthCharacter(k));
    }

}
/*Q1. Find the K-th Character in String Game I
Easy
3 pt.
Alice and Bob are playing a game. Initially, Alice has a string word = "a".

You are given a positive integer k.

Now Bob will ask Alice to perform the following operation forever:

Generate a new string by changing each character in word to its next character in the English alphabet, and append it to the original word.
For example, performing the operation on "c" generates "cd" and performing the operation on "zb" generates "zbac".

Return the value of the kth character in word, after enough operations have been done for word to have at least k characters.

Note that the character 'z' can be changed to 'a' in the operation.



Example 1:

Input: k = 5

Output: "b"

Explanation:

Initially, word = "a". We need to do the operation three times:

Generated string is "b", word becomes "ab".
Generated string is "bc", word becomes "abbc".
Generated string is "bccd", word becomes "abbcbccd".*/