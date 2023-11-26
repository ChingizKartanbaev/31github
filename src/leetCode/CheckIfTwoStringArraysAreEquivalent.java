package leetCode;

public class CheckIfTwoStringArraysAreEquivalent {

    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder result1 = new StringBuilder();
        StringBuilder result2 = new StringBuilder();

        for (String el : word1) {
            result1.append(el);
        }

        for (String el : word2) {
            result2.append(el);
        }

        return result1.toString().equals(result2.toString());
    }
}
