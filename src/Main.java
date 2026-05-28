import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Duke duke = new Duke();
        Inventory inventory = new Inventory();
        FirstChapter firstChapter = new FirstChapter(scanner, duke, inventory);
        SecondChapter secondChapter = new SecondChapter(scanner, duke, inventory);
        ThirdChapter thirdChapter = new ThirdChapter(scanner, duke);
        ForthChapter forthChapter = new ForthChapter(scanner, duke);

        System.out.println("Today Duke (the java mascot) is stuck in the deep world of tech. He is quite fimiliar with it but he never went this deep. Help him get out of this world!");

        firstChapter.start();
        secondChapter.start();
        thirdChapter.start();
        forthChapter.start();

        System.out.println("Duke has done it!(you did it but duke is the main character sorry).");
        System.out.println("Now duke is back to being the java mascot.");
        System.out.println("Thanks for playing the game!");

        }
    }
