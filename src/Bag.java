import java.util.HashMap;
import java.util.Map;

// This is a Class representing a Bag data structure that supports duplicate elements
public class Bag<T> {
    // HashMap to store elements and their frequency counts
    private Map<T, Integer> elements;

    // This is the constructor to initialize the bag
    public Bag() {
        elements = new HashMap<>();
    }

    // THis adds an element to the bag. If the element exists, we increase its count.
    public void add(T item) {
        elements.put(item, elements.getOrDefault(item, 0) + 1);
    }

    // This removes one occurrence of the specified element from the bag, presuming it exists
    public void remove(T item) {
        if (elements.containsKey(item)) {
            if (elements.get(item) > 1) {
                elements.put(item, elements.get(item) - 1);  // Decrease count by 1
            } else {
                elements.remove(item);  // Remove element if count is 1
            }
        }
    }

    // Returns true if the bag contains the item
    public boolean contains(T item) {
        return elements.containsKey(item);
    }

    // Returns the count of the item in the bag
    public int count(T item) {
        return elements.getOrDefault(item, 0);
    }

    // Returns the string representation of the bag for printing
    @Override
    public String toString() {
        return elements.toString();
    }
}

