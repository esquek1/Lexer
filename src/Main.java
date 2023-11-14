import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.FileReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        String word1 = "class";
        Token token = new Token();

        // read file character by character
        System.out.println("Enter filename: ");
        String fileName = args[0];
        File input = new File(fileName);
        if (!input.exists()) {
            System.out.println(args[0] + " does not exist");
            return;
        }

        if (!(input.isFile() && input.canRead())) {
            System.out.println(input.getName() + " cannot read");
            return;
        }
        System.out.println("\n\n");
        BufferedReader buffReader = null;
        try {
            buffReader = new BufferedReader(new FileReader(input));
            String line;

            while ((line = buffReader.readLine()) != null) {
                StringTokenizer tokenizer = new StringTokenizer(line, " \t"); // Delimiters are space and tab
                while (tokenizer.hasMoreTokens()) {
                    String word = tokenizer.nextToken();
                    if (!word.isEmpty()) {
                        boolean ifFound = false;
                        // Check if the word exists in the token mapping
                        for (Integer tokenId : token.tokens.keySet()) {
                            if (token.tokens.get(tokenId).contains(word)) {
                                System.out.println("Token Category: " + tokenId + ", value \"" + word + "\"");
                                ifFound = true;
                                break;
                            }
                        }
                        if (!ifFound) {
                            System.out.println("Error: " + word + " not allowed");
                        }
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}