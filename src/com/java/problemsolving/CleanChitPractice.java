package com.oetp;

import java.awt.print.Pageable;
import java.util.*;
import java.util.concurrent.*;
import java.util.stream.Collectors;

public class CleanChitPractice {

    public static void main(String[] args) {

        ExecutorService service = Executors.newFixedThreadPool(2);

        service.submit(()->{
            int n=10;
            while(n>0){
                if(n%2==0){
                    System.out.println("EVEN "+n);
                }
                n--;
            }
        });
        service.submit(()->{
            int n=10;
            while(n>0){
                if(n%2==1){
                    System.out.println("ODD "+n);
                }
                n--;
            }
        });


    }

    //1.Reverse a String (without using built-ins)
    public static void reverse(String value){
        int start = 0,end=value.length()-1;
        char cArr[] = value.toCharArray();
        while(start<end){
            char c = cArr[end];
            cArr[end] = cArr[start];
            cArr[start] = c;
            start++;
            end--;

        }
        String revered = Arrays.toString(cArr);
        System.out.println(revered);
    }

    //2.Count frequency of characters
    public static void countFrequency(String value){
        HashMap<Character,Integer> occurance= new HashMap<>();
        for(char c:value.toCharArray()){
            occurance.put(c,occurance.getOrDefault(c,0)+1);
        }
        System.out.println(occurance);
    }

    //3.Check if two strings are anagrams
    public static void checkAnagrams(String value1,String value2){


       int [] freq = new int[26];

       value1 = value1.replaceAll("\\s","").toLowerCase();
        value2 = value2.replaceAll("\\s","").toLowerCase();

       for(char c1:value1.toCharArray()){
           freq[c1-'a']++;
       }
       for(char c2:value2.toCharArray()){
           freq[c2-'a']--;
       }

       for (int count : freq) {
            if (count != 0) {
                System.out.println("NOT ANAGRAM");
                return;
            }
        }
        System.out.println("ANAGRAM");
    }

    //4.Find first non-repeating character
    public static void nonRepeatingChar(String value){
        HashSet<Character> characters = new HashSet<>();

        for(char c : value.toCharArray()){
            if(!characters.add(c)){
                System.out.println(c);
                return;
            }
        }
    }

    //5.Remove duplicates from string
    public static void removeDuplicates(String value){
        Set<Character> characters=new LinkedHashSet<>();

        for(char c:value.toCharArray()){
            characters.add(c);
        }

        StringBuffer sb = new StringBuffer();
        for(char c:characters){
            sb.append(c);
        }
        System.out.println(sb);
    }

    //6. Check if string is palindrome
    public static  void checkPalindrome(String value){
        int start=0;
        int end = value.length()-1;
        while(start<end){
            if(value.charAt(start)!=value.charAt(end)){
                System.out.println("NOT A PALINDROME");
                return;
            }
            start++;
            end--;
        }
        System.out.println("IS PALINDROME");

//        boolean isPal = value.equalsIgnoreCase(new StringBuilder(value).reverse().toString());
    }

    //7.Longest word in sentence
    public static void findLongestWord(String value){
        String [] val=value.split(" ");
        int max = 0;
        for(int i=0;i<val.length;i++){

            if(val[i].length()>val[max].length()){
                max=i;
            }
        }

        System.out.println(val[max]);
    }

    //8.Compress string (aabb → a2b2)
    public static void compressString(String value){

        StringBuilder sb = new StringBuilder();
        int count=1;
        for(int i=1;i<value.length();i++){

            if(value.charAt(i)==value.charAt(i-1)){
                count++;
            }else{
                sb.append(value.charAt(i-1)).append(count);
                count = 1;
            }
        }

        sb.append(value.charAt(value.length()-1)).append(count);
        System.out.println(sb);
    }

    //9.Find vowels & consonant count
    public static void findVowelsAndCons(String value){
        int vowels=0;
        int cons=0;
//        Set<Character> set=new HashSet<>();
//        set.add('a');
//        set.add('e');
//        set.add('i');
//        set.add('o');
//        set.add('u');
//
//        for(char c:value.trim().toLowerCase().toCharArray()){
//            if (!Character.isLetter(c)) {
//                continue; // skip non-letters
//            }
//            if(set.contains(c)){
//                vowels++;
//            }
//            else {
//                cons++;
//            }
//        }
        String vowelsSet = "aeiou";

        for (char c : value.toLowerCase().toCharArray()) {
            if (Character.isLetter(c)) {
                if (vowelsSet.indexOf(c) >= 0) vowels++;
                else cons++;
            }
        }
        System.out.println(vowels+" "+cons);
    }

    //10.Find max/min in array
    public static void findMaxMin(int [] values){
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<values.length;i++){
            if(values[i]>max){
                max = values[i];
            }else if(values[i]<min){
                min =values[i];
            }
        }
        System.out.println(max + " "+ min);
    }

    //11.Second largest element
    public static void findSecondLargest(int [] values){

        int max = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for(int i=0;i<values.length;i++){
            if(values[i]>max){
                second = max;
                max = values[i];

            } else if (values[i]>second && values[i] < max){
                second=values[i];
            }
        }
        if (second == Integer.MIN_VALUE) {
            System.out.println("No second largest element");
        } else {
            System.out.println(second);
        }

    }

    //12.Remove duplicates from sorted array
    public static void removeDuplicates(int [] values){
        //1,2,2,3,3,3,4,5,6,6,7,9,9
        int i=0;
        for(int j=0;j<values.length-1;j++){
            if(values[j]!=values[j+1]){
                i++;
                values[i]=values[j+1];
            }
        }
//
//        for (int j = 1; j < values.length; j++) {
//            if (values[j] != values[i]) {
//                i++;
//                values[i] = values[j];
//            }
//        }
        for(int k=0;k<=i;k++){
            System.out.println(values[k]);
        }

    }

    //13.Move zeros to end
    public static void zeroAtEnd(int [] values){
        //0,1,2,3,0,4,0,5,0,0,0,6,0,7,8,9,0,10,0

        int i=0;
        for(int j=0;j<values.length;j++){
            if(values[j]!=0){
                values[i++]=values[j];
            }
        }

        while(i<values.length){
            values[i++]=0;
        }
        System.out.println(Arrays.toString(values));
    }

    //14.Find missing number
    public static int findMissingNumber(int [] values){

        int currentvalue=1;
        for(int i=0;i<values.length;i++){

            if(values[i]==currentvalue){
                currentvalue++;
            }
            else{
                return currentvalue;
            }
        }
        return 0;
    }
    //15.Merge two sorted arrays
    public static void mergeTwoSortedArray(int [] arr1,int [] arr2){

        int sum = arr1.length+arr2.length;
        int mergedArray[] = new int[sum];
        int i=0,j=0,k=0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] <= arr2[j]) {
                mergedArray[k++] = arr1[i++];
            } else {
                mergedArray[k++] = arr2[j++];
            }
        }

        while(i<arr1.length){
            mergedArray[k++]=arr1[i++];
        }
        while(j<arr2.length){
            mergedArray[k++]=arr2[j++];
        }


        System.out.println(Arrays.toString(mergedArray));

    }

    //16.Rotate array by K positions
    public static void rotateArray(int[] values, int k) {

        int n = values.length;
        k = k % n; // normalize k

        reverse(values, 0, k - 1);
        reverse(values, k, n - 1);
        reverse(values, 0, n - 1);

        System.out.println(Arrays.toString(values));
    }

    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    //17.Find first repeated element in array
    public static Integer firstRepeatedElement(int [] values){
        HashSet<Integer> set = new HashSet<>();
        int i=0;
        while(i<values.length){

            if(!set.add(values[i])){
                return values[i];
            }

            i++;
        }
        return 0;
    }
    //18.Count occurrences of words in paragraph
    public static void countWordOccurrences(String paragraph){

        if(paragraph==null || paragraph.isEmpty()){
            return;
        }

        String[] array = paragraph.toLowerCase().split(" ");
        int i=0;
        HashMap<String,Integer> occurrence = new HashMap<>();
        while(i<array.length){
            occurrence.put(array[i],occurrence.getOrDefault(array[i],0)+1);
            i++;
        }

        Map<Integer,List<String>> groupByFreq = occurrence.entrySet().stream().collect(Collectors.groupingBy(
                e -> e.getValue().intValue(),
                Collectors.mapping(Map.Entry::getKey, Collectors.toList())
        ));


        System.out.println(groupByFreq);



    }
    //19.Find element with highest frequency
    public static Integer highestFrequencyFirst(int[] values) {

        Map<Integer, Integer> freq = new HashMap<>();
        int maxCount = 0;
        Integer result = null;

        for (int num : values) {
            int count = freq.getOrDefault(num, 0) + 1;
            freq.put(num, count);

            if (count > maxCount) {
                maxCount = count;
                result = num;
            }
        }
        return result;
    }
    //20.
    public static void detectDuplicateChars(String value) {

        Set<Character> seen = new HashSet<>();
        Set<Character> duplicates = new HashSet<>();

        for (char c : value.toCharArray()) {
            if (!seen.add(c)) {
                duplicates.add(c);
            }
        }

        System.out.println(duplicates);


    }


    public static Node reverseLinkedList(Node head){
        Node prev = null;
        Node current = head;

        while (current != null) {
            Node next = current.next; // store next
            current.next = prev;      // reverse link
            prev = current;           // move prev
            current = next;           // move current
        }

        return prev;

    }

    public static class Node {

        int value;
        Node next;

        public Node(int value){
            this.value = value;
            this.next = null;
        }
        public Node(int value,Node next){
            this.value = value;
            this.next = next;
        }

    }

}

class Producer implements Runnable{

    private final BlockingQueue<String> queue;

    Producer(BlockingQueue<String> queue){
        this.queue=queue;
    }


    @Override
    public void run() {
        while(true){

        }
    }
}

