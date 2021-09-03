package exercise03;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Jacob Cordonero
 */

import java.util.Scanner;

public class Solution03 {
    public static void main(String[] args) {
        //prompts the user for a quote and an author
        //Display the quotation and author
        //as shown in the example output:
        /*  What is the quote? These aren't the droids you're looking for.
            Who said it? Obi-Wan Kenobi
            Obi-Wan Kenobi says, "These aren't the droids you're looking for."
        */

        Scanner input = new Scanner(System.in);
        System.out.print("What is the quote? ");
        String quote = input.nextLine();
        System.out.print("Who said it? ");
        String author = input.nextLine();
        System.out.println(author + " says, \"" + quote + "\"");
    }
}
