public class MathOperations {
    public static void main(String[] args) {
       int bagOfSweets1 = 5;
       int bagOfSweets2 = 10;

       long starsInMilkyWay = 2500000000L;
       long starsInAndromeda = 1000000000000L;

       double testScore = 6.7;
       double bonusMarks = 2;
       System.out.println("Fred and George collected " + (bagOfSweets1 + bagOfSweets2) + "sweets");
       System.out.println("There are " + (starsInMilkyWay + starsInAndromeda) + " stars in the Milky way");
       System.out.println("With bonus marks, Ron scored" + (testScore + bonusMarks) + "/10");

       System.out.println(bagOfSweets2 - bagOfSweets1);
       System.out.println(starsInAndromeda - starsInMilkyWay);
       System.out.println(testScore- bonusMarks);

       System.out.println(bagOfSweets2/bagOfSweets1);
       System.out.println(starsInAndromeda/starsInMilkyWay);
       System.out.println(testScore/bonusMarks);

       int counter = 0;
       counter ++;
       counter++;
       counter++;
       System.out.println("I count: " + counter);
       counter --;
       counter--;
       counter--;
        System.out.println("I count: " + counter);
    }
}
