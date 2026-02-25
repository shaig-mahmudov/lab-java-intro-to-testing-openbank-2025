public abstract class Player {
    private int health;
    private final int originalHealth;
    private int strength;
    private int lives;

    public Player(int health, int strength, int lives){
        this.health = health;
        this.strength = strength;
        this.lives = lives;
        this.originalHealth = health;
    }

    public int getHealth(){
        return health;
    }

    public int getStrength(){
        return strength;
    }

    public int getLives (){
        return lives;
    }

    public void setHealth(int health){
        this.health = health;
    }

    public void setStrength(int strength){
        this.strength = strength;
    }

    public void setLives(int lives){
        this.lives = lives;
    }

    public void decrementLive(){
        if (lives > 0){
            lives -= 1;
            health = originalHealth;
        }
        else {
            System.out.println("This character is dead");
        }
    }

    public void attack(Player playerToAttack){
        playerToAttack.setHealth(playerToAttack.getHealth() - strength);
    }

    public void checkHealth(){
        if (getHealth() <= 0){
            decrementLive();
        }
    }
}
