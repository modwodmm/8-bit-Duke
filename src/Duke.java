public class Duke {

    private final String name = "Duke";
    private int health = 100;
    private int score = 0;

    public boolean takeDamage(int damageGiven){
        boolean isAlive = false;
        if(health <= damageGiven){
            health = 0;
            System.out.println("You died!");
            return isAlive;
        }
        else{
            health -= damageGiven;
            System.out.println("Damage: " + damageGiven);
            System.out.println("Health: " + health);
            return isAlive = true;
        }
    }

    public void heal(int amountHealed){
        if(health == 100){
            System.out.println("You already have full health!");
        }
        else{
            health = Math.min(100, health + amountHealed);
            System.out.println("Health: " + health);
        }
    }

    public void passedChapter(){
        score++;
    }

    public void resetHealth(){
        health = 100;
    }

    public String getName(){
        return name;
    }

    public int getHealth(){
        return health;
    }

    public int getScore(){
        return score;
    }

}
