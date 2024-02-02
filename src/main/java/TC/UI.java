package TC;

import java.util.Scanner;

public class UI {
    static Scanner in = new Scanner(System.in);

    public UI() {
    }

    public static void logo() {
        System.out.println("****************************************");
        System.out.println("*                                      *");
        System.out.println("* TTTTT EEEEE RRRR  M   M III N   N  A *");
        System.out.println("*    TT  E     R   R MM MM  I  NN  N A *");
        System.out.println("*    TT  EEEE  RRRR  M M M  I  N N N A *");
        System.out.println("*    TT  E     R  R  M   M  I  N  NN A *");
        System.out.println("*    TT  EEEEE R   R M   M III N   N A *");
        System.out.println("*                                      *");
        System.out.println("****************************************");
        System.out.println("                ~ Terminal Chat ~       ");
        System.out.println("****************************************");
        System.out.println("Chat with style in your terminal window!");
        System.out.println("****************************************");
    }

    public static int startOptions() {
        System.out.println("1. Join a chat");
        System.out.println("2. Create a chat");
        System.out.println("3. Universal chat");
        System.out.println("4. Exit");

        int option = in.nextInt();

        if (option < 1 || option > 4) {
            System.out.println("Invalid option. Please try again.");
            return startOptions();
        } else
            return option;
    }

    public static String userName() {
       System.out.println("Please enter a username");
       return in.nextLine();
    }

    public static int id() {
        System.out.println("Please enter a ID");
        return in.nextInt();
    }

    public static void rejected(){
        System.out.println("Sorry ID entered not valid");
        logo();
        startOptions();
    }


}

