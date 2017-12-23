/*
 * Test data strategy for Graph.
 *
 * Generated by JMLUnitNG 1.4 (116/OpenJML-20131218-REV3178), 2017-10-21 23:19 -0400.
 * (do not modify this comment, it is used by JMLUnitNG clean-up routines)
 */

import org.jmlspecs.jmlunitng.iterator.ObjectArrayIterator;
import org.jmlspecs.jmlunitng.iterator.RepeatedAccessIterator;

/**
 * Test data strategy for Graph. Provides
 * test values for parameter "Graph source" 
 * of method "Graph(Graph)". 
 * 
 * @author JMLUnitNG 1.4 (116/OpenJML-20131218-REV3178)
 * @version 2017-10-21 23:19 -0400
 */
public /*@ nullable_by_default */ class Graph_Graph__Graph_source__0__source
  extends Graph_ClassStrategy_Graph {
  /**
   * @return local-scope values for parameter 
   *  "Graph source".
   */
  public RepeatedAccessIterator<?> localValues() {
    return new ObjectArrayIterator<Object>
    (new Object[]
     { /* add local-scope Graph values or generators here */ });
  }

  /**
   * Constructor.
   * The use of reflection can be controlled here for  
   * "Graph source" of method "Graph(Graph)" 
   * by changing the parameters to <code>setReflective</code>
   * and <code>setMaxRecursionDepth<code>.
   * In addition, the data generators used can be changed by adding 
   * additional data class lines, or by removing some of the automatically 
   * generated ones. Since this is the lowest level of strategy, the 
   * behavior will be exactly as you specify here if you clear the existing 
   * list of classes first.
   *
   * @see NonPrimitiveStrategy#addDataClass(Class<?>)
   * @see NonPrimitiveStrategy#clearDataClasses()
   * @see ObjectStrategy#setReflective(boolean)
   * @see ObjectStrategy#setMaxRecursionDepth(int)
   */
  public Graph_Graph__Graph_source__0__source() {
    super();
    // uncomment to control the maximum reflective instantiation
    // recursion depth, 0 by default
    // setMaxRecursionDepth(0);
  }
}
