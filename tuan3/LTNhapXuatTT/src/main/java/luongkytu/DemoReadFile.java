/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package luongkytu;

import java.io.*;

/**
 *
 * @author ADMIN
 */
public class DemoReadFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            //tao luong
            FileReader fr = new FileReader("baitho.txt");
            //Doc du lieu
            int ch;
            do{
                ch = fr.read();
                if(ch!=-1){
                    System.out.print((char)ch);
                }
            } while(ch!=-1);
                    
            //dong luong
            fr.close();
            
            System.out.println("Da doc xong");
            
        } catch (Exception ex){
            System.out.println("Loi xay ra:" + ex.toString());
        }
    }
    
}
