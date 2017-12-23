/*
 * Test data strategy for Graph.
 *
 * Generated by JMLUnitNG 1.4 (116/OpenJML-20131218-REV3178), 2017-10-21 23:19 -0400.
 * (do not modify this comment, it is used by JMLUnitNG clean-up routines)
 */

import java.util.LinkedList;
import java.util.List;

import org.jmlspecs.jmlunitng.iterator.InstantiationIterator;
import org.jmlspecs.jmlunitng.iterator.IteratorAdapter;
import org.jmlspecs.jmlunitng.iterator.NonNullMultiIterator;
import org.jmlspecs.jmlunitng.iterator.ObjectArrayIterator;
import org.jmlspecs.jmlunitng.iterator.RepeatedAccessIterator;
import org.jmlspecs.jmlunitng.strategy.ObjectStrategy;

/**
 * Test data strategy for Graph. Provides
 * instances of Graph for testing, using
 * parameters from constructor tests.
 * 
 * @author JMLUnitNG 1.4 (116/OpenJML-20131218-REV3178)
 * @version 2017-10-21 23:19 -0400
 */
public /*@ nullable_by_default */ class Graph_InstanceStrategy extends ObjectStrategy {
  /**
   * @return local-scope instances of Graph.
   */
  public RepeatedAccessIterator<?> localValues() {
    return new ObjectArrayIterator<Object>
    (new Object[]
     { /* add Graph values or generators here */ });
  }

  /**
   * @return default instances of Graph, generated
   *  using constructor test parameters.
   */ 
  public RepeatedAccessIterator<Graph> defaultValues() {
    final List<RepeatedAccessIterator<Graph>> iters = 
      new LinkedList<RepeatedAccessIterator<Graph>>();

    // an instantiation iterator for the default constructor
    // (if there isn't one, it will fail silently)
    iters.add(new InstantiationIterator<Graph>
      (Graph.class, 
       new Class<?>[0], 
       new ObjectArrayIterator<Object[]>(new Object[][]{{}})));

    // parameters for method Graph(Graph)
    iters.add(new InstantiationIterator<Graph>
      (Graph.class, 
       new Class<?>[]
       {Graph.class},
       Graph_JML_Test.p_Graph__Graph_source__0().wrapped()));

    return new NonNullMultiIterator<Graph>(iters);
  }

  /**
   * Constructor. The boolean parameter to <code>setReflective</code>
   * determines whether or not reflection will be used to generate
   * test objects, and the int parameter to <code>setMaxRecursionDepth</code>
   * determines how many levels reflective generation of self-referential classes
   * will recurse.
   *
   * @see ObjectStrategy#setReflective(boolean)
   * @see ObjectStrategy#setMaxRecursionDepth(int)
   */
  public Graph_InstanceStrategy() {
    super(Graph.class);
    setReflective(false);
    // uncomment to control the maximum reflective instantiation
    // recursion depth, 0 by default
    // setMaxRecursionDepth(0);
  }
}