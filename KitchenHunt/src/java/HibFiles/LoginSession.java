package HibFiles;
// Generated May 1, 2016 11:31:45 PM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * LoginSession generated by hbm2java
 */
public class LoginSession  implements java.io.Serializable {


     private Integer idloginSession;
     private UserLogin userLogin;
     private Date inTime;
     private Date outTime;
     private String ipAddress;

    public LoginSession() {
    }

	
    public LoginSession(UserLogin userLogin) {
        this.userLogin = userLogin;
    }
    public LoginSession(UserLogin userLogin, Date inTime, Date outTime, String ipAddress) {
       this.userLogin = userLogin;
       this.inTime = inTime;
       this.outTime = outTime;
       this.ipAddress = ipAddress;
    }
   
    public Integer getIdloginSession() {
        return this.idloginSession;
    }
    
    public void setIdloginSession(Integer idloginSession) {
        this.idloginSession = idloginSession;
    }
    public UserLogin getUserLogin() {
        return this.userLogin;
    }
    
    public void setUserLogin(UserLogin userLogin) {
        this.userLogin = userLogin;
    }
    public Date getInTime() {
        return this.inTime;
    }
    
    public void setInTime(Date inTime) {
        this.inTime = inTime;
    }
    public Date getOutTime() {
        return this.outTime;
    }
    
    public void setOutTime(Date outTime) {
        this.outTime = outTime;
    }
    public String getIpAddress() {
        return this.ipAddress;
    }
    
    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }




}


