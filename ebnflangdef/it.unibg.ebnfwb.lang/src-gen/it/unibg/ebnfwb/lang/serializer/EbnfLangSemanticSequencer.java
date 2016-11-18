/*
 * generated by Xtext 2.10.0
 */
package it.unibg.ebnfwb.lang.serializer;

import com.google.inject.Inject;
import it.unibg.ebnfwb.lang.ebnfLang.EbnfGrammar;
import it.unibg.ebnfwb.lang.ebnfLang.EbnfLangPackage;
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
import it.unibg.ebnfwb.lang.ebnfLang.ProductionRule;
import it.unibg.ebnfwb.lang.services.EbnfLangGrammarAccess;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class EbnfLangSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private EbnfLangGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == EbnfLangPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case EbnfLangPackage.EBNF_GRAMMAR:
				sequence_EbnfGrammar(context, (EbnfGrammar) semanticObject); 
				return; 
			case EbnfLangPackage.EXPRESSION_ALTERNATIVE:
				sequence_Expression_Alternative(context, (Expression_Alternative) semanticObject); 
				return; 
			case EbnfLangPackage.EXPRESSION_CONCATENATION:
				sequence_Expression_Concatenation(context, (Expression_Concatenation) semanticObject); 
				return; 
			case EbnfLangPackage.EXPRESSION_EXCEPTION:
				sequence_Expression_Exception(context, (Expression_Exception) semanticObject); 
				return; 
			case EbnfLangPackage.EXPRESSION_GROUP:
				sequence_Expression_Group(context, (Expression_Group) semanticObject); 
				return; 
			case EbnfLangPackage.EXPRESSION_OPTIONAL_GROUP:
				sequence_Expression_Optional_Group(context, (Expression_Optional_Group) semanticObject); 
				return; 
			case EbnfLangPackage.EXPRESSION_REPETITION:
				sequence_Expression_Repetition(context, (Expression_Repetition) semanticObject); 
				return; 
			case EbnfLangPackage.EXPRESSION_REPETITION_GROUP:
				sequence_Expression_Repetition_Group(context, (Expression_Repetition_Group) semanticObject); 
				return; 
			case EbnfLangPackage.EXPRESSION_RULE_REFERENCE:
				sequence_Expression_Rule_Reference(context, (Expression_Rule_Reference) semanticObject); 
				return; 
			case EbnfLangPackage.EXPRESSION_SPECIAL_SEQUENCE:
				sequence_Expression_Special_Sequence(context, (Expression_Special_Sequence) semanticObject); 
				return; 
			case EbnfLangPackage.EXPRESSION_TERMINAL_SYMBOL:
				sequence_Expression_Terminal_Symbol(context, (Expression_Terminal_Symbol) semanticObject); 
				return; 
			case EbnfLangPackage.PRODUCTION_RULE:
				sequence_ProductionRule(context, (ProductionRule) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     EbnfGrammar returns EbnfGrammar
	 *
	 * Constraint:
	 *     rules+=ProductionRule*
	 */
	protected void sequence_EbnfGrammar(ISerializationContext context, EbnfGrammar semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns Expression_Alternative
	 *     Expression_Alternative returns Expression_Alternative
	 *
	 * Constraint:
	 *     (elements+=Expression_Alternative_Expression_Alternative_1_0 elements+=Expression_Concatenation+)
	 */
	protected void sequence_Expression_Alternative(ISerializationContext context, Expression_Alternative semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns Expression_Concatenation
	 *     Expression_Alternative returns Expression_Concatenation
	 *     Expression_Alternative.Expression_Alternative_1_0 returns Expression_Concatenation
	 *     Expression_Concatenation returns Expression_Concatenation
	 *
	 * Constraint:
	 *     (elements+=Expression_Concatenation_Expression_Concatenation_1_0 elements+=Expression_Exception+)
	 */
	protected void sequence_Expression_Concatenation(ISerializationContext context, Expression_Concatenation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns Expression_Exception
	 *     Expression_Alternative returns Expression_Exception
	 *     Expression_Alternative.Expression_Alternative_1_0 returns Expression_Exception
	 *     Expression_Concatenation returns Expression_Exception
	 *     Expression_Concatenation.Expression_Concatenation_1_0 returns Expression_Exception
	 *     Expression_Exception returns Expression_Exception
	 *     Expression_Exception.Expression_Exception_1_0 returns Expression_Exception
	 *
	 * Constraint:
	 *     (left=Expression_Exception_Expression_Exception_1_0 right=Expression_Repetition)
	 */
	protected void sequence_Expression_Exception(ISerializationContext context, Expression_Exception semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, EbnfLangPackage.Literals.EXPRESSION_EXCEPTION__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EbnfLangPackage.Literals.EXPRESSION_EXCEPTION__LEFT));
			if (transientValues.isValueTransient(semanticObject, EbnfLangPackage.Literals.EXPRESSION_EXCEPTION__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EbnfLangPackage.Literals.EXPRESSION_EXCEPTION__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getExpression_ExceptionAccess().getExpression_ExceptionLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getExpression_ExceptionAccess().getRightExpression_RepetitionParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns Expression_Group
	 *     Expression_Alternative returns Expression_Group
	 *     Expression_Alternative.Expression_Alternative_1_0 returns Expression_Group
	 *     Expression_Concatenation returns Expression_Group
	 *     Expression_Concatenation.Expression_Concatenation_1_0 returns Expression_Group
	 *     Expression_Exception returns Expression_Group
	 *     Expression_Exception.Expression_Exception_1_0 returns Expression_Group
	 *     Expression_Repetition returns Expression_Group
	 *     Expression_Terminal returns Expression_Group
	 *     Expression_Group returns Expression_Group
	 *
	 * Constraint:
	 *     expr=Expression
	 */
	protected void sequence_Expression_Group(ISerializationContext context, Expression_Group semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, EbnfLangPackage.Literals.EXPRESSION_GROUP__EXPR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EbnfLangPackage.Literals.EXPRESSION_GROUP__EXPR));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getExpression_GroupAccess().getExprExpressionParserRuleCall_2_0(), semanticObject.getExpr());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns Expression_Optional_Group
	 *     Expression_Alternative returns Expression_Optional_Group
	 *     Expression_Alternative.Expression_Alternative_1_0 returns Expression_Optional_Group
	 *     Expression_Concatenation returns Expression_Optional_Group
	 *     Expression_Concatenation.Expression_Concatenation_1_0 returns Expression_Optional_Group
	 *     Expression_Exception returns Expression_Optional_Group
	 *     Expression_Exception.Expression_Exception_1_0 returns Expression_Optional_Group
	 *     Expression_Repetition returns Expression_Optional_Group
	 *     Expression_Terminal returns Expression_Optional_Group
	 *     Expression_Optional_Group returns Expression_Optional_Group
	 *
	 * Constraint:
	 *     expr=Expression
	 */
	protected void sequence_Expression_Optional_Group(ISerializationContext context, Expression_Optional_Group semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, EbnfLangPackage.Literals.EXPRESSION_OPTIONAL_GROUP__EXPR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EbnfLangPackage.Literals.EXPRESSION_OPTIONAL_GROUP__EXPR));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getExpression_Optional_GroupAccess().getExprExpressionParserRuleCall_2_0(), semanticObject.getExpr());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns Expression_Repetition
	 *     Expression_Alternative returns Expression_Repetition
	 *     Expression_Alternative.Expression_Alternative_1_0 returns Expression_Repetition
	 *     Expression_Concatenation returns Expression_Repetition
	 *     Expression_Concatenation.Expression_Concatenation_1_0 returns Expression_Repetition
	 *     Expression_Exception returns Expression_Repetition
	 *     Expression_Exception.Expression_Exception_1_0 returns Expression_Repetition
	 *     Expression_Repetition returns Expression_Repetition
	 *
	 * Constraint:
	 *     (repetitions=NUMBER expr=Expression_Terminal)
	 */
	protected void sequence_Expression_Repetition(ISerializationContext context, Expression_Repetition semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, EbnfLangPackage.Literals.EXPRESSION_REPETITION__REPETITIONS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EbnfLangPackage.Literals.EXPRESSION_REPETITION__REPETITIONS));
			if (transientValues.isValueTransient(semanticObject, EbnfLangPackage.Literals.EXPRESSION_REPETITION__EXPR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EbnfLangPackage.Literals.EXPRESSION_REPETITION__EXPR));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getExpression_RepetitionAccess().getRepetitionsNUMBERTerminalRuleCall_1_1_0(), semanticObject.getRepetitions());
		feeder.accept(grammarAccess.getExpression_RepetitionAccess().getExprExpression_TerminalParserRuleCall_1_3_0(), semanticObject.getExpr());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns Expression_Repetition_Group
	 *     Expression_Alternative returns Expression_Repetition_Group
	 *     Expression_Alternative.Expression_Alternative_1_0 returns Expression_Repetition_Group
	 *     Expression_Concatenation returns Expression_Repetition_Group
	 *     Expression_Concatenation.Expression_Concatenation_1_0 returns Expression_Repetition_Group
	 *     Expression_Exception returns Expression_Repetition_Group
	 *     Expression_Exception.Expression_Exception_1_0 returns Expression_Repetition_Group
	 *     Expression_Repetition returns Expression_Repetition_Group
	 *     Expression_Terminal returns Expression_Repetition_Group
	 *     Expression_Repetition_Group returns Expression_Repetition_Group
	 *
	 * Constraint:
	 *     (expr=Expression atLeastOne?='-'?)
	 */
	protected void sequence_Expression_Repetition_Group(ISerializationContext context, Expression_Repetition_Group semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns Expression_Rule_Reference
	 *     Expression_Alternative returns Expression_Rule_Reference
	 *     Expression_Alternative.Expression_Alternative_1_0 returns Expression_Rule_Reference
	 *     Expression_Concatenation returns Expression_Rule_Reference
	 *     Expression_Concatenation.Expression_Concatenation_1_0 returns Expression_Rule_Reference
	 *     Expression_Exception returns Expression_Rule_Reference
	 *     Expression_Exception.Expression_Exception_1_0 returns Expression_Rule_Reference
	 *     Expression_Repetition returns Expression_Rule_Reference
	 *     Expression_Terminal returns Expression_Rule_Reference
	 *     Expression_Rule_Reference returns Expression_Rule_Reference
	 *
	 * Constraint:
	 *     rule=[ProductionRule|NAME]
	 */
	protected void sequence_Expression_Rule_Reference(ISerializationContext context, Expression_Rule_Reference semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, EbnfLangPackage.Literals.EXPRESSION_RULE_REFERENCE__RULE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EbnfLangPackage.Literals.EXPRESSION_RULE_REFERENCE__RULE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getExpression_Rule_ReferenceAccess().getRuleProductionRuleNAMETerminalRuleCall_1_0_1(), semanticObject.getRule());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns Expression_Special_Sequence
	 *     Expression_Alternative returns Expression_Special_Sequence
	 *     Expression_Alternative.Expression_Alternative_1_0 returns Expression_Special_Sequence
	 *     Expression_Concatenation returns Expression_Special_Sequence
	 *     Expression_Concatenation.Expression_Concatenation_1_0 returns Expression_Special_Sequence
	 *     Expression_Exception returns Expression_Special_Sequence
	 *     Expression_Exception.Expression_Exception_1_0 returns Expression_Special_Sequence
	 *     Expression_Repetition returns Expression_Special_Sequence
	 *     Expression_Terminal returns Expression_Special_Sequence
	 *     Expression_Special_Sequence returns Expression_Special_Sequence
	 *
	 * Constraint:
	 *     text=SPECIAL_SEQUENCE
	 */
	protected void sequence_Expression_Special_Sequence(ISerializationContext context, Expression_Special_Sequence semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, EbnfLangPackage.Literals.EXPRESSION_SPECIAL_SEQUENCE__TEXT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EbnfLangPackage.Literals.EXPRESSION_SPECIAL_SEQUENCE__TEXT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getExpression_Special_SequenceAccess().getTextSPECIAL_SEQUENCETerminalRuleCall_1_0(), semanticObject.getText());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns Expression_Terminal_Symbol
	 *     Expression_Alternative returns Expression_Terminal_Symbol
	 *     Expression_Alternative.Expression_Alternative_1_0 returns Expression_Terminal_Symbol
	 *     Expression_Concatenation returns Expression_Terminal_Symbol
	 *     Expression_Concatenation.Expression_Concatenation_1_0 returns Expression_Terminal_Symbol
	 *     Expression_Exception returns Expression_Terminal_Symbol
	 *     Expression_Exception.Expression_Exception_1_0 returns Expression_Terminal_Symbol
	 *     Expression_Repetition returns Expression_Terminal_Symbol
	 *     Expression_Terminal returns Expression_Terminal_Symbol
	 *     Expression_Terminal_Symbol returns Expression_Terminal_Symbol
	 *
	 * Constraint:
	 *     text=TERMINAL_SYMBOL
	 */
	protected void sequence_Expression_Terminal_Symbol(ISerializationContext context, Expression_Terminal_Symbol semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, EbnfLangPackage.Literals.EXPRESSION_TERMINAL_SYMBOL__TEXT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EbnfLangPackage.Literals.EXPRESSION_TERMINAL_SYMBOL__TEXT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getExpression_Terminal_SymbolAccess().getTextTERMINAL_SYMBOLTerminalRuleCall_1_0(), semanticObject.getText());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ProductionRule returns ProductionRule
	 *
	 * Constraint:
	 *     (name=NAME expr=Expression)
	 */
	protected void sequence_ProductionRule(ISerializationContext context, ProductionRule semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, EbnfLangPackage.Literals.PRODUCTION_RULE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EbnfLangPackage.Literals.PRODUCTION_RULE__NAME));
			if (transientValues.isValueTransient(semanticObject, EbnfLangPackage.Literals.PRODUCTION_RULE__EXPR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EbnfLangPackage.Literals.PRODUCTION_RULE__EXPR));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getProductionRuleAccess().getNameNAMETerminalRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getProductionRuleAccess().getExprExpressionParserRuleCall_2_0(), semanticObject.getExpr());
		feeder.finish();
	}
	
	
}