import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Token token = new Token();

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

        System.out.println(input.getName() + " opened.");

        try {
            FileInputStream fis = new FileInputStream(fileName);
            char currChar;
            StringBuilder currWord = new StringBuilder();

            boolean isStringOrComment = false;
            boolean isString = false;
            boolean isComment = false;
            int content;
            while ((content = fis.read()) != -1) {
                currChar = (char) content;
                //System.out.println("currWord: " + currWord);

                // Check if string
                if (currChar == '"' || isStringOrComment) {
                    System.out.println("string: " + currWord);
                    if (currWord.length() == 0) {
                        // Beginning of the string
                        currWord.append(currChar);
                        isStringOrComment = true;

                    } else if (currWord.charAt(0) == '"') {
                        // Ending of the string
                        currWord.append(currChar);
                        isStringOrComment = false;

                    }else{
                        currWord.append(currChar);
                    }
                } else if (checkIfLetterOrNum(currChar) || isSymbol(currChar)) {
                    // Concatenate currChar to currWord
                    currWord.append(currChar);
             //   } else if (!isStringOrComment) {
                    // If space, tab, newline, or carriage return, check if the word exists in the token mapping
                    boolean ifFound = false;
                    StringBuilder tempWord = new StringBuilder();
                    tempWord.append(currWord);
                    tempWord.append(currChar);


                    /*
                    read character
                    check if its a token
                    if yes, continue reading
                    else, new word.
                     */
                    System.out.println("Checking if its a token: " + currWord);
                    for (Integer tokenId : token.tokens.keySet()) {

                        // Check if next formed string is in the hashmap
                        // if it is, read next char
                        if (token.tokens.get(tokenId).contains(tempWord.toString())) {
                            System.out.println("Next formed string is a token");
                            ifFound = false;
                            break;
                        }else if (token.tokens.get(tokenId).contains(currWord.toString())) {
                            // Else, print category and create new word
                            System.out.println("Token Category: " + tokenId + ", value \"" + currWord + "\"");
                            ifFound = true;
                            break;
                        }
                    }

                    if (!ifFound) {
                        // Check if it's a string

                        if(isString){
                            System.out.println("Token Category: 62, string, "+ currWord);
                        }
                    }
                }else if(currChar == ' ' || currChar == '\t' || currChar == '\n' || currChar == '\r'){
                    // Reset the length
                    currWord.setLength(0);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static boolean isSymbol(char c) {
        char[] symbolArray = {'!', '@', '#', '$', '%', '&', '*', '(', ')', '-', '_', '+', '=', '[', ']',
                '{', '}', '|', '\'', '"', ':', '.', ',', '<', '>', '?', '/'};
        for (char currentChar : symbolArray) {
            if (currentChar == c) {
                return true;
            }
        }
        return false;
    }

    private static boolean checkIfLetterOrNum(char c) {
        return (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') || (c >= '0' && c <= '9');
    }

}