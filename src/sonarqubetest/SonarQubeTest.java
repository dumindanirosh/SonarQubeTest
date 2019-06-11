/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sonarqubetest;

/**
 *
 * @author P0502878
 */
public class SonarQubeTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        TestSevice  s = new TestSevice();
        Subject subjectDO = s.getSub();
        TestP resetValidityDO = s.getTestP();
       
        	if((resetValidityDO != null && resetValidityDO.getTime() != null) && subjectDO != null){
                    System.out.println("hihihihi");
                }
			
    }
    
}
