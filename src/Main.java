// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Village myVillage = new Village("Gondolin");
        myVillage.getName();
        System.out.println(myVillage.homeList.size());
        System.out.println(myVillage.getWoods() + " bois");
        System.out.println(myVillage.getStones() + " pierre");
        System.out.println(myVillage.getVillagers() + " villageois");

        myVillage.cutWood(50);
        System.out.println(myVillage.getWoods() + " bois");//attendu 10
        System.out.println(myVillage.getStones() + " pierre");//attendu 10

        myVillage.cutWood(6);
        System.out.println(myVillage.getWoods() + " bois");
        System.out.println(myVillage.getStones() + " pierre");

        myVillage.cutWood(5);
        System.out.println(myVillage.getWoods() + " bois");
        System.out.println(myVillage.getStones() + " pierre");
        //commencer exo 5
    }
}