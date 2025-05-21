public class Chickens01 {
    public static void main(String[] args) {
        //Put yout code here
        int totalEggs = 0;
        int chickenCount = 3;
        int eggsPerChicken =  5;
        //monday
        totalEggs += chickenCount * eggsPerChicken;

        //Tuesday
        totalEggs += ++chickenCount * eggsPerChicken;
        
        //Wednesday
        chickenCount /= 2;
        totalEggs += chickenCount * eggsPerChicken;

        System.out.println(totalEggs);
    }   
}
