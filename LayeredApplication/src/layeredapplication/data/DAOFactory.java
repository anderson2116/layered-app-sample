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
// Abstract class DAO Factory
public abstract class DAOFactory {

    // List of DAO types supported by the factory
    public static final int FILE = 1;
    public static final int ORACLE = 2;
    public static final int SYBASE = 3;

    // There will be a method for each DAO that can be 
    // created. The concrete factories will have to 
    // implement these methods.
    public abstract UserDAO getUserDAO();

    public static DAOFactory getDAOFactory(
            int whichFactory) {

        switch (whichFactory) {
            case FILE:
                return new FileDAOFactory();
            case ORACLE:
                return new OracleDAOFactory();
            default:
                return null;
        }
    }
}
