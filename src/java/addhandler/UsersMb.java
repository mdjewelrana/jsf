/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package addhandler;

import dao.addDao;
import entity.Users;
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
public class UsersMb {
    Users user=new Users();

    public Users getUsers() {
        return user;
    }

    public void setUsers(Users user) {
        this.user = user;
    }
    public String addUsers(){
        user.setUUsername(user.getUUsername());
        user.setUFullname(user.getUFullname());
        user.setUPass(user.getUPass());
        user.setUEmail(user.getUEmail());
        new addDao().addUser(user);
        if(new addDao().addUser(user)){
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "User Updated", ""));
        } else{
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Something went wrong!", ""));
        }
        return null;
        
        
        
        
        
    }
    
}
