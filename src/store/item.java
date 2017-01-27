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
public class item {
    public int sku;
    protected int inStock;
    protected double price;
    protected double cost;
    public String description;
    
   public item ()
   {
        this.sku=101;
        this.price=1;
        this.description="Default item description";
        this.cost=0;
        this.inStock=0;
   }
    public item(int sku, int inStock, double price, double cost, String description)
    {
        this.sku=sku;
        this.inStock=inStock;
        this.price=price;
        this.cost=cost;
        this.description=description;
    }

    //sku get and set
    public int getSku()
    {
        return sku;
    }
    public void setSku(int sku)
    {
        this.sku=sku;
    }
    //inStock get and set
    public int getinStock()
    {
        return inStock;
    }
    public void setinStock(int inStock)
    {
        this.inStock=inStock;
    }
    //price get and set
    public double getPrice()
    {
        return price;
    }
    public void setPrice(double price)
    {
        this.price=price;
    }
    //cost get and set
    public double getCost()
    {
        return cost;
    }
    public void setCost(double cost)
    {
        this.cost=cost;
    }
    //description get and set
    public String getDescription()
    {
        return description;
    }
    public boolean setDescription(String description)
    {
        if(description.length()==0 || description==null)
        {
            System.err.println("Description is empty, default value set");
            return false;
        }
        else
        {
            this.description=description;
            return true;
        }   
    }
    //methods
    public void purchase(int itPurchased, double cost)
    {
        this.inStock+=itPurchased;
        this.cost=cost;
        System.out.println("InStock changed to: "+inStock+" and cost changed to: "+cost);
    }
    public boolean sale(int toSell)
    {
        if(toSell>this.inStock)
        {
            System.out.println("Could not sell: "+toSell+" items, not enough in stock");
            return false;
        }
        else
        {   int sold=this.inStock-toSell;
            System.out.println("Sale was successfull."+"Stock went from: "+this.inStock+" to: "+sold);
            this.inStock-=toSell;
            return true;
        }
    }
    public int checkStock()
    {
        return inStock;
    }
    public void upPrice(int newPrice)
    {
        this.price=newPrice;
        System.out.println("Price changed to: "+newPrice);
    }
}