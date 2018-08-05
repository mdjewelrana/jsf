/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package addhandler;

import dao.addDao;
import entity.Book;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author ASUS
 */
@ManagedBean
@SessionScoped
public class BookMb {

    Book book = new Book();

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public String addBook() {

        book.setCCar(book.getCCar());
        book.setCCity(book.getCCity());
        book.setPLocation(book.getPLocation());
        book.setDLocation(book.getDLocation());
book.setPDate(book.getPDate());
        new addDao().addBook(book);

        if(new addDao().addBook(book)){
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Saved successfull", ""));
        } else{
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Something went wrong!", ""));
        }
        return null;
    }
      public List<Book> getAllBook(){
        List<Book> list = new addDao().getAllBook();
        return list;
    }
      public void editBook(){
        FacesContext context = FacesContext.getCurrentInstance();
        HttpServletRequest request = (HttpServletRequest) context.getExternalContext().getRequest();
        int id = Integer.parseInt(request.getParameter("id"));
        
        List<Book> list = getAllBook();
        for(Book book : list){
            if(book.getBId()== id){
               book.setBId(book.getBId());
              book.setCCar(book.getCCar());
        book.setCCity(book.getCCity());
        book.setPLocation(book.getPLocation());
        book.setDLocation(book.getDLocation());
book.setPDate(book.getPDate());
            }
        }
        
    }
       public void updateBook(){
                
                 
       book.setBId(book.getBId());
              book.setCCar(book.getCCar());
        book.setCCity(book.getCCity());
        book.setPLocation(book.getPLocation());
        book.setDLocation(book.getDLocation());
book.setPDate(book.getPDate());
        
          if(new addDao().updateBook(book)){
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Update  successfull", ""));
        } else{
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Something went wrong!", ""));
        }
      
    }
      public void deleteBook(){
        FacesContext context = FacesContext.getCurrentInstance();
        HttpServletRequest request = (HttpServletRequest) context.getExternalContext().getRequest();
        int id = Integer.parseInt(request.getParameter("id"));
        
        book.setBId(id);
        
       
        
          if(new addDao().deleteBook(book)){
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "delete  successfull", ""));
        } else{
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Something went wrong!", ""));
        }
        
        
    }
      
}
