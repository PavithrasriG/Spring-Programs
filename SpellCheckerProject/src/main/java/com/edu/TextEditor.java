package com.edu;

public class TextEditor {

	
	private SpellChecker spell;
	  
	
	// generate the setter and method
	
	 public SpellChecker getSpell() {
		return spell;
	}


	public void setSpell(SpellChecker spell) {
		this.spell = spell;
	}


   public void textEditorFunction() {
		if(spell!=null) {
			spell.SpellCheckFunction();
			
		}
	}
}
