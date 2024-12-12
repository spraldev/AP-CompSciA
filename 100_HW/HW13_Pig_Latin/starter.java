import java.util.Scanner;

class starter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Please input your sentence: ");
        
        String sentence = scanner.nextLine();
        
        String newSentence = "";
        
        String[] arr = sentence.split(" ");
        
        for (int i = 0; i < arr.length; i++) {
            String word = arr[i];
            
            // check if word has 1 char
            if (word.length() == 0) {
                continue;
            }

            char firstChar = word.charAt(0);
            boolean startsWithVowel = "aeiouAEIOU".indexOf(firstChar) != -1;

            if (startsWithVowel) {
                newSentence += word + "-way ";
            } else if (word.length() > 1) {
                newSentence += word.substring(1) + "-" + firstChar + "ay ";
            } else {
                newSentence += word + "-ay ";
            }
        }
        
        System.out.println("Pig Latin: " + newSentence.trim());
    }
}
