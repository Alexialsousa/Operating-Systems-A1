
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kerly Titus
 */
public class Driver {

    /** 
     * main class
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {

    	 /*******************************************************************************************************************************************
    	  * TODO : implement all the operations of main class   																					*
    	  ******************************************************************************************************************************************/

    	Network objNetwork = new Network("network");            /* Activate the network */
        objNetwork.start();

        Server objServer = new Server();                               /* Start the server */
        objServer.start();

        Client objClient1 = new Client("sending");             /* Start the sending client */
        objClient1.start();

        Client objClient2 = new Client("receiving");           /* Start the receiving client */
        objClient2.start();
/*
        try {
            objClient1.join();
            objClient2.join();
            objServer.join();
            objNetwork.join();
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
*/

    }
}
