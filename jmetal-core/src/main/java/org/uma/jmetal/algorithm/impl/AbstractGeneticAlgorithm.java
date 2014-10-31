package org.uma.jmetal.algorithm.impl;

import org.uma.jmetal.algorithm.Algorithm;
import org.uma.jmetal.operator.CrossoverOperator;
import org.uma.jmetal.operator.MutationOperator;
import org.uma.jmetal.operator.SelectionOperator;
import org.uma.jmetal.problem.Problem;
import org.uma.jmetal.solution.Solution;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ajnebro on 26/10/14.
 */
public abstract class AbstractGeneticAlgorithm<Result> extends AbstractEvolutionaryAlgorithm <Result> {
  protected SelectionOperator<List<Solution>, Solution> selectionOperator ;
  protected CrossoverOperator<List<Solution>, List<Solution>> crossoverOperator ;
  protected MutationOperator<Solution> mutationOperator ;
}
