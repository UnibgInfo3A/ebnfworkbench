/**
 * generated by Xtext 2.10.0
 */
package it.unibg.ebnfwb.lang.ebnfLang;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression Repetition Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.unibg.ebnfwb.lang.ebnfLang.Expression_Repetition_Group#getExpr <em>Expr</em>}</li>
 *   <li>{@link it.unibg.ebnfwb.lang.ebnfLang.Expression_Repetition_Group#isAtLeastOne <em>At Least One</em>}</li>
 * </ul>
 *
 * @see it.unibg.ebnfwb.lang.ebnfLang.EbnfLangPackage#getExpression_Repetition_Group()
 * @model
 * @generated
 */
public interface Expression_Repetition_Group extends Expression
{
  /**
   * Returns the value of the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expr</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expr</em>' containment reference.
   * @see #setExpr(Expression)
   * @see it.unibg.ebnfwb.lang.ebnfLang.EbnfLangPackage#getExpression_Repetition_Group_Expr()
   * @model containment="true"
   * @generated
   */
  Expression getExpr();

  /**
   * Sets the value of the '{@link it.unibg.ebnfwb.lang.ebnfLang.Expression_Repetition_Group#getExpr <em>Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expr</em>' containment reference.
   * @see #getExpr()
   * @generated
   */
  void setExpr(Expression value);

  /**
   * Returns the value of the '<em><b>At Least One</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>At Least One</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>At Least One</em>' attribute.
   * @see #setAtLeastOne(boolean)
   * @see it.unibg.ebnfwb.lang.ebnfLang.EbnfLangPackage#getExpression_Repetition_Group_AtLeastOne()
   * @model
   * @generated
   */
  boolean isAtLeastOne();

  /**
   * Sets the value of the '{@link it.unibg.ebnfwb.lang.ebnfLang.Expression_Repetition_Group#isAtLeastOne <em>At Least One</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>At Least One</em>' attribute.
   * @see #isAtLeastOne()
   * @generated
   */
  void setAtLeastOne(boolean value);

} // Expression_Repetition_Group
