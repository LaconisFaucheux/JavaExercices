import java.util.ArrayList;
import java.util.List;

public class Village {
    private String name;
    private Ressources myRessources;
    private int villagers = 0;
    public House chiefHome;
    List<House> homeList;
    public Forest forest;

    public Village(String a_name){
        myRessources = new Ressources();
        chiefHome = new House();
        homeList = new ArrayList<>();
        homeList.add(chiefHome);
        villagers = getVillagers();
        this.name = a_name;
        forest = new Forest();
    }

    public void getName(){
        System.out.println(name);
    }

    public int getWoods(){
        return myRessources.getWood();
    }

    public int getStones(){
        return myRessources.getStones();
    }

    public int getVillagers(){
        return villagers = (homeList.size() * House.villager);
    }

    private void addHouse(){
        if(this.myRessources.getWood() >= House.WOOD_NEEDED && this.myRessources.getStones() >= House.STONE_NEEDED){
            homeList.add(new House());
            myRessources.useWoods(House.WOOD_NEEDED);
            myRessources.useStones(House.STONE_NEEDED);
        }
    }

    public void cutWood(int a_villagers){
        int wood;
        if (a_villagers <= villagers && myRessources.getWood() >= (Forest.WOOD_COST * a_villagers)  && myRessources.getStones() >= (Forest.STONE_COST * a_villagers)){
            myRessources.useStones(Forest.STONE_COST * a_villagers);
            myRessources.useWoods(Forest.WOOD_COST * a_villagers);
            wood = a_villagers * Forest.GAIN_WOOD;
        }
        else{
            if(a_villagers > villagers){
                System.out.println("Vous n'avez pas assez de villageois!");
            }
            else if (myRessources.getWood() < Forest.WOOD_COST){
                System.out.println("Vous n'avez pas assez de bois!");
            }
            else{
                System.out.println("Vous n'avez pas assez de pierre!");
            }
            wood = 0;
        }
        myRessources.addWood(wood);
    }
}
