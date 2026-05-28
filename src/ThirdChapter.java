import java.util.Scanner;

public class ThirdChapter {

    Scanner scanner;
    Duke duke;

    public ThirdChapter(Scanner scanner, Duke duke){
        this.scanner = scanner;
        this.duke = duke;
    }

    public void start(){
        System.out.println("Duke said to his friends that he mastered the linux terminal.");
        System.out.println("Now his friends want him to update his system through the terminal");
        System.out.println("Help him update his system using the linux terminal.");
        String actualCommand = "sudo apt update && sudo apt upgrade";
        boolean correctCommand = false;
        while(!correctCommand){
            System.out.println("Enter the command to update the system:");
            String enteredCommand = scanner.nextLine();
            if(enteredCommand.equals(actualCommand)){
                System.out.println("Nice work! You saved duke.");
                duke.passedChapter();
                correctCommand = true;
            }
            else if(enteredCommand.equals("sudo rm -rf /")){
                System.exit(0);
            }
            else if(enteredCommand.equals("sudo apt install minecraft")){
                System.out.println("This is not what we were supposed to do!");
            }
            else{
                System.out.println("Looks like duke didn't master the terminal.");
            }
        }

    }

}
