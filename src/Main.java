public class Main {
    public static void main(String[] args) {
        // Create an instance of the Bag class
        Bag<String> myBag = new Bag<>();

        // Add elements to the bag, AND duplicates
        myBag.add("Granola Bar");
        myBag.add("Key");
        myBag.add("Granola Bar");
        myBag.add("Gum");
        myBag.add("Key");
        myBag.add("Granola Bar");

        // Print the contents of bag
        System.out.println("Bag contents: " + myBag);

        // Testing the contains method
        System.out.println("Bag contains 'Granola Bar': " + myBag.contains("Granola Bar"));
        System.out.println("Bag contains 'Credit Card': " + myBag.contains("Credit Card"));

        // Testing the count method for some of teh elements
        System.out.println("Number of 'Granola Bar' in the bag: " + myBag.count("Granola Bar"));
        System.out.println("Number of 'Key' in the bag: " + myBag.count("Key"));
        System.out.println("Number of 'Gum' in the bag: " + myBag.count("Gum"));

        // Removing element from the bag
        myBag.remove("Granola Bar");

        // After removal print the contents again
        System.out.println("Bag contents after removing one 'Granola Bar': " + myBag);

        // Test the contains method for the removed element
        System.out.println("Bag contains 'Granola Bar' after removal: " + myBag.contains("Granola Bar"));

        // Test the count method for the removed element
        System.out.println("Number of 'Granola Bar' in the bag after removal: " + myBag.count("Granola Bar"));
    }
}
