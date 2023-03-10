package com.zipcodewilmington;

import java.lang.invoke.StringConcatFactory;
import java.util.*;

/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {
        return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {
        return array[array.length - 1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        return array[array.length - 2];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals((value))) {
                j = j + 1;
            }
        }
        if (j != 0) {
            return true;
        } else {
        }
        return false;
    }


    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        // Collections.reverse(Arrays.asList(array));
        StringBuilder reversed = new StringBuilder();

        for (int i = array.length; i > 0; i--) {
            reversed.append(array[i - 1]).append(" ");
        }
        ;
        String[] reversedArray = reversed.toString().split(" ");
        return reversedArray;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        int j = 0;
        int i;
        for (i = 0; i < (int) array.length; i++) {
            if (array[i].equals(array[array.length - 1 - i])) {
                j += 1;
            }
        }
        if (i == j) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        String lowerCase = "abcdefghijklmnopqrstuvwxyz";
        String upperCase = "";
        for (String element : array) {
            upperCase += element.toLowerCase();
        }
        for (char c : lowerCase.toCharArray()) {
            if (upperCase.indexOf(c) == -1) {
                return false;
            }
        }
        return true;
    }


    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals((value))) {
                j = j + 1;
            }

        }
        return j;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
//       String[] arr = array;
        List<String> list = new ArrayList<>(Arrays.asList(array));
        list.remove(valueToRemove);
        String[] arr = list.toArray(new String[list.size()]);
        return arr;

    }


    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        List<String> list = new ArrayList<>(Arrays.asList(array));
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i).equals(list.get(i + 1))) {
                list.remove(i);
                i--;
            }
        }
        return list.toArray(new String[list.size()]);
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        List<String> list = new ArrayList<>(Arrays.asList(array));
        List<String> result = new ArrayList<>();
        while (!list.isEmpty()) {
            String current = list.remove(0);
            StringBuilder sb = new StringBuilder(current);
            while (!list.isEmpty() && list.get(0).equals(current)) {
                sb.append(current);
                list.remove(0);
            }
            result.add(sb.toString());
        }
        return result.toArray(new String[0]);

    }
}