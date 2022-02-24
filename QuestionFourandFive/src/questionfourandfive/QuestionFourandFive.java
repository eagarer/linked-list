/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questionfourandfive;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 */
public class QuestionFourandFive {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        SLLQueue<String> myQueue = new SLLQueue<>();
        
        try {
            File myFile = new File("/home/laseruss/NetBeansProjects/QuestionFourandFive/src/questionfourandfive/test.txt");
            Scanner myScanner = new Scanner(myFile);
            
            while (myScanner.hasNextLine()) {
                
                String data = myScanner.nextLine();
                data = data.toLowerCase();
                String[] lineArray = data.split(" ");
                
                for (int i = 0; i < lineArray.length; i++) {
                    myQueue.push(lineArray[i]);
                }
                
            }

            myQueue.deleteDuplicated();
            System.out.println("size: " + myQueue.size());
            
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace(); 
        }  
    }
    
}
