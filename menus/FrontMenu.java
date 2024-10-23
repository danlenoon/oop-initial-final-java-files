package menus;

import java.util.Scanner;

import utils.SystemFunctions;
import utils.SystemVariables.MenuConstants;

public class FrontMenu {
    private static Scanner scanner = new Scanner(System.in);
    public static void openMenu() {
        while (true) {
            SystemFunctions.clearConsole();
            System.out.println("=================================\r\n" + //
            "| Greetings, welcome to… |\r\n" + //
            "| DL Auto Care! |\r\n" + //
            "=================================\r\n" + //
            "1 Choose a role\r\n" + //
            "2 Exit");
            System.out.print("Enter choice: ");
            String userInput = scanner.nextLine().trim();
            switch (userInput) {
                case "1": {
                    SystemFunctions.changeMenu(MenuConstants.RoleSelection);
                    System.out.println("Reached");
                    return;
                    
                }
                case "2": {
                    SystemFunctions.shutDownProgram();
                    System.out.println("Thank you for visiting at DL Auto Care!\r\n" + //
                                                "Terminating...");
                    SystemFunctions.delay(1);
                    return;
                }
            }
        }
    }
}