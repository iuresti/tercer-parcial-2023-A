package edu.uaslp.objetos.shoppingcart;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import edu.uaslp.objetos.shoppingcart.*;

public class ShoppingCart {
    private List<ShoppingItem> list;
    private ShoppingItemCatalog shoppingItemCatalog;
    private ShoppingItem shoppingItem;


    public ShoppingCart(ShoppingItemCatalog shoppingItemCatalog){
        shoppingItemCatalog = new ShoppingItemCatalog();
        list = new List<ShoppingItem>();
    }

    public void add(String string){
        shoppingItemCatalog.getItem;
    }


    public int getTotalCostInCents(){
        Iterator iterator = list.iterator();
        int total=0;

        while(iterator.hasNext()) {
            shoppingItem currentShoppingItem = (shoppingItem) iterator.next();
            total = total + currentShoppingItem.unitCostInCents;
        }

        return total;
    }


    public int  getDistinctItemsCount(){
        Iterator iterator = list.iterator();

        while(iterator.hasNext()) {
            shoppingItem currentShoppingItem = (ShoppingItem) iterator.next();
            if(currentTask.getTitle() == title) {
                return currentTask;
            }
        }
    }



    public int getTotalItemsCount(){
        return list.size();
    }



    public List<ShoppingItem> getItems(){
        Iterator iterator = list.iterator();
        List<ShoppingItem> list1;

        while(iterator.hasNext()) {
            shoppingItem currentShoppingItem = (shoppingItem) iterator.next();
            list1.add(currentShoppingItem);
        }

        return list1;
    }


    public Collection<ShoppingItem> getDistinctItems(){
        Iterator iterator = list.iterator();
        Iterator iterator1 = list.iterator();
        List<ShoppingItem> list1;

        while(iterator.hasNext()) {
            shoppingItem currentShoppingItem = (shoppingItem) iterator.next();
            list1.add(currentShoppingItem);
            while(iterator1.hasNext()) {
                shoppingItem currentShoppingItem = (shoppingItem) iterator.next();
                list1.add(currentShoppingItem);
            }
        }

        return list1;

    }


}
