/*
 * Test data strategy for package search.
 *
 * Generated by JMLUnitNG 1.4 (116/OpenJML-20131218-REV3178), 2017-10-14 19:42 -0400.
 * (do not modify this comment, it is used by JMLUnitNG clean-up routines)
 */

 package search;

import org.jmlspecs.jmlunitng.iterator.ObjectArrayIterator;
import org.jmlspecs.jmlunitng.iterator.RepeatedAccessIterator;
import org.jmlspecs.jmlunitng.strategy.IntStrategy;

/**
 * Test data strategy for package search. Provides
 * package-scope test values for type int.
 * 
 * @author JMLUnitNG 1.4 (116/OpenJML-20131218-REV3178)
 * @version 2017-10-14 19:42 -0400
 */
public /*@ nullable_by_default */ class PackageStrategy_int 
  extends IntStrategy {
  /**
   * @return package-scope values for type int.
   */
  public RepeatedAccessIterator<?> packageValues() {
    return new ObjectArrayIterator<Object>
    (new Object[] 
     { /* add package-scope int values or generators here */ });
  }
}
