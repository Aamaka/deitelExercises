package javaAssignment;

import java.util.Scanner;

public class MyersBriggs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int extrovertCounter = 0;
        int introvertCounter = 0;
        int sensitiveCounter = 0;
        int intuitionCounter = 0;
        int thinkerCounter = 0;
        int feelerCounter = 0;
        int judgingCounter = 0;
        int perceptiveCounter = 0;
        String choice;

        for (int i = 1; i <= 20; i++) {
            System.out.println("Enter A or B");
            switch (i) {
                case 1 -> {
                    System.out.println("""
                            1.
                            A. expend energy, enjoy groups
                            B. conserve energy, enjoy one-on-one
                            """);
                    choice = input.next();
                    if (choice.equalsIgnoreCase("A")) extrovertCounter++;
                    else introvertCounter++;
                }
                case 2 -> {
                    System.out.println("""
                            2.
                            A. interpret literally
                            B. look for meaning and possibilities
                            """);
                    choice = input.next();
                    if (choice.equalsIgnoreCase("A")) sensitiveCounter++;
                    else intuitionCounter++;
                }
                case 3 -> {
                    System.out.println("""
                            3.
                            A. logical,thinking,Questioning
                            B. empathetic,feeling,accommodating
                            """);
                    choice = input.next();
                    if (choice.equalsIgnoreCase("A")) thinkerCounter++;
                    else feelerCounter++;
                }
                case 4 -> {
                    System.out.println("""
                            4.
                            A. organized,orderly
                            B. flexible,adaptable
                            """);
                    choice = input.next();
                    if (choice.equalsIgnoreCase("A")) judgingCounter++;
                    else perceptiveCounter++;
                }
                case 5 -> {
                    System.out.println("""
                            5.
                            A. more outgoing,think aloud
                            B. more reserved,think to yourself
                            """);
                    choice = input.next();
                    if (choice.equalsIgnoreCase("A")) extrovertCounter++;
                    else introvertCounter++;
                }
                case 6 -> {
                    System.out.println("""
                            6.
                            A. practical,realistic,experiential
                            B. imaginative,innovative,theoretical
                            """);
                    choice = input.next();
                    if (choice.equalsIgnoreCase("A")) sensitiveCounter++;
                    else intuitionCounter++;
                }
                case 7 -> {
                    System.out.println("""
                            7.
                            A. candid,straight forward, frank
                            B. tactful, kind ,encouraging
                            """);
                    choice = input.next();
                    if (choice.equalsIgnoreCase("A")) thinkerCounter++;
                    else feelerCounter++;
                }
                case 8 -> {
                    System.out.println("""
                            8.
                            A. plan,schedule
                            B. unplanned spontaneous
                            """);
                    choice = input.next();
                    if (choice.equalsIgnoreCase("A")) judgingCounter++;
                    else perceptiveCounter++;
                }
                case 9 -> {
                    System.out.println("""
                            9.
                            A. seek many tasks,public activities,interaction with others
                            B. seek private,solitary activities with quite to concentrate
                            """);
                    choice = input.next();
                    if (choice.equalsIgnoreCase("A")) extrovertCounter++;
                    else introvertCounter++;
                }
                case 10 -> {
                    System.out.println("""
                            10.
                            A. standard,usual,conventional
                            B. different,novel,unique
                            """);
                    choice = input.next();
                    if (choice.equalsIgnoreCase("A")) sensitiveCounter++;
                    else intuitionCounter++;
                }
                case 11 -> {
                    System.out.println("""
                            11.
                            A. firm,tend to criticize,hold the line
                            B. gentle,tend to appreciate,conciliate
                            """);
                    choice = input.next();
                    if (choice.equalsIgnoreCase("A")) thinkerCounter++;
                    else feelerCounter++;
                }
                case 12 -> {
                    System.out.println("""
                            12.
                            A. regulated
                            B. easygoing, "live" and "let live"
                            """);
                    choice = input.next();
                    if (choice.equalsIgnoreCase("A")) judgingCounter++;
                    else perceptiveCounter++;
                }
                case 13 -> {
                    System.out.println("""
                            13.
                            A. external,communicative,express yourself
                            B. internal,reticent,keep to yourself
                            """);
                    choice = input.next();
                    if (choice.equalsIgnoreCase("A")) extrovertCounter++;
                    else introvertCounter++;
                }
                case 14 -> {
                    System.out.println("""
                            14.
                            A. focus on here-and-now
                            B. look to the future,global perspective,"big picture"
                            """);
                    choice = input.next();
                    if (choice.equalsIgnoreCase("A")) sensitiveCounter++;
                    else intuitionCounter++;
                }
                case 15 -> {
                    System.out.println("""
                            15.
                            A. tough-minded,just
                            B.tender-heart,merciful
                            """);
                    choice = input.next();
                    if (choice.equalsIgnoreCase("A")) thinkerCounter++;
                    else feelerCounter++;
                }
                case 16 -> {
                    System.out.println("""
                            16.
                            A. preparation,plan ahead
                            B. go with the flow,adapts as you go
                            """);
                    choice = input.next();
                    if (choice.equalsIgnoreCase("A")) judgingCounter++;
                    else perceptiveCounter++;
                }
                case 17 -> {
                    System.out.println("""
                            17.
                            A. active,initial
                            B. reflective,deliberate
                            """);
                    choice = input.next();
                    if (choice.equalsIgnoreCase("A")) extrovertCounter++;
                    else introvertCounter++;
                }
                case 18 -> {
                    System.out.println("""
                            18.
                            A. facts,things,"what is"
                            B. ideas,dreams,"what could be",philosophy
                            """);
                    choice = input.next();
                    if (choice.equalsIgnoreCase("A")) sensitiveCounter++;
                    else intuitionCounter++;
                }
                case 19 -> {
                    System.out.println("""
                            19.
                            A. matter of facts,issue-oriented
                            B. sensitive,people-oriented,compassionate
                            """);
                    choice = input.next();
                    if (choice.equalsIgnoreCase("A")) thinkerCounter++;
                    else feelerCounter++;
                }
                case 20 -> {
                    System.out.println("""
                            20.
                            A. control,govern
                            B. latitude,freedom
                            """);
                    choice = input.next();
                    if (choice.equalsIgnoreCase("A")) judgingCounter++;
                    else perceptiveCounter++;
                }
                default -> System.out.println("enter only A or B");

            }


        }
        System.out.println("Extrovert = " + extrovertCounter);
        System.out.println("Introvert = " + introvertCounter);
        System.out.println("Sensitive = " + sensitiveCounter);
        System.out.println("Intuition = " + intuitionCounter);
        System.out.println("Thinker = " + thinkerCounter);
        System.out.println("Feeler = " + feelerCounter);
        System.out.println("Judging = " + judgingCounter);
        System.out.println("Perceptive = " + perceptiveCounter);
        System.out.println();

        if (extrovertCounter > introvertCounter) System.out.print("Extrovert ");
        else if (introvertCounter > extrovertCounter) System.out.print("Introvert ");
         if (sensitiveCounter > intuitionCounter) System.out.print("Sensitive ");
        else if (intuitionCounter > sensitiveCounter) System.out.print("intuition ");
         if (thinkerCounter > feelerCounter) System.out.print("Thinker ");
        else if (feelerCounter > thinkerCounter) System.out.print("Feeler ");
         if (judgingCounter > perceptiveCounter) System.out.print("Judging ");
        else if (perceptiveCounter > judgingCounter) System.out.print("Perceptive ");


    }
}

