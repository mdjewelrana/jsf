
package display;

import dao.ListDao;
import entity.Category;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped

public class DisplayCategoryMB {
    public List<Category> getAllCategory(){
        List<Category> plist = new ListDao().allCategoryList();   
        return plist;
    }
}
