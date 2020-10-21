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
public class OracleVehicleDAO implements VehicleDAO {

    @Override
    public void createVehicle(String id, String desc) {
        System.out.println("OracleVehicleDAO.createUser: " + id + ", " + desc);
    }

}
