/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package play;
import controller.c_Login;
import view.Login;
/**
 *
 * @author albariiqy
 */
public class play {
    public static void main(String[] args) {
        Login v = new Login();
        c_Login c = new c_Login(v);
    }
}
