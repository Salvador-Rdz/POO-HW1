/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package store;

/**
 *
 * @author Salvador
 */
public class Store {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("----- Custom item test ------");
        //Custom item
        item newItem = new item(102,5,12,8,"Coca-Cola");
        System.out.println("SKU = "+newItem.getSku());
        System.out.println("In stock = "+newItem.getinStock());
        System.out.println("Price = "+newItem.getPrice());
        System.out.println("Cost = "+newItem.getCost());
        System.out.println("Description = "+newItem.getDescription());
        System.out.println("This item's stock is: "+newItem.checkStock());
        System.out.println("-------- Default item test ------");
        //Default item
        item otherItem = new item();
        System.out.println("SKU = "+otherItem.getSku());
        System.out.println("In stock = "+otherItem.getinStock());
        System.out.println("Price = "+otherItem.getPrice());
        System.out.println("Cost = "+otherItem.getCost());
        System.out.println("Description = "+otherItem.getDescription());
        System.out.println("This item's stock is: "+otherItem.checkStock());
        System.out.println("--------- Method Tests --------");
        //item methods
        otherItem.purchase(1, 2); //Will add 1 to the stock
        otherItem.sale(5);    //Will print an error, since there's more than the one in the default's stock.
        System.out.println("Items in stock: "+otherItem.checkStock()); //Worth to mention, there's 1 in stock now.
        otherItem.upPrice(14); //Will change the price to 14.
        System.out.println("New Price = "+otherItem.getPrice());
    }
    
}
