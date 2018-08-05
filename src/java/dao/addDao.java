/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entity.Book;
import entity.Category;
import entity.Contact;
import entity.Users;
import java.util.List;
import javax.servlet.http.HttpSession;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import util.HibernateUtil;
import util.SessionUtil;

/**
 *
 * @author ASUS
 */
public class addDao {
     public boolean addCategory(Category cat){
         try{
        SessionFactory factory = HibernateUtil.getSessionFactory();
        Session session =factory.openSession();
        session.beginTransaction();
        session.save(cat);
        session.getTransaction().commit();
        session.close();
      return true; 
         }catch(Exception e){
             
                 return false;
                 }
                
     }
     
      public boolean updateCategory(Category c) {
        try {
            SessionFactory factory = HibernateUtil.getSessionFactory();
            Session session = factory.openSession();
            session.beginTransaction();

            session.update(c);

            session.getTransaction().commit();
            session.close();
            return true;

        } catch (Exception e) {
            //e.printStackTrace();
            return false;
        }
      }
       public boolean deleteCategory(Category c) {
        try {
            SessionFactory factory = HibernateUtil.getSessionFactory();
            Session session = factory.openSession();
            session.beginTransaction();

            session.delete(c);

            session.getTransaction().commit();
            session.close();
            return true;

        } catch (Exception e) {
            //e.printStackTrace();
            return false;
        }
    }
     public boolean addBook(Book b){
         try{
         SessionFactory factory = HibernateUtil.getSessionFactory();
        Session session =factory.openSession();
        session.beginTransaction();
        session.save(b);
        session.getTransaction().commit();
        session.close();
         //return null;
          return true;
          }catch(Exception e){
              return false;
                      }
     }
     
     public boolean deleteBook(Book b) {
        try {

            SessionFactory factory = HibernateUtil.getSessionFactory();
            Session session = factory.openSession();
            session.beginTransaction();

            session.delete(b);

            session.getTransaction().commit();
            session.close();

            return true;

        } catch (Exception e) {
            return false;
        }
    }
       
     public boolean updateBook(Book b) {
        try {

            SessionFactory factory = HibernateUtil.getSessionFactory();
            Session session = factory.openSession();
            session.beginTransaction();

            session.update(b);

            session.getTransaction().commit();
            session.close();

            return true;

        } catch (Exception e) {
            return false;
        }
    }
      public boolean addContact(Contact c){
         try{SessionFactory factory = HibernateUtil.getSessionFactory();
        Session session =factory.openSession();
        session.beginTransaction();
        session.save(c);
        session.getTransaction().commit();
        session.close();
         return true;
         }catch(Exception e){
         return false;
     }
      }
      public boolean addUser(Users u){
          try{
         SessionFactory factory = HibernateUtil.getSessionFactory();
        Session session =factory.openSession();
        session.beginTransaction();
        session.save(u);
        session.getTransaction().commit();
        session.close();
         return true;
          }catch(Exception e){
              return false;
                      }
         
     }
      public boolean updateUsers(Users u) {
        try {
            SessionFactory factory = HibernateUtil.getSessionFactory();
            Session session = factory.openSession();
            session.beginTransaction();

            session.update(u);

            session.getTransaction().commit();
            session.close();
            return true;

        } catch (Exception e) {
            //e.printStackTrace();
            return false;
        }
    }
       public boolean deleteUsers(Users u) {
        try {
            SessionFactory factory = HibernateUtil.getSessionFactory();
            Session session = factory.openSession();
            session.beginTransaction();

            session.delete(u);

            session.getTransaction().commit();
            session.close();
            return true;

        } catch (Exception e) {
            //e.printStackTrace();
            return false;
        }
    }
       public static List<Book> getAllBook() {
        SessionFactory factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();        
        Query query = session.createQuery("SELECT b FROM Book b");
        
        List<Book> cList= query.list();
        cList.toString();
        session.close();
        return cList;
    }
     public boolean login(Users user) {
        try {

            SessionFactory factory = HibernateUtil.getSessionFactory();
            Session session = factory.openSession();
            session.beginTransaction();
            
            Query query = session.createQuery("SELECT u FROM Users u WHERE u.UUsername=:uname AND u.UPass=:pass");
            query.setString("uname", user.getUUsername());
            query.setString("pass", user.getUPass());          
            
            List<Users> cList= query.list();
            cList.toString();
            session.getTransaction().commit();
            session.close();
            
            if(cList.size()>0){
                HttpSession session1 = SessionUtil.getSession();
                session1.setAttribute("uname", cList.get(0).getUUsername());
                session1.setAttribute("uid", cList.get(0).getUId());                
                return true;
            } else{
                return false;                
            }
            

        } catch (Exception e) {
            //e.printStackTrace();
            return false;
        }
    }
    
      }

