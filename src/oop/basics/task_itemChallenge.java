package oop.basics;

class Item{
    public static int numItems = 0;
    final int Id;

    Item(int id){
        Id = id;
    }
    public static int getNextId(){
        return Item.numItems++;
    }
    public static Item getItem(){
        int id = Item.getNextId();
        Item item = new Item(id);
        return item;
    }
    public static void printNumItems(){
        System.out.println("Num items: "+ Item.numItems);
    }
    public void printId(){
        System.out.println("ID item: "+this.Id);
    }
}

public class task_itemChallenge {
    public static void main(String[] args) {

        for(int i=0;i<3;i++){
            Item items = Item.getItem();
            items.printId();
        }
        Item.printNumItems();
    }
}
