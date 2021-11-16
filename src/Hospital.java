import java.util.Scanner;

public class Hospital {
    Scanner sca =new Scanner(System.in);
    public void welcomeNote() {
        System.out.print("Enter your name: ");
        String name=sca.nextLine();
        System.out.println("Welcome "+name);
        System.out.print("Enter your age: ");
        String age=sca.nextLine();
        System.out.println("Your age is: "+age);
        System.out.println("1. Left Eye");
        System.out.println("2. Right Eye");
        System.out.println("3. Heart");
        System.out.println("4. Stomach");
        System.out.println("5. Skin");
        System.out.println("6. Quit");
        System.out.print("Choose an organ: ");
        int organ=sca.nextInt();
        switch (organ) {
            case 1 -> leftEar();
            case 2 -> rightEar();
            case 3 -> heart();
            case 4 -> stomach();
            case 5 -> skin();
            case 6 -> quit();
            default -> System.out.println("Invalid input");
        }
    }

    public void leftEar() {
        System.out.println("Name: Left Eye");
        System.out.println("Medical Condition: Short Sighted");
        System.out.println("Colour: Blue");
        System.out.println("         1.Close eye");
        int close=sca.nextInt();
        if (close==1) welcomeNote();
        else System.out.println("Invalid input.^-^");
    }

    public void rightEar() {
        System.out.println("Name: Right Eye");
        System.out.println("Medical Condition: Hypermyopia");
        System.out.println("Colour: Green");
        System.out.println("               1.Close Eye");
        int close=sca.nextInt();
        if (close==1) welcomeNote();
        else System.out.println("Invalid input.^-^");
    }

    public void heart() {
        System.out.println("Name: Heart");
        System.out.println("Medical Condition: Normal");
        System.out.println("Beat Rate: 65");
        System.out.print("1. Enter a new heartbeat rate: ");
        System.out.println("2. Close Heart");
        int heartBeatRate=sca.nextInt();
        if (heartBeatRate==1) System.out.println("New HeartBeat Rate is "+heartBeatRate);
        welcomeNote();
        if (heartBeatRate==2) welcomeNote();
        else System.out.println("Invalid Input.^-^");
    }

    public void stomach() {
        System.out.println("Name: Stomach");
        System.out.println("Medical Condition: PUD");
        System.out.println("1. Begin Surgery");
        System.out.println("2. Close Stomach");
        int stomachSurgery=sca.nextInt();
        if (stomachSurgery==1) System.out.println("Surgery begins...");
        welcomeNote();
        if (stomachSurgery==2) welcomeNote();
        else System.out.println("Invalid input.^-^");
    }

    public void skin() {
        System.out.println("Name: Skin");
        System.out.println("Medical Condition: Burned.");
        welcomeNote();
    }

    public void quit() {
        System.out.println("Bye for now. See you next time.");
    }

    public static void main(String[] args) {
        Hospital hospital=new Hospital();
        hospital.welcomeNote();
    }
}
