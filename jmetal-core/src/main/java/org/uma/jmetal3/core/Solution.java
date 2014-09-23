package org.uma.jmetal3.core;

import org.uma.jmetal3.encoding.attributes.AlgorithmAttributes;

/**
 * Created by Antonio on 03/09/14.
 */
public interface Solution<T> {
  public void setObjective(int index, double value) ;
  public double getObjective(int index) ;

  public T getVariableValue(int index) ;
  public void setVariableValue(int index, T value) ;

  public int getNumberOfVariables() ;
  public int getNumberOfObjectives() ;

  public double getOverallConstraintViolationDegree() ;
  public void setOverallConstraintViolationDegree(double violationDegree) ;

  public Solution<?> copy() ;

  public AlgorithmAttributes getAlgorithmAttributes() ;

  public void setAttribute(Object key, Object value) ;
  public Object getAttribute(Object key) ;
 }
