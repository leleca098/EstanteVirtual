package Run;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import Telas.Login;
import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

/**
 *
 * @author erick
 */
public class Run {
    public static void main(String[] args) throws Exception{
        Properties properties = new Properties();
        properties.load(new FileInputStream(new File("conf.properties")));
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login(properties).setVisible(true);
            }
        });
    }
}
