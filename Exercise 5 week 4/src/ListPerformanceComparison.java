import java.util.ArrayList;
import java.util.LinkedList;

public class ListPerformanceComparison {

    public static void main(String[] args) {
        int[] inputSizes = {1000, 10000, 100000}; // Different sizes of input
        for (int size : inputSizes) {
            System.out.println("Input size: " + size);
            testArrayList(size);
            testLinkedList(size);
            System.out.println("-----------------------");
        }
    }

    public static void testArrayList(int size) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        long startTime = System.nanoTime();

        // Insertion at the end
        for (int i = 0; i < size; i++) {
            arrayList.add(i);
        }

        // Deletion at the end
        for (int i = size - 1; i >= 0; i--) {
            arrayList.remove(i);
        }

        long endTime = System.nanoTime();
        System.out.println("ArrayList - Time taken: " + (endTime - startTime) + " ns");
    }

    public static void testLinkedList(int size) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        long startTime = System.nanoTime();

        // Insertion at the end
        for (int i = 0; i < size; i++) {
            linkedList.add(i);
        }

        // Deletion at the end
        for (int i = size - 1; i >= 0; i--) {
            linkedList.removeLast();
        }

        long endTime = System.nanoTime();
        System.out.println("LinkedList - Time taken: " + (endTime - startTime) + " ns");
    }
}
