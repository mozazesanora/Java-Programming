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
import java.util.ArrayList;
public class controllRegister extends modelRegister implements MyLib{
    
    public controllRegister(){
        //if we need it
    }
    

    @Override
    public void login(String paramUsername, String paramPassword) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void posting(String paramPost) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void register(String paramNama, String paramUsername, String paramJenisKelamin, String paramEmail, String paramPassword) {
        
        
        ArrayList list= new ArrayList();
        
        try {
            this.setNama(paramNama);
            this.setUsername(paramUsername);
            this.setJenisKelamim(paramJenisKelamin);
            this.setEmail(paramEmail);
            this.setPassword(paramPassword);  
            JOptionPane.showMessageDialog(null, "Registrasi sukses");
            
        } catch (java.util.InputMismatchException e) {
            JOptionPane.showConfirmDialog(null, "Ada error pada proses pengisian data anda");
        }
        
        System.out.println("Namanya adalah:"+getNama());
        System.out.println("Username adalah:"+getUsername());
    }
    
    public void move_page(){
        new GLogin().setVisible(true);
//        dispose();
    }

    
    
}
