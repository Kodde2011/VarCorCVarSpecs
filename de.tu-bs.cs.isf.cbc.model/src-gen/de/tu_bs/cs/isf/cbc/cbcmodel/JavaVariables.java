/**
 */
package de.tu_bs.cs.isf.cbc.cbcmodel;

import de.tu_bs.cs.isf.cbc.cbcclass.model.cbcclass.Field;
import de.tu_bs.cs.isf.cbc.cbcclass.model.cbcclass.Parameter;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Java Variables</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.tu_bs.cs.isf.cbc.cbcmodel.JavaVariables#getVariables <em>Variables</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.cbc.cbcmodel.JavaVariables#getFields <em>Fields</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.cbc.cbcmodel.JavaVariables#getParams <em>Params</em>}</li>
 * </ul>
 *
 * @see de.tu_bs.cs.isf.cbc.cbcmodel.CbcmodelPackage#getJavaVariables()
 * @model
 * @generated
 */
public interface JavaVariables extends EObject {
	/**
	 * Returns the value of the '<em><b>Variables</b></em>' containment reference list.
	 * The list contents are of type {@link de.tu_bs.cs.isf.cbc.cbcmodel.JavaVariable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variables</em>' containment reference list.
	 * @see de.tu_bs.cs.isf.cbc.cbcmodel.CbcmodelPackage#getJavaVariables_Variables()
	 * @model containment="true"
	 * @generated
	 */
	EList<JavaVariable> getVariables();

	/**
	 * Returns the value of the '<em><b>Fields</b></em>' reference list.
	 * The list contents are of type {@link de.tu_bs.cs.isf.cbc.cbcclass.model.cbcclass.Field}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fields</em>' reference list.
	 * @see de.tu_bs.cs.isf.cbc.cbcmodel.CbcmodelPackage#getJavaVariables_Fields()
	 * @model
	 * @generated
	 */
	EList<Field> getFields();

	/**
	 * Returns the value of the '<em><b>Params</b></em>' containment reference list.
	 * The list contents are of type {@link de.tu_bs.cs.isf.cbc.cbcclass.model.cbcclass.Parameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Params</em>' containment reference list.
	 * @see de.tu_bs.cs.isf.cbc.cbcmodel.CbcmodelPackage#getJavaVariables_Params()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parameter> getParams();

} // JavaVariables
