public class Bus {
    public static void main(String[] args) {
        String sentence = "Number of Passengers: ";
        int passengers = 0;
        System.out.println(sentence + passengers);
        passengers += 9;
        System.out.println(sentence + passengers);
        passengers -= 5;
        System.out.println(sentence + passengers);
        passengers -= 4;
        System.out.println(sentence + passengers);

        // assigning a new String value to the sentence variable 
        sentence = "End of shift";
        System.out.println(sentence);
    }
}