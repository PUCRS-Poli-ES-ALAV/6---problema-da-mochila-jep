import java.util.ArrayList;
import java.util.List;

public class BackPack {
    public static void main(String[] args) {
        // Test case 1
        Item[] items1 = {
            new Item(23, 92),
            new Item(31, 57),
            new Item(29, 49),
            new Item(44, 68),
            new Item(53, 60),
            new Item(38, 43),
            new Item(63, 67),
            new Item(85, 84),
            new Item(89, 87),
            new Item(82, 72)
        };
        int[] result1 = backPack(165, items1);
        System.out.println("Test case 1:");
        System.out.println("Best combination: " + result1[0] + ", Total value: " + result1[1]);

        // Test case 2
        Item[] items2 = {
            new Item(56, 50),
            new Item(59, 50),
            new Item(80, 64),
            new Item(64, 46),
            new Item(75, 50),
            new Item(17, 5)
        };
        int[] result2 = backPack(190, items2);
        System.out.println("\nTest case 2:");
        System.out.println("Best combination: " + result2[0] + ", Total value: " + result2[1]);
    }

    public static int[] backPack(int C, Item[] items) {
        List<Item> bestCombination = new ArrayList<>();
        int[] bestResult = new int[]{0, 0}; // {number of items, total value}
        backpackRecursive(C, items, 0, new ArrayList<>(), 0, 0, bestCombination, bestResult);

        System.out.println("\nBest combination:");
        for (Item item : bestCombination) {
            System.out.printf("[peso=%d, valor=%d]", item.peso, item.valor);
        }
        System.out.println();

        return bestResult;
    }

    private static void backpackRecursive(int C, Item[] items, int index, List<Item> currentComb, 
                                            int currentWeight, int currentValue, 
                                            List<Item> bestCombination, int[] bestResult) {
        if (index == items.length) {
            System.out.println("Current combination:");
            for (Item item : currentComb) {
                System.out.printf("[peso=%d, valor=%d]", item.peso, item.valor);
            }
            System.out.println(" - Total weight: " + currentWeight + ", Total value: " + currentValue);

            if (currentValue > bestResult[1]) {
                bestResult[0] = currentComb.size();
                bestResult[1] = currentValue;
                bestCombination.clear();
                bestCombination.addAll(currentComb);
            }
            return;
        }

        // Try adding the current item
        if (currentWeight + items[index].peso <= C) {
            currentComb.add(items[index]);
            backpackRecursive(C, items, index + 1, currentComb, 
                              currentWeight + items[index].peso, 
                              currentValue + items[index].valor, 
                              bestCombination, bestResult);
            currentComb.remove(currentComb.size() - 1);
        }

        // Try not adding the current item
        backpackRecursive(C, items, index + 1, currentComb, currentWeight, currentValue, 
                          bestCombination, bestResult);
    }
}
