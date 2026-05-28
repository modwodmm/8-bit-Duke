import java.util.Scanner;
import java.util.Random;

public class FirstChapter {

    private Scanner scanner;
    private int stamina = 0;
    private Random random = new Random();
    private Duke duke;
    private Inventory inventory;

    public FirstChapter(Scanner scanner, Duke duke, Inventory inventory){
        this.scanner = scanner;
        this.duke = duke;
        this.inventory = inventory;
    }

    public void start(){
        System.out.println("** CHAPTER 1 **");
        System.out.println("Duke encountered memory leak. To fix memory leak, Duke agreed to a dunking challenge against the memory leak.");

        int ram = 0;
        boolean rightChoice = false;
        while(!rightChoice){
            try{
                System.out.println("Enter the amount of ram you have:");
                ram = Integer.parseInt(scanner.nextLine());
                rightChoice = true;
            } catch (NumberFormatException e) {
                System.out.println("Please enter a correct amount");
            }
        }

        switch(ram){
            case 4:
                System.out.println("You got +2 stamina boost");
                stamina = 2;
                break;
            case 8:
                System.out.println("You got +4 stamina boost");
                stamina = 4;
                break;
            case 16:
                System.out.println("You got +8 stamina boost");
                stamina = 8;
                break;
            case 32:
                System.out.println("You got +16 stamina boost");
                stamina = 16;
                break;
            case 64:
                System.out.println("You got +32 stamina boost");
                stamina = 32;
                break;
            default:
                System.out.println("How did you get that much ram?");
        }

        dunkingChances();

    }

    public void dunkingChances(){
        boolean won = false;
        int boost = 0;
        while(!won){
            int chance = random.nextInt(0, 101) + stamina + boost;
            System.out.println("Duke got the ball.");
            System.out.println("Nice dribble by duke");
            System.out.println("Duke goes for the dunk!");
            if(chance < 60){
                System.out.println("Duke went for the dunk but couldn't quite get it.");
                System.out.println("You got a +15 boost");
                boost = boost + 15;
            }
            else{
                System.out.println("Duke made a clean duke and left the memory leak in shock!");
                System.out.println("You won!!");
                duke.passedChapter();
                System.out.println("You got a Thermal Paste! You will need it later.");
                inventory.addItem("Thermal Paste");
                won = true;
            }
        }
    }

}
