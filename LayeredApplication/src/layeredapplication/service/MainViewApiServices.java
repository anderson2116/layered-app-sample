/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package layeredapplication.service;

import layeredapplication.business.UserCrud;

/**
 *
 * @author sebastianmolano
 */
public class MainViewApiServices {
    
        
    public static  void createUser(String id, String desc){      
        System.out.println("MainViewApiServices.createUser: "+id+", "+desc);
        UserCrud.getInstance().createUser(id, desc);
    }
    
}
