/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package layeredapplication.data;

/**
 *
 * @author sebastianmolano
 */
public class OracleDAOFactory extends  DAOFactory{
    
    public UserDAO userDAO = new OracleUserDAO();
    public VehicleDAO vehicleDAO = new OracleVehicleDAO();

    @Override
    public UserDAO getUserDAO() {
        return userDAO;
    }

    @Override
    public VehicleDAO getVehicleDAO() {
        return vehicleDAO;
    }
    
}
