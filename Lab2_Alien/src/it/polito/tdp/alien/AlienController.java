package it.polito.tdp.alien;

/**
 * Sample Skeleton for 'Alien.fxml' Controller Class
 */



import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class AlienController {
	
	AlienDictionary ad;
	
    @FXML
    private ResourceBundle resources;
    @FXML
    private URL location;
    @FXML
    private TextField txtWord;
    @FXML
    private TextArea txtResult;
    @FXML
    private Button btnTranslate;
    @FXML
    private Button btnReset;
        
    
    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
    	assert txtWord != null : "fx:id=\"txtWord\" was not injected: check your FXML file 'Alien.fxml'.";
    	assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'Alien.fxml'.";
    	assert btnTranslate != null : "fx:id=\"bntTranslate\" was not injected: check your FXML file 'Alien.fxml'.";
    	assert btnReset != null : "fx:id=\"btnReset\" was not injected: check your FXML file 'Alien.fxml'.";
    	ad=new AlienDictionary();
    }
  
    
    @FXML
    void doTranslate(ActionEvent event) {
    	    String parole=txtWord.getText().toLowerCase();
    	    
    	    String [] array=parole.split(" ");
    	    if (array.length==2 && array[0].matches("[A-Za-z]*")==true && array[1].matches("[A-Za-z]*")==true){
    	    	String alienWord=array[0];
    	    	String translation= array[1];
    	    	ad.addWord(alienWord, translation);
    	    	txtResult.setText("Inserita una nuova parola: "+array[0]+" con traduzione "+array[1]);
    	    }
    	    if (array.length==1 && array[0].matches("[A-Za-z]*")==true){
    	    	String s=ad.translateWord(array[0]);
    	    	if (s.compareTo("")!=0)
    	    		txtResult.setText(s);
    	    	else txtResult.setText("Parola non trovata");
    	    }
    	    txtWord.clear();
    	       	    
    }
    
    
    @FXML
    void doReset(ActionEvent event) {
    	ad.reset() ;
    	txtResult.clear() ;

    }
    
}
