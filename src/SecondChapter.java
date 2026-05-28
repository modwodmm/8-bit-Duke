import java.util.Scanner;

public class SecondChapter {

    private Scanner scanner;
    private Duke duke;
    private Inventory inventory;

    public SecondChapter(Scanner scanner, Duke duke, Inventory inventory){
        this.scanner = scanner;
        this.duke = duke;
        this.inventory = inventory;
    }

    public void start(){
        System.out.println("** Chapter 2 **");
        System.out.println("The cpu is overheating. Get the required items and re-paste the cpu.");
        boolean done = false;
        int choice = 0;
        while(!done){
            boolean correctChoice = false;
            while(!correctChoice){
                try{
                    System.out.println("1. Go to the wizard\n2. Go to the haters dungeon\n3. Re-paste the cpu");
                    choice = Integer.parseInt(scanner.nextLine());
                    correctChoice = true;
                }
                catch(NumberFormatException e){
                    System.out.println("Please enter a correct choice.");
                }
            }
            boolean goBack = false;
            while(!goBack){
                switch(choice){
                    case 1:
                        System.out.println("Duke went to the wizard.");
                        System.out.println("Wizard: Go to the haters dungeon and defeat the haters to obtain isopropyl alcohol.");
                        goBack = true;
                        break;
                    case 2:
                        dungeon();
                        goBack = true;
                        break;
                    case 3:
                        if(inventory.hasItem("Thermal Paste") && inventory.hasItem("Cotton Swab") && inventory.hasItem("Isopropyl Alcohol")){
                            System.out.println("The cpu has been re-pasted and now the temps are normal again.");
                            duke.passedChapter();
                            return;
                        }
                        else{
                            System.out.println("Collect all the items to re-paste the cpu");
                            goBack = true;
                        }
                        break;
                    default:
                        System.out.println("Enter a correct choice");
                }
            }
        }
    }

    public void dungeon(){

        int haterHealth = 100;

        System.out.println("Duke was captured by the haters and presented in front of the haters' king.");
        System.out.println("They agreed on giving duke the cotton swab if he defeats the biggest java hater.");
        System.out.println("*Stump* *Stump*\nHere comes the biggest java hater.");
        System.out.println("Begin the debate.");
        System.out.println("Biggest Hater: Java is too verbose.");
        duke.takeDamage(25);
        int choice1 = 0;
        boolean rightChoice1 = false;
        while(!rightChoice1){
            try{
                System.out.println("Choose your argument:\n1. Java's verbosity makes code more readable and the IDEs make most of the work easier.");
                System.out.println("2. Java is a useful language used for making android apps, backend systems, enterprise software and desktop apps.");
                System.out.println("3. Java can be used to make games as well. Famous examples include: Minecraft, Runescape and well this game.");
                choice1 = Integer.parseInt(scanner.nextLine());
                rightChoice1 = true;
            }
            catch(NumberFormatException e){
                System.out.println("Please enter a correct choice!");
            }
        }
        if(choice1 == 1){
            System.out.println("Great argument!");
            duke.heal(25);
            haterHealth = haterHealth - 25;
            System.out.println("Damage done: 25\nHater health: " + haterHealth);
        }
        else{
            System.out.println("Not so great of an argument.");
            haterHealth = haterHealth - 10;
            System.out.println("Damage done: 10\nHater health: " + haterHealth);
        }

        System.out.println("Biggest Hater: Java is not even useful.");
        duke.takeDamage(25);
        int choice2 = 0;
        boolean rightChoice2 = false;
        while(!rightChoice2){
            try{
                System.out.println("Choose your argument:\n1. Java's verbosity makes code more readable and the IDEs make most of the work easier.");
                System.out.println("2. Java is a useful language used for making android apps, backend systems, enterprise software and desktop apps.");
                System.out.println("3. Java can be used to make games as well. Famous examples include: Minecraft, Runescape and well this game.");
                choice2 = Integer.parseInt(scanner.nextLine());
                rightChoice2 = true;
            }
            catch(NumberFormatException e){
                System.out.println("Please enter a correct choice!");
            }
        }
        if(choice2 == 2){
            System.out.println("Great argument!");
            duke.heal(25);
            haterHealth = haterHealth - 25;
            System.out.println("Damage done: 25\nHater health: " + haterHealth);
        }
        else{
            System.out.println("Not so great of an argument.");
            haterHealth = haterHealth - 10;
            System.out.println("Damage done: 10\nHater health: " + haterHealth);
        }

        System.out.println("Biggest Hater: Java can't be used for game developing.");
        if(duke.takeDamage(50)){
            int choice3 = 0;
            boolean rightChoice3 = false;
            while(!rightChoice3){
                try{
                    System.out.println("Choose your argument:\n1. Java's verbosity makes code more readable and the IDEs make most of the work easier.");
                    System.out.println("2. Java is a useful language used for making android apps, backend systems, enterprise software and desktop apps.");
                    System.out.println("3. Java can be used to make games as well. Famous examples include: Minecraft, Runescape and well this game.");
                    choice3 = Integer.parseInt(scanner.nextLine());
                    rightChoice3 = true;
                }
                catch(NumberFormatException e){
                    System.out.println("Please enter a correct choice!");
                }
            }
            if(choice3 == 3){
                System.out.println("Great argument!");
                duke.heal(50);
                haterHealth = haterHealth - 50;
                System.out.println("Damage done: 50\nHater health: " + haterHealth);
                inventory.addItem("Cotton Swab");
                System.out.println("The haters are defeated and gave you the Cotton Swab.");
                inventory.addItem("Isopropyl Alcohol");
                System.out.println("The wizard gave you the Isopropyl Alcohol.");
            }
        }
        else{
            duke.resetHealth();
            start();
        }

    }

}
