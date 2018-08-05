/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package addhandler;

import dao.addDao;
import entity.Users;
import java.io.IOException;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;
import util.SessionUtil;

/**
 *
 * @author ASUS
 */
@ManagedBean

public class LoginMb {
    Users users = new Users();

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }
    public String login(){
       users.setUUsername(users.getUUsername());
        users.setUPass(users.getUPass());
       
        
        if(new addDao().login(users)){
            System.out.println("Login success");
            try {
                ExternalContext ec = SessionUtil.getExternalContext();
                HttpSession session = SessionUtil.getSession();
                
                
                String redirect = ec.getRequestContextPath() + "/user/welcome.xhtml"; 
                
                
//                if(!session.getAttribute("redirect").toString().equals("")){
//                    redirect = session.getAttribute("redirect").toString();
//                }
                
               
                ec.redirect(redirect);
            } catch (IOException ex) {
                //ex.printStackTrace();
            }
            return "user";
        } else{
            System.out.println("Login failed");
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Something went wrong!", ""));
        }
        return null; 

    }
    public String logout(){
        try {
            HttpSession session1 = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(true);
//            session1.setAttribute("uname", "");
//            session1.setAttribute("uid", "");
            session1.invalidate();
            
            ExternalContext ec = FacesContext.getCurrentInstance().getExternalContext();
            ec.redirect(ec.getRequestContextPath() + "/login");
            
            
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        
        return null;
    }
}
