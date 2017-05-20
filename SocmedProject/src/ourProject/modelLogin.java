/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ourProject;

/**
 *
 * @author mozaze
 */
public class modelLogin implements MyLib{

    @Override
    public void login(String paramUsername, String paramPassword) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void register(String paramNama, String paramUsername, String paramJenisKelamin, String paramEmail, String paramPassword) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void posting(String paramPost) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    private String usernameLogin;
    private String passwordLogin;

    /**
     * @return the usernameLogin
     */
    public String getUsernameLogin() {
        return usernameLogin;
    }

    /**
     * @param usernameLogin the usernameLogin to set
     */
    public void setUsernameLogin(String usernameLogin) {
        this.usernameLogin = usernameLogin;
    }

    /**
     * @return the passwordLogin
     */
    public String getPasswordLogin() {
        return passwordLogin;
    }

    /**
     * @param passwordLogin the passwordLogin to set
     */
    public void setPasswordLogin(String passwordLogin) {
        this.passwordLogin = passwordLogin;
    }
    
    
    
    
}
