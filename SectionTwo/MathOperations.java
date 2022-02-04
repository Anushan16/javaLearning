public class MathOperations {
    public static void main(String[] args) {

        int bagOfSweets1 = 5;
        int bagOfSweets2 = 10;

        long starsInMilkyWay = 2500000000L;
        long starsInAndromeda = 1000000000000L;

        double testScore = 6.7;
        double bonusMarks = 2.5;

        // Addition
        
        
        // Java works left to right (without brackets first half of string gets concatenated with bos1 to output a string, which then gets cocatenated with bos2 and then the rest of the string)
        System.out.println("Fred and George collected " + bagOfSweets1+bagOfSweets2 + " sweets");

        System.out.println("Fred and George collected " + (bagOfSweets1+bagOfSweets2) + " sweets");
        System.out.println("There are " + (starsInMilkyWay+starsInAndromeda) + " stars in the Milky Way and Andromeda galaxies combined.");
        System.out.println("With bonus marks, Ron scored " + (bonusMarks+testScore) + "/10 on his potions test. Snape wasn't too thrilled");

        // Subtraction        

        System.out.println("Fred has " + (bagOfSweets2 - bagOfSweets1) + " more sweets than George");
        System.out.println("There are " + (starsInAndromeda - starsInMilkyWay ) + " more stars in Andromeda compared to the the Milky Way");
        System.out.println("With bonus marks, Ron scored " + (testScore- bonusMarks) + "/10 on his potions test. Snape wasn't too thrilled");

    }
    
}
