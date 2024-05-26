import java.util.Arrays;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        printLength("Hello World it`s Java");
        System.out.println(reverseMethod("Hello"));
        int vowelsCount = checkVowelsElements("hello world");
        System.out.println("Кількість голосних літер: " + vowelsCount);
        printPolindrom("aba");
        System.out.println(removeDuplicateCharacters("heleelooo"));
        changeArrive("I arrive and I back");
        System.out.println(reverseString("I arrive and I back"));
        capitalizeFirstLetter("hello world it`s all letter upper");
        System.out.println(areAnagrams("обезьянство", "светобоязнь"));
    }

    public static void printLength(String words) {
        if (words.trim().isEmpty()) {
            System.out.println(0);
            return;
        }
        System.out.println(words.trim().split(" ").length);
    }
    public static String reverseMethod(String words){
        return new StringBuilder(words).reverse().toString();
    }
    public static int checkVowelsElements(String words){
        String lowerCaseWords = words.toLowerCase();
        int count = 0;
        for (int i = 0; i < lowerCaseWords.length(); i++) {
            char ch = lowerCaseWords.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count;
    }
    public static void printPolindrom(String words){
        System.out.println(words.trim().equals(reverseMethod(words)));
    }

        public static String removeDuplicateCharacters(String words) {
        HashSet<Character> set = new HashSet<>();
        String result = "";
             for (char c : words.toCharArray()){
                 if (!set.contains(c)) {
                     result += c;
                     set.add(c);
                 }
             }
             return result;
        }
        public static void changeArrive (String words){
           String[] change = words.split(" ");
            System.out.println(Arrays.toString(change));
        }
        public static String reverseString (String words){
            return new StringBuilder(words).reverse().toString();
        }
        public static void capitalizeFirstLetter (String words){
            String[] change = words.split(" ");
            for (int i = 0; i < change.length; i++) {
                change[i] = change[i].substring(0,1).toUpperCase() + change[i].substring(1);
            }
            System.out.println(Arrays.toString(change));
        }
    public static boolean areAnagrams(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
       return true;
    }

    }