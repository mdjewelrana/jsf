/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package addhandler;

import dao.addDao;
import entity.Contact;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author ASUS
 */
@ManagedBean
@SessionScoped
public class ContactMb {

    Contact contact = new Contact();

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public String addContact() {
        
        contact.setDName(contact.getDName());
        contact.setDAddress(contact.getDAddress());
        contact.setDPhone(contact.getDPhone());
        contact.setDEmail(contact.getDEmail());
        contact.setDLisence(contact.getDLisence());
        new addDao().addContact(contact);
       if(new addDao().addContact(contact)){
      FacesContext.getCurrentInstance().addMessage(null,new FacesMessage(FacesMessage.SEVERITY_INFO, "Driver add Successful",""));
      }
      else{
         FacesContext.getCurrentInstance().addMessage(null,new FacesMessage(FacesMessage.SEVERITY_WARN, "Data Saved",""));
      } 
      
        return null;
    }

}