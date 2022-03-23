package javaAssignment;

import java.util.Scanner;

public class Phone {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("""
                Nokia!!!
                Enter:
                1 -> Phone Book
                2 -> Message
                3 -> Chat
                4 -> Call Register
                5 -> Tones
                6 -> Settings
                7 -> Call divert
                8 -> Games
                9 -> Calculator
                10 -> Reminder
                11 -> Clock
                12 -> Profile
                13 -> SIM setting
                             """);
            int userInput = input.nextInt();

        switch (userInput) {
            case 1 -> {
                System.out.println("Phone book");
                System.out.println("""
                        Enter:
                                                
                        1. Search
                        2. Service Nos.
                        3. Add name
                        4. Erase
                        5. Edit
                        6. Assign tone
                        7. Send b'card
                        8. Options
                        9. Speed dials
                        10. Voice tags
                        """);
                userInput = input.nextInt();
                switch (userInput) {
                    case 1 -> System.out.println("you made a research");
                    case 2 -> System.out.println("05667 is your service number");
                    case 3 -> System.out.println("you have added your name... your name is Amaka");
                    case 4 -> System.out.println("you made an erase");
                    case 5 -> System.out.println("edit your pictures");
                    case 6 -> System.out.println("pick your preferred tone");
                    case 7 -> System.out.println("send birthday message");
                    case 8 -> {
                        System.out.println("""
                                1. Type of view
                                2. Memory status
                                """);
                        userInput = input.nextInt();
                        switch (userInput) {
                            case 1 -> System.out.println("portrait");
                            case 2 -> System.out.println("you are low on space");
                        }
                    }
                    case 9 -> System.out.println("how fast you dial");
                    case 10 -> System.out.println("Voice tag select");
                }
            }
            case 2 -> {
                System.out.println("Messages");
                System.out.println("""
                        Enter:
                                                
                        1. Write message
                        2. Inbox
                        3. Outbox
                        4. Pictures messages
                        5. Templates
                        6. Smileys
                        7. Message settings
                        8. Info service
                        9. Voice mailbox number
                        10. Service command editor
                        """);
                userInput = input.nextInt();
                switch (userInput) {
                    case 1 -> System.out.println("Type your message");
                    case 2 -> System.out.println("Received messages");
                    case 3 -> System.out.println("Sent messages");
                    case 4 -> System.out.println("Send picture messages");
                    case 5 -> System.out.println("This is your template");
                    case 6 -> System.out.println("Smiley faces");
                    case 7 -> {
                        System.out.println("""
                                1. Set
                                2. Common
                                """);
                        userInput = input.nextInt();
                        switch (userInput) {
                            case 1 -> {
                                System.out.println("""
                                        1. Message centre number
                                        2. Message sent as
                                        3. Message validity
                                        """);
                                userInput = input.nextInt();
                                switch (userInput) {
                                    case 1 -> System.out.println("13456 is your message centre number");
                                    case 2 -> System.out.println("Send your message as a frame");
                                    case 3 -> System.out.println("Message valid till tomorrow");
                                }
                            }
                            case 2 -> {
                                System.out.println("""
                                        1. Delivery report
                                        2. Reply via same centre
                                        3. Character support
                                        """);
                                userInput = input.nextInt();
                                switch (userInput) {
                                    case 1 -> System.out.println("report your deliver");
                                    case 2 -> System.out.println("reply your messages");
                                    case 3 -> System.out.println("support your phone character");
                                }
                            }
                            case 8 -> System.out.println("this is your information service");
                            case 9 -> System.out.println("6788 is your voice mailbox number");
                            case 10 -> System.out.println("edit your service command");
                        }
                    }
                }
            }
            case 3 -> {
                System.out.println("Chat");
                System.out.println("Chat with friend");
            }
            case 4 -> {
                System.out.println("""
                        Call register
                                1. Missed calls
                                2. Received calls
                                3. Dialled numbers
                                4. Erase recent call lists
                                5. Show call duration
                                6. Show call costs
                                7. Call cost settings
                                8. Prepaid credit
                        """);
                userInput = input.nextInt();
                switch (userInput) {
                    case 1 -> {
                        System.out.println("Missed calls");
                        System.out.println("""
                                Uncle chi(5)
                                Chief(2)
                                mom(2)
                                """);
                    }
                    case 2 -> {
                        System.out.println("Received calls ");
                        System.out.println("""
                                mama
                                chair person
                                Bola
                                """);
                    }
                    case 3 -> {
                        System.out.println("Dialled numbers");
                        System.out.println("""
                                09012345678
                                09178854880
                                08096545356
                                """);
                    }
                    case 4 -> {
                        System.out.println("Erase recent call list");
                        System.out.println("""
                                past
                                panama
                                playmate
                                """);
                    }
                    case 5 -> {
                        System.out.println("Show call duration");
                        System.out.println("""
                                1. Last call duration
                                2. All call duration
                                3. Received calls' duration
                                4. Dialled calls duration
                                5. Clear timers
                                """);
                        userInput = input.nextInt();
                        switch (userInput) {
                            case 1 -> {
                                System.out.println("Last call duration");
                                System.out.println(""" 
                                             Bola
                                             05 minutes:34 seconds
                                        """);
                            }
                            case 2 -> {
                                System.out.println("All call duration");
                                System.out.println("""
                                        Bola
                                        00 minutes : 55 seconds
                                        Blu
                                        10 minutes : 22 seconds
                                        Shaman
                                        06 minutes : 30 seconds
                                        """);
                            }
                            case 3 -> {
                                System.out.println("Received calls duration");
                                System.out.println("""
                                        mama
                                        12 minutes : 15 seconds
                                        peace
                                        11 minutes : 14 seconds
                                        """);
                            }
                            case 4 -> {
                                System.out.println("Dialled calls duration");
                                System.out.println("""
                                        09176689342
                                        00 minute : 12 seconds
                                        08123456789
                                        12 minutes : 13 seconds
                                        """);
                            }
                            case 5 -> System.out.println("Done");
                        }
                    }
                    case 6 -> {
                        System.out.println("Show call cost");
                        System.out.println();
                        System.out.println("""
                                1. Last call cost
                                2. All calls' cost
                                3. Clear counters
                                """);
                        userInput = input.nextInt();
                        switch (userInput) {
                            case 1 -> System.out.println("your call cost : #200, balance : #50");
                            case 2 -> System.out.println("All cost : #1750.34");
                            case 3 -> System.out.println("Done");
                        }
                    }
                    case 7 -> {
                        System.out.println("Cost call settings");
                        System.out.println("""
                                  1. Call cost limit
                                  2. Show costs in
                                """);
                        userInput = input.nextInt();
                        switch (userInput) {
                            case 1 -> System.out.println("call cost limit : #20,000");
                            case 2 -> System.out.println("show call cost in full");
                        }
                    }
                    case 8 -> System.out.println("This is your prepaid credit");
                }
            }
            case 5 -> {
                System.out.println("""
                        Tone
                              1. Ringing tone
                              2. Ringing volume
                              3. Incoming call alert
                              4. Composer
                              5. Message alert tone
                              6. Keypad tone
                              7. Warning and game tones
                              8. Vibrating alert
                              9. Screen saver
                        """);
                userInput = input.nextInt();
                switch (userInput) {
                    case 1 -> System.out.println("para para low");
                    case 2 -> System.out.println("volume 5");
                    case 3 -> System.out.println("fuse  and engine sounds");
                    case 4 -> System.out.println("Compose your own tone");
                    case 5 -> System.out.println("mama mama jam");
                    case 6 -> System.out.println("paa paa");
                    case 7 -> System.out.println("bio boo");
                    case 8 -> System.out.println("buzz buzz");
                    case 9 -> System.out.println("lolo");
                }
            }
            case 6 -> {
                System.out.println("""
                        Settings
                             1. call settings
                             2. Phone setting
                             3. Security settings
                             4. Restore factory settings
                        """);
                userInput = input.nextInt();
                System.out.println("Settings");
                switch (userInput) {
                    case 1 -> {
                        System.out.println("""
                                1. Automatic radial
                                2. Speed dialling
                                3. Call waiting option
                                4. Own number sending
                                5. Phone line in use
                                6. Automatic answer
                                   """);
                        userInput = input.nextInt();
                        switch (userInput) {
                            case 1 -> System.out.println("Automatic radial enabled");
                            case 2 -> System.out.println("Dial speed");
                            case 3 -> System.out.println("Option for waiting calls");
                            case 4 -> System.out.println("Sending number");
                            case 5 -> System.out.println("line is busy");
                            case 6 -> System.out.println("Answers");
                        }
                    }
                    case 2 -> {
                        System.out.println("""
                                1. Language
                                2. Cell info display
                                3. Welcome note
                                4. Network selection
                                5. Lights
                                6. Confirm SIM service actions
                                   """);
                        userInput = input.nextInt();
                        switch (userInput) {
                            case 1 -> System.out.println("""
                                    English
                                    French
                                    """);
                            case 2 -> System.out.println("Displays");
                            case 3 -> System.out.println("Welcome to Nokia");
                            case 4 -> System.out.println("MTN");
                            case 5 -> System.out.println("Blue");
                            case 6 -> System.out.println("Confirmed");
                        }
                    }
                    case 3 -> {
                        System.out.println("""
                                1. PIN code request
                                2. Call barring service
                                3. Fixed dialling
                                4. Closed user group
                                5. Phone Security
                                6. Change access codes
                                   """);
                        userInput = input.nextInt();
                        switch (userInput) {
                            case 1 -> System.out.println("Correct");
                            case 2 -> System.out.println("Stop");
                            case 3 -> System.out.println("Dialing is fixed");
                            case 4 -> System.out.println("User group closed");
                            case 5 -> System.out.println("""
                                    PIN
                                    Password
                                    """);
                            case 6 -> System.out.println("Codes changed");
                        }
                    }
                    case 4 -> System.out.println("Settings restored");
                }
            }
            case 7 -> System.out.println("Call diverted");
            case 8 -> System.out.println("Snake");
            case 9 -> System.out.println("7 + 7 = 14");
            case 10 -> System.out.println("It's my birthday on the 6th of next month");
            case 11 -> {
                System.out.println("""
                        Clock
                            1. Alarm clock
                            2. Clock settings
                            3. Date settings
                            4. Stopwatch
                            5. Countdown timer
                            6. Auto update of date and time
                            
                        """);
                userInput = input.nextInt();
                switch (userInput) {
                    case 1 -> System.out.println("Ring : 6:30 am");
                    case 2 -> System.out.println("Time : 5: 30 pm");
                    case 3 -> System.out.println("22/03/2022");
                    case 4 -> System.out.println("Stop");
                    case 5 -> System.out.println("5,4,3,2,1");
                    case 6 -> System.out.println("Date and Time updated");
                }
            }
            case 12 -> System.out.println("Semicolon");
            case 13 -> System.out.println("SIM services good");
            default -> System.out.println("invalid number");
        }



        }
    }

