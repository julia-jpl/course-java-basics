package com.rakovets.course.javabasics.practice.strings;

import java.util.SortedMap;

public class StringUtil {
    String string1 = " qwerty :))";

   public String getConcatnatedString(String str) {
       if (str != null) {
           return string1.concat(str);
       } else {
           return "-1";
       }
   }

   public int getSymbolIndex(String string, char x) {
       return string.indexOf(x);
   }

   public boolean isEqualStrings(String string, String string1) {
       return string1.equals(string);
   }

   public String getUpperCaseWithoutStartEndWhitespaces(String string) {
       String string2 = string.toUpperCase();
       return string2.trim();
   }

   public String getSubString(String string1) {
       int start = 10;
       int end = start + 23;
       String subString = "";
       if (string1.length() < start) {
           subString = "Substring is empty";
       } else  if (end >= string1.length()) {
           end = string1.length();
           subString = string1.substring(10, end);
       } else if (end < string1.length()) {
           subString = string1.substring(start, end);
       }
       return subString;
   }

   public String getSadFace(String string1) {
       return string1.replace(":)", ":(");
   }

   public boolean isStartsAndEndsWith(String string, String word) {
       boolean start = string.startsWith(word);
       boolean end = string.endsWith(word);
       if (end && start) {
           return true;
       } else {
           return false;
       }
   }
   public int getNumberOfVovels(String string) {
       int numberOfVovels = 0;
       if (string != null) {
           String string1 = string.toLowerCase();
           char[] vovels = new char[]{'a', 'e', 'i', 'o', 'u', 'y', 'а', 'е', 'ё', 'и', 'о', 'у', 'ы', 'э', 'ю', 'я'};
           for (int i = 0; i < string1.length(); i++) {
               for (int j = 0; j < vovels.length; j++) {
                   char letter = string1.charAt(i);
                   if (letter == vovels[j]) {
                       numberOfVovels += 1;
                   }
               }
           }

       }
       return numberOfVovels;
   }

   public int getNumberOfDotsCommasExclamationMarks(String string) {
       int numberOfDotsCommasExclamationMarks = 0;
       if (string != null) {
           for (int i = 0; i < string.length(); i++) {
               char mark = string.charAt(i);
               if ((mark == '.') || (mark == ',') || (mark == '!')) {
                   numberOfDotsCommasExclamationMarks += 1;
               }
           }
       }
       return numberOfDotsCommasExclamationMarks;
   }

   public boolean isPalindromeString(String string) {
       if ((string == "") || (string == null)) {
           return false;
       } else {
           StringBuffer stringBuffer = new StringBuffer(string);
           stringBuffer.reverse();
           String string1 = stringBuffer.toString();
           return string1.equals(string);
       }
   }

   public void getSubStringsArray(String string1, int n) {
       int start = 0;
       int end = start + n;
       if ((string1 != null) &&
               (n > 0) &&
               (string1 != "") &&
               (string1.length() / n > 1) &&
               (string1.length() % n == 0)) {
           String[] subStringsArray = new String[string1.length() / n];
           for (int i = 0; i < subStringsArray.length; i++) {
               subStringsArray[i] = string1.substring(start, end);
               start += n;
               end += n;
               System.out.println(subStringsArray[i]);
           }
       } else {
           System.out.println("Impossible to get substrings");
       }
   }

   public int getNumberOfWords(String string) {
       int numberOfWords = 0;
       char char1;
       char char2;
       if (string.charAt(0) != 32) {
           numberOfWords += 1;
           for (int i = 1; i < (string.length() - 1); i++) {
           char1 = string.charAt(i);
           char2 = string.charAt(i + 1);
           if ((char1 == 32) && (char2 != 32)) {
               numberOfWords += 1;
           }
       }
       } else {
           for (int i = 0; i < (string.length() - 1); i++) {
               char1 = string.charAt(i);
               char2 = string.charAt(i + 1);
               if ((char1 == 32) && (char2 != 32)) {
                   numberOfWords += 1;
               }
           }
       }
       return numberOfWords;
   }
    public String getInitial(String string) {
       String initial = "";
       string.toUpperCase();
       String[] words = string.split(" ");
       String surname = words[0];
       String name = words[1];
       String secondName = words[2];
       String initial1 = surname.substring(0, 1);
       String initial2 = name.substring(0, 1);
       String initial3 = secondName.substring(0, 1);
       initial = String.join(".", initial1, initial2, initial3);
       return initial;
    }

    public String getDigits(String string) {
       String digits = "";
       for (int i = 1; i < string.length(); i++) {
           char letter = string.charAt(i);
           if (letter >= '0' && letter <= '9') {
               digits += letter;
           }
       } return digits;
    }

    public  String getDifferentLetters(String word1, String word2) {
       String differentLetters = "";
       boolean a;
       for (int i = 0; i < word1.length(); i++) {
           a = false;
           for (int j = 0; j < word2.length(); j++) {
               if (word1.charAt(i) == word2.charAt(j)) {
                   a = true;
                   break;
               }
           }
           if (!a) {
               char letter = word1.charAt(i);
               differentLetters += letter;
           }
       }
       for (int i = 0; i < word2.length(); i++) {
           a = false;
           for (int j = 0; j < word1.length(); j++) {
               if (word2.charAt(i) == word1.charAt(j)) {
                   a = true;
                   break;
               }
           }
           if (!a) {
               char letter = word2.charAt(i);
               differentLetters += letter;

           }
       }
       return differentLetters;
   }



   public String getUpperCase(String string1) {
       return string1.toUpperCase();
    }

}
