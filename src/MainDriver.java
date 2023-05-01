import java.util.ArrayList;

public class MainDriver {
    public static void main(String[] args) {
        BinarySearchTree<String> words = new BinarySearchTree<>();

        WordHamster chomp = new WordHamster();
        boolean canGatherFromFile = chomp.gatherWords(args[0]);
        if (canGatherFromFile) {
            ArrayList<String> wordsFromFile = chomp.exposeWords();
            for (String word : wordsFromFile) {
                words.insert(word);
            }

            System.out.println("Total words in the text file: " + wordsFromFile.size());

            System.out.println("");

            words.printTree();

            double ttrRatio = (1.0 * words.size() / wordsFromFile.size());
            System.out.println("TTR Ratio " + ttrRatio);
        } else {
            System.out.println("Unable to parse text from file");
        }
    }
}
