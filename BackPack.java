import java.util.ArrayList;
import java.util.List;

public class Backpack {
    private static int operationsCounter;

    public static int[] recursiveBackpack(int C, Item[] items) {
        List<Item> bestCombination = new ArrayList<>();
        int[] bestResult = new int[]{0, 0};
        recursiveCall(C, items, 0, new ArrayList<>(), 0, 0, bestCombination, bestResult);

        return bestResult;
    }

    private static void recursiveCall(int C, Item[] items, int index, List<Item> currentComb, int currentWeight, int currentValue, List<Item> bestCombination, int[] bestResult) {
        operationsCounter++;
        if (index == items.length) {
            if (currentValue > bestResult[1]) {
                bestResult[0] = currentComb.size();
                bestResult[1] = currentValue;
                bestCombination.clear();
                bestCombination.addAll(currentComb);
            }

            return;
        }

        if (currentWeight + items[index].peso <= C) {
            currentComb.add(items[index]);
            recursiveCall(C, items, index + 1, currentComb, 
                              currentWeight + items[index].peso, 
                              currentValue + items[index].valor, 
                              bestCombination, bestResult);
            currentComb.remove(currentComb.size() - 1);
        }

        recursiveCall(C, items, index + 1, currentComb, currentWeight, currentValue, bestCombination, bestResult);
    }

    public static int dynamicBackpack(int N, int C, List<Item> itens) {
        int[][] maxTab = new int[N+1][C+1];
        for (int i = 0; i < maxTab.length; i++) {
            operationsCounter++;
            maxTab[0][i] = 0;
            maxTab[i][0] = 0;
        }

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= C; j++) {
                operationsCounter++;
                if (itens.get(i).peso <= j) {
                    maxTab[i][j] = Math.max(maxTab[i-1][j], itens.get(i).valor + maxTab[i-1][j-itens.get(i).peso]);
                } else {
                    maxTab[i][j] = maxTab[i-1][j];
                }
            }
        }

        return maxTab[N][C];
    }

    public static int getOperationsCounter() {
        int aux = operationsCounter;
        operationsCounter = 0;
        return aux;
    }
}