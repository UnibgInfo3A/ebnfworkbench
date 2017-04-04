package it.unibg.ebnfwb.exporter.latex;

import java.util.ArrayList;

public class SpecialCharMarnager {
	
	private String s ;
	
	public SpecialCharMarnager(String s){
		super();
		this.s = s;
	}
//Metodo che sostituisce caratteri speciali in una Stringa
	public String substitute(){
		
		ArrayList<String> specialCharList = new ArrayList<>();
		specialCharList.add("{");
		specialCharList.add("}");
		specialCharList.add("&");
		specialCharList.add("%");
		specialCharList.add("$");
		specialCharList.add("#");
		specialCharList.add("^");
		specialCharList.add("_");
		specialCharList.add("~");
	
		for(int i = 0; i<specialCharList.size(); i++){
			String special = specialCharList.get(i);
			if(s.contains(special)){
				s = s.replace(special,"\\"+special);
			}
		}
		return s;
	}
	//TODO
	public String latexCharacterManager(){
		
		for (int i = 0; i<s.length(); i++){
			int index = s.indexOf("'");
			if(index%2 != 0)
				s = s.replace("'", "´");
		}
		return s;
	}
	
}
