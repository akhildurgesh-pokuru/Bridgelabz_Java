package Generics;

import java.util.ArrayList;
import java.util.List;

abstract class WareHouseItem{
    int id;
    String name;

    WareHouseItem(int id, String name){
        this.id = id;
        this.name = name;
    }

    abstract public void displayDetails();
}

class Electronics extends WareHouseItem{
    int warranty_years;
    Electronics(int id, String name, int warranty_years){
        super(id, name);
        this.warranty_years = warranty_years;
    }

    public void displayDetails(){
        System.out.println("Id: "+id);
        System.out.println("Name: "+name);
        System.out.println("Warranty years: "+warranty_years);
    }
}

class Groceries extends WareHouseItem{
    int expiry_days;
    Groceries(int id, String name, int expiry_days){
        super(id, name);
        this.expiry_days = expiry_days;
    }

    public void displayDetails(){
        System.out.println("Id: "+id);
        System.out.println("Name: "+name);
        System.out.println("Expiry Days: "+expiry_days);
    }
}

class Furniture extends WareHouseItem{
    String material;
    Furniture(int id, String name, String material){
        super(id, name);
        this.material = material;
    }

    public void displayDetails(){
        System.out.println("Id: "+id);
        System.out.println("Name: "+name);
        System.out.println("Material: "+material);
    }
}


class Storage<T extends WareHouseItem>{
    List<T> storage_items;
    Storage(){
        this.storage_items = new ArrayList<>();
    }

    public void addItems(T item){
        storage_items.add(item);
    }

    public T getItem(int index){
        return storage_items.get(index);
    }
}

class WareHouseUtility{
    public void displayAll(List<? extends WareHouseItem> items){
        for(WareHouseItem item : items){
            item.displayDetails();
            System.out.println();
        }
    }
}



public class SmartWareHouseManagementSystem {
    public static void main(String[] args){
        Electronics electronics = new Electronics(121,"smart watch",2);
        Electronics electronics1 = new Electronics(122,"iphone",2);
        Groceries groceries = new Groceries(120,"vegetables",2);
        Furniture furniture = new Furniture(155,"double cart bed","take");

        Storage<WareHouseItem> storage = new Storage<>();
        storage.addItems(electronics);
        storage.addItems(electronics1);
        storage.addItems(groceries);
        storage.addItems(furniture);

        WareHouseUtility obj = new WareHouseUtility();
        obj.displayAll(storage.storage_items);

    }
}
