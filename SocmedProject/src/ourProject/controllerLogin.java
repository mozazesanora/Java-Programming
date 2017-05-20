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
import javax.swing.JOptionPane;
public class controllerLogin extends modelLogin{
    public controllerLogin(){
    
    }
    
    public void login(String paramusername , String paramPassword){
        try {
            this.setUsernameLogin(paramusername);
            this.setPasswordLogin(paramPassword);
            System.out.println(""+getUsernameLogin());
            System.out.println(""+getPasswordLogin());
            if (getUsernameLogin().equals("sanora")&&getPasswordLogin().equals("milun2010")) {
                new GBeranda().setVisible(true);
                JOptionPane.showMessageDialog(null, "Selamat datang");
            } else {
                JOptionPane.showMessageDialog(null, "Kombinasi password dan username tidak sesuai");
            }
        } catch (java.util.InputMismatchException e) {
            JOptionPane.showMessageDialog(null, "Data yang anda masukkan tidak benar");
        }
        
    }
}
