/*
 * Test Oracle Class for Graph
 * For Use With OpenJML RAC
 *
 * Generated by JMLUnitNG 1.4 (116/OpenJML-20131218-REV3178), 2017-10-21 23:19 -0400.
 * (do not modify this comment, it is used by JMLUnitNG clean-up routines)
 */

import java.io.PrintWriter;
import java.util.ArrayList;

import org.jmlspecs.jmlunitng.iterator.IteratorWrapper;
import org.jmlspecs.jmlunitng.iterator.ParameterArrayIterator;
import org.jmlspecs.jmlunitng.testng.BasicTestListener;
import org.jmlspecs.jmlunitng.testng.PreconditionSkipException;
import org.testng.Assert;
import org.testng.TestException;
import org.testng.TestNG;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.xml.XmlSuite;

import org.jmlspecs.utils.JmlAssertionError;
import org.jmlspecs.utils.Utils; 

/**
 * Test oracles generated by JMLUnitNG for OpenJML RAC of class
 * Graph.
 * 
 * @author JMLUnitNG 1.4 (116/OpenJML-20131218-REV3178)
 * @version 2017-10-21 23:19 -0400
 */

public /*@ nullable_by_default */ class Graph_JML_Test {
  /**
   * The main method. Allows the tests to be run without a testng.xml or
   * the use of the TestNG executable/plugin.
   *
   * @param the_args Command line arguments, ignored.
   */
  public static void main(String[] the_args) {
    final TestNG testng_runner = new TestNG();
    final Class<?>[] classes = {Graph_JML_Test.class};
    final BasicTestListener listener =
      new BasicTestListener(new PrintWriter(System.out));
    testng_runner.setUseDefaultListeners(false);
    testng_runner.setXmlSuites(new ArrayList<XmlSuite>());
    testng_runner.setTestClasses(classes);
    testng_runner.addListener(listener);
    testng_runner.run();
  }

  /** 
   * A test to ensure that RAC is enabled before running other tests;
   * this also turns on RAC exceptions if they were not already turned on.
   */
  @Test
  public void test_racEnabled() {
    Utils.useExceptions = true;
    Assert.assertFalse
    (Utils.isRACCompiled(Graph_JML_Test.class),
     "JMLUnitNG tests must not be RAC-compiled when using OpenJML RAC.");
    Assert.assertTrue
    (Utils.isRACCompiled(Graph.class),
     "JMLUnitNG tests can only run on RAC-compiled code.");
  } 

  /**
   * A test for method getNeighbors.
   *
   * @param the_test_object The Graph to call the test method on.
   * @param v The Object to be passed.
   */
  @Test(dependsOnMethods = { "test_racEnabled" }, 
        dataProvider = "p_getNeighbors__Object_v__10")
  public void test_getNeighbors__Object_v__10
  (final Graph the_test_object, 
   final java.lang.Object v) {
      if (the_test_object == null) {
        throw new PreconditionSkipException
        ("could not construct an object to test");
      }
    try {
      the_test_object.getNeighbors(v);
    }
    catch (final JmlAssertionError $e) {
      if ($e.jmlAssertionType.equals("Precondition") &&
          $e.getStackTrace().length >= 4 &&
          "test_getNeighbors__Object_v__10".equals($e.getStackTrace()[3].getMethodName())) {
        // meaningless test because precondition failed
        throw new PreconditionSkipException($e.getMessage());
      } else {
        // test failure because something else failed
        throw new TestException($e.getMessage());
      }
    } catch (final Throwable $e) {
      // test failure for some reason other than assertion violation
      throw new TestException($e.getMessage());
    }
  }

  /**
   * A test for a constructor.
   *
   */
  @Test(dependsOnMethods = { "test_racEnabled" })
  public void test_Graph__0
  () {
    try {
      new Graph();
    }
    catch (final JmlAssertionError $e) {
      if ($e.jmlAssertionType.equals("Precondition") &&
          $e.getStackTrace().length >= 4 &&
          "test_Graph__0".equals($e.getStackTrace()[3].getMethodName())) {
        // meaningless test because precondition failed
        throw new PreconditionSkipException($e.getMessage());
      } else {
        // test failure because something else failed
        throw new TestException($e.getMessage());
      }
    } catch (final Throwable $e) {
      // test failure for some reason other than assertion violation
      throw new TestException($e.getMessage());
    }
  }

  /**
   * A test for method subtractGraphs.
   *
   * @param the_test_object The Graph to call the test method on.
   * @param g1 The Graph to be passed.
   * @param g2 The Graph to be passed.
   */
  @Test(dependsOnMethods = { "test_racEnabled" }, 
        dataProvider = "p_subtractGraphs__Graph_g1__Graph_g2__0")
  public void test_static_subtractGraphs__Graph_g1__Graph_g2__0
  ( final Graph g1, final Graph g2) {
    try {
      Graph.subtractGraphs(g1, g2);
    }
    catch (final JmlAssertionError $e) {
      if ($e.jmlAssertionType.equals("Precondition") &&
          $e.getStackTrace().length >= 4 &&
          "test_static_subtractGraphs__Graph_g1__Graph_g2__0".equals($e.getStackTrace()[3].getMethodName())) {
        // meaningless test because precondition failed
        throw new PreconditionSkipException($e.getMessage());
      } else {
        // test failure because something else failed
        throw new TestException($e.getMessage());
      }
    } catch (final Throwable $e) {
      // test failure for some reason other than assertion violation
      throw new TestException($e.getMessage());
    }
  }

  /**
   * A test for method hasEdge.
   *
   * @param the_test_object The Graph to call the test method on.
   * @param v1 The Object to be passed.
   * @param v2 The Object to be passed.
   */
  @Test(dependsOnMethods = { "test_racEnabled" }, 
        dataProvider = "p_hasEdge__Object_v1__Object_v2__20")
  public void test_hasEdge__Object_v1__Object_v2__20
  (final Graph the_test_object, 
   final java.lang.Object v1, final java.lang.Object v2) {
      if (the_test_object == null) {
        throw new PreconditionSkipException
        ("could not construct an object to test");
      }
    try {
      the_test_object.hasEdge(v1, v2);
    }
    catch (final JmlAssertionError $e) {
      if ($e.jmlAssertionType.equals("Precondition") &&
          $e.getStackTrace().length >= 4 &&
          "test_hasEdge__Object_v1__Object_v2__20".equals($e.getStackTrace()[3].getMethodName())) {
        // meaningless test because precondition failed
        throw new PreconditionSkipException($e.getMessage());
      } else {
        // test failure because something else failed
        throw new TestException($e.getMessage());
      }
    } catch (final Throwable $e) {
      // test failure for some reason other than assertion violation
      throw new TestException($e.getMessage());
    }
  }

  /**
   * A test for method isBipartite.
   *
   * @param the_test_object The Graph to call the test method on.
   * @param graph The Graph to be passed.
   */
  @Test(dependsOnMethods = { "test_racEnabled" }, 
        dataProvider = "p_isBipartite__Graph_graph__0")
  public void test_static_isBipartite__Graph_graph__0
  ( final Graph graph) {
    try {
      Graph.isBipartite(graph);
    }
    catch (final JmlAssertionError $e) {
      if ($e.jmlAssertionType.equals("Precondition") &&
          $e.getStackTrace().length >= 4 &&
          "test_static_isBipartite__Graph_graph__0".equals($e.getStackTrace()[3].getMethodName())) {
        // meaningless test because precondition failed
        throw new PreconditionSkipException($e.getMessage());
      } else {
        // test failure because something else failed
        throw new TestException($e.getMessage());
      }
    } catch (final Throwable $e) {
      // test failure for some reason other than assertion violation
      throw new TestException($e.getMessage());
    }
  }

  /**
   * A test for a constructor.
   *
   * @param source The Graph to be passed.
   */
  @Test(dependsOnMethods = { "test_racEnabled" }, 
        dataProvider = "p_Graph__Graph_source__0")
  public void test_Graph__Graph_source__0
  (final Graph source) {
    try {
      new Graph(source);
    }
    catch (final JmlAssertionError $e) {
      if ($e.jmlAssertionType.equals("Precondition") &&
          $e.getStackTrace().length >= 4 &&
          "test_Graph__Graph_source__0".equals($e.getStackTrace()[3].getMethodName())) {
        // meaningless test because precondition failed
        throw new PreconditionSkipException($e.getMessage());
      } else {
        // test failure because something else failed
        throw new TestException($e.getMessage());
      }
    } catch (final Throwable $e) {
      // test failure for some reason other than assertion violation
      throw new TestException($e.getMessage());
    }
  }

  /**
   * A test for method isPath.
   *
   * @param the_test_object The Graph to call the test method on.
   * @param graph The Graph to be passed.
   */
  @Test(dependsOnMethods = { "test_racEnabled" }, 
        dataProvider = "p_isPath__Graph_graph__0")
  public void test_static_isPath__Graph_graph__0
  ( final Graph graph) {
    try {
      Graph.isPath(graph);
    }
    catch (final JmlAssertionError $e) {
      if ($e.jmlAssertionType.equals("Precondition") &&
          $e.getStackTrace().length >= 4 &&
          "test_static_isPath__Graph_graph__0".equals($e.getStackTrace()[3].getMethodName())) {
        // meaningless test because precondition failed
        throw new PreconditionSkipException($e.getMessage());
      } else {
        // test failure because something else failed
        throw new TestException($e.getMessage());
      }
    } catch (final Throwable $e) {
      // test failure for some reason other than assertion violation
      throw new TestException($e.getMessage());
    }
  }

  /**
   * A test for method getVertices.
   *
   * @param the_test_object The Graph to call the test method on.
   */
  @Test(dependsOnMethods = { "test_racEnabled" }, 
        dataProvider = "p_instance_only")
  public void test_getVertices__0
  (final Graph the_test_object ) {
      if (the_test_object == null) {
        throw new PreconditionSkipException
        ("could not construct an object to test");
      }
    try {
      the_test_object.getVertices();
    }
    catch (final JmlAssertionError $e) {
      if ($e.jmlAssertionType.equals("Precondition") &&
          $e.getStackTrace().length >= 4 &&
          "test_getVertices__0".equals($e.getStackTrace()[3].getMethodName())) {
        // meaningless test because precondition failed
        throw new PreconditionSkipException($e.getMessage());
      } else {
        // test failure because something else failed
        throw new TestException($e.getMessage());
      }
    } catch (final Throwable $e) {
      // test failure for some reason other than assertion violation
      throw new TestException($e.getMessage());
    }
  }

  /**
   * A test for method addEdge.
   *
   * @param the_test_object The Graph to call the test method on.
   * @param v1 The Object to be passed.
   * @param v2 The Object to be passed.
   */
  @Test(dependsOnMethods = { "test_racEnabled" }, 
        dataProvider = "p_addEdge__Object_v1__Object_v2__20")
  public void test_addEdge__Object_v1__Object_v2__20
  (final Graph the_test_object, 
   final java.lang.Object v1, final java.lang.Object v2) {
      if (the_test_object == null) {
        throw new PreconditionSkipException
        ("could not construct an object to test");
      }
    try {
      the_test_object.addEdge(v1, v2);
    }
    catch (final JmlAssertionError $e) {
      if ($e.jmlAssertionType.equals("Precondition") &&
          $e.getStackTrace().length >= 4 &&
          "test_addEdge__Object_v1__Object_v2__20".equals($e.getStackTrace()[3].getMethodName())) {
        // meaningless test because precondition failed
        throw new PreconditionSkipException($e.getMessage());
      } else {
        // test failure because something else failed
        throw new TestException($e.getMessage());
      }
    } catch (final Throwable $e) {
      // test failure for some reason other than assertion violation
      throw new TestException($e.getMessage());
    }
  }

  /**
   * A test for method print.
   *
   * @param the_test_object The Graph to call the test method on.
   */
  @Test(dependsOnMethods = { "test_racEnabled" }, 
        dataProvider = "p_instance_only")
  public void test_print__0
  (final Graph the_test_object ) {
      if (the_test_object == null) {
        throw new PreconditionSkipException
        ("could not construct an object to test");
      }
    try {
      the_test_object.print();
    }
    catch (final JmlAssertionError $e) {
      if ($e.jmlAssertionType.equals("Precondition") &&
          $e.getStackTrace().length >= 4 &&
          "test_print__0".equals($e.getStackTrace()[3].getMethodName())) {
        // meaningless test because precondition failed
        throw new PreconditionSkipException($e.getMessage());
      } else {
        // test failure because something else failed
        throw new TestException($e.getMessage());
      }
    } catch (final Throwable $e) {
      // test failure for some reason other than assertion violation
      throw new TestException($e.getMessage());
    }
  }

  /**
   * A test for method isCycle.
   *
   * @param the_test_object The Graph to call the test method on.
   * @param graph The Graph to be passed.
   */
  @Test(dependsOnMethods = { "test_racEnabled" }, 
        dataProvider = "p_isCycle__Graph_graph__0")
  public void test_static_isCycle__Graph_graph__0
  ( final Graph graph) {
    try {
      Graph.isCycle(graph);
    }
    catch (final JmlAssertionError $e) {
      if ($e.jmlAssertionType.equals("Precondition") &&
          $e.getStackTrace().length >= 4 &&
          "test_static_isCycle__Graph_graph__0".equals($e.getStackTrace()[3].getMethodName())) {
        // meaningless test because precondition failed
        throw new PreconditionSkipException($e.getMessage());
      } else {
        // test failure because something else failed
        throw new TestException($e.getMessage());
      }
    } catch (final Throwable $e) {
      // test failure for some reason other than assertion violation
      throw new TestException($e.getMessage());
    }
  }

  /**
   * A test for method hasVertex.
   *
   * @param the_test_object The Graph to call the test method on.
   * @param v The Object to be passed.
   */
  @Test(dependsOnMethods = { "test_racEnabled" }, 
        dataProvider = "p_hasVertex__Object_v__10")
  public void test_hasVertex__Object_v__10
  (final Graph the_test_object, 
   final java.lang.Object v) {
      if (the_test_object == null) {
        throw new PreconditionSkipException
        ("could not construct an object to test");
      }
    try {
      the_test_object.hasVertex(v);
    }
    catch (final JmlAssertionError $e) {
      if ($e.jmlAssertionType.equals("Precondition") &&
          $e.getStackTrace().length >= 4 &&
          "test_hasVertex__Object_v__10".equals($e.getStackTrace()[3].getMethodName())) {
        // meaningless test because precondition failed
        throw new PreconditionSkipException($e.getMessage());
      } else {
        // test failure because something else failed
        throw new TestException($e.getMessage());
      }
    } catch (final Throwable $e) {
      // test failure for some reason other than assertion violation
      throw new TestException($e.getMessage());
    }
  }

  /**
   * A test for method addVertex.
   *
   * @param the_test_object The Graph to call the test method on.
   * @param v The Object to be passed.
   */
  @Test(dependsOnMethods = { "test_racEnabled" }, 
        dataProvider = "p_addVertex__Object_v__10")
  public void test_addVertex__Object_v__10
  (final Graph the_test_object, 
   final java.lang.Object v) {
      if (the_test_object == null) {
        throw new PreconditionSkipException
        ("could not construct an object to test");
      }
    try {
      the_test_object.addVertex(v);
    }
    catch (final JmlAssertionError $e) {
      if ($e.jmlAssertionType.equals("Precondition") &&
          $e.getStackTrace().length >= 4 &&
          "test_addVertex__Object_v__10".equals($e.getStackTrace()[3].getMethodName())) {
        // meaningless test because precondition failed
        throw new PreconditionSkipException($e.getMessage());
      } else {
        // test failure because something else failed
        throw new TestException($e.getMessage());
      }
    } catch (final Throwable $e) {
      // test failure for some reason other than assertion violation
      throw new TestException($e.getMessage());
    }
  }

  /**
   * A test for method removeEdge.
   *
   * @param the_test_object The Graph to call the test method on.
   * @param v1 The Object to be passed.
   * @param v2 The Object to be passed.
   */
  @Test(dependsOnMethods = { "test_racEnabled" }, 
        dataProvider = "p_removeEdge__Object_v1__Object_v2__20")
  public void test_removeEdge__Object_v1__Object_v2__20
  (final Graph the_test_object, 
   final java.lang.Object v1, final java.lang.Object v2) {
      if (the_test_object == null) {
        throw new PreconditionSkipException
        ("could not construct an object to test");
      }
    try {
      the_test_object.removeEdge(v1, v2);
    }
    catch (final JmlAssertionError $e) {
      if ($e.jmlAssertionType.equals("Precondition") &&
          $e.getStackTrace().length >= 4 &&
          "test_removeEdge__Object_v1__Object_v2__20".equals($e.getStackTrace()[3].getMethodName())) {
        // meaningless test because precondition failed
        throw new PreconditionSkipException($e.getMessage());
      } else {
        // test failure because something else failed
        throw new TestException($e.getMessage());
      }
    } catch (final Throwable $e) {
      // test failure for some reason other than assertion violation
      throw new TestException($e.getMessage());
    }
  }

  /**
   * A test for method getDegree.
   *
   * @param the_test_object The Graph to call the test method on.
   * @param v The Object to be passed.
   */
  @Test(dependsOnMethods = { "test_racEnabled" }, 
        dataProvider = "p_getDegree__Object_v__10")
  public void test_getDegree__Object_v__10
  (final Graph the_test_object, 
   final java.lang.Object v) {
      if (the_test_object == null) {
        throw new PreconditionSkipException
        ("could not construct an object to test");
      }
    try {
      the_test_object.getDegree(v);
    }
    catch (final JmlAssertionError $e) {
      if ($e.jmlAssertionType.equals("Precondition") &&
          $e.getStackTrace().length >= 4 &&
          "test_getDegree__Object_v__10".equals($e.getStackTrace()[3].getMethodName())) {
        // meaningless test because precondition failed
        throw new PreconditionSkipException($e.getMessage());
      } else {
        // test failure because something else failed
        throw new TestException($e.getMessage());
      }
    } catch (final Throwable $e) {
      // test failure for some reason other than assertion violation
      throw new TestException($e.getMessage());
    }
  }

  /**
   * A test for method splitIntoPieces.
   *
   * @param the_test_object The Graph to call the test method on.
   * @param graph The Graph to be passed.
   * @param cycle The Graph to be passed.
   */
  @Test(dependsOnMethods = { "test_racEnabled" }, 
        dataProvider = "p_splitIntoPieces__Graph_graph__Graph_cycle__0")
  public void test_static_splitIntoPieces__Graph_graph__Graph_cycle__0
  ( final Graph graph, final Graph cycle) {
    try {
      Graph.splitIntoPieces(graph, cycle);
    }
    catch (final JmlAssertionError $e) {
      if ($e.jmlAssertionType.equals("Precondition") &&
          $e.getStackTrace().length >= 4 &&
          "test_static_splitIntoPieces__Graph_graph__Graph_cycle__0".equals($e.getStackTrace()[3].getMethodName())) {
        // meaningless test because precondition failed
        throw new PreconditionSkipException($e.getMessage());
      } else {
        // test failure because something else failed
        throw new TestException($e.getMessage());
      }
    } catch (final Throwable $e) {
      // test failure for some reason other than assertion violation
      throw new TestException($e.getMessage());
    }
  }

  /**
   * A test for method numEdges.
   *
   * @param the_test_object The Graph to call the test method on.
   */
  @Test(dependsOnMethods = { "test_racEnabled" }, 
        dataProvider = "p_instance_only")
  public void test_numEdges__0
  (final Graph the_test_object ) {
      if (the_test_object == null) {
        throw new PreconditionSkipException
        ("could not construct an object to test");
      }
    try {
      the_test_object.numEdges();
    }
    catch (final JmlAssertionError $e) {
      if ($e.jmlAssertionType.equals("Precondition") &&
          $e.getStackTrace().length >= 4 &&
          "test_numEdges__0".equals($e.getStackTrace()[3].getMethodName())) {
        // meaningless test because precondition failed
        throw new PreconditionSkipException($e.getMessage());
      } else {
        // test failure because something else failed
        throw new TestException($e.getMessage());
      }
    } catch (final Throwable $e) {
      // test failure for some reason other than assertion violation
      throw new TestException($e.getMessage());
    }
  }

  /**
   * A test for method numVertices.
   *
   * @param the_test_object The Graph to call the test method on.
   */
  @Test(dependsOnMethods = { "test_racEnabled" }, 
        dataProvider = "p_instance_only")
  public void test_numVertices__0
  (final Graph the_test_object ) {
      if (the_test_object == null) {
        throw new PreconditionSkipException
        ("could not construct an object to test");
      }
    try {
      the_test_object.numVertices();
    }
    catch (final JmlAssertionError $e) {
      if ($e.jmlAssertionType.equals("Precondition") &&
          $e.getStackTrace().length >= 4 &&
          "test_numVertices__0".equals($e.getStackTrace()[3].getMethodName())) {
        // meaningless test because precondition failed
        throw new PreconditionSkipException($e.getMessage());
      } else {
        // test failure because something else failed
        throw new TestException($e.getMessage());
      }
    } catch (final Throwable $e) {
      // test failure for some reason other than assertion violation
      throw new TestException($e.getMessage());
    }
  }

  /**
   * A test for method addGraphs.
   *
   * @param the_test_object The Graph to call the test method on.
   * @param g1 The Graph to be passed.
   * @param g2 The Graph to be passed.
   */
  @Test(dependsOnMethods = { "test_racEnabled" }, 
        dataProvider = "p_addGraphs__Graph_g1__Graph_g2__0")
  public void test_static_addGraphs__Graph_g1__Graph_g2__0
  ( final Graph g1, final Graph g2) {
    try {
      Graph.addGraphs(g1, g2);
    }
    catch (final JmlAssertionError $e) {
      if ($e.jmlAssertionType.equals("Precondition") &&
          $e.getStackTrace().length >= 4 &&
          "test_static_addGraphs__Graph_g1__Graph_g2__0".equals($e.getStackTrace()[3].getMethodName())) {
        // meaningless test because precondition failed
        throw new PreconditionSkipException($e.getMessage());
      } else {
        // test failure because something else failed
        throw new TestException($e.getMessage());
      }
    } catch (final Throwable $e) {
      // test failure for some reason other than assertion violation
      throw new TestException($e.getMessage());
    }
  }

  /**
   * Data provider for method java.util.Set getNeighbors(Object).
   * @return An iterator over strategies to use for parameter generation.
   */
  @SuppressWarnings({"unchecked"})
  @DataProvider(name = "p_getNeighbors__Object_v__10", 
                parallel = false)
  public static IteratorWrapper<Object[]> p_getNeighbors__Object_v__10() {
    return new IteratorWrapper<Object[]>
    (new ParameterArrayIterator
         (Graph_InstanceStrategy.class,
          Graph_getNeighbors__Object_v__10__v.class));
  }



  /**
   * Data provider for method Graph subtractGraphs(Graph, Graph).
   * @return An iterator over strategies to use for parameter generation.
   */
  @SuppressWarnings({"unchecked"})
  @DataProvider(name = "p_subtractGraphs__Graph_g1__Graph_g2__0", 
                parallel = false)
  public static IteratorWrapper<Object[]> p_subtractGraphs__Graph_g1__Graph_g2__0() {
    return new IteratorWrapper<Object[]>
    (new ParameterArrayIterator
         (Graph_subtractGraphs__Graph_g1__Graph_g2__0__g1.class,
          Graph_subtractGraphs__Graph_g1__Graph_g2__0__g2.class));
  }


  /**
   * Data provider for method boolean hasEdge(Object, Object).
   * @return An iterator over strategies to use for parameter generation.
   */
  @SuppressWarnings({"unchecked"})
  @DataProvider(name = "p_hasEdge__Object_v1__Object_v2__20", 
                parallel = false)
  public static IteratorWrapper<Object[]> p_hasEdge__Object_v1__Object_v2__20() {
    return new IteratorWrapper<Object[]>
    (new ParameterArrayIterator
         (Graph_InstanceStrategy.class,
          Graph_hasEdge__Object_v1__Object_v2__20__v1.class,
                  Graph_hasEdge__Object_v1__Object_v2__20__v2.class));
  }


  /**
   * Data provider for method boolean isBipartite(Graph).
   * @return An iterator over strategies to use for parameter generation.
   */
  @SuppressWarnings({"unchecked"})
  @DataProvider(name = "p_isBipartite__Graph_graph__0", 
                parallel = false)
  public static IteratorWrapper<Object[]> p_isBipartite__Graph_graph__0() {
    return new IteratorWrapper<Object[]>
    (new ParameterArrayIterator
         (Graph_isBipartite__Graph_graph__0__graph.class));
  }


  /**
   * Data provider for constructor Graph(Graph).
   * @return An iterator over strategies to use for parameter generation.
   */
  @SuppressWarnings({"unchecked"})
  @DataProvider(name = "p_Graph__Graph_source__0", 
                parallel = false)
  public static IteratorWrapper<Object[]> p_Graph__Graph_source__0() {
    return new IteratorWrapper<Object[]>
    (new ParameterArrayIterator
         (Graph_Graph__Graph_source__0__source.class));
  }


  /**
   * Data provider for method boolean isPath(Graph).
   * @return An iterator over strategies to use for parameter generation.
   */
  @SuppressWarnings({"unchecked"})
  @DataProvider(name = "p_isPath__Graph_graph__0", 
                parallel = false)
  public static IteratorWrapper<Object[]> p_isPath__Graph_graph__0() {
    return new IteratorWrapper<Object[]>
    (new ParameterArrayIterator
         (Graph_isPath__Graph_graph__0__graph.class));
  }



  /**
   * Data provider for method void addEdge(Object, Object).
   * @return An iterator over strategies to use for parameter generation.
   */
  @SuppressWarnings({"unchecked"})
  @DataProvider(name = "p_addEdge__Object_v1__Object_v2__20", 
                parallel = false)
  public static IteratorWrapper<Object[]> p_addEdge__Object_v1__Object_v2__20() {
    return new IteratorWrapper<Object[]>
    (new ParameterArrayIterator
         (Graph_InstanceStrategy.class,
          Graph_addEdge__Object_v1__Object_v2__20__v1.class,
                  Graph_addEdge__Object_v1__Object_v2__20__v2.class));
  }



  /**
   * Data provider for method boolean isCycle(Graph).
   * @return An iterator over strategies to use for parameter generation.
   */
  @SuppressWarnings({"unchecked"})
  @DataProvider(name = "p_isCycle__Graph_graph__0", 
                parallel = false)
  public static IteratorWrapper<Object[]> p_isCycle__Graph_graph__0() {
    return new IteratorWrapper<Object[]>
    (new ParameterArrayIterator
         (Graph_isCycle__Graph_graph__0__graph.class));
  }


  /**
   * Data provider for method boolean hasVertex(Object).
   * @return An iterator over strategies to use for parameter generation.
   */
  @SuppressWarnings({"unchecked"})
  @DataProvider(name = "p_hasVertex__Object_v__10", 
                parallel = false)
  public static IteratorWrapper<Object[]> p_hasVertex__Object_v__10() {
    return new IteratorWrapper<Object[]>
    (new ParameterArrayIterator
         (Graph_InstanceStrategy.class,
          Graph_hasVertex__Object_v__10__v.class));
  }


  /**
   * Data provider for method void addVertex(Object).
   * @return An iterator over strategies to use for parameter generation.
   */
  @SuppressWarnings({"unchecked"})
  @DataProvider(name = "p_addVertex__Object_v__10", 
                parallel = false)
  public static IteratorWrapper<Object[]> p_addVertex__Object_v__10() {
    return new IteratorWrapper<Object[]>
    (new ParameterArrayIterator
         (Graph_InstanceStrategy.class,
          Graph_addVertex__Object_v__10__v.class));
  }


  /**
   * Data provider for method void removeEdge(Object, Object).
   * @return An iterator over strategies to use for parameter generation.
   */
  @SuppressWarnings({"unchecked"})
  @DataProvider(name = "p_removeEdge__Object_v1__Object_v2__20", 
                parallel = false)
  public static IteratorWrapper<Object[]> p_removeEdge__Object_v1__Object_v2__20() {
    return new IteratorWrapper<Object[]>
    (new ParameterArrayIterator
         (Graph_InstanceStrategy.class,
          Graph_removeEdge__Object_v1__Object_v2__20__v1.class,
                  Graph_removeEdge__Object_v1__Object_v2__20__v2.class));
  }


  /**
   * Data provider for method int getDegree(Object).
   * @return An iterator over strategies to use for parameter generation.
   */
  @SuppressWarnings({"unchecked"})
  @DataProvider(name = "p_getDegree__Object_v__10", 
                parallel = false)
  public static IteratorWrapper<Object[]> p_getDegree__Object_v__10() {
    return new IteratorWrapper<Object[]>
    (new ParameterArrayIterator
         (Graph_InstanceStrategy.class,
          Graph_getDegree__Object_v__10__v.class));
  }


  /**
   * Data provider for method java.util.Set splitIntoPieces(Graph, Graph).
   * @return An iterator over strategies to use for parameter generation.
   */
  @SuppressWarnings({"unchecked"})
  @DataProvider(name = "p_splitIntoPieces__Graph_graph__Graph_cycle__0", 
                parallel = false)
  public static IteratorWrapper<Object[]> p_splitIntoPieces__Graph_graph__Graph_cycle__0() {
    return new IteratorWrapper<Object[]>
    (new ParameterArrayIterator
         (Graph_splitIntoPieces__Graph_graph__Graph_cycle__0__graph.class,
          Graph_splitIntoPieces__Graph_graph__Graph_cycle__0__cycle.class));
  }




  /**
   * Data provider for method Graph addGraphs(Graph, Graph).
   * @return An iterator over strategies to use for parameter generation.
   */
  @SuppressWarnings({"unchecked"})
  @DataProvider(name = "p_addGraphs__Graph_g1__Graph_g2__0", 
                parallel = false)
  public static IteratorWrapper<Object[]> p_addGraphs__Graph_g1__Graph_g2__0() {
    return new IteratorWrapper<Object[]>
    (new ParameterArrayIterator
         (Graph_addGraphs__Graph_g1__Graph_g2__0__g1.class,
          Graph_addGraphs__Graph_g1__Graph_g2__0__g2.class));
  }


  /**
   * Data provider for methods with no parameters.
   * @return An iterator over the main class strategy.
   */
  @SuppressWarnings({"unchecked"})
  @DataProvider(name = "p_instance_only", 
                parallel = false)
  public static IteratorWrapper<Object[]> p_instance_only() {
    return new IteratorWrapper<Object[]>
    (new ParameterArrayIterator(Graph_InstanceStrategy.class));
  }
}