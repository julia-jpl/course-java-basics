package com.rakovets.course.javabasics.practice;

import java.util.*;

public class TextMonitoring {

   public HashMap<String, Integer> researchText(String text) {
       String text1 = text.replaceAll("\\W", " ");
       String text2 = text1.trim();
       HashMap<String, Integer> mapWords = new HashMap<>();
       for (String string : text2.split(" ")) {
           if (mapWords.containsKey(string)) {
               mapWords.put(string, mapWords.get(string) + 1);
           } else {
               mapWords.put(string, 1);
           }
       } mapWords.remove("");
       return mapWords;
   }

   public int getCountUniqueWords(HashMap<String, Integer> map) {
       int result = 0;
       for (Map.Entry<String, Integer> item : map.entrySet()) {
           if (item.getValue() == 1) {
               result += 1;
           }
       }
       return result;
   }

   public Collection<String> getUniqueWords(HashMap<String, Integer> map) {
       HashMap<String, Integer> uniqueWords = new HashMap<>();
       for (Map.Entry<String, Integer> item : map.entrySet()) {
           if (item.getValue() == 1) {
               uniqueWords.put(item.getKey(), item.getValue());
           }
       }
       Collection<String> result = uniqueWords.keySet();
       return result;
   }

   public int get(HashMap<String, Integer> map, String word) {
       return map.get(word);
   }

   public Map<String, Integer> getWordFrequencyDesc(boolean isAscendingFrequency, HashMap<String, Integer> map) {
       List<Map.Entry<String, Integer>> list = new LinkedList<>(map.entrySet());
       Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
           @Override
           public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
               if (isAscendingFrequency) {
                   return o1.getValue().compareTo(o2.getValue());
               } else {
                   return o2.getValue().compareTo(o1.getValue());
               }
           }
       });
      Map<String, Integer> sortedMap = new LinkedHashMap<>();
      for (Map.Entry<String, Integer> item : list) {
          sortedMap.put(item.getKey(), item.getValue());
      }
      return sortedMap;
   }
}
