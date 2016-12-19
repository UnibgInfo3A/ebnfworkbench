/**
 * generated by Xtext 2.10.0
 */
package it.unibg.ebnfwb.lang.ebnfLang.impl;

import it.unibg.ebnfwb.lang.ebnfLang.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EbnfLangFactoryImpl extends EFactoryImpl implements EbnfLangFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static EbnfLangFactory init()
  {
    try
    {
      EbnfLangFactory theEbnfLangFactory = (EbnfLangFactory)EPackage.Registry.INSTANCE.getEFactory(EbnfLangPackage.eNS_URI);
      if (theEbnfLangFactory != null)
      {
        return theEbnfLangFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new EbnfLangFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EbnfLangFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case EbnfLangPackage.EBNF_GRAMMAR: return createEbnfGrammar();
      case EbnfLangPackage.LINE: return createLine();
      case EbnfLangPackage.PRODUCTION_RULE: return createProductionRule();
      case EbnfLangPackage.EXPRESSION: return createExpression();
      case EbnfLangPackage.EXPRESSION_ALTERNATIVE: return createExpression_Alternative();
      case EbnfLangPackage.EXPRESSION_CONCATENATION: return createExpression_Concatenation();
      case EbnfLangPackage.EXPRESSION_EXCEPTION: return createExpression_Exception();
      case EbnfLangPackage.EXPRESSION_REPETITION: return createExpression_Repetition();
      case EbnfLangPackage.EXPRESSION_RULE_REFERENCE: return createExpression_Rule_Reference();
      case EbnfLangPackage.EXPRESSION_SPECIAL_SEQUENCE: return createExpression_Special_Sequence();
      case EbnfLangPackage.EXPRESSION_TERMINAL_SYMBOL: return createExpression_Terminal_Symbol();
      case EbnfLangPackage.EXPRESSION_REPETITION_GROUP: return createExpression_Repetition_Group();
      case EbnfLangPackage.EXPRESSION_OPTIONAL_GROUP: return createExpression_Optional_Group();
      case EbnfLangPackage.EXPRESSION_GROUP: return createExpression_Group();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EbnfGrammar createEbnfGrammar()
  {
    EbnfGrammarImpl ebnfGrammar = new EbnfGrammarImpl();
    return ebnfGrammar;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Line createLine()
  {
    LineImpl line = new LineImpl();
    return line;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProductionRule createProductionRule()
  {
    ProductionRuleImpl productionRule = new ProductionRuleImpl();
    return productionRule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression createExpression()
  {
    ExpressionImpl expression = new ExpressionImpl();
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression_Alternative createExpression_Alternative()
  {
    Expression_AlternativeImpl expression_Alternative = new Expression_AlternativeImpl();
    return expression_Alternative;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression_Concatenation createExpression_Concatenation()
  {
    Expression_ConcatenationImpl expression_Concatenation = new Expression_ConcatenationImpl();
    return expression_Concatenation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression_Exception createExpression_Exception()
  {
    Expression_ExceptionImpl expression_Exception = new Expression_ExceptionImpl();
    return expression_Exception;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression_Repetition createExpression_Repetition()
  {
    Expression_RepetitionImpl expression_Repetition = new Expression_RepetitionImpl();
    return expression_Repetition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression_Rule_Reference createExpression_Rule_Reference()
  {
    Expression_Rule_ReferenceImpl expression_Rule_Reference = new Expression_Rule_ReferenceImpl();
    return expression_Rule_Reference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression_Special_Sequence createExpression_Special_Sequence()
  {
    Expression_Special_SequenceImpl expression_Special_Sequence = new Expression_Special_SequenceImpl();
    return expression_Special_Sequence;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression_Terminal_Symbol createExpression_Terminal_Symbol()
  {
    Expression_Terminal_SymbolImpl expression_Terminal_Symbol = new Expression_Terminal_SymbolImpl();
    return expression_Terminal_Symbol;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression_Repetition_Group createExpression_Repetition_Group()
  {
    Expression_Repetition_GroupImpl expression_Repetition_Group = new Expression_Repetition_GroupImpl();
    return expression_Repetition_Group;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression_Optional_Group createExpression_Optional_Group()
  {
    Expression_Optional_GroupImpl expression_Optional_Group = new Expression_Optional_GroupImpl();
    return expression_Optional_Group;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression_Group createExpression_Group()
  {
    Expression_GroupImpl expression_Group = new Expression_GroupImpl();
    return expression_Group;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EbnfLangPackage getEbnfLangPackage()
  {
    return (EbnfLangPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static EbnfLangPackage getPackage()
  {
    return EbnfLangPackage.eINSTANCE;
  }

} //EbnfLangFactoryImpl
