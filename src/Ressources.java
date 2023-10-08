public class Ressources {
    private int woods;
    private int stones;

    public int getWood(){
        return woods;
    }

    public int getStones(){
        return stones;
    }

    public Ressources(){
        woods = 10;
        stones = 10;
    }

    public void useWoods(int nbr){
        woods -= nbr;
    }
    public void useStones(int nbr){
        stones -= nbr;
    }

    public void addWood(int nbr){
        woods += nbr;
    }
    public void addStone(int nbr){
        stones += nbr;
    }
}
