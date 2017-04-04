/**
 * generated by Xtext 2.10.0
 */
package it.unibg.ebnfwb.lang.ebnfLang;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see it.unibg.ebnfwb.lang.ebnfLang.EbnfLangPackage
 * @generated
 */
public interface EbnfLangFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  EbnfLangFactory eINSTANCE = it.unibg.ebnfwb.lang.ebnfLang.impl.EbnfLangFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Ebnf Grammar</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ebnf Grammar</em>'.
   * @generated
   */
  EbnfGrammar createEbnfGrammar();

  /**
   * Returns a new object of class '<em>Line</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Line</em>'.
   * @generated
   */
  Line createLine();

  /**
   * Returns a new object of class '<em>Production Rule</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Production Rule</em>'.
   * @generated
   */
  ProductionRule createProductionRule();

  /**
   * Returns a new object of class '<em>Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expression</em>'.
   * @generated
   */
  Expression createExpression();

  /**
   * Returns a new object of class '<em>User Comment</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>User Comment</em>'.
   * @generated
   */
  UserComment createUserComment();

  /**
   * Returns a new object of class '<em>Expression Alternative</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expression Alternative</em>'.
   * @generated
   */
  Expression_Alternative createExpression_Alternative();

  /**
   * Returns a new object of class '<em>Expression Concatenation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expression Concatenation</em>'.
   * @generated
   */
  Expression_Concatenation createExpression_Concatenation();

  /**
   * Returns a new object of class '<em>Expression Exception</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expression Exception</em>'.
   * @generated
   */
  Expression_Exception createExpression_Exception();

  /**
   * Returns a new object of class '<em>Expression Repetition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expression Repetition</em>'.
   * @generated
   */
  Expression_Repetition createExpression_Repetition();

  /**
   * Returns a new object of class '<em>Expression Rule Reference</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expression Rule Reference</em>'.
   * @generated
   */
  Expression_Rule_Reference createExpression_Rule_Reference();

  /**
   * Returns a new object of class '<em>Expression Special Sequence</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expression Special Sequence</em>'.
   * @generated
   */
  Expression_Special_Sequence createExpression_Special_Sequence();

  /**
   * Returns a new object of class '<em>Expression Terminal Symbol</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expression Terminal Symbol</em>'.
   * @generated
   */
  Expression_Terminal_Symbol createExpression_Terminal_Symbol();

  /**
   * Returns a new object of class '<em>Expression Repetition Group</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expression Repetition Group</em>'.
   * @generated
   */
  Expression_Repetition_Group createExpression_Repetition_Group();

  /**
   * Returns a new object of class '<em>Expression Optional Group</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expression Optional Group</em>'.
   * @generated
   */
  Expression_Optional_Group createExpression_Optional_Group();

  /**
   * Returns a new object of class '<em>Expression Group</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expression Group</em>'.
   * @generated
   */
  Expression_Group createExpression_Group();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  EbnfLangPackage getEbnfLangPackage();

} //EbnfLangFactory
