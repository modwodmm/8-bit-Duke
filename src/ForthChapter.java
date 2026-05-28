import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ForthChapter {

    Scanner scanner;
    Duke duke;
    HashMap<String, Integer> files = new HashMap<>();

    public ForthChapter(Scanner scanner, Duke duke){
        this.scanner = scanner;
        this.duke = duke;
        files.put("Minecraft", 1500);
        files.put("Stardew Valley", 500);
        files.put("JDK 26", 250);
        files.put("System32", 7000);
        files.put("Intellij Idea", 3200);
        files.put("Eclipse", 1500);
        files.put("CarVideo.mp4", 500);
        files.put("TheMovie.mp4", 1600);
        files.put("Temp", 1300);
        files.put("Roblox", 900);
        files.put("TF2", 15000);
    }

    public void start(){
        int spaceUsed = 73250;
        int threshold = 53000;

        System.out.println("After the update the space on the pc is quite low.");
        System.out.println("Help duke clean out the storage by deleting files that are not required.");
        for(Map.Entry<String, Integer> entry : files.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue() + "MB");
        }

        while(!(threshold >= spaceUsed)){
            System.out.println("Enter the item to remove:");
            String item = scanner.nextLine();
            if(item.equals("System32")){
                System.exit(0);
            }
            else if(files.containsKey(item)){
                spaceUsed -= files.get(item);
                files.remove(item);
                System.out.println("Used space: " + spaceUsed + "MB\nThreshold: " + threshold + "MB");
            }
            else{
                System.out.println("Please choose a correct file.");
            }
        }

        System.out.println("The threshold has been reached. Nice job!");
        duke.passedChapter();

    }

}
