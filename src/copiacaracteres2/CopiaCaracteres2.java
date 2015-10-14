/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package copiacaracteres2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author oracle
 */
public class CopiaCaracteres2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // TODO code application logic here
            BufferedReader br = new BufferedReader(new FileReader("texto10.txt"));
            PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("texto11.txt")));
            String leido;
            leido = br.readLine();
            pw.println(leido);
            leido = br.readLine();
            pw.println(leido);
            leido = br.readLine();
            pw.println(leido);

            br.close();
            pw.close();

        } catch (FileNotFoundException ex) {
            Logger.getLogger(CopiaCaracteres2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(CopiaCaracteres2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
