/*
 * generated by Xtext 2.10.0
 */
package it.unibg.ebnfwb.lang.ide.contentassist.antlr;

import com.google.inject.Inject;
import it.unibg.ebnfwb.lang.ide.contentassist.antlr.internal.InternalEbnfLangParser;
import it.unibg.ebnfwb.lang.services.EbnfLangGrammarAccess;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

public class EbnfLangParser extends AbstractContentAssistParser {

	@Inject
	private EbnfLangGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalEbnfLangParser createParser() {
		InternalEbnfLangParser result = new InternalEbnfLangParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getExpression_RepetitionAccess().getAlternatives(), "rule__Expression_Repetition__Alternatives");
					put(grammarAccess.getExpression_TerminalAccess().getAlternatives(), "rule__Expression_Terminal__Alternatives");
					put(grammarAccess.getEbnfGrammarAccess().getGroup(), "rule__EbnfGrammar__Group__0");
					put(grammarAccess.getProductionRuleAccess().getGroup(), "rule__ProductionRule__Group__0");
					put(grammarAccess.getExpression_AlternativeAccess().getGroup(), "rule__Expression_Alternative__Group__0");
					put(grammarAccess.getExpression_AlternativeAccess().getGroup_1(), "rule__Expression_Alternative__Group_1__0");
					put(grammarAccess.getExpression_AlternativeAccess().getGroup_1_1(), "rule__Expression_Alternative__Group_1_1__0");
					put(grammarAccess.getExpression_ConcatenationAccess().getGroup(), "rule__Expression_Concatenation__Group__0");
					put(grammarAccess.getExpression_ConcatenationAccess().getGroup_1(), "rule__Expression_Concatenation__Group_1__0");
					put(grammarAccess.getExpression_ConcatenationAccess().getGroup_1_1(), "rule__Expression_Concatenation__Group_1_1__0");
					put(grammarAccess.getExpression_ExceptionAccess().getGroup(), "rule__Expression_Exception__Group__0");
					put(grammarAccess.getExpression_ExceptionAccess().getGroup_1(), "rule__Expression_Exception__Group_1__0");
					put(grammarAccess.getExpression_RepetitionAccess().getGroup_1(), "rule__Expression_Repetition__Group_1__0");
					put(grammarAccess.getExpression_Rule_ReferenceAccess().getGroup(), "rule__Expression_Rule_Reference__Group__0");
					put(grammarAccess.getExpression_Special_SequenceAccess().getGroup(), "rule__Expression_Special_Sequence__Group__0");
					put(grammarAccess.getExpression_Terminal_SymbolAccess().getGroup(), "rule__Expression_Terminal_Symbol__Group__0");
					put(grammarAccess.getExpression_Repetition_GroupAccess().getGroup(), "rule__Expression_Repetition_Group__Group__0");
					put(grammarAccess.getExpression_Optional_GroupAccess().getGroup(), "rule__Expression_Optional_Group__Group__0");
					put(grammarAccess.getExpression_GroupAccess().getGroup(), "rule__Expression_Group__Group__0");
					put(grammarAccess.getEbnfGrammarAccess().getRulesAssignment_1(), "rule__EbnfGrammar__RulesAssignment_1");
					put(grammarAccess.getProductionRuleAccess().getNameAssignment_0(), "rule__ProductionRule__NameAssignment_0");
					put(grammarAccess.getProductionRuleAccess().getExprAssignment_2(), "rule__ProductionRule__ExprAssignment_2");
					put(grammarAccess.getExpression_AlternativeAccess().getElementsAssignment_1_1_1(), "rule__Expression_Alternative__ElementsAssignment_1_1_1");
					put(grammarAccess.getExpression_ConcatenationAccess().getElementsAssignment_1_1_1(), "rule__Expression_Concatenation__ElementsAssignment_1_1_1");
					put(grammarAccess.getExpression_ExceptionAccess().getRightAssignment_1_2(), "rule__Expression_Exception__RightAssignment_1_2");
					put(grammarAccess.getExpression_RepetitionAccess().getRepetitionsAssignment_1_1(), "rule__Expression_Repetition__RepetitionsAssignment_1_1");
					put(grammarAccess.getExpression_RepetitionAccess().getExprAssignment_1_3(), "rule__Expression_Repetition__ExprAssignment_1_3");
					put(grammarAccess.getExpression_Rule_ReferenceAccess().getRuleAssignment_1(), "rule__Expression_Rule_Reference__RuleAssignment_1");
					put(grammarAccess.getExpression_Special_SequenceAccess().getTextAssignment_1(), "rule__Expression_Special_Sequence__TextAssignment_1");
					put(grammarAccess.getExpression_Terminal_SymbolAccess().getTextAssignment_1(), "rule__Expression_Terminal_Symbol__TextAssignment_1");
					put(grammarAccess.getExpression_Repetition_GroupAccess().getExprAssignment_2(), "rule__Expression_Repetition_Group__ExprAssignment_2");
					put(grammarAccess.getExpression_Repetition_GroupAccess().getAtLeastOneAssignment_4(), "rule__Expression_Repetition_Group__AtLeastOneAssignment_4");
					put(grammarAccess.getExpression_Optional_GroupAccess().getExprAssignment_2(), "rule__Expression_Optional_Group__ExprAssignment_2");
					put(grammarAccess.getExpression_GroupAccess().getExprAssignment_2(), "rule__Expression_Group__ExprAssignment_2");
				}
			};
		}
		return nameMappings.get(element);
	}

	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			InternalEbnfLangParser typedParser = (InternalEbnfLangParser) parser;
			typedParser.entryRuleEbnfGrammar();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public EbnfLangGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(EbnfLangGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}