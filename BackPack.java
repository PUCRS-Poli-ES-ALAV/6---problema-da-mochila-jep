import java.util.ArrayList;
import java.util.List;

public class BackPack {
    public static void main(String[] args) {
        Item[] itens = {new Item(10,5),
            new Item(5,2),
            new Item(2,1),
            new Item(1,1),
            new Item(4,3),
            new Item(5,6)};
        backPack(25, itens);
    }

    public static int[] backPack(int C, Item[] itens) {
        List<List<Item>> conjCombItems = new ArrayList<List<Item>>();
        for (int i = 0; i < itens.length; i++) {
            List<Item> combItems = new ArrayList<>();
            int somaPeso = 0;
            for (int j = i; j < itens.length; j++) {
                if (somaPeso + itens[j].peso <= C) {
                    combItems.add(itens[j]);
                    somaPeso += itens[j].peso;
                } 
            }
            conjCombItems.add(combItems);
        }

        for (List<Item> combItems : conjCombItems) {
            for (Item item : combItems) {
                System.out.printf("[peso=%d, valor=%d]", item.peso, item.valor);
            }
            System.out.println("\n");
        }

        return null;
    }
}
