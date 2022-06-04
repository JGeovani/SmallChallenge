package br.org.estudarfora;

import java.util.Scanner;

public class BeginnerChallenge {
    static char[] transforms(char[] word) {
        for (int i = 0; i < word.length; i++) {
            if (word[i] == 'a' || word[i] == 'e' || word[i] == 'i' || word[i] == 'o' || word[i] == 'u') {
                char upperCase = Character.toUpperCase(word[i]);
                word[i] = upperCase;
            }
        }
        return word;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        System.out.println(transforms(word.toCharArray()));
    }
}
