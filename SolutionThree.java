public class SolutionThree {
        public static String reverseWords(String s) {
            String[] words = s.trim().split("\\s+"); // Split by one or more spaces
            StringBuilder result = new StringBuilder();
    
            for (int i = words.length - 1; i >= 0; i--) {
                result.append(words[i]);
                if (i > 0) {
                    result.append(" "); // Add a space between words
                }
            }
    
            return result.toString();
        }
    
        public static void main(String[] args) {
            String input = "Welcome to geeksforgeeks";
            System.out.println("Reversed words: " + reverseWords(input));
        }
    }

public class SolutionThree {
        public static String reverseWords(String s) {
            String[] words = s.trim().split("\\s+"); // Split by one or more spaces
            StringBuilder result = new StringBuilder();
    
            for (int i = words.length - 1; i >= 0; i--) {
                result.append(words[i]);
                if (i > 0) {
                    result.append(" "); // Add a space between words
                }
            }
    
            return result.toString();
        }
    
        public static void main(String[] args) {
            String input = "Welcome to geeksforgeeks";
            System.out.println("Reversed words: " + reverseWords(input));
        }
    }

    