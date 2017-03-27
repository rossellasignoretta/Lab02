package it.polito.tdp.alien;

import java.util.*;

public class WordEnhanced {
	 
	private String alienWord;
	private List<String> translations;
	
	public WordEnhanced(String alienWord) {
		this.alienWord = alienWord;
		translations= new LinkedList<String>();
	}
	
	public String getAlienWord() {
		return alienWord;
	}

	public void setAlienWord(String alienWord) {
		this.alienWord = alienWord;
	}

	public void aggiungiTrad(String trad){
		translations.add(trad);
	}
	
	public String compare(String alienWord){
		if (this.alienWord.compareTo(alienWord)==0){
			return alienWord;
		}
		else return null;
	}
	
	public List<String> getTraduzioni(){
		return translations;
	}

	
	

}
