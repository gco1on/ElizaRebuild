/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Eliza;
import java.awt.*;
/**
 *
 * @author gcolon
 */
public class ElizaApp {

    static String scriptPathname = "script.txt";
    static String testPathname = "script.txt";
    

    static final boolean useWindow = false;
    static final boolean local = true;

    public static void main(String args[]) {
        ElizaMain eliza = new ElizaMain();
        String script = scriptPathname;
        String test = testPathname;

        if (args.length > 0) script = args[0];
        if (args.length > 1) test = args[1];
        int res = eliza.readScript(local, script);
        if (res != 0) System.exit(res);
        if (useWindow) {
            Frame f = new Frame("Eliza");
            f.resize(100, 100);
            f.show();
            Panel p = new Panel();
            f.add(p);
            p.show();
            res = eliza.runProgram(test, p);
        } else {
            res = eliza.runProgram(test, null);
            System.exit(res);
        }
    }
}
