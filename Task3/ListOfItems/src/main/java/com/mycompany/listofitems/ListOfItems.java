    package com.mycompany.listofitems;

    import java.util.ArrayList;
    import java.util.Arrays;
    import java.util.HashMap;
    import java.util.HashSet;
    import java.util.LinkedList;
    import java.util.List;
    import java.util.Set;

    /**
     *
     * @author mostafa ahmed
     *
    */
    public class ListOfItems {

        public static void main(String[] args) {

            // Creating the same item data
            /*
            Item[] items = new Item[5];

            items[0] = new Item(1, "Laptop", 25000, "Electronics");
            items[1] = new Item(2, "Phone", 15000, "Electronics");
            items[2] = new Item(3, "Book", 300, "Education");
            items[3] = new Item(4, "Chair", 1200, "Furniture");
            items[4] = new Item(5, "Table", 2500, "Furniture");

            */

            Item item1 = new Item(1, "Laptop", 25000, "Electronics");
            Item item2 = new Item(2, "Phone", 15000, "Electronics");
            Item item3 = new Item(3, "Book", 300, "Education");
            Item item4 = new Item(4, "Chair", 1200, "Furniture");
            Item item5 = new Item(5, "Table", 2500, "Furniture");


            // ================================================================
            // 1. ONE-DIMENSIONAL ARRAY

            System.out.println("========== 1D ARRAY ==========");

            Item[] itemsArray = {item1, item2, item3, item4, item5 };

            // Access
            System.out.println("============ access ============= ");
            System.out.println("First item: " + itemsArray[0].getName());
            System.out.println("Second item catogrey: " + itemsArray[1].getCategory());
            System.out.println("========================= ");


            // Search
            for (Item item : itemsArray) {
                if (item.getId() == 3) {
                    System.out.println("Found: " + item.getName());
                }
            }

            // ==========  Modify ================
            itemsArray[1].setPrice(14000);
            itemsArray[2].setName("electonics");
            itemsArray[3].setCategory("education");


            // Display
            for (Item item : itemsArray) {
                item.display();
                System.out.println("===============================================");
            }


            // ================================================================
            // 2. TWO-DIMENSIONAL ARRAY
            // ================================================================

            System.out.println("\n========== 2D ARRAY ==========");

            Item[][] items2D = {
                {item1, item2},
                {item3, item4},
                {item5}
            };

            // Access
            System.out.println("========== 2D ARRAY Access ==========");
            System.out.println("Item name at [0][1]: " + items2D[0][1].getName());
            System.out.println("Item  category  [1][1]: " + items2D[1][1].getCategory());
            System.out.println("Item price at [2][0]: " + items2D[2][0].getPrice());


            // Search
            for (Item[] row : items2D) {
                for (Item item : row) {
                    if (item.getCategory().equals("Furniture")) {
                        System.out.println("Furniture: " + item.getName());
                    }
                }
            }

            // Modify
            items2D[1][0].setName("Java Programming Book");
            items2D[1][1].setPrice(1600);

            // Display
            for (Item[] row : items2D) {
                for (Item item : row) {
                    item.display();
                System.out.println("===============================================");
                }
            }


            // ================================================================
            // 3. LIST

            System.out.println("\n========== LIST ==========");

            List<Item> itemsList = Arrays.asList(item1, item2, item3, item4, item5);

            // Access
            System.out.println("Item at index 2: " + itemsList.get(2).getName());
            System.out.println("Item at index 3: " + itemsList.get(3).getName());

            // Search
            for (Item item : itemsList) {
                if (item.getName().equals("Laptop")) {
                    System.out.println("Found Laptop");
                }
            }

            // Modify
            itemsList.get(0).setPrice(24000);

            // Display
            for (Item item : itemsList) {
                item.display();
                System.out.println("===============================================");
            }


            // ================================================================
            // 4. ARRAYLIST

            System.out.println("\n========== ARRAYLIST ==========");

            ArrayList<Item> arrayList = new ArrayList<>();

            arrayList.add(item1);
            arrayList.add(item2);
            arrayList.add(item3);
            arrayList.add(item4);
            arrayList.add(item5);

            // Access
            System.out.println("Item at index 1: " + arrayList.get(1).getName());

            // Search
            for (Item item : arrayList) {
                if (item.getPrice() > 10000) {
                    System.out.println("Expensive item: " + item.getName());
                }
            }

            // Modify
            arrayList.get(2).setPrice(350);

            // Display
            for (Item item : arrayList) {
                item.display();
                System.out.println("===============================================");
            }


            // ================================================================
            // 5. LINKEDLIST
            // ================================================================

            System.out.println("\n========== LINKEDLIST ==========");

            LinkedList<Item> linkedList = new LinkedList<>();

            linkedList.add(item1);
            linkedList.add(item2);
            linkedList.add(item3);
            linkedList.add(item4);
            linkedList.add(item5);

            // Access
            System.out.println("First item: " + linkedList.getFirst().getName());

            // Search
            for (Item item : linkedList) {
                if (item.getCategory().equals("Education")) {
                    System.out.println("Education item: " + item.getName());
                }
            }

            // Modify
            linkedList.get(3).setPrice(1300);

            // Display
            for (Item item : linkedList) {
                item.display();
                System.out.println("===============================================");
            }


            // ================================================================
            // 6. SET
            // ================================================================

            System.out.println("\n========== SET ==========");

            Set<Item> itemsSet = new HashSet<>();

            itemsSet.add(item1);
            itemsSet.add(item2);
            itemsSet.add(item3);
            itemsSet.add(item4);
            itemsSet.add(item5);
            itemsSet.add(new Item(6, "Table", 2500, "Furniture"));

            // Access / Search
            for (Item item : itemsSet) {
                if (item.getId() == 4) {
                    System.out.println("Found item: " + item.getName());
                }
            }

            // Modify
            for (Item item : itemsSet) {
                if (item.getId() == 1) {
                    item.setPrice(23000);
                }
            }

            // Display
            for (Item item : itemsSet) {
                item.display();
                System.out.println("===============================================");
            }


            // ================================================================
            // 7. HASHSET

            System.out.println("\n========== HASHSET ==========");

            HashSet<Item> hashSet = new HashSet<>();

            hashSet.add(item1);
            hashSet.add(item2);
            hashSet.add(item3);
            hashSet.add(item4);
            hashSet.add(item5);
            hashSet.add(new Item(6, "Table", 2500, "Furniture"));


            // Search
            for (Item item : hashSet) {
                if (item.getName().equals("Phone")) {
                    System.out.println("Found Phone");
                }
            }

            // Modify
            for (Item item : hashSet) {
                if (item.getId() == 2) {
                    item.setPrice(14500);
                }
            }

            // Display
            for (Item item : hashSet) {
                item.display();
                System.out.println("===============================================");
            }


            // ================================================================
            // 8. HASHMAP
            // ================================================================

            System.out.println("\n========== HASHMAP ==========");

            HashMap<Integer, Item> hashMap = new HashMap<>();

            hashMap.put(item1.getId(), item1);
            hashMap.put(item2.getId(), item2);
            hashMap.put(item3.getId(), item3);
            hashMap.put(item4.getId(), item4);
            hashMap.put(item5.getId(), item5);
            hashMap.put(6,new Item(6, "Table", 2500, "Furniture"));

            // Access using key
            System.out.println("Item with ID 3: " + hashMap.get(3).getName());

            // Search
            if (hashMap.containsKey(4)) {
                System.out.println("Item with ID 4 exists.");
            }

            // Modify
            hashMap.get(5).setPrice(2700);

            // Display
            for (Item item : hashMap.values()) {
                item.display();
                System.out.println("===============================================");
            }
        }
    }






