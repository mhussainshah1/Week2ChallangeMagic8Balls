package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        playGame();
        System.out.println("\nThank you for playing!");
    }
    public static void playGame(){
        List<String> answer = new ArrayList<>();
        answer.add("It is certain");
        answer.add("It is decidedly so");
        answer.add("Without a doubt");
        answer.add("Yes definitely");
        answer.add("You may rely on it");
        answer.add("As I see it, yes");
        answer.add("Most likely");
        answer.add("Outlook good");/**/
        answer.add("Yes");
        answer.add("Signs point to yes");
        answer.add("Reply hazy try again");
        answer.add("Ask again later");
        answer.add("Better not tell you now");
        answer.add("Cannot predict now");
        answer.add("Concentrate and ask again");
        answer.add("Don 't count on it");
        answer.add("My reply is no");
        answer.add("My sources say no");
        answer.add("Outlook not so good");
        answer.add("Very doubtful");

        int heighestIndex = answer.size() -1;

        Scanner keyboard = new Scanner(System.in);
        String question, reply;
        int randomIndex;

        do{
            System.out.print("You Asked: ");
            question = keyboard.nextLine();
            randomIndex = getRandomNumber(heighestIndex);
            reply = answer.get(randomIndex);
            System.out.println("\nMAGIC 8-BALL SAYS: " + reply);
            System.out.println("\nDo you have another question for the Magic 8-Ball? (y/n)");
            question = keyboard.nextLine();
        } while (!question.equalsIgnoreCase("n"));
    }

    public static int getRandomNumber(int max){
        int randomNumber = 1 + (int)(Math.random()*max);
        return randomNumber;
    }
}