import java.util.HashMap;
import java.util.Map;

// Class representing a Bag data structure that supports duplicate elements
public class Bag<T> {
    // HashMap to store elements and their frequency counts
    private Map<T, Integer> elements;

    // Constructor to initialize the bag
    public Bag() {
        elements = new HashMap<>();
    }

    // Adds an element to the bag. If the element exists, increase its count.
    public void add(T item) {
        elements.put(item, elements.getOrDefault(item, 0) + 1);
    }

    // Removes one occurrence of the specified element from the bag, if it exists
    public void remove(T item) {
        if (elements.containsKey(item)) {
            if (elements.get(item) > 1) {
                elements.put(item, elements.get(item) - 1);  // Decrease count by 1
            } else {
                elements.remove(item);  // Remove element completely if count is 1
            }
        }
    }

    // Returns true if the bag contains the specified item
    public boolean contains(T item) {
        return elements.containsKey(item);
    }

    // Returns the count of a specific item in the bag
    public int count(T item) {
        return elements.getOrDefault(item, 0);
    }

    // Returns the string representation of the bag for printing
    @Override
    public String toString() {
        return elements.toString();
    }
}

