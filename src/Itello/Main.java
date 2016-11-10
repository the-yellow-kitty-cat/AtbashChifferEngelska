package Itello;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a string");
        String a = in.nextLine();
        if (a.equals("")) {
            System.out.println(a);
        } else {
            String encryptionToString = getAtbashEncryption(a);
            System.out.println(encryptionToString);
        }
    }

    static String getAtbashEncryption(String a) {
        StringBuilder encryptedSentence = new StringBuilder();

        for (int currentLetter = 0; currentLetter < a.length(); currentLetter++) {

            char originalAscii = a.charAt(currentLetter);
            boolean isBigLetter = originalAscii >= 65 && originalAscii <= 90;
            boolean isSmallLetter = originalAscii >= 97 && originalAscii <= 122;
            boolean isNumber = originalAscii >= 48 && originalAscii <= 57;

            int letterCode;
            int lengthOfAlphabet;

            if (isBigLetter || isSmallLetter) {
                lengthOfAlphabet = 27;
            } else if (isNumber) {
                lengthOfAlphabet = 9;
            } else {
                encryptedSentence.append(originalAscii);
                continue;
            }

            if (isBigLetter) {
                letterCode = 64;
            } else if (isSmallLetter) {
                letterCode = 96;
            } else {
                letterCode = 48;
            }
            char newAscii = (char) (lengthOfAlphabet - (originalAscii - letterCode) + letterCode);
            encryptedSentence.append(newAscii);
        }
        return encryptedSentence.toString();
    }

}

