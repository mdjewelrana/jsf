/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package addhandler;

import dao.addDao;
import entity.Category;
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
public class CategoryMb {

    Category category = new Category();

    public Category getCategory() {
        return category;
    }

    public void setCategory() {
        this.category = category;
    }

    public String addCategory() {
        category.setChooseCity(category.getChooseCity());
        category.setMaxBillCharge(category.getMaxBillCharge());
         category.setExtraCharge(category.getExtraCharge());
          category.setFreeKm(category.getFreeKm());
           category.setWaitingCharge(category.getWaitingCharge());
        new addDao().addCategory(category);
        if (new addDao().addCategory(category)) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Saved successfull", ""));
        } else {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Something went wrong!", ""));
        }
        return null;
    }
}
