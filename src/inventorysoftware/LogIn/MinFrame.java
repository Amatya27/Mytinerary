/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package inventorysoftware.LogIn;

/**
 *
 * @author RoXen
 */
public class MinFrame {
 
    public static void main(String[] args) {
        SpalshScreen screen = new SpalshScreen();
        NewSignin sign = new NewSignin();
        screen.setVisible(true);
        /*LoginPages2 sign = new LoginPages2();
        screen.setVisible(true);*/
        try {
            for (int row = 0; row <=100; row++) {
                Thread.sleep(100);
                screen.loadingnumber.setText(Integer.toString(row)+"%");
                screen.loadingprogress.setValue(row);
                if (row == 100) {
                    
                    screen.setVisible(false);
                    sign.setVisible(true);
                    
                }
            }
        } catch (Exception e) {
        }
    }

    void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
