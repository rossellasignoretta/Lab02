package it.polito.tdp.alien;

import java.util.*;

public class AlienDictionary {
	
	private List<WordEnhanced> listaParole= new LinkedList<WordEnhanced>();
	
	private WordEnhanced cerca(String alienWord){
		WordEnhanced parola=null;
		for (WordEnhanced temp: listaParole){
			if (temp.compare(alienWord)!=null){
				parola=temp;
				break;
			}
		}
		return parola;
	}
	
	public void addWord(String alienWord, String translation){
		
		if (cerca(alienWord)==null){
			WordEnhanced w= new WordEnhanced(alienWord);
			w.aggiungiTrad(translation);
			listaParole.add(w);
		}
		else { 
			cerca(alienWord).aggiungiTrad(translation);			
		}
	}
	
	/*public String translateWord(String alienWord){
		if (cerca(alienWord)!=null){
			return cerca(alienWord).getTranslation();
		}
		else return null;
	}*/
	
	public String translateWord(String alienWord){
		String risultato="";
		if (cerca(alienWord)!=null){
			List <String> traduzioni=cerca(alienWord).getTraduzioni();
			for (String s: traduzioni){
			risultato+=s+"\n";
			}
		}
		 return risultato;
		}

	public void reset() {
		listaParole.clear();
	}

}
