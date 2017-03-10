package it.unibg.ebnfwb.exporter.latex;

import it.unibg.ebnfwb.lang.ebnfLang.Expression_Alternative;
import it.unibg.ebnfwb.lang.ebnfLang.Expression_Concatenation;
import it.unibg.ebnfwb.lang.ebnfLang.Expression_Exception;
import it.unibg.ebnfwb.lang.ebnfLang.Expression_Group;
import it.unibg.ebnfwb.lang.ebnfLang.Expression_Optional_Group;
import it.unibg.ebnfwb.lang.ebnfLang.Expression_Repetition;
import it.unibg.ebnfwb.lang.ebnfLang.Expression_Repetition_Group;
import it.unibg.ebnfwb.lang.ebnfLang.Expression_Rule_Reference;
import it.unibg.ebnfwb.lang.ebnfLang.Expression_Special_Sequence;
import it.unibg.ebnfwb.lang.ebnfLang.Expression_Terminal_Symbol;
import it.unibg.ebnfwb.lang.ebnfLang.Line;
import it.unibg.ebnfwb.lang.ebnfLang.ProductionRule;
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
		s+= new ToString().doSwitch(object.getElements().get(object.getElements().size()-1)).toString();
	
		
		return s;
	}


	@Override
	public String caseExpression_Concatenation(Expression_Concatenation object) {
		
		String s="";
		for (int i=0; i<object.getElements().size()-1; i++)
			
			s+=new ToString().doSwitch(object.getElements().get(i)) + ",";
			
		
		s+= new ToString().doSwitch(object.getElements().get(object.getElements().size()-1)).toString();
	
		
		return s;

	}
	
	@Override
	public String caseExpression_Exception(Expression_Exception object){
		String s = "";
		s+=new ToString().doSwitch(object.getLeft()) + "-" ;
		s+= new ToString().doSwitch(object.getRight());
		return s;
		
	}
	
	@Override
	public String caseExpression_Group(Expression_Group object){
		String s = "";
		
		s = "(" + new ToString().doSwitch(object.getExpr())+ ")";
		
		return s.toString();
		
		
	}
	
	@Override
	public String caseExpression_Optional_Group(Expression_Optional_Group object){
		String s = "";
		
		s = "["+ new ToString().doSwitch(object.getExpr())+ "]";
		return s.toString();
		
	}
	
	@Override
	public String caseExpression_Repetition(Expression_Repetition object){
		String s = "";
		s= object.getRepetitions()+"*"+new ToString().doSwitch(object.getExpr()) ;

		
		return s;
		
	}
	
	@Override
	public String caseExpression_Repetition_Group(Expression_Repetition_Group object){
		String s = "";
		
		s = "{" +  new ToString().doSwitch(object.getExpr()) + "}";
		return s;
		
	}
	
	@Override
	public String caseExpression_Rule_Reference(Expression_Rule_Reference object){
		String s = "";
		
		s= "<" +object.getRule().getName()+">";
		
		return s;
		
	}
	
	@Override
	public String caseExpression_Special_Sequence(Expression_Special_Sequence object){
		String s = "";
		
		s = object.getText();
		return s;
		
	}
	
	@Override
	public String caseExpression_Terminal_Symbol(Expression_Terminal_Symbol object){
		String s = "";
		s = object.getText().toString();
		return s;
		
	}
	
	@Override
	public String caseLine(Line object) {
		String s = "";
		s = object.toString();
		return s;
	}
	

}
