/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laskuri2;

/**
 *
 * @author juhat
 */
public class Laskuri2{
  /* laskuriolion kentan arvoa voi kasvattaa yhdella kutsumalla metodia
     lisaa(). Arvoa voi tarkastella ja sen voi nollata.                 */
	private int tapahtumia;
        public Laskuri2(int alkuarvo){ 
        // konstruktori, kuormitettu. Alkuarvon tulee olla >= 0.
		if(alkuarvo < 0)
			return;
		this.tapahtumia = alkuarvo;
	}
	public Laskuri2(){
		this.tapahtumia = 0;
	}

  	public void lisaa(){
    		this.tapahtumia = this.tapahtumia + 1; 
  	}
        
  	public int lukema(){
    		return this.tapahtumia;
  	}
  	public void nollaa(){
    		this.tapahtumia = 0;
  	}
	public String toString(){
		return "Laskurin lukema on " + this.tapahtumia;
	}

}
