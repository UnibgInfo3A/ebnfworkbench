/**
 * generated by Xtext 2.10.0
 */
package it.unibg.ebnfwb.lang.ebnfLang.impl;

import it.unibg.ebnfwb.lang.ebnfLang.EbnfLangPackage;
import it.unibg.ebnfwb.lang.ebnfLang.UserComment;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>User Comment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link it.unibg.ebnfwb.lang.ebnfLang.impl.UserCommentImpl#getContentComment <em>Content Comment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UserCommentImpl extends LineImpl implements UserComment
{
  /**
   * The default value of the '{@link #getContentComment() <em>Content Comment</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContentComment()
   * @generated
   * @ordered
   */
  protected static final String CONTENT_COMMENT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getContentComment() <em>Content Comment</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContentComment()
   * @generated
   * @ordered
   */
  protected String contentComment = CONTENT_COMMENT_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected UserCommentImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return EbnfLangPackage.Literals.USER_COMMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getContentComment()
  {
    return contentComment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setContentComment(String newContentComment)
  {
    String oldContentComment = contentComment;
    contentComment = newContentComment;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EbnfLangPackage.USER_COMMENT__CONTENT_COMMENT, oldContentComment, contentComment));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case EbnfLangPackage.USER_COMMENT__CONTENT_COMMENT:
        return getContentComment();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case EbnfLangPackage.USER_COMMENT__CONTENT_COMMENT:
        setContentComment((String)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case EbnfLangPackage.USER_COMMENT__CONTENT_COMMENT:
        setContentComment(CONTENT_COMMENT_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case EbnfLangPackage.USER_COMMENT__CONTENT_COMMENT:
        return CONTENT_COMMENT_EDEFAULT == null ? contentComment != null : !CONTENT_COMMENT_EDEFAULT.equals(contentComment);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (contentComment: ");
    result.append(contentComment);
    result.append(')');
    return result.toString();
  }

} //UserCommentImpl
