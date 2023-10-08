public class Mine {
    final static int GAIN_STONE = 10;
    final static int WOOD_COST = 2;
    final static int STONE_COST = 1;

    public Mine (){
        System.out.println("Stone Mine Created my Lord!");
    }

    public int mineStone(int villagers){
        return villagers * GAIN_STONE;
    }
}
