/**
 * generated by Xtext 2.10.0
 */
package it.unibg.ebnfwb.lang.ebnfLang.impl;

import it.unibg.ebnfwb.lang.ebnfLang.EbnfGrammar;
import it.unibg.ebnfwb.lang.ebnfLang.EbnfLangFactory;
import it.unibg.ebnfwb.lang.ebnfLang.EbnfLangPackage;
import it.unibg.ebnfwb.lang.ebnfLang.Expression;
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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EbnfLangPackageImpl extends EPackageImpl implements EbnfLangPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ebnfGrammarEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass productionRuleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass expressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass expression_AlternativeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass expression_ConcatenationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass expression_ExceptionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass expression_RepetitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass expression_Rule_ReferenceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass expression_Special_SequenceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass expression_Terminal_SymbolEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass expression_Repetition_GroupEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass expression_Optional_GroupEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass expression_GroupEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see it.unibg.ebnfwb.lang.ebnfLang.EbnfLangPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private EbnfLangPackageImpl()
  {
    super(eNS_URI, EbnfLangFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link EbnfLangPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static EbnfLangPackage init()
  {
    if (isInited) return (EbnfLangPackage)EPackage.Registry.INSTANCE.getEPackage(EbnfLangPackage.eNS_URI);

    // Obtain or create and register package
    EbnfLangPackageImpl theEbnfLangPackage = (EbnfLangPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof EbnfLangPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new EbnfLangPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theEbnfLangPackage.createPackageContents();

    // Initialize created meta-data
    theEbnfLangPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theEbnfLangPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(EbnfLangPackage.eNS_URI, theEbnfLangPackage);
    return theEbnfLangPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEbnfGrammar()
  {
    return ebnfGrammarEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEbnfGrammar_Rules()
  {
    return (EReference)ebnfGrammarEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getProductionRule()
  {
    return productionRuleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getProductionRule_Name()
  {
    return (EAttribute)productionRuleEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProductionRule_Expr()
  {
    return (EReference)productionRuleEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExpression()
  {
    return expressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExpression_Alternative()
  {
    return expression_AlternativeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpression_Alternative_Elements()
  {
    return (EReference)expression_AlternativeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExpression_Concatenation()
  {
    return expression_ConcatenationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpression_Concatenation_Elements()
  {
    return (EReference)expression_ConcatenationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExpression_Exception()
  {
    return expression_ExceptionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpression_Exception_Left()
  {
    return (EReference)expression_ExceptionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpression_Exception_Right()
  {
    return (EReference)expression_ExceptionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExpression_Repetition()
  {
    return expression_RepetitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getExpression_Repetition_Repetitions()
  {
    return (EAttribute)expression_RepetitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpression_Repetition_Expr()
  {
    return (EReference)expression_RepetitionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExpression_Rule_Reference()
  {
    return expression_Rule_ReferenceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpression_Rule_Reference_Rule()
  {
    return (EReference)expression_Rule_ReferenceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExpression_Special_Sequence()
  {
    return expression_Special_SequenceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getExpression_Special_Sequence_Text()
  {
    return (EAttribute)expression_Special_SequenceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExpression_Terminal_Symbol()
  {
    return expression_Terminal_SymbolEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getExpression_Terminal_Symbol_Text()
  {
    return (EAttribute)expression_Terminal_SymbolEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExpression_Repetition_Group()
  {
    return expression_Repetition_GroupEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpression_Repetition_Group_Expr()
  {
    return (EReference)expression_Repetition_GroupEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getExpression_Repetition_Group_AtLeastOne()
  {
    return (EAttribute)expression_Repetition_GroupEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExpression_Optional_Group()
  {
    return expression_Optional_GroupEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpression_Optional_Group_Expr()
  {
    return (EReference)expression_Optional_GroupEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExpression_Group()
  {
    return expression_GroupEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpression_Group_Expr()
  {
    return (EReference)expression_GroupEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EbnfLangFactory getEbnfLangFactory()
  {
    return (EbnfLangFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    ebnfGrammarEClass = createEClass(EBNF_GRAMMAR);
    createEReference(ebnfGrammarEClass, EBNF_GRAMMAR__RULES);

    productionRuleEClass = createEClass(PRODUCTION_RULE);
    createEAttribute(productionRuleEClass, PRODUCTION_RULE__NAME);
    createEReference(productionRuleEClass, PRODUCTION_RULE__EXPR);

    expressionEClass = createEClass(EXPRESSION);

    expression_AlternativeEClass = createEClass(EXPRESSION_ALTERNATIVE);
    createEReference(expression_AlternativeEClass, EXPRESSION_ALTERNATIVE__ELEMENTS);

    expression_ConcatenationEClass = createEClass(EXPRESSION_CONCATENATION);
    createEReference(expression_ConcatenationEClass, EXPRESSION_CONCATENATION__ELEMENTS);

    expression_ExceptionEClass = createEClass(EXPRESSION_EXCEPTION);
    createEReference(expression_ExceptionEClass, EXPRESSION_EXCEPTION__LEFT);
    createEReference(expression_ExceptionEClass, EXPRESSION_EXCEPTION__RIGHT);

    expression_RepetitionEClass = createEClass(EXPRESSION_REPETITION);
    createEAttribute(expression_RepetitionEClass, EXPRESSION_REPETITION__REPETITIONS);
    createEReference(expression_RepetitionEClass, EXPRESSION_REPETITION__EXPR);

    expression_Rule_ReferenceEClass = createEClass(EXPRESSION_RULE_REFERENCE);
    createEReference(expression_Rule_ReferenceEClass, EXPRESSION_RULE_REFERENCE__RULE);

    expression_Special_SequenceEClass = createEClass(EXPRESSION_SPECIAL_SEQUENCE);
    createEAttribute(expression_Special_SequenceEClass, EXPRESSION_SPECIAL_SEQUENCE__TEXT);

    expression_Terminal_SymbolEClass = createEClass(EXPRESSION_TERMINAL_SYMBOL);
    createEAttribute(expression_Terminal_SymbolEClass, EXPRESSION_TERMINAL_SYMBOL__TEXT);

    expression_Repetition_GroupEClass = createEClass(EXPRESSION_REPETITION_GROUP);
    createEReference(expression_Repetition_GroupEClass, EXPRESSION_REPETITION_GROUP__EXPR);
    createEAttribute(expression_Repetition_GroupEClass, EXPRESSION_REPETITION_GROUP__AT_LEAST_ONE);

    expression_Optional_GroupEClass = createEClass(EXPRESSION_OPTIONAL_GROUP);
    createEReference(expression_Optional_GroupEClass, EXPRESSION_OPTIONAL_GROUP__EXPR);

    expression_GroupEClass = createEClass(EXPRESSION_GROUP);
    createEReference(expression_GroupEClass, EXPRESSION_GROUP__EXPR);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    expression_AlternativeEClass.getESuperTypes().add(this.getExpression());
    expression_ConcatenationEClass.getESuperTypes().add(this.getExpression());
    expression_ExceptionEClass.getESuperTypes().add(this.getExpression());
    expression_RepetitionEClass.getESuperTypes().add(this.getExpression());
    expression_Rule_ReferenceEClass.getESuperTypes().add(this.getExpression());
    expression_Special_SequenceEClass.getESuperTypes().add(this.getExpression());
    expression_Terminal_SymbolEClass.getESuperTypes().add(this.getExpression());
    expression_Repetition_GroupEClass.getESuperTypes().add(this.getExpression());
    expression_Optional_GroupEClass.getESuperTypes().add(this.getExpression());
    expression_GroupEClass.getESuperTypes().add(this.getExpression());

    // Initialize classes and features; add operations and parameters
    initEClass(ebnfGrammarEClass, EbnfGrammar.class, "EbnfGrammar", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEbnfGrammar_Rules(), this.getProductionRule(), null, "rules", null, 0, -1, EbnfGrammar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(productionRuleEClass, ProductionRule.class, "ProductionRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getProductionRule_Name(), ecorePackage.getEString(), "name", null, 0, 1, ProductionRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProductionRule_Expr(), this.getExpression(), null, "expr", null, 0, 1, ProductionRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(expressionEClass, Expression.class, "Expression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(expression_AlternativeEClass, Expression_Alternative.class, "Expression_Alternative", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getExpression_Alternative_Elements(), this.getExpression(), null, "elements", null, 0, -1, Expression_Alternative.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(expression_ConcatenationEClass, Expression_Concatenation.class, "Expression_Concatenation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getExpression_Concatenation_Elements(), this.getExpression(), null, "elements", null, 0, -1, Expression_Concatenation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(expression_ExceptionEClass, Expression_Exception.class, "Expression_Exception", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getExpression_Exception_Left(), this.getExpression(), null, "left", null, 0, 1, Expression_Exception.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExpression_Exception_Right(), this.getExpression(), null, "right", null, 0, 1, Expression_Exception.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(expression_RepetitionEClass, Expression_Repetition.class, "Expression_Repetition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getExpression_Repetition_Repetitions(), ecorePackage.getEInt(), "repetitions", null, 0, 1, Expression_Repetition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExpression_Repetition_Expr(), this.getExpression(), null, "expr", null, 0, 1, Expression_Repetition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(expression_Rule_ReferenceEClass, Expression_Rule_Reference.class, "Expression_Rule_Reference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getExpression_Rule_Reference_Rule(), this.getProductionRule(), null, "rule", null, 0, 1, Expression_Rule_Reference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(expression_Special_SequenceEClass, Expression_Special_Sequence.class, "Expression_Special_Sequence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getExpression_Special_Sequence_Text(), ecorePackage.getEString(), "text", null, 0, 1, Expression_Special_Sequence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(expression_Terminal_SymbolEClass, Expression_Terminal_Symbol.class, "Expression_Terminal_Symbol", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getExpression_Terminal_Symbol_Text(), ecorePackage.getEString(), "text", null, 0, 1, Expression_Terminal_Symbol.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(expression_Repetition_GroupEClass, Expression_Repetition_Group.class, "Expression_Repetition_Group", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getExpression_Repetition_Group_Expr(), this.getExpression(), null, "expr", null, 0, 1, Expression_Repetition_Group.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getExpression_Repetition_Group_AtLeastOne(), ecorePackage.getEBoolean(), "atLeastOne", null, 0, 1, Expression_Repetition_Group.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(expression_Optional_GroupEClass, Expression_Optional_Group.class, "Expression_Optional_Group", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getExpression_Optional_Group_Expr(), this.getExpression(), null, "expr", null, 0, 1, Expression_Optional_Group.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(expression_GroupEClass, Expression_Group.class, "Expression_Group", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getExpression_Group_Expr(), this.getExpression(), null, "expr", null, 0, 1, Expression_Group.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //EbnfLangPackageImpl