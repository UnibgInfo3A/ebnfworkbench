package it.unibg.ebnfwb.exporter.latex;

import it.unibg.ebnfwb.lang.ebnfLang.Expression_Alternative;
import it.unibg.ebnfwb.lang.ebnfLang.Expression_Concatenation;
import it.unibg.ebnfwb.lang.ebnfLang.util.EbnfLangSwitch;
import it.unibg.ebnfwb.lang.ebnfLang.Expression;

public class ToString extends EbnfLangSwitch<String>{
	
	
	public ToString() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String caseExpression_Alternative(Expression_Alternative object) {
		String s="";
		for (int i=0; i<object.getElements().size()-1; i++)
			s+=new ToString().doSwitch(object.getElements().get(i)) + "|";
		s.concat(object.getElements().get(object.getElements().size()-1).toString());
		
		return s;
	}


	@Override
	public String caseExpression_Concatenation(Expression_Concatenation object) {
		// TODO Auto-generated method stub
		return super.caseExpression_Concatenation(object);
	}
	
	
	

}
