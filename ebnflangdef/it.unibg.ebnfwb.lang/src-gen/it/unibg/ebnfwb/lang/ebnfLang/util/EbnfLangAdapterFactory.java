/**
 * generated by Xtext 2.10.0
 */
package it.unibg.ebnfwb.lang.ebnfLang.util;

import it.unibg.ebnfwb.lang.ebnfLang.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see it.unibg.ebnfwb.lang.ebnfLang.EbnfLangPackage
 * @generated
 */
public class EbnfLangAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static EbnfLangPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EbnfLangAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = EbnfLangPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EbnfLangSwitch<Adapter> modelSwitch =
    new EbnfLangSwitch<Adapter>()
    {
      @Override
      public Adapter caseEbnfGrammar(EbnfGrammar object)
      {
        return createEbnfGrammarAdapter();
      }
      @Override
      public Adapter caseProductionRule(ProductionRule object)
      {
        return createProductionRuleAdapter();
      }
      @Override
      public Adapter caseExpression(Expression object)
      {
        return createExpressionAdapter();
      }
      @Override
      public Adapter caseExpression_Alternative(Expression_Alternative object)
      {
        return createExpression_AlternativeAdapter();
      }
      @Override
      public Adapter caseExpression_Concatenation(Expression_Concatenation object)
      {
        return createExpression_ConcatenationAdapter();
      }
      @Override
      public Adapter caseExpression_Exception(Expression_Exception object)
      {
        return createExpression_ExceptionAdapter();
      }
      @Override
      public Adapter caseExpression_Repetition(Expression_Repetition object)
      {
        return createExpression_RepetitionAdapter();
      }
      @Override
      public Adapter caseExpression_Rule_Reference(Expression_Rule_Reference object)
      {
        return createExpression_Rule_ReferenceAdapter();
      }
      @Override
      public Adapter caseExpression_Special_Sequence(Expression_Special_Sequence object)
      {
        return createExpression_Special_SequenceAdapter();
      }
      @Override
      public Adapter caseExpression_Terminal_Symbol(Expression_Terminal_Symbol object)
      {
        return createExpression_Terminal_SymbolAdapter();
      }
      @Override
      public Adapter caseExpression_Repetition_Group(Expression_Repetition_Group object)
      {
        return createExpression_Repetition_GroupAdapter();
      }
      @Override
      public Adapter caseExpression_Optional_Group(Expression_Optional_Group object)
      {
        return createExpression_Optional_GroupAdapter();
      }
      @Override
      public Adapter caseExpression_Group(Expression_Group object)
      {
        return createExpression_GroupAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link it.unibg.ebnfwb.lang.ebnfLang.EbnfGrammar <em>Ebnf Grammar</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.unibg.ebnfwb.lang.ebnfLang.EbnfGrammar
   * @generated
   */
  public Adapter createEbnfGrammarAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.unibg.ebnfwb.lang.ebnfLang.ProductionRule <em>Production Rule</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.unibg.ebnfwb.lang.ebnfLang.ProductionRule
   * @generated
   */
  public Adapter createProductionRuleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.unibg.ebnfwb.lang.ebnfLang.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.unibg.ebnfwb.lang.ebnfLang.Expression
   * @generated
   */
  public Adapter createExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.unibg.ebnfwb.lang.ebnfLang.Expression_Alternative <em>Expression Alternative</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.unibg.ebnfwb.lang.ebnfLang.Expression_Alternative
   * @generated
   */
  public Adapter createExpression_AlternativeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.unibg.ebnfwb.lang.ebnfLang.Expression_Concatenation <em>Expression Concatenation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.unibg.ebnfwb.lang.ebnfLang.Expression_Concatenation
   * @generated
   */
  public Adapter createExpression_ConcatenationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.unibg.ebnfwb.lang.ebnfLang.Expression_Exception <em>Expression Exception</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.unibg.ebnfwb.lang.ebnfLang.Expression_Exception
   * @generated
   */
  public Adapter createExpression_ExceptionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.unibg.ebnfwb.lang.ebnfLang.Expression_Repetition <em>Expression Repetition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.unibg.ebnfwb.lang.ebnfLang.Expression_Repetition
   * @generated
   */
  public Adapter createExpression_RepetitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.unibg.ebnfwb.lang.ebnfLang.Expression_Rule_Reference <em>Expression Rule Reference</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.unibg.ebnfwb.lang.ebnfLang.Expression_Rule_Reference
   * @generated
   */
  public Adapter createExpression_Rule_ReferenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.unibg.ebnfwb.lang.ebnfLang.Expression_Special_Sequence <em>Expression Special Sequence</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.unibg.ebnfwb.lang.ebnfLang.Expression_Special_Sequence
   * @generated
   */
  public Adapter createExpression_Special_SequenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.unibg.ebnfwb.lang.ebnfLang.Expression_Terminal_Symbol <em>Expression Terminal Symbol</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.unibg.ebnfwb.lang.ebnfLang.Expression_Terminal_Symbol
   * @generated
   */
  public Adapter createExpression_Terminal_SymbolAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.unibg.ebnfwb.lang.ebnfLang.Expression_Repetition_Group <em>Expression Repetition Group</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.unibg.ebnfwb.lang.ebnfLang.Expression_Repetition_Group
   * @generated
   */
  public Adapter createExpression_Repetition_GroupAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.unibg.ebnfwb.lang.ebnfLang.Expression_Optional_Group <em>Expression Optional Group</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.unibg.ebnfwb.lang.ebnfLang.Expression_Optional_Group
   * @generated
   */
  public Adapter createExpression_Optional_GroupAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.unibg.ebnfwb.lang.ebnfLang.Expression_Group <em>Expression Group</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.unibg.ebnfwb.lang.ebnfLang.Expression_Group
   * @generated
   */
  public Adapter createExpression_GroupAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //EbnfLangAdapterFactory
