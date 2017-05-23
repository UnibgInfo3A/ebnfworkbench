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
	
//	public String hyphenate(String s){
//		for (int i = 0; i < s.length(); i++) {
//			if(s.contains("{")){
//				s=s.replaceAll("{", "\\"+"-"+"\\{");
//			}
//			else if(s.contains("[")){
//				s = s.replace("[", "\\"+"-"+"[");
//			}
//			
//		}
//		return s;
//	}
	
	
//	public  String stringManager(String s){
//
//		String[] rule = s.split(" ");
//	String sr = "";
//
//	for (int i = 0; i < rule.length; i++) {
//		
//		if(rule[i].length()>0 && rule[i].charAt(0)=='\''){
//			
//			String sc = rule[i].replaceFirst("'", "`");
//			sr = sr +" "+ sc ;
//
//		}else if((rule[i].length()>1 && (rule[i].charAt(1)=='\'') ||
//				(rule[i].length()>2 && rule[i].charAt(2)=='\''))){
//			String sc = rule[i].replaceFirst("'", "`");
//			sr = sr +" "+ sc ;
//		}
//			else sr = sr +" "+rule[i];
//
//	}
//
//	return sr;
//
//	}

}
