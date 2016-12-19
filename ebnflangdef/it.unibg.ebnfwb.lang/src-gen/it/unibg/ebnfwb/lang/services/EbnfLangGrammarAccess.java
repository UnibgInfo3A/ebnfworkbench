/*
 * generated by Xtext 2.10.0
 */
package it.unibg.ebnfwb.lang.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class EbnfLangGrammarAccess extends AbstractGrammarElementFinder {
	
	public class EbnfGrammarElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "it.unibg.ebnfwb.lang.EbnfLang.EbnfGrammar");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cEbnfGrammarAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cRulesAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cRulesProductionRuleParserRuleCall_1_0 = (RuleCall)cRulesAssignment_1.eContents().get(0);
		
		//EbnfGrammar:
		//	{EbnfGrammar} rules+=ProductionRule*;
		@Override public ParserRule getRule() { return rule; }
		
		//{EbnfGrammar} rules+=ProductionRule*
		public Group getGroup() { return cGroup; }
		
		//{EbnfGrammar}
		public Action getEbnfGrammarAction_0() { return cEbnfGrammarAction_0; }
		
		//// Enforce object creation
		//rules+=ProductionRule*
		public Assignment getRulesAssignment_1() { return cRulesAssignment_1; }
		
		//ProductionRule
		public RuleCall getRulesProductionRuleParserRuleCall_1_0() { return cRulesProductionRuleParserRuleCall_1_0; }
	}
	public class ProductionRuleElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "it.unibg.ebnfwb.lang.EbnfLang.ProductionRule");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameNAMETerminalRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Keyword cEqualsSignKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cExprAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cExprExpressionParserRuleCall_2_0 = (RuleCall)cExprAssignment_2.eContents().get(0);
		private final Keyword cSemicolonKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//ProductionRule:
		//	name=NAME '=' expr=Expression ';';
		@Override public ParserRule getRule() { return rule; }
		
		//name=NAME '=' expr=Expression ';'
		public Group getGroup() { return cGroup; }
		
		//name=NAME
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }
		
		//NAME
		public RuleCall getNameNAMETerminalRuleCall_0_0() { return cNameNAMETerminalRuleCall_0_0; }
		
		//'='
		public Keyword getEqualsSignKeyword_1() { return cEqualsSignKeyword_1; }
		
		//expr=Expression
		public Assignment getExprAssignment_2() { return cExprAssignment_2; }
		
		//Expression
		public RuleCall getExprExpressionParserRuleCall_2_0() { return cExprExpressionParserRuleCall_2_0; }
		
		//';'
		public Keyword getSemicolonKeyword_3() { return cSemicolonKeyword_3; }
	}
	public class ExpressionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "it.unibg.ebnfwb.lang.EbnfLang.Expression");
		private final RuleCall cExpression_AlternativeParserRuleCall = (RuleCall)rule.eContents().get(1);
		
		//Expression:
		//	Expression_Alternative;
		@Override public ParserRule getRule() { return rule; }
		
		//Expression_Alternative
		public RuleCall getExpression_AlternativeParserRuleCall() { return cExpression_AlternativeParserRuleCall; }
	}
	public class Expression_AlternativeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "it.unibg.ebnfwb.lang.EbnfLang.Expression_Alternative");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cExpression_ConcatenationParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Action cExpression_AlternativeElementsAction_1_0 = (Action)cGroup_1.eContents().get(0);
		private final Group cGroup_1_1 = (Group)cGroup_1.eContents().get(1);
		private final Keyword cVerticalLineKeyword_1_1_0 = (Keyword)cGroup_1_1.eContents().get(0);
		private final Assignment cElementsAssignment_1_1_1 = (Assignment)cGroup_1_1.eContents().get(1);
		private final RuleCall cElementsExpression_ConcatenationParserRuleCall_1_1_1_0 = (RuleCall)cElementsAssignment_1_1_1.eContents().get(0);
		
		//// The operator | defines alternatives. It has got the lowest priority and is left associative
		//Expression_Alternative Expression:
		//	Expression_Concatenation ({Expression_Alternative.elements+=current} ('|' elements+=Expression_Concatenation)+)?
		@Override public ParserRule getRule() { return rule; }
		
		//Expression_Concatenation ({Expression_Alternative.elements+=current} ('|' elements+=Expression_Concatenation)+)?
		public Group getGroup() { return cGroup; }
		
		//Expression_Concatenation
		public RuleCall getExpression_ConcatenationParserRuleCall_0() { return cExpression_ConcatenationParserRuleCall_0; }
		
		//({Expression_Alternative.elements+=current} ('|' elements+=Expression_Concatenation)+)?
		public Group getGroup_1() { return cGroup_1; }
		
		//{Expression_Alternative.elements+=current}
		public Action getExpression_AlternativeElementsAction_1_0() { return cExpression_AlternativeElementsAction_1_0; }
		
		//('|' elements+=Expression_Concatenation)+
		public Group getGroup_1_1() { return cGroup_1_1; }
		
		//'|'
		public Keyword getVerticalLineKeyword_1_1_0() { return cVerticalLineKeyword_1_1_0; }
		
		//elements+=Expression_Concatenation
		public Assignment getElementsAssignment_1_1_1() { return cElementsAssignment_1_1_1; }
		
		//Expression_Concatenation
		public RuleCall getElementsExpression_ConcatenationParserRuleCall_1_1_1_0() { return cElementsExpression_ConcatenationParserRuleCall_1_1_1_0; }
	}
	public class Expression_ConcatenationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "it.unibg.ebnfwb.lang.EbnfLang.Expression_Concatenation");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cExpression_ExceptionParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Action cExpression_ConcatenationElementsAction_1_0 = (Action)cGroup_1.eContents().get(0);
		private final Group cGroup_1_1 = (Group)cGroup_1.eContents().get(1);
		private final Keyword cCommaKeyword_1_1_0 = (Keyword)cGroup_1_1.eContents().get(0);
		private final Assignment cElementsAssignment_1_1_1 = (Assignment)cGroup_1_1.eContents().get(1);
		private final RuleCall cElementsExpression_ExceptionParserRuleCall_1_1_1_0 = (RuleCall)cElementsAssignment_1_1_1.eContents().get(0);
		
		//// The operator , concatenates two or more symbols. It has got a higher priority than the alternative and is left associative, too
		//Expression_Concatenation Expression:
		//	Expression_Exception ({Expression_Concatenation.elements+=current} (',' elements+=Expression_Exception)+)?
		@Override public ParserRule getRule() { return rule; }
		
		//Expression_Exception ({Expression_Concatenation.elements+=current} (',' elements+=Expression_Exception)+)?
		public Group getGroup() { return cGroup; }
		
		//Expression_Exception
		public RuleCall getExpression_ExceptionParserRuleCall_0() { return cExpression_ExceptionParserRuleCall_0; }
		
		//({Expression_Concatenation.elements+=current} (',' elements+=Expression_Exception)+)?
		public Group getGroup_1() { return cGroup_1; }
		
		//{Expression_Concatenation.elements+=current}
		public Action getExpression_ConcatenationElementsAction_1_0() { return cExpression_ConcatenationElementsAction_1_0; }
		
		//(',' elements+=Expression_Exception)+
		public Group getGroup_1_1() { return cGroup_1_1; }
		
		//','
		public Keyword getCommaKeyword_1_1_0() { return cCommaKeyword_1_1_0; }
		
		//elements+=Expression_Exception
		public Assignment getElementsAssignment_1_1_1() { return cElementsAssignment_1_1_1; }
		
		//Expression_Exception
		public RuleCall getElementsExpression_ExceptionParserRuleCall_1_1_1_0() { return cElementsExpression_ExceptionParserRuleCall_1_1_1_0; }
	}
	public class Expression_ExceptionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "it.unibg.ebnfwb.lang.EbnfLang.Expression_Exception");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cExpression_RepetitionParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Action cExpression_ExceptionLeftAction_1_0 = (Action)cGroup_1.eContents().get(0);
		private final Keyword cHyphenMinusKeyword_1_1 = (Keyword)cGroup_1.eContents().get(1);
		private final Assignment cRightAssignment_1_2 = (Assignment)cGroup_1.eContents().get(2);
		private final RuleCall cRightExpression_RepetitionParserRuleCall_1_2_0 = (RuleCall)cRightAssignment_1_2.eContents().get(0);
		
		//// The operator - defines an exception and substracts a symbol from a set. It has got the highest priority of all operators
		//Expression_Exception Expression:
		//	Expression_Repetition ({Expression_Exception.left=current} '-' right=Expression_Repetition)*
		@Override public ParserRule getRule() { return rule; }
		
		//Expression_Repetition ({Expression_Exception.left=current} '-' right=Expression_Repetition)*
		public Group getGroup() { return cGroup; }
		
		//Expression_Repetition
		public RuleCall getExpression_RepetitionParserRuleCall_0() { return cExpression_RepetitionParserRuleCall_0; }
		
		//({Expression_Exception.left=current} '-' right=Expression_Repetition)*
		public Group getGroup_1() { return cGroup_1; }
		
		//{Expression_Exception.left=current}
		public Action getExpression_ExceptionLeftAction_1_0() { return cExpression_ExceptionLeftAction_1_0; }
		
		//'-'
		public Keyword getHyphenMinusKeyword_1_1() { return cHyphenMinusKeyword_1_1; }
		
		//right=Expression_Repetition
		public Assignment getRightAssignment_1_2() { return cRightAssignment_1_2; }
		
		//Expression_Repetition
		public RuleCall getRightExpression_RepetitionParserRuleCall_1_2_0() { return cRightExpression_RepetitionParserRuleCall_1_2_0; }
	}
	public class Expression_RepetitionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "it.unibg.ebnfwb.lang.EbnfLang.Expression_Repetition");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cExpression_TerminalParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final Group cGroup_1 = (Group)cAlternatives.eContents().get(1);
		private final Action cExpression_RepetitionAction_1_0 = (Action)cGroup_1.eContents().get(0);
		private final Assignment cRepetitionsAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cRepetitionsNUMBERTerminalRuleCall_1_1_0 = (RuleCall)cRepetitionsAssignment_1_1.eContents().get(0);
		private final Keyword cAsteriskKeyword_1_2 = (Keyword)cGroup_1.eContents().get(2);
		private final Assignment cExprAssignment_1_3 = (Assignment)cGroup_1.eContents().get(3);
		private final RuleCall cExprExpression_TerminalParserRuleCall_1_3_0 = (RuleCall)cExprAssignment_1_3.eContents().get(0);
		
		//// The operator * defines an exception and substracts a symbol from a set. It has got the highest priority of all operators
		//Expression_Repetition Expression:
		//	Expression_Terminal | {Expression_Repetition} repetitions=NUMBER '*' expr=Expression_Terminal
		@Override public ParserRule getRule() { return rule; }
		
		//Expression_Terminal | {Expression_Repetition} repetitions=NUMBER '*' expr=Expression_Terminal
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//Expression_Terminal
		public RuleCall getExpression_TerminalParserRuleCall_0() { return cExpression_TerminalParserRuleCall_0; }
		
		//{Expression_Repetition} repetitions=NUMBER '*' expr=Expression_Terminal
		public Group getGroup_1() { return cGroup_1; }
		
		//{Expression_Repetition}
		public Action getExpression_RepetitionAction_1_0() { return cExpression_RepetitionAction_1_0; }
		
		//repetitions=NUMBER
		public Assignment getRepetitionsAssignment_1_1() { return cRepetitionsAssignment_1_1; }
		
		//NUMBER
		public RuleCall getRepetitionsNUMBERTerminalRuleCall_1_1_0() { return cRepetitionsNUMBERTerminalRuleCall_1_1_0; }
		
		//'*'
		public Keyword getAsteriskKeyword_1_2() { return cAsteriskKeyword_1_2; }
		
		//expr=Expression_Terminal
		public Assignment getExprAssignment_1_3() { return cExprAssignment_1_3; }
		
		//Expression_Terminal
		public RuleCall getExprExpression_TerminalParserRuleCall_1_3_0() { return cExprExpression_TerminalParserRuleCall_1_3_0; }
	}
	public class Expression_TerminalElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "it.unibg.ebnfwb.lang.EbnfLang.Expression_Terminal");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cExpression_Rule_ReferenceParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cExpression_Terminal_SymbolParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cExpression_Repetition_GroupParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		private final RuleCall cExpression_Optional_GroupParserRuleCall_3 = (RuleCall)cAlternatives.eContents().get(3);
		private final RuleCall cExpression_GroupParserRuleCall_4 = (RuleCall)cAlternatives.eContents().get(4);
		private final RuleCall cExpression_Special_SequenceParserRuleCall_5 = (RuleCall)cAlternatives.eContents().get(5);
		
		//// The parts of a rule can be
		//// - a reference pointing to another rule
		//// - a terminal symbol
		//// - a special sequence (non standardized)
		//// - a group (repetition, optional or simple group)
		//Expression_Terminal Expression:
		//	Expression_Rule_Reference | Expression_Terminal_Symbol | Expression_Repetition_Group | Expression_Optional_Group |
		//	Expression_Group | Expression_Special_Sequence
		@Override public ParserRule getRule() { return rule; }
		
		//Expression_Rule_Reference | Expression_Terminal_Symbol | Expression_Repetition_Group | Expression_Optional_Group |
		//Expression_Group | Expression_Special_Sequence
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//Expression_Rule_Reference
		public RuleCall getExpression_Rule_ReferenceParserRuleCall_0() { return cExpression_Rule_ReferenceParserRuleCall_0; }
		
		//Expression_Terminal_Symbol
		public RuleCall getExpression_Terminal_SymbolParserRuleCall_1() { return cExpression_Terminal_SymbolParserRuleCall_1; }
		
		//Expression_Repetition_Group
		public RuleCall getExpression_Repetition_GroupParserRuleCall_2() { return cExpression_Repetition_GroupParserRuleCall_2; }
		
		//Expression_Optional_Group
		public RuleCall getExpression_Optional_GroupParserRuleCall_3() { return cExpression_Optional_GroupParserRuleCall_3; }
		
		//Expression_Group
		public RuleCall getExpression_GroupParserRuleCall_4() { return cExpression_GroupParserRuleCall_4; }
		
		//Expression_Special_Sequence
		public RuleCall getExpression_Special_SequenceParserRuleCall_5() { return cExpression_Special_SequenceParserRuleCall_5; }
	}
	public class Expression_Rule_ReferenceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "it.unibg.ebnfwb.lang.EbnfLang.Expression_Rule_Reference");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cExpression_Rule_ReferenceAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cRuleAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cRuleProductionRuleCrossReference_1_0 = (CrossReference)cRuleAssignment_1.eContents().get(0);
		private final RuleCall cRuleProductionRuleNAMETerminalRuleCall_1_0_1 = (RuleCall)cRuleProductionRuleCrossReference_1_0.eContents().get(1);
		
		//// Reference another rule by its name
		//Expression_Rule_Reference Expression:
		//	{Expression_Rule_Reference} rule=[ProductionRule|NAME]
		@Override public ParserRule getRule() { return rule; }
		
		//{Expression_Rule_Reference} rule=[ProductionRule|NAME]
		public Group getGroup() { return cGroup; }
		
		//{Expression_Rule_Reference}
		public Action getExpression_Rule_ReferenceAction_0() { return cExpression_Rule_ReferenceAction_0; }
		
		//rule=[ProductionRule|NAME]
		public Assignment getRuleAssignment_1() { return cRuleAssignment_1; }
		
		//[ProductionRule|NAME]
		public CrossReference getRuleProductionRuleCrossReference_1_0() { return cRuleProductionRuleCrossReference_1_0; }
		
		//NAME
		public RuleCall getRuleProductionRuleNAMETerminalRuleCall_1_0_1() { return cRuleProductionRuleNAMETerminalRuleCall_1_0_1; }
	}
	public class Expression_Special_SequenceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "it.unibg.ebnfwb.lang.EbnfLang.Expression_Special_Sequence");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cExpression_Special_SequenceAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cTextAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cTextSPECIAL_SEQUENCETerminalRuleCall_1_0 = (RuleCall)cTextAssignment_1.eContents().get(0);
		
		//// A special sequence
		//Expression_Special_Sequence Expression:
		//	{Expression_Special_Sequence} text=SPECIAL_SEQUENCE
		@Override public ParserRule getRule() { return rule; }
		
		//{Expression_Special_Sequence} text=SPECIAL_SEQUENCE
		public Group getGroup() { return cGroup; }
		
		//{Expression_Special_Sequence}
		public Action getExpression_Special_SequenceAction_0() { return cExpression_Special_SequenceAction_0; }
		
		//text=SPECIAL_SEQUENCE
		public Assignment getTextAssignment_1() { return cTextAssignment_1; }
		
		//SPECIAL_SEQUENCE
		public RuleCall getTextSPECIAL_SEQUENCETerminalRuleCall_1_0() { return cTextSPECIAL_SEQUENCETerminalRuleCall_1_0; }
	}
	public class Expression_Terminal_SymbolElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "it.unibg.ebnfwb.lang.EbnfLang.Expression_Terminal_Symbol");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cExpression_Terminal_SymbolAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cTextAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cTextTERMINAL_SYMBOLTerminalRuleCall_1_0 = (RuleCall)cTextAssignment_1.eContents().get(0);
		
		//// A terminal symbol is a string which can be enclosed within ' or "
		//Expression_Terminal_Symbol Expression:
		//	{Expression_Terminal_Symbol} text=TERMINAL_SYMBOL
		@Override public ParserRule getRule() { return rule; }
		
		//{Expression_Terminal_Symbol} text=TERMINAL_SYMBOL
		public Group getGroup() { return cGroup; }
		
		//{Expression_Terminal_Symbol}
		public Action getExpression_Terminal_SymbolAction_0() { return cExpression_Terminal_SymbolAction_0; }
		
		//text=TERMINAL_SYMBOL
		public Assignment getTextAssignment_1() { return cTextAssignment_1; }
		
		//TERMINAL_SYMBOL
		public RuleCall getTextTERMINAL_SYMBOLTerminalRuleCall_1_0() { return cTextTERMINAL_SYMBOLTerminalRuleCall_1_0; }
	}
	public class Expression_Repetition_GroupElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "it.unibg.ebnfwb.lang.EbnfLang.Expression_Repetition_Group");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cExpression_Repetition_GroupAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cExprAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cExprExpressionParserRuleCall_2_0 = (RuleCall)cExprAssignment_2.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cAtLeastOneAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final Keyword cAtLeastOneHyphenMinusKeyword_4_0 = (Keyword)cAtLeastOneAssignment_4.eContents().get(0);
		
		//// An expression enclosed within curly brackets means that this part can be repeated 0...n times. If the brackets are followed by an - the minimum number of repetitions is 1
		//Expression_Repetition_Group Expression:
		//	{Expression_Repetition_Group} '{' expr=Expression '}' atLeastOne?='-'?
		@Override public ParserRule getRule() { return rule; }
		
		//{Expression_Repetition_Group} '{' expr=Expression '}' atLeastOne?='-'?
		public Group getGroup() { return cGroup; }
		
		//{Expression_Repetition_Group}
		public Action getExpression_Repetition_GroupAction_0() { return cExpression_Repetition_GroupAction_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//expr=Expression
		public Assignment getExprAssignment_2() { return cExprAssignment_2; }
		
		//Expression
		public RuleCall getExprExpressionParserRuleCall_2_0() { return cExprExpressionParserRuleCall_2_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_3() { return cRightCurlyBracketKeyword_3; }
		
		//atLeastOne?='-'?
		public Assignment getAtLeastOneAssignment_4() { return cAtLeastOneAssignment_4; }
		
		//'-'
		public Keyword getAtLeastOneHyphenMinusKeyword_4_0() { return cAtLeastOneHyphenMinusKeyword_4_0; }
	}
	public class Expression_Optional_GroupElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "it.unibg.ebnfwb.lang.EbnfLang.Expression_Optional_Group");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cExpression_Optional_GroupAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cLeftSquareBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cExprAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cExprExpressionParserRuleCall_2_0 = (RuleCall)cExprAssignment_2.eContents().get(0);
		private final Keyword cRightSquareBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//// An expression enclosed within brackets means that this part is optional
		//Expression_Optional_Group Expression:
		//	{Expression_Optional_Group} '[' expr=Expression ']'
		@Override public ParserRule getRule() { return rule; }
		
		//{Expression_Optional_Group} '[' expr=Expression ']'
		public Group getGroup() { return cGroup; }
		
		//{Expression_Optional_Group}
		public Action getExpression_Optional_GroupAction_0() { return cExpression_Optional_GroupAction_0; }
		
		//'['
		public Keyword getLeftSquareBracketKeyword_1() { return cLeftSquareBracketKeyword_1; }
		
		//expr=Expression
		public Assignment getExprAssignment_2() { return cExprAssignment_2; }
		
		//Expression
		public RuleCall getExprExpressionParserRuleCall_2_0() { return cExprExpressionParserRuleCall_2_0; }
		
		//']'
		public Keyword getRightSquareBracketKeyword_3() { return cRightSquareBracketKeyword_3; }
	}
	public class Expression_GroupElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "it.unibg.ebnfwb.lang.EbnfLang.Expression_Group");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cExpression_GroupAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cExprAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cExprExpressionParserRuleCall_2_0 = (RuleCall)cExprAssignment_2.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//// Parts of an expression can be put in paranthesis to influence the parsing order
		//Expression_Group Expression:
		//	{Expression_Group} '(' expr=Expression ')'
		@Override public ParserRule getRule() { return rule; }
		
		//{Expression_Group} '(' expr=Expression ')'
		public Group getGroup() { return cGroup; }
		
		//{Expression_Group}
		public Action getExpression_GroupAction_0() { return cExpression_GroupAction_0; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_1() { return cLeftParenthesisKeyword_1; }
		
		//expr=Expression
		public Assignment getExprAssignment_2() { return cExprAssignment_2; }
		
		//Expression
		public RuleCall getExprExpressionParserRuleCall_2_0() { return cExprExpressionParserRuleCall_2_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_3() { return cRightParenthesisKeyword_3; }
	}
	
	
	private final EbnfGrammarElements pEbnfGrammar;
	private final ProductionRuleElements pProductionRule;
	private final ExpressionElements pExpression;
	private final Expression_AlternativeElements pExpression_Alternative;
	private final Expression_ConcatenationElements pExpression_Concatenation;
	private final Expression_ExceptionElements pExpression_Exception;
	private final Expression_RepetitionElements pExpression_Repetition;
	private final Expression_TerminalElements pExpression_Terminal;
	private final Expression_Rule_ReferenceElements pExpression_Rule_Reference;
	private final Expression_Special_SequenceElements pExpression_Special_Sequence;
	private final Expression_Terminal_SymbolElements pExpression_Terminal_Symbol;
	private final Expression_Repetition_GroupElements pExpression_Repetition_Group;
	private final Expression_Optional_GroupElements pExpression_Optional_Group;
	private final Expression_GroupElements pExpression_Group;
	private final TerminalRule tNUMBER;
	private final TerminalRule tNAME;
	private final TerminalRule tTERMINAL_SYMBOL;
	private final TerminalRule tSPECIAL_SEQUENCE;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public EbnfLangGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pEbnfGrammar = new EbnfGrammarElements();
		this.pProductionRule = new ProductionRuleElements();
		this.pExpression = new ExpressionElements();
		this.pExpression_Alternative = new Expression_AlternativeElements();
		this.pExpression_Concatenation = new Expression_ConcatenationElements();
		this.pExpression_Exception = new Expression_ExceptionElements();
		this.pExpression_Repetition = new Expression_RepetitionElements();
		this.pExpression_Terminal = new Expression_TerminalElements();
		this.pExpression_Rule_Reference = new Expression_Rule_ReferenceElements();
		this.pExpression_Special_Sequence = new Expression_Special_SequenceElements();
		this.pExpression_Terminal_Symbol = new Expression_Terminal_SymbolElements();
		this.pExpression_Repetition_Group = new Expression_Repetition_GroupElements();
		this.pExpression_Optional_Group = new Expression_Optional_GroupElements();
		this.pExpression_Group = new Expression_GroupElements();
		this.tNUMBER = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "it.unibg.ebnfwb.lang.EbnfLang.NUMBER");
		this.tNAME = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "it.unibg.ebnfwb.lang.EbnfLang.NAME");
		this.tTERMINAL_SYMBOL = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "it.unibg.ebnfwb.lang.EbnfLang.TERMINAL_SYMBOL");
		this.tSPECIAL_SEQUENCE = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "it.unibg.ebnfwb.lang.EbnfLang.SPECIAL_SEQUENCE");
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("it.unibg.ebnfwb.lang.EbnfLang".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//EbnfGrammar:
	//	{EbnfGrammar} rules+=ProductionRule*;
	public EbnfGrammarElements getEbnfGrammarAccess() {
		return pEbnfGrammar;
	}
	
	public ParserRule getEbnfGrammarRule() {
		return getEbnfGrammarAccess().getRule();
	}
	
	//ProductionRule:
	//	name=NAME '=' expr=Expression ';';
	public ProductionRuleElements getProductionRuleAccess() {
		return pProductionRule;
	}
	
	public ParserRule getProductionRuleRule() {
		return getProductionRuleAccess().getRule();
	}
	
	//Expression:
	//	Expression_Alternative;
	public ExpressionElements getExpressionAccess() {
		return pExpression;
	}
	
	public ParserRule getExpressionRule() {
		return getExpressionAccess().getRule();
	}
	
	//// The operator | defines alternatives. It has got the lowest priority and is left associative
	//Expression_Alternative Expression:
	//	Expression_Concatenation ({Expression_Alternative.elements+=current} ('|' elements+=Expression_Concatenation)+)?
	public Expression_AlternativeElements getExpression_AlternativeAccess() {
		return pExpression_Alternative;
	}
	
	public ParserRule getExpression_AlternativeRule() {
		return getExpression_AlternativeAccess().getRule();
	}
	
	//// The operator , concatenates two or more symbols. It has got a higher priority than the alternative and is left associative, too
	//Expression_Concatenation Expression:
	//	Expression_Exception ({Expression_Concatenation.elements+=current} (',' elements+=Expression_Exception)+)?
	public Expression_ConcatenationElements getExpression_ConcatenationAccess() {
		return pExpression_Concatenation;
	}
	
	public ParserRule getExpression_ConcatenationRule() {
		return getExpression_ConcatenationAccess().getRule();
	}
	
	//// The operator - defines an exception and substracts a symbol from a set. It has got the highest priority of all operators
	//Expression_Exception Expression:
	//	Expression_Repetition ({Expression_Exception.left=current} '-' right=Expression_Repetition)*
	public Expression_ExceptionElements getExpression_ExceptionAccess() {
		return pExpression_Exception;
	}
	
	public ParserRule getExpression_ExceptionRule() {
		return getExpression_ExceptionAccess().getRule();
	}
	
	//// The operator * defines an exception and substracts a symbol from a set. It has got the highest priority of all operators
	//Expression_Repetition Expression:
	//	Expression_Terminal | {Expression_Repetition} repetitions=NUMBER '*' expr=Expression_Terminal
	public Expression_RepetitionElements getExpression_RepetitionAccess() {
		return pExpression_Repetition;
	}
	
	public ParserRule getExpression_RepetitionRule() {
		return getExpression_RepetitionAccess().getRule();
	}
	
	//// The parts of a rule can be
	//// - a reference pointing to another rule
	//// - a terminal symbol
	//// - a special sequence (non standardized)
	//// - a group (repetition, optional or simple group)
	//Expression_Terminal Expression:
	//	Expression_Rule_Reference | Expression_Terminal_Symbol | Expression_Repetition_Group | Expression_Optional_Group |
	//	Expression_Group | Expression_Special_Sequence
	public Expression_TerminalElements getExpression_TerminalAccess() {
		return pExpression_Terminal;
	}
	
	public ParserRule getExpression_TerminalRule() {
		return getExpression_TerminalAccess().getRule();
	}
	
	//// Reference another rule by its name
	//Expression_Rule_Reference Expression:
	//	{Expression_Rule_Reference} rule=[ProductionRule|NAME]
	public Expression_Rule_ReferenceElements getExpression_Rule_ReferenceAccess() {
		return pExpression_Rule_Reference;
	}
	
	public ParserRule getExpression_Rule_ReferenceRule() {
		return getExpression_Rule_ReferenceAccess().getRule();
	}
	
	//// A special sequence
	//Expression_Special_Sequence Expression:
	//	{Expression_Special_Sequence} text=SPECIAL_SEQUENCE
	public Expression_Special_SequenceElements getExpression_Special_SequenceAccess() {
		return pExpression_Special_Sequence;
	}
	
	public ParserRule getExpression_Special_SequenceRule() {
		return getExpression_Special_SequenceAccess().getRule();
	}
	
	//// A terminal symbol is a string which can be enclosed within ' or "
	//Expression_Terminal_Symbol Expression:
	//	{Expression_Terminal_Symbol} text=TERMINAL_SYMBOL
	public Expression_Terminal_SymbolElements getExpression_Terminal_SymbolAccess() {
		return pExpression_Terminal_Symbol;
	}
	
	public ParserRule getExpression_Terminal_SymbolRule() {
		return getExpression_Terminal_SymbolAccess().getRule();
	}
	
	//// An expression enclosed within curly brackets means that this part can be repeated 0...n times. If the brackets are followed by an - the minimum number of repetitions is 1
	//Expression_Repetition_Group Expression:
	//	{Expression_Repetition_Group} '{' expr=Expression '}' atLeastOne?='-'?
	public Expression_Repetition_GroupElements getExpression_Repetition_GroupAccess() {
		return pExpression_Repetition_Group;
	}
	
	public ParserRule getExpression_Repetition_GroupRule() {
		return getExpression_Repetition_GroupAccess().getRule();
	}
	
	//// An expression enclosed within brackets means that this part is optional
	//Expression_Optional_Group Expression:
	//	{Expression_Optional_Group} '[' expr=Expression ']'
	public Expression_Optional_GroupElements getExpression_Optional_GroupAccess() {
		return pExpression_Optional_Group;
	}
	
	public ParserRule getExpression_Optional_GroupRule() {
		return getExpression_Optional_GroupAccess().getRule();
	}
	
	//// Parts of an expression can be put in paranthesis to influence the parsing order
	//Expression_Group Expression:
	//	{Expression_Group} '(' expr=Expression ')'
	public Expression_GroupElements getExpression_GroupAccess() {
		return pExpression_Group;
	}
	
	public ParserRule getExpression_GroupRule() {
		return getExpression_GroupAccess().getRule();
	}
	
	//terminal NUMBER returns ecore::EInt:
	//	'1'..'9' '0'..'9'*;
	public TerminalRule getNUMBERRule() {
		return tNUMBER;
	}
	
	//terminal NAME:
	//	'a'..'z' | 'A'..'Z' | '_'+;
	public TerminalRule getNAMERule() {
		return tNAME;
	}
	
	//terminal TERMINAL_SYMBOL:
	//	'"' !'"'+ '"' | '\'' !'\''+ '\'';
	public TerminalRule getTERMINAL_SYMBOLRule() {
		return tTERMINAL_SYMBOL;
	}
	
	//terminal SPECIAL_SEQUENCE:
	//	'?' !'?'+ '?';
	public TerminalRule getSPECIAL_SEQUENCERule() {
		return tSPECIAL_SEQUENCE;
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' | "'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT:
	//	'/ *'->'* /';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
