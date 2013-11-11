/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.lehigh.cse216.fall13.bugs.controller;

import edu.lehigh.cse216.fall13.bugs.business.Bug;
import edu.lehigh.cse216.fall13.bugs.database.DatabaseManager;
import java.util.ArrayList;

/**
 *
 * @author hansen
 */
public class MainController {
    public static MainController instance = new MainController();
    
    /**
     * 
     */
    MainController() {
        //default
    }
    
    /**
     * 
     * @param b
     * @return 
     */
    public Bug add(Bug b) {        
        int bugId = DatabaseManager.instance.addBug(b);
        return view(bugId);
    }
    
    /**
     * 
     * @return 
     */
    public ArrayList<Bug> list() {
        return DatabaseManager.instance.listBugs();        
    }
    
    /**
     * 
     * @param bugId
     * @return 
     */
    public Bug view(int bugId) {
        return DatabaseManager.instance.getBug(bugId);
    }
    
    /**
     * 
     * @param strings
     * @return 
     */
    public ArrayList<Bug> search(String... strings) {
        return null;
    }
    
    /**
     * 
     * @param b 
     */
    public void edit(Bug b) {
        DatabaseManager.instance.editBug(b);
        //TODO: return the correct bug to the gui.
    }
}
