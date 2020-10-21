/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package layeredapplication.business;

import layeredapplication.data.DAOFactory;
import layeredapplication.data.UserDAO;
import layeredapplication.data.VehicleDAO;
import layeredapplication.tools.Encryptor;

/**
 *
 * @author sebastianmolano
 */
public class UserCrud {

    private static UserCrud instance = null;

    public static UserCrud getInstance() {
        if (UserCrud.instance == null) {
            instance = new UserCrud();
        }
        return UserCrud.instance;
    }

    private UserCrud() {
    }

    public void createUser(String id, String desc) {
        
        Encryptor aesWithCbc = new Encryptor()
                .type(Encryptor.TYPES.AES)
                .cbc(true)
                .publicKey("my publi key")
                .secret("password");
        Encryptor tripleDESnoCBC = new Encryptor()
                .type(Encryptor.TYPES.TRIPLEDES)
                .cbc(false)
                .secret("password");
        
        
        String encrypt = aesWithCbc.encrypt(id);
        String encrypt2 = tripleDESnoCBC.encrypt(id);
        
        
        System.out.println("UserCrud.createUser: "+id+", "+desc);
        
        DAOFactory daoFactory = DAOFactory.getDAOFactory(Math.random() > 0.5 ? DAOFactory.ORACLE : DAOFactory.FILE);
        
        UserDAO userDAO = daoFactory.getUserDAO();
        userDAO.createUser(id, desc);
        
        
        VehicleDAO vehicleDAO = daoFactory.getVehicleDAO();
        vehicleDAO.createVehicle(id, desc);
    }

}
