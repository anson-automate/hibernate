package test.main;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import test.bean.Inventory;
import test.service.InventoryService;
import test.util.HibernateUtils;



public class HibernateDerbyEx {

    public static void main(String[] args) {


//        Inventory newItem = new Inventory("shirt-women",200,(float) 20.24);
//        InventoryService.addItem(newItem);
//        Inventory newItem1 = new Inventory("shirt-boy",300,(float) 10.24);
//        InventoryService.addItem(newItem1);
//        Inventory newItem2 = new Inventory("shirt-girl",100,(float) 13.24);
//        InventoryService.addItem(newItem2);
//    	
//    	for (Long i=(long) 3; i<(long)9; i++) {
 //   		InventoryService.deleteItem(1L);
//    	}
//        
//        InventoryService.updateQuantity(1L,100);
        
//        
        List<Inventory> items1 = InventoryService.getInventoryItems();

        
        for (Inventory item : items1) {

            System.out.println(item);
        }
        
       Map<Long,Integer> itemToMap = new HashMap<Long,Integer>();
       String  decision = null;
       Scanner inputValue = new Scanner(System.in);
       Long id;
       do {
    	   System.out.println("Enter product id (107-114)");
    	   id = inputValue.nextLong();
    	   System.out.println("Enter quantity");
    	   itemToMap.put(id,inputValue.nextInt() );
    	   System.out.println("Do you want to continue? (yes/no)");
    	   decision = inputValue.next();
       }while (decision.equalsIgnoreCase("yes"));
       float totalPrice = (float) 0.0;
       System.out.printf("ProductName\tPrice\tQuantity\tAmount\n");
      for (Long iter :itemToMap.keySet() ) {
    	  System.out.printf("%s\t%.2f\t%d\t\t$%.2f%n",InventoryService.getItemById(iter).getProductName(),InventoryService.getItemById(iter).getProductPrice(),itemToMap.get(iter),InventoryService.getItemById(iter).getProductPrice()*itemToMap.get(iter));
    	  //System.out.printf(InventoryService.getItemById(iter).getProductName()+"  "+InventoryService.getItemById(iter).getProductPrice()+"   "+itemToMap.get(iter)+"  "+InventoryService.getItemById(iter).getProductPrice()*itemToMap.get(iter));
    	  totalPrice = totalPrice + InventoryService.getItemById(iter).getProductPrice()*itemToMap.get(iter);
    	  InventoryService.updateQuantity(iter,itemToMap.get(iter));
      }
      System.out.printf("\t\t\tTotal Price : \t$%.2f",totalPrice);
        
        HibernateUtils.shutdown();
    }
    
    public void addToCart(Long id,int quantity) {
    	
    	InventoryService.updateQuantity(id,quantity);
    }
}