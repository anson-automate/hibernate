package test.service;

import java.util.List;
import org.hibernate.Session;
import test.bean.Inventory;
import test.util.HibernateUtils;

public class InventoryService {

    private InventoryService() {};

    public static Inventory getItemById(Long id) {

    	Inventory item;
        try (Session session = HibernateUtils.getSessionFactory().openSession()) {
        	item = session.get(Inventory.class, id);
        }

        return item;
    }

    @SuppressWarnings("unchecked")
    public static List<Inventory> getInventoryItems () {

    	List<Inventory> InventoryItems;
        try (Session session = HibernateUtils.getSessionFactory().openSession()) {
        	InventoryItems = session.createQuery("from Inventory").list();
        }
        return InventoryItems;
    }

	public static void addItem(Inventory newItem) {
        try (Session session = HibernateUtils.getSessionFactory().openSession()) {
            session.beginTransaction();

            session.save(newItem);

            session.getTransaction().commit();
        }
		
	}
	
	public static void deleteItem(Long Id) {
        try (Session session = HibernateUtils.getSessionFactory().openSession()) {
            session.beginTransaction();
            Inventory deleteItem = session.get(Inventory.class, Id);
            session.delete(deleteItem);
            session.getTransaction().commit();
        }
		
	}

	public static void updateQuantity(Long Id, int newquantity) {
        try (Session session = HibernateUtils.getSessionFactory().openSession()) {
            session.beginTransaction();
            Inventory updItem = session.get(Inventory.class, Id);
            updItem.setQuantity(updItem.getQuantity()-newquantity);
            session.update(updItem);
            session.getTransaction().commit();
        }
		
	}
}