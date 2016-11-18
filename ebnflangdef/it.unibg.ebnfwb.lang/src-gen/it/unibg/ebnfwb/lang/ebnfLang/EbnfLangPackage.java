/**
 * generated by Xtext 2.10.0
 */
package it.unibg.ebnfwb.lang.ebnfLang;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see it.unibg.ebnfwb.lang.ebnfLang.EbnfLangFactory
 * @model kind="package"
 * @generated
 */
public interface EbnfLangPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "ebnfLang";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.unibg.it/ebnfwb/lang/EbnfLang";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "ebnfLang";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  EbnfLangPackage eINSTANCE = it.unibg.ebnfwb.lang.ebnfLang.impl.EbnfLangPackageImpl.init();

  /**
   * The meta object id for the '{@link it.unibg.ebnfwb.lang.ebnfLang.impl.EbnfGrammarImpl <em>Ebnf Grammar</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.unibg.ebnfwb.lang.ebnfLang.impl.EbnfGrammarImpl
   * @see it.unibg.ebnfwb.lang.ebnfLang.impl.EbnfLangPackageImpl#getEbnfGrammar()
   * @generated
   */
  int EBNF_GRAMMAR = 0;

  /**
   * The feature id for the '<em><b>Rules</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EBNF_GRAMMAR__RULES = 0;

  /**
   * The number of structural features of the '<em>Ebnf Grammar</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EBNF_GRAMMAR_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link it.unibg.ebnfwb.lang.ebnfLang.impl.ProductionRuleImpl <em>Production Rule</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.unibg.ebnfwb.lang.ebnfLang.impl.ProductionRuleImpl
   * @see it.unibg.ebnfwb.lang.ebnfLang.impl.EbnfLangPackageImpl#getProductionRule()
   * @generated
   */
  int PRODUCTION_RULE = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRODUCTION_RULE__NAME = 0;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRODUCTION_RULE__EXPR = 1;

  /**
   * The number of structural features of the '<em>Production Rule</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRODUCTION_RULE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link it.unibg.ebnfwb.lang.ebnfLang.impl.ExpressionImpl <em>Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.unibg.ebnfwb.lang.ebnfLang.impl.ExpressionImpl
   * @see it.unibg.ebnfwb.lang.ebnfLang.impl.EbnfLangPackageImpl#getExpression()
   * @generated
   */
  int EXPRESSION = 2;

  /**
   * The number of structural features of the '<em>Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link it.unibg.ebnfwb.lang.ebnfLang.impl.Expression_AlternativeImpl <em>Expression Alternative</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.unibg.ebnfwb.lang.ebnfLang.impl.Expression_AlternativeImpl
   * @see it.unibg.ebnfwb.lang.ebnfLang.impl.EbnfLangPackageImpl#getExpression_Alternative()
   * @generated
   */
  int EXPRESSION_ALTERNATIVE = 3;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_ALTERNATIVE__ELEMENTS = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Expression Alternative</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_ALTERNATIVE_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link it.unibg.ebnfwb.lang.ebnfLang.impl.Expression_ConcatenationImpl <em>Expression Concatenation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.unibg.ebnfwb.lang.ebnfLang.impl.Expression_ConcatenationImpl
   * @see it.unibg.ebnfwb.lang.ebnfLang.impl.EbnfLangPackageImpl#getExpression_Concatenation()
   * @generated
   */
  int EXPRESSION_CONCATENATION = 4;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_CONCATENATION__ELEMENTS = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Expression Concatenation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_CONCATENATION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link it.unibg.ebnfwb.lang.ebnfLang.impl.Expression_ExceptionImpl <em>Expression Exception</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.unibg.ebnfwb.lang.ebnfLang.impl.Expression_ExceptionImpl
   * @see it.unibg.ebnfwb.lang.ebnfLang.impl.EbnfLangPackageImpl#getExpression_Exception()
   * @generated
   */
  int EXPRESSION_EXCEPTION = 5;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_EXCEPTION__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_EXCEPTION__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Expression Exception</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_EXCEPTION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link it.unibg.ebnfwb.lang.ebnfLang.impl.Expression_RepetitionImpl <em>Expression Repetition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.unibg.ebnfwb.lang.ebnfLang.impl.Expression_RepetitionImpl
   * @see it.unibg.ebnfwb.lang.ebnfLang.impl.EbnfLangPackageImpl#getExpression_Repetition()
   * @generated
   */
  int EXPRESSION_REPETITION = 6;

  /**
   * The feature id for the '<em><b>Repetitions</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_REPETITION__REPETITIONS = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_REPETITION__EXPR = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Expression Repetition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_REPETITION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link it.unibg.ebnfwb.lang.ebnfLang.impl.Expression_Rule_ReferenceImpl <em>Expression Rule Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.unibg.ebnfwb.lang.ebnfLang.impl.Expression_Rule_ReferenceImpl
   * @see it.unibg.ebnfwb.lang.ebnfLang.impl.EbnfLangPackageImpl#getExpression_Rule_Reference()
   * @generated
   */
  int EXPRESSION_RULE_REFERENCE = 7;

  /**
   * The feature id for the '<em><b>Rule</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_RULE_REFERENCE__RULE = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Expression Rule Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_RULE_REFERENCE_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link it.unibg.ebnfwb.lang.ebnfLang.impl.Expression_Special_SequenceImpl <em>Expression Special Sequence</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.unibg.ebnfwb.lang.ebnfLang.impl.Expression_Special_SequenceImpl
   * @see it.unibg.ebnfwb.lang.ebnfLang.impl.EbnfLangPackageImpl#getExpression_Special_Sequence()
   * @generated
   */
  int EXPRESSION_SPECIAL_SEQUENCE = 8;

  /**
   * The feature id for the '<em><b>Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_SPECIAL_SEQUENCE__TEXT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Expression Special Sequence</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_SPECIAL_SEQUENCE_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link it.unibg.ebnfwb.lang.ebnfLang.impl.Expression_Terminal_SymbolImpl <em>Expression Terminal Symbol</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.unibg.ebnfwb.lang.ebnfLang.impl.Expression_Terminal_SymbolImpl
   * @see it.unibg.ebnfwb.lang.ebnfLang.impl.EbnfLangPackageImpl#getExpression_Terminal_Symbol()
   * @generated
   */
  int EXPRESSION_TERMINAL_SYMBOL = 9;

  /**
   * The feature id for the '<em><b>Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_TERMINAL_SYMBOL__TEXT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Expression Terminal Symbol</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_TERMINAL_SYMBOL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link it.unibg.ebnfwb.lang.ebnfLang.impl.Expression_Repetition_GroupImpl <em>Expression Repetition Group</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.unibg.ebnfwb.lang.ebnfLang.impl.Expression_Repetition_GroupImpl
   * @see it.unibg.ebnfwb.lang.ebnfLang.impl.EbnfLangPackageImpl#getExpression_Repetition_Group()
   * @generated
   */
  int EXPRESSION_REPETITION_GROUP = 10;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_REPETITION_GROUP__EXPR = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>At Least One</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_REPETITION_GROUP__AT_LEAST_ONE = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Expression Repetition Group</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_REPETITION_GROUP_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link it.unibg.ebnfwb.lang.ebnfLang.impl.Expression_Optional_GroupImpl <em>Expression Optional Group</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.unibg.ebnfwb.lang.ebnfLang.impl.Expression_Optional_GroupImpl
   * @see it.unibg.ebnfwb.lang.ebnfLang.impl.EbnfLangPackageImpl#getExpression_Optional_Group()
   * @generated
   */
  int EXPRESSION_OPTIONAL_GROUP = 11;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_OPTIONAL_GROUP__EXPR = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Expression Optional Group</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_OPTIONAL_GROUP_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link it.unibg.ebnfwb.lang.ebnfLang.impl.Expression_GroupImpl <em>Expression Group</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.unibg.ebnfwb.lang.ebnfLang.impl.Expression_GroupImpl
   * @see it.unibg.ebnfwb.lang.ebnfLang.impl.EbnfLangPackageImpl#getExpression_Group()
   * @generated
   */
  int EXPRESSION_GROUP = 12;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_GROUP__EXPR = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Expression Group</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_GROUP_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;


  /**
   * Returns the meta object for class '{@link it.unibg.ebnfwb.lang.ebnfLang.EbnfGrammar <em>Ebnf Grammar</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ebnf Grammar</em>'.
   * @see it.unibg.ebnfwb.lang.ebnfLang.EbnfGrammar
   * @generated
   */
  EClass getEbnfGrammar();

  /**
   * Returns the meta object for the containment reference list '{@link it.unibg.ebnfwb.lang.ebnfLang.EbnfGrammar#getRules <em>Rules</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Rules</em>'.
   * @see it.unibg.ebnfwb.lang.ebnfLang.EbnfGrammar#getRules()
   * @see #getEbnfGrammar()
   * @generated
   */
  EReference getEbnfGrammar_Rules();

  /**
   * Returns the meta object for class '{@link it.unibg.ebnfwb.lang.ebnfLang.ProductionRule <em>Production Rule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Production Rule</em>'.
   * @see it.unibg.ebnfwb.lang.ebnfLang.ProductionRule
   * @generated
   */
  EClass getProductionRule();

  /**
   * Returns the meta object for the attribute '{@link it.unibg.ebnfwb.lang.ebnfLang.ProductionRule#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see it.unibg.ebnfwb.lang.ebnfLang.ProductionRule#getName()
   * @see #getProductionRule()
   * @generated
   */
  EAttribute getProductionRule_Name();

  /**
   * Returns the meta object for the containment reference '{@link it.unibg.ebnfwb.lang.ebnfLang.ProductionRule#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr</em>'.
   * @see it.unibg.ebnfwb.lang.ebnfLang.ProductionRule#getExpr()
   * @see #getProductionRule()
   * @generated
   */
  EReference getProductionRule_Expr();

  /**
   * Returns the meta object for class '{@link it.unibg.ebnfwb.lang.ebnfLang.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression</em>'.
   * @see it.unibg.ebnfwb.lang.ebnfLang.Expression
   * @generated
   */
  EClass getExpression();

  /**
   * Returns the meta object for class '{@link it.unibg.ebnfwb.lang.ebnfLang.Expression_Alternative <em>Expression Alternative</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression Alternative</em>'.
   * @see it.unibg.ebnfwb.lang.ebnfLang.Expression_Alternative
   * @generated
   */
  EClass getExpression_Alternative();

  /**
   * Returns the meta object for the containment reference list '{@link it.unibg.ebnfwb.lang.ebnfLang.Expression_Alternative#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see it.unibg.ebnfwb.lang.ebnfLang.Expression_Alternative#getElements()
   * @see #getExpression_Alternative()
   * @generated
   */
  EReference getExpression_Alternative_Elements();

  /**
   * Returns the meta object for class '{@link it.unibg.ebnfwb.lang.ebnfLang.Expression_Concatenation <em>Expression Concatenation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression Concatenation</em>'.
   * @see it.unibg.ebnfwb.lang.ebnfLang.Expression_Concatenation
   * @generated
   */
  EClass getExpression_Concatenation();

  /**
   * Returns the meta object for the containment reference list '{@link it.unibg.ebnfwb.lang.ebnfLang.Expression_Concatenation#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see it.unibg.ebnfwb.lang.ebnfLang.Expression_Concatenation#getElements()
   * @see #getExpression_Concatenation()
   * @generated
   */
  EReference getExpression_Concatenation_Elements();

  /**
   * Returns the meta object for class '{@link it.unibg.ebnfwb.lang.ebnfLang.Expression_Exception <em>Expression Exception</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression Exception</em>'.
   * @see it.unibg.ebnfwb.lang.ebnfLang.Expression_Exception
   * @generated
   */
  EClass getExpression_Exception();

  /**
   * Returns the meta object for the containment reference '{@link it.unibg.ebnfwb.lang.ebnfLang.Expression_Exception#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see it.unibg.ebnfwb.lang.ebnfLang.Expression_Exception#getLeft()
   * @see #getExpression_Exception()
   * @generated
   */
  EReference getExpression_Exception_Left();

  /**
   * Returns the meta object for the containment reference '{@link it.unibg.ebnfwb.lang.ebnfLang.Expression_Exception#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see it.unibg.ebnfwb.lang.ebnfLang.Expression_Exception#getRight()
   * @see #getExpression_Exception()
   * @generated
   */
  EReference getExpression_Exception_Right();

  /**
   * Returns the meta object for class '{@link it.unibg.ebnfwb.lang.ebnfLang.Expression_Repetition <em>Expression Repetition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression Repetition</em>'.
   * @see it.unibg.ebnfwb.lang.ebnfLang.Expression_Repetition
   * @generated
   */
  EClass getExpression_Repetition();

  /**
   * Returns the meta object for the attribute '{@link it.unibg.ebnfwb.lang.ebnfLang.Expression_Repetition#getRepetitions <em>Repetitions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Repetitions</em>'.
   * @see it.unibg.ebnfwb.lang.ebnfLang.Expression_Repetition#getRepetitions()
   * @see #getExpression_Repetition()
   * @generated
   */
  EAttribute getExpression_Repetition_Repetitions();

  /**
   * Returns the meta object for the containment reference '{@link it.unibg.ebnfwb.lang.ebnfLang.Expression_Repetition#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr</em>'.
   * @see it.unibg.ebnfwb.lang.ebnfLang.Expression_Repetition#getExpr()
   * @see #getExpression_Repetition()
   * @generated
   */
  EReference getExpression_Repetition_Expr();

  /**
   * Returns the meta object for class '{@link it.unibg.ebnfwb.lang.ebnfLang.Expression_Rule_Reference <em>Expression Rule Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression Rule Reference</em>'.
   * @see it.unibg.ebnfwb.lang.ebnfLang.Expression_Rule_Reference
   * @generated
   */
  EClass getExpression_Rule_Reference();

  /**
   * Returns the meta object for the reference '{@link it.unibg.ebnfwb.lang.ebnfLang.Expression_Rule_Reference#getRule <em>Rule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Rule</em>'.
   * @see it.unibg.ebnfwb.lang.ebnfLang.Expression_Rule_Reference#getRule()
   * @see #getExpression_Rule_Reference()
   * @generated
   */
  EReference getExpression_Rule_Reference_Rule();

  /**
   * Returns the meta object for class '{@link it.unibg.ebnfwb.lang.ebnfLang.Expression_Special_Sequence <em>Expression Special Sequence</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression Special Sequence</em>'.
   * @see it.unibg.ebnfwb.lang.ebnfLang.Expression_Special_Sequence
   * @generated
   */
  EClass getExpression_Special_Sequence();

  /**
   * Returns the meta object for the attribute '{@link it.unibg.ebnfwb.lang.ebnfLang.Expression_Special_Sequence#getText <em>Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Text</em>'.
   * @see it.unibg.ebnfwb.lang.ebnfLang.Expression_Special_Sequence#getText()
   * @see #getExpression_Special_Sequence()
   * @generated
   */
  EAttribute getExpression_Special_Sequence_Text();

  /**
   * Returns the meta object for class '{@link it.unibg.ebnfwb.lang.ebnfLang.Expression_Terminal_Symbol <em>Expression Terminal Symbol</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression Terminal Symbol</em>'.
   * @see it.unibg.ebnfwb.lang.ebnfLang.Expression_Terminal_Symbol
   * @generated
   */
  EClass getExpression_Terminal_Symbol();

  /**
   * Returns the meta object for the attribute '{@link it.unibg.ebnfwb.lang.ebnfLang.Expression_Terminal_Symbol#getText <em>Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Text</em>'.
   * @see it.unibg.ebnfwb.lang.ebnfLang.Expression_Terminal_Symbol#getText()
   * @see #getExpression_Terminal_Symbol()
   * @generated
   */
  EAttribute getExpression_Terminal_Symbol_Text();

  /**
   * Returns the meta object for class '{@link it.unibg.ebnfwb.lang.ebnfLang.Expression_Repetition_Group <em>Expression Repetition Group</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression Repetition Group</em>'.
   * @see it.unibg.ebnfwb.lang.ebnfLang.Expression_Repetition_Group
   * @generated
   */
  EClass getExpression_Repetition_Group();

  /**
   * Returns the meta object for the containment reference '{@link it.unibg.ebnfwb.lang.ebnfLang.Expression_Repetition_Group#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr</em>'.
   * @see it.unibg.ebnfwb.lang.ebnfLang.Expression_Repetition_Group#getExpr()
   * @see #getExpression_Repetition_Group()
   * @generated
   */
  EReference getExpression_Repetition_Group_Expr();

  /**
   * Returns the meta object for the attribute '{@link it.unibg.ebnfwb.lang.ebnfLang.Expression_Repetition_Group#isAtLeastOne <em>At Least One</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>At Least One</em>'.
   * @see it.unibg.ebnfwb.lang.ebnfLang.Expression_Repetition_Group#isAtLeastOne()
   * @see #getExpression_Repetition_Group()
   * @generated
   */
  EAttribute getExpression_Repetition_Group_AtLeastOne();

  /**
   * Returns the meta object for class '{@link it.unibg.ebnfwb.lang.ebnfLang.Expression_Optional_Group <em>Expression Optional Group</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression Optional Group</em>'.
   * @see it.unibg.ebnfwb.lang.ebnfLang.Expression_Optional_Group
   * @generated
   */
  EClass getExpression_Optional_Group();

  /**
   * Returns the meta object for the containment reference '{@link it.unibg.ebnfwb.lang.ebnfLang.Expression_Optional_Group#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr</em>'.
   * @see it.unibg.ebnfwb.lang.ebnfLang.Expression_Optional_Group#getExpr()
   * @see #getExpression_Optional_Group()
   * @generated
   */
  EReference getExpression_Optional_Group_Expr();

  /**
   * Returns the meta object for class '{@link it.unibg.ebnfwb.lang.ebnfLang.Expression_Group <em>Expression Group</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression Group</em>'.
   * @see it.unibg.ebnfwb.lang.ebnfLang.Expression_Group
   * @generated
   */
  EClass getExpression_Group();

  /**
   * Returns the meta object for the containment reference '{@link it.unibg.ebnfwb.lang.ebnfLang.Expression_Group#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr</em>'.
   * @see it.unibg.ebnfwb.lang.ebnfLang.Expression_Group#getExpr()
   * @see #getExpression_Group()
   * @generated
   */
  EReference getExpression_Group_Expr();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  EbnfLangFactory getEbnfLangFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link it.unibg.ebnfwb.lang.ebnfLang.impl.EbnfGrammarImpl <em>Ebnf Grammar</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.unibg.ebnfwb.lang.ebnfLang.impl.EbnfGrammarImpl
     * @see it.unibg.ebnfwb.lang.ebnfLang.impl.EbnfLangPackageImpl#getEbnfGrammar()
     * @generated
     */
    EClass EBNF_GRAMMAR = eINSTANCE.getEbnfGrammar();

    /**
     * The meta object literal for the '<em><b>Rules</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EBNF_GRAMMAR__RULES = eINSTANCE.getEbnfGrammar_Rules();

    /**
     * The meta object literal for the '{@link it.unibg.ebnfwb.lang.ebnfLang.impl.ProductionRuleImpl <em>Production Rule</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.unibg.ebnfwb.lang.ebnfLang.impl.ProductionRuleImpl
     * @see it.unibg.ebnfwb.lang.ebnfLang.impl.EbnfLangPackageImpl#getProductionRule()
     * @generated
     */
    EClass PRODUCTION_RULE = eINSTANCE.getProductionRule();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PRODUCTION_RULE__NAME = eINSTANCE.getProductionRule_Name();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PRODUCTION_RULE__EXPR = eINSTANCE.getProductionRule_Expr();

    /**
     * The meta object literal for the '{@link it.unibg.ebnfwb.lang.ebnfLang.impl.ExpressionImpl <em>Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.unibg.ebnfwb.lang.ebnfLang.impl.ExpressionImpl
     * @see it.unibg.ebnfwb.lang.ebnfLang.impl.EbnfLangPackageImpl#getExpression()
     * @generated
     */
    EClass EXPRESSION = eINSTANCE.getExpression();

    /**
     * The meta object literal for the '{@link it.unibg.ebnfwb.lang.ebnfLang.impl.Expression_AlternativeImpl <em>Expression Alternative</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.unibg.ebnfwb.lang.ebnfLang.impl.Expression_AlternativeImpl
     * @see it.unibg.ebnfwb.lang.ebnfLang.impl.EbnfLangPackageImpl#getExpression_Alternative()
     * @generated
     */
    EClass EXPRESSION_ALTERNATIVE = eINSTANCE.getExpression_Alternative();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION_ALTERNATIVE__ELEMENTS = eINSTANCE.getExpression_Alternative_Elements();

    /**
     * The meta object literal for the '{@link it.unibg.ebnfwb.lang.ebnfLang.impl.Expression_ConcatenationImpl <em>Expression Concatenation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.unibg.ebnfwb.lang.ebnfLang.impl.Expression_ConcatenationImpl
     * @see it.unibg.ebnfwb.lang.ebnfLang.impl.EbnfLangPackageImpl#getExpression_Concatenation()
     * @generated
     */
    EClass EXPRESSION_CONCATENATION = eINSTANCE.getExpression_Concatenation();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION_CONCATENATION__ELEMENTS = eINSTANCE.getExpression_Concatenation_Elements();

    /**
     * The meta object literal for the '{@link it.unibg.ebnfwb.lang.ebnfLang.impl.Expression_ExceptionImpl <em>Expression Exception</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.unibg.ebnfwb.lang.ebnfLang.impl.Expression_ExceptionImpl
     * @see it.unibg.ebnfwb.lang.ebnfLang.impl.EbnfLangPackageImpl#getExpression_Exception()
     * @generated
     */
    EClass EXPRESSION_EXCEPTION = eINSTANCE.getExpression_Exception();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION_EXCEPTION__LEFT = eINSTANCE.getExpression_Exception_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION_EXCEPTION__RIGHT = eINSTANCE.getExpression_Exception_Right();

    /**
     * The meta object literal for the '{@link it.unibg.ebnfwb.lang.ebnfLang.impl.Expression_RepetitionImpl <em>Expression Repetition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.unibg.ebnfwb.lang.ebnfLang.impl.Expression_RepetitionImpl
     * @see it.unibg.ebnfwb.lang.ebnfLang.impl.EbnfLangPackageImpl#getExpression_Repetition()
     * @generated
     */
    EClass EXPRESSION_REPETITION = eINSTANCE.getExpression_Repetition();

    /**
     * The meta object literal for the '<em><b>Repetitions</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXPRESSION_REPETITION__REPETITIONS = eINSTANCE.getExpression_Repetition_Repetitions();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION_REPETITION__EXPR = eINSTANCE.getExpression_Repetition_Expr();

    /**
     * The meta object literal for the '{@link it.unibg.ebnfwb.lang.ebnfLang.impl.Expression_Rule_ReferenceImpl <em>Expression Rule Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.unibg.ebnfwb.lang.ebnfLang.impl.Expression_Rule_ReferenceImpl
     * @see it.unibg.ebnfwb.lang.ebnfLang.impl.EbnfLangPackageImpl#getExpression_Rule_Reference()
     * @generated
     */
    EClass EXPRESSION_RULE_REFERENCE = eINSTANCE.getExpression_Rule_Reference();

    /**
     * The meta object literal for the '<em><b>Rule</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION_RULE_REFERENCE__RULE = eINSTANCE.getExpression_Rule_Reference_Rule();

    /**
     * The meta object literal for the '{@link it.unibg.ebnfwb.lang.ebnfLang.impl.Expression_Special_SequenceImpl <em>Expression Special Sequence</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.unibg.ebnfwb.lang.ebnfLang.impl.Expression_Special_SequenceImpl
     * @see it.unibg.ebnfwb.lang.ebnfLang.impl.EbnfLangPackageImpl#getExpression_Special_Sequence()
     * @generated
     */
    EClass EXPRESSION_SPECIAL_SEQUENCE = eINSTANCE.getExpression_Special_Sequence();

    /**
     * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXPRESSION_SPECIAL_SEQUENCE__TEXT = eINSTANCE.getExpression_Special_Sequence_Text();

    /**
     * The meta object literal for the '{@link it.unibg.ebnfwb.lang.ebnfLang.impl.Expression_Terminal_SymbolImpl <em>Expression Terminal Symbol</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.unibg.ebnfwb.lang.ebnfLang.impl.Expression_Terminal_SymbolImpl
     * @see it.unibg.ebnfwb.lang.ebnfLang.impl.EbnfLangPackageImpl#getExpression_Terminal_Symbol()
     * @generated
     */
    EClass EXPRESSION_TERMINAL_SYMBOL = eINSTANCE.getExpression_Terminal_Symbol();

    /**
     * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXPRESSION_TERMINAL_SYMBOL__TEXT = eINSTANCE.getExpression_Terminal_Symbol_Text();

    /**
     * The meta object literal for the '{@link it.unibg.ebnfwb.lang.ebnfLang.impl.Expression_Repetition_GroupImpl <em>Expression Repetition Group</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.unibg.ebnfwb.lang.ebnfLang.impl.Expression_Repetition_GroupImpl
     * @see it.unibg.ebnfwb.lang.ebnfLang.impl.EbnfLangPackageImpl#getExpression_Repetition_Group()
     * @generated
     */
    EClass EXPRESSION_REPETITION_GROUP = eINSTANCE.getExpression_Repetition_Group();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION_REPETITION_GROUP__EXPR = eINSTANCE.getExpression_Repetition_Group_Expr();

    /**
     * The meta object literal for the '<em><b>At Least One</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXPRESSION_REPETITION_GROUP__AT_LEAST_ONE = eINSTANCE.getExpression_Repetition_Group_AtLeastOne();

    /**
     * The meta object literal for the '{@link it.unibg.ebnfwb.lang.ebnfLang.impl.Expression_Optional_GroupImpl <em>Expression Optional Group</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.unibg.ebnfwb.lang.ebnfLang.impl.Expression_Optional_GroupImpl
     * @see it.unibg.ebnfwb.lang.ebnfLang.impl.EbnfLangPackageImpl#getExpression_Optional_Group()
     * @generated
     */
    EClass EXPRESSION_OPTIONAL_GROUP = eINSTANCE.getExpression_Optional_Group();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION_OPTIONAL_GROUP__EXPR = eINSTANCE.getExpression_Optional_Group_Expr();

    /**
     * The meta object literal for the '{@link it.unibg.ebnfwb.lang.ebnfLang.impl.Expression_GroupImpl <em>Expression Group</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.unibg.ebnfwb.lang.ebnfLang.impl.Expression_GroupImpl
     * @see it.unibg.ebnfwb.lang.ebnfLang.impl.EbnfLangPackageImpl#getExpression_Group()
     * @generated
     */
    EClass EXPRESSION_GROUP = eINSTANCE.getExpression_Group();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION_GROUP__EXPR = eINSTANCE.getExpression_Group_Expr();

  }

} //EbnfLangPackage
