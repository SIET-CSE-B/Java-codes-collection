public class SplitExample {
    public static void main(String[] args) {
        String sentence = "Java is fun to learn";

        // Split the sentence by space
        String[] words = sentence.split(" ");

        // Print each word
        for (String word : words) {
            System.out.println(word);
        }
    }
}
