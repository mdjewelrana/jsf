package entity;
// Generated Apr 4, 2018 6:53:33 AM by Hibernate Tools 4.3.1



/**
 * Users generated by hbm2java
 */
public class Users  implements java.io.Serializable {


     private Integer UId;
     private String UUsername;
     private String UPass;
     private String UFullname;
     private String UEmail;

    public Users() {
    }

    public Users(String UUsername, String UPass, String UFullname, String UEmail) {
       this.UUsername = UUsername;
       this.UPass = UPass;
       this.UFullname = UFullname;
       this.UEmail = UEmail;
    }
   
    public Integer getUId() {
        return this.UId;
    }
    
    public void setUId(Integer UId) {
        this.UId = UId;
    }
    public String getUUsername() {
        return this.UUsername;
    }
    
    public void setUUsername(String UUsername) {
        this.UUsername = UUsername;
    }
    public String getUPass() {
        return this.UPass;
    }
    
    public void setUPass(String UPass) {
        this.UPass = UPass;
    }
    public String getUFullname() {
        return this.UFullname;
    }
    
    public void setUFullname(String UFullname) {
        this.UFullname = UFullname;
    }
    public String getUEmail() {
        return this.UEmail;
    }
    
    public void setUEmail(String UEmail) {
        this.UEmail = UEmail;
    }




}


