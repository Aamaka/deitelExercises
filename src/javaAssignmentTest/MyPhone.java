package javaAssignmentTest;

import java.util.Scanner;

public class MyPhone {
    static int userInput;
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        menu();
    }

    private static void menu() {
        String main = """
                              
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
                14 -> back
                """;

        System.out.println(main);
        userInput = input.nextInt();
        switch (userInput) {
            case 1 -> phoneBook();
            case 2 -> messages();
            case 3 -> chat();
            case 4 -> callRegister();
            case 5 -> tones();
            case 6 -> settings();
            case 7 -> callDivert();
            case 8 -> Games();
            case 9 -> Calculator();
            case 10 -> Reminder();
            case 11 -> clock();
            case 12 -> profile();
            case 13 -> simSetting();
            case 14 -> exit();
            default -> menu();
        }
    }

    private static void simSetting() {
        System.out.println("SIM services good");
    }

    private static void profile() {
        System.out.println("Semicolon");
    }

    private static void clock() {
        System.out.println("""
                Clock
                    1. Alarm clock
                    2. Clock settings
                    3. Date settings
                    4. Stopwatch
                    5. Countdown timer
                    6. Auto update of date and time
                    7. back
                """);
        userInput = input.nextInt();
        switch (userInput) {
            case 1 -> alarmClock();
            case 2 -> clockSettings();
            case 3 -> dateSetting();
            case 4 -> stopWatch();
            case 5 -> countDownTimer();
            case 6 -> autoUpdateTimAndDate();
            case 7 -> menu();
            default -> clock();
        }
    }

    private static void autoUpdateTimAndDate() {
        System.out.println("Date and Time updated");
    }

    private static void countDownTimer() {
        System.out.println("5,4,3,2,1");
    }

    private static void stopWatch() {
        System.out.println("Stop");
    }

    private static void dateSetting() {
        System.out.println("22/03/2022");
    }

    private static void clockSettings() {
        System.out.println("Time : 5: 30 pm");
    }

    private static void alarmClock() {
        System.out.println("Ring : 6:30 am");
    }

    private static void Reminder() {
        System.out.println("It's my birthday on the 6th of next month");
    }

    private static void Calculator() {
        System.out.println("7 + 7 = 14");
    }

    private static void Games() {
        System.out.println("Snake");
    }

    private static void callDivert() {
        System.out.println("Call diverted");
    }

    private static void settings() {
        System.out.println("""
                Settings
                     1. call settings
                     2. Phone setting
                     3. Security settings
                     4. Restore factory settings
                     5. back
                """);
        userInput = input.nextInt();
        switch (userInput) {
            case 1 -> callsSetting();
            case 2 -> phoneSetting();
            case 3 -> securitySetting();
            case 4 -> restoreSettings();
            case 5 -> menu();
            default -> settings();
        }
    }

    private static void restoreSettings() {
        System.out.println("Settings restored");
    }

    private static void securitySetting() {
        System.out.println("Security Settings");
        System.out.println("""
                               1. PIN code request
                               2. Call barring service
                               3. Fixed dialling
                               4. Closed user group
                               5. Phone Security
                               6. Change access codes
                               7. back
                   """);
        userInput = input.nextInt();
        switch (userInput) {
            case 1 -> pinCodeRequest();
            case 2 -> callBarringService();
            case 3 -> fixedDialling();
            case 4 -> closedUserGroup();
            case 5 -> phoneSecurity();
            case 6 -> changeAccessCodes();
            case 7 -> settings();
            default -> securitySetting();
        }
    }

    private static void changeAccessCodes() {
        System.out.println("Codes changed");
    }

    private static void phoneSecurity() {
        System.out.println("""
                PIN
                Password
                     """);
    }

    private static void closedUserGroup() {
        System.out.println("User group closed");
    }

    private static void fixedDialling() {
        System.out.println("Dialing is fixed");
    }

    private static void callBarringService() {
        System.out.println("Stop");
    }

    private static void pinCodeRequest() {
        System.out.println("Correct");
    }

    private static void phoneSetting() {
        System.out.println("""
                1. Language
                2. Cell info display
                3. Welcome note
                4. Network selection
                5. Lights
                6. Confirm SIM service actions
                7. back
                   """);
        userInput = input.nextInt();
        switch (userInput) {
            case 1 -> language();
            case 2 -> callInfoDisplay();
            case 3 -> welcomeNote();
            case 4 -> networkSelection();
            case 5 -> lights();
            case 6 -> simService();
            case 7 -> settings();
            default -> phoneSetting();
        }
    }

    private static void simService() {
        System.out.println("Confirmed");
    }

    private static void lights() {
        System.out.println("Blue");
    }

    private static void networkSelection() {
        System.out.println("MTN");
    }

    private static void welcomeNote() {
        System.out.println("Welcome to Nokia");
    }

    private static void callInfoDisplay() {
        System.out.println("Displays");

    }

    private static void language() {
        System.out.println("""
                English
                French
                    """);
    }

    private static void callsSetting() {
        System.out.println("""
                1. Automatic radial
                2. Speed dialling
                3. Call waiting option
                4. Own number sending
                5. Phone line in use
                6. Automatic answer
                7. back
                   """);
        userInput = input.nextInt();
        switch (userInput) {
            case 1 -> automaticRadial();
            case 2 -> speedDialling();
            case 3 -> callWaitingOption();
            case 4 -> ownNumberSending();
            case 5 -> phoneLine();
            case 6 -> automaticAnswer();
            case 7 -> settings();
            default -> callsSetting();
        }
    }

    private static void automaticAnswer() {
        System.out.println("Answers");
    }

    private static void phoneLine() {
        System.out.println("line is busy");
    }

    private static void ownNumberSending() {
        System.out.println("Sending number");
    }

    private static void callWaitingOption() {
        System.out.println("Option for waiting calls");
    }

    private static void speedDialling() {
        System.out.println("Dial speed");
    }

    private static void automaticRadial() {
        System.out.println("Automatic radial enabled");
    }

    private static void tones() {
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
                      10.back
                """);
        userInput = input.nextInt();
        switch (userInput) {
            case 1 -> ringingTone();
            case 2 -> ringingVolume();
            case 3 -> incomingCallsAlert();
            case 4 -> composer();
            case 5 -> MessageAlertTone();
            case 6 -> keypadTone();
            case 7 -> warningAndGameTone();
            case 8 -> vibratingAlert();
            case 9 -> screenSaver();
            case 10 -> menu();
            default -> tones();
        }
    }

    private static void screenSaver() {
        System.out.println("lolo");
    }

    private static void vibratingAlert() {
        System.out.println("buzz buzz");
    }

    private static void warningAndGameTone() {
        System.out.println("bio boo");
    }

    private static void keypadTone() {
        System.out.println("paa paa");
    }

    private static void MessageAlertTone() {
        System.out.println("mama mama jam");
    }

    private static void composer() {
        System.out.println("Compose your own tone");
    }

    private static void incomingCallsAlert() {
        System.out.println("fuse  and engine sounds");
    }

    private static void ringingVolume() {
        System.out.println("volume 5");
    }

    private static void ringingTone() {
        System.out.println("para para low");
    }

    private static void callRegister() {
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
                        9. back
                """);
        userInput = input.nextInt();
        switch (userInput) {
            case 1 -> missedCalls();
            case 2 -> receivedCalls();
            case 3 -> dialledNumbers();
            case 4 -> eraseRecentCalls();
            case 5 -> showCallDuration();
            case 6 -> showCallCost();
            case 7 -> callCostSetting();
            case 8 -> prepaidCredit();
            case 9 -> menu();
            default -> callRegister();
        }
    }

    private static void prepaidCredit() {
        System.out.println("This is your prepaid credit");
    }

    private static void callCostSetting() {
        System.out.println("Cost call settings");
        System.out.println("""
                  1. Call cost limit
                  2. Show costs in
                  3. back
                """);
        userInput = input.nextInt();
        switch (userInput) {
            case 1 -> callCostLimit();
            case 2 -> showCallCostIn();
            case 3 -> callRegister();
            default -> callCostSetting();
        }
    }

    private static void showCallCostIn() {
        System.out.println("show call cost in full");
    }

    private static void callCostLimit() {
        System.out.println("call cost limit : #20,000");
    }

    private static void showCallCost() {
        System.out.println("Show call cost");
        System.out.println();
        System.out.println("""
                1. Last call cost
                2. All calls' cost
                3. Clear counters
                4. back
                """);
        userInput = input.nextInt();
        switch (userInput) {
            case 1 -> lastCallCost();
            case 2 -> allCallsCost();
            case 3 -> clearCounter();
            case 4 -> callRegister();
            default -> showCallCost();
        }
    }

    private static void clearCounter() {
        System.out.println("Done");
    }

    private static void allCallsCost() {
        System.out.println("All cost : #1750.34");
    }

    private static void lastCallCost() {
        System.out.println("your call cost : #200, balance : #50");
    }

    private static void showCallDuration() {
        System.out.println("Show call duration");
        System.out.println("""
                1. Last call duration
                2. All call duration
                3. Received calls' duration
                4. Dialled calls duration
                5. Clear timers
                6. back
                """);
        userInput = input.nextInt();
        switch (userInput) {
            case 1 -> lastCallDuration();
            case 2 -> allCalls();
            case 3 -> receivedCallsDuration();
            case 4 -> dialledCallsDuration();
            case 5 -> clearTimers();
            case 6 -> callRegister();
            default -> showCallDuration();
        }
    }

    private static void clearTimers() {
        System.out.println("Done");
    }

    private static void dialledCallsDuration() {
        System.out.println("Dialled calls duration");
        System.out.println("""
                09176689342
                00 minute : 12 seconds
                08123456789
                12 minutes : 13 seconds
                """);
    }

    private static void receivedCallsDuration() {
        System.out.println("Received calls duration");
        System.out.println("""
                mama
                12 minutes : 15 seconds
                peace
                11 minutes : 14 seconds
                """);
    }


    private static void allCalls() {
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

    private static void lastCallDuration() {
        System.out.println("Last call duration");
        System.out.println(""" 
                Bola
                05 minutes:34 seconds
                         """);
    }

    private static void eraseRecentCalls() {
        System.out.println("Erase recent call list");
        System.out.println("""
                past
                panama
                playmate
                """);
    }

    private static void dialledNumbers() {
        System.out.println("Dialled numbers");
        System.out.println("""
                09012345678
                09178854880
                08096545356
                """);
    }

    private static void receivedCalls() {
        System.out.println("Received calls ");
        System.out.println("""
                mama
                chair person
                Bola
                """);
    }

    private static void missedCalls() {
        System.out.println("Missed calls");
        System.out.println("""
                Uncle chi(5)
                Chief(2)
                mom(2)
                """);
    }

    private static void chat() {
        System.out.println("Chat with friend");
    }

    private static void messages() {
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
                11. back
                """);
        userInput = input.nextInt();
        switch (userInput) {
            case 1 -> writeMessage();
            case 2 -> inbox();
            case 3 -> outbox();
            case 4 -> picturesMessages();
            case 5 -> templates();
            case 6 -> smileys();
            case 7 -> messagesSettings();
            case 8 -> infoService();
            case 9 -> voiceMailboxNumber();
            case 10 -> serviceCommandEditor();
            case 11 -> exit();
            default -> messages();
        }
    }

    private static void serviceCommandEditor() {
        System.out.println("edit your service command");
    }

    private static void voiceMailboxNumber() {
        System.out.println("6788 is your voice mailbox number");
        messages();
    }

    private static void infoService() {
        System.out.println("this is your information service");
        messages();
    }

    private static void messagesSettings() {
        System.out.println("""
                1. Set
                2. Common
                3. back
                """);
        userInput = input.nextInt();
        switch (userInput) {
            case 1 -> set();
            case 2 -> common();
            case 3 -> messages();
            default -> messagesSettings();
        }
    }

    private static void common() {
        System.out.println("""
                1. Delivery report
                2. Reply via same centre
                3. Character support
                4.back
                """);
        userInput = input.nextInt();
        switch (userInput) {
            case 1 -> deliveryReport();
            case 2 -> Reply();
            case 3 -> characterSupport();
            case 4 -> messagesSettings();
            default -> common();
        }
    }

    private static void characterSupport() {
        System.out.println("support your phone character");
    }

    private static void Reply() {
        System.out.println("reply your messages");
    }

    private static void deliveryReport() {
        System.out.println("report your deliver");
    }

    private static void set() {
        System.out.println("""
                                
                1. Message centre number
                2. Message sent as
                3. Message validity
                4. back
                """);
        userInput = input.nextInt();
        switch (userInput) {
            case 1 -> messageCentreNumber();
            case 2 -> messageSentAs();
            case 3 -> messageValidity();
            case 4 -> messagesSettings();
            default -> set();
        }
    }



    private static void messageValidity() {
        System.out.println("Message valid till tomorrow");
    }

    private static void messageSentAs() {
        System.out.println("Send your message as a frame");
    }

    private static void messageCentreNumber() {
        System.out.println("13456 is your message centre number");
        messages();
    }

    private static void smileys() {
        System.out.println("Smiley faces");
    }

    private static void templates() {
        System.out.println("This is your template");
    }

    private static void picturesMessages() {
        System.out.println("Send picture messages");
    }

    private static void outbox() {
        System.out.println("sent messages");
    }

    private static void inbox() {
        System.out.println("your messages");
    }

    private static void writeMessage() {
        System.out.println("enter your message");
    }

    private static void phoneBook() {
        System.out.println("Phone book");
        System.out.println("""
                Enter:
                                        
                1. Search
                2. Service Nos.
                3. Add name
                4. Erase
                5. Edit
                6. Assign tone
                7. Send b' card
                8. Options
                9. Speed dials
                10. Voice tags
                11. back
                """);
        userInput = input.nextInt();
        switch (userInput) {
            case 1 -> search();
            case 2 -> serviceNos();
            case 3 -> addName();
            case 4 -> erase();
            case 5 -> edit();
            case 6 -> assignTone();
            case 7 -> sendBCard();
            case 8 -> options();
            case 9 -> speedDial();
            case 10 -> voiceTags();
            case 11 -> menu();
            default -> phoneBook();
        }
    }

    private static void exit() {
        System.out.println("bye");
    }

    private static void voiceTags() {
        System.out.println("press 77 to add to shortcut");
    }

    private static void speedDial() {
        System.out.println("press 77 to add to shortcut");
    }

    private static void options() {
        System.out.println("""
                1. Type of view
                2. Memory status
                3. back
                """);
        userInput = input.nextInt();
        switch (userInput) {
            case 1 -> typeOfView();
            case 2 -> memoryStatus();
            case 3 -> back();
            default -> options();
        }
    }

    private static void back() {
        phoneBook();
    }

    private static void memoryStatus() {
        System.out.println("total space is 1024mb");
    }

    private static void typeOfView() {
        System.out.println("portrait");
    }


    private static void sendBCard() {
        System.out.println("send business message");
    }

    private static void assignTone() {
        System.out.println("pick your preferred tone");
    }

    private static void edit() {
        System.out.println("edit your pictures");
    }

    private static void erase() {
        System.out.println("you made an erase");
    }

    private static void addName() {
        System.out.println("you have added your name... your name is Addiction");
    }

    private static void serviceNos() {
        System.out.println("05667 is your service number");
    }

    private static void search() {
        System.out.println("search");
    }

}
