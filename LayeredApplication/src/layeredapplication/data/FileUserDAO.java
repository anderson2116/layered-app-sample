/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package layeredapplication.data;

import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author sebastianmolano
 */
public class FileUserDAO implements UserDAO {

    @Override
    public void createUser(String id, String desc) {
        System.out.println("FileUserDAO.createUser: "+id+", "+desc);
        try {
            FileWriter myWriter = new FileWriter("/tmp/lab/"+id+".txt");
            myWriter.write(desc);
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

}
