import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * A class to perform various operations that involve traversing a graph.
 * This exists to prevent having to pass multiple state variables to
 * recursive calls when performing the traversals.  Most operations
 * have a corresponding static method in the Graph class for easier
 * calling.
 *
 * @author Max Bogue
 */
public class GraphTraverser<T> {

    ///*@ invariant this.graph != null; */
    ///*@ invariant this.searched != null; */
    ///*@ invariant this.searched.getClass().getName() == java.util.HashSet.class.getName(); */
    ///*@ invariant this.coloring.getClass().getName() == java.util.HashMap.class.getName(); */
    ///*@ invariant this.goal.getClass().getName() == java.lang.Integer.class.getName(); */
    ///*@ invariant this.next.getClass().getName() == java.lang.Integer.class.getName(); */
    ///*@ invariant this.searched.getClass().getName() != this.coloring.getClass().getName(); */
    ///*@ invariant this.searched.getClass().getName() != this.goal.getClass().getName(); */
    ///*@ invariant this.searched.getClass().getName() != this.next.getClass().getName(); */
    ///*@ invariant this.next.getClass().getName() == this.prev.getClass().getName(); */
    /** The graph that this object works on. */
    /*@ spec_public */ private Graph<T> graph;

    /** A set to track nodes already searched in the current traversal. */
    /*@ spec_public */ private Set<T> searched = new HashSet<T>();

    /** A map used for colorings of the graph. */
    /*@ spec_public */ private Map<T, Integer> coloring = null;

    /** A variable to hold the graph resulting from an operation. */
    /*@ spec_public */ private Graph<T> result = null;

    /** A target vertex. */
    /*@ spec_public */ private T goal = null;

    /** The next vertex in a traversal (used for walkCycle). */
    /*@ spec_public */ private T next = null;

    /** The previous vertex in a traversal (used for walkCycle). */
    /*@ spec_public */ private T prev = null;

    /*@
    @ public normal_behavior // Generated by Daikon
    @ requires graph != null;
    @ ensures this.next == this.prev;
    @ ensures this.coloring == null;
    @ ensures this.result == null;
    @ ensures this.goal == null;
    @ ensures this.next == null;
    @*/
    /**
     * Constructor for a GraphTraverser object.
     * 
     * @param graph
     */
    public GraphTraverser( Graph<T> graph ) {
        this.graph = graph;
    }

    /*@
    @ public normal_behavior // Generated by Daikon
    @ requires this.next == this.prev;
    @ requires this.coloring == null;
    @ requires this.result == null;
    @ requires this.goal == null;
    @ requires this.next == null;
    @ ensures this.graph == \old(this.graph);
    @ ensures this.searched == \old(this.searched);
    @ ensures this.result == \old(this.result);
    @ ensures this.goal == \old(this.goal);
    @ ensures this.next == this.prev;
    @ ensures this.next == \old(this.next);
    @ ensures this.next == \old(this.prev);
    @ ensures (this.coloring == null)  ==>  (this.coloring == \old(this.coloring));
    @ ensures (this.coloring != null)  ==>  (\old(this) != null);
    @ ensures (this.coloring != null)  ==>  (this.coloring.getClass().getName() == java.util.HashMap.class.getName());
    @ ensures (this.coloring != null)  ==>  (this.graph != null);
    @ ensures (this.coloring != null)  ==>  (this.searched != null);
    @ ensures this.result == null;
    @ ensures this.goal == null;
    @ ensures this.next == null;
    @ ensures \result == true;
    @ ensures this.searched.getClass().getName() == \old(this.searched.getClass().getName());
    @*/
    /**
     * Tests whether this graph is bipartite.
     *
     * @return      True if it is bipartite.
     */
    public boolean isBipartite() {
        if ( graph.numVertices() == 0 ) return true;
        coloring = new HashMap<T, Integer>();
        return isBipartite( graph.getVertices().iterator().next(), true );
    }

    /*@
    @ private normal_behavior // Generated by Daikon
    @ requires this.next == this.prev;
    @ requires this != null;
    @ requires this.graph != null;
    @ requires this.searched != null;
    @ requires this.coloring != null;
    @ requires this.result == null;
    @ requires this.goal == null;
    @ requires this.next == null;
    @ requires v.getClass().getName() == java.lang.Integer.class.getName();
    @ requires this.searched.getClass().getName() != v.getClass().getName();
    @ requires this.coloring.getClass().getName() != v.getClass().getName();
    @ ensures this.graph == \old(this.graph);
    @ ensures this.searched == \old(this.searched);
    @ ensures this.coloring == \old(this.coloring);
    @ ensures this.result == \old(this.result);
    @ ensures this.goal == \old(this.goal);
    @ ensures this.next == this.prev;
    @ ensures this.next == \old(this.next);
    @ ensures this.next == \old(this.prev);
    @ ensures this.graph != null;
    @ ensures this.searched != null;
    @ ensures this.coloring != null;
    @ ensures this.result == null;
    @ ensures this.goal == null;
    @ ensures this.next == null;
    @ ensures \result == true;
    @ ensures this.searched.getClass().getName() == \old(this.searched.getClass().getName());
    @ ensures this.searched.getClass().getName() != \old(v.getClass().getName());
    @ ensures this.coloring.getClass().getName() == \old(this.coloring.getClass().getName());
    @ ensures this.coloring.getClass().getName() != \old(v.getClass().getName());
    @*/
    /**
     * Private worker function for isBipartite.
     *
     * @param v     The current node in the traversal.
     * @param color The color to try for this node.
     * @return      True if no conflicts were found.
     */
    private boolean isBipartite( T v, boolean color ) {
        if ( coloring.containsKey( v ) ) {
            if ( !coloring.get( v ).equals( color ? 1 : 0 ) ) {
                return false;
            } else {
                return true;
            }
        } else {
            coloring.put( v, color ? 1 : 0 );
            boolean bipartite = true;
            for ( T n : graph.getNeighbors( v ) ) {
                bipartite = bipartite && isBipartite( n, !color );
            }
            return bipartite;
        }
    }

    /*@
    @ public normal_behavior // Generated by Daikon
    @ requires this.coloring == null;
    @ requires this.result == null;
    @ requires this.goal == null;
    @ ensures this.graph == \old(this.graph);
    @ ensures this.searched == \old(this.searched);
    @ ensures this.coloring == \old(this.coloring);
    @ ensures this.result == \old(this.result);
    @ ensures this.goal == \old(this.goal);
    @ ensures this.prev == \result;
    @ ensures this.coloring == null;
    @ ensures this.result == null;
    @ ensures this.goal == null;
    @ ensures this.next != null;
    @ ensures \result != null;
    @ ensures \result.getClass().getName() == java.lang.Integer.class.getName();
    @ ensures this.searched.getClass().getName() != \result.getClass().getName();
    @ ensures this.searched.getClass().getName() == \old(this.searched.getClass().getName());
    @ ensures this.searched.getClass().getName() != \old(this.next.getClass().getName());
    @ ensures this.next.getClass().getName() == \result.getClass().getName();
    @ ensures this.prev.getClass().getName() == \result.getClass().getName();
    @ ensures \result.getClass().getName() == \old(this.next.getClass().getName());
    @*/
    /**
     * Walks around a cycle, starting from an arbitrary vertex
     * and going in an arbitrary direction.
     *
     * @return      The next vertex in the walk.
     */
    public T walkCycle() {
        if ( next == null ) {
            prev = graph.getVertices().iterator().next();
            next = graph.getNeighbors( prev ).iterator().next();
        } else {
            for ( T n : graph.getNeighbors( next ) ) {
                if ( !n.equals( prev ) ) {
                    prev = next;
                    next = n;
                    break;
                }
            }
        }
        return prev;
    }

    /*@
    @ public normal_behavior // Generated by Daikon
    @ requires this.next == this.prev;
    @ requires this.coloring == null;
    @ requires this.result == null;
    @ requires this.goal == null;
    @ requires this.next == null;
    @ requires start.getClass().getName() == java.lang.Integer.class.getName();
    @ requires this.searched.getClass().getName() != start.getClass().getName();
    @ requires this.searched.getClass().getName() != banned.getClass().getName();
    @ requires start.getClass().getName() == end.getClass().getName();
    @ requires start.getClass().getName() != banned.getClass().getName();
    @ ensures this.graph == \old(this.graph);
    @ ensures this.searched == \old(this.searched);
    @ ensures this.coloring == \old(this.coloring);
    @ ensures this.result == \result;
    @ ensures this.goal == \old(end);
    @ ensures this.next == this.prev;
    @ ensures this.next == \old(this.next);
    @ ensures this.next == \old(this.prev);
    @ ensures this.coloring == null;
    @ ensures this.next == null;
    @ ensures this.searched.getClass().getName() == \old(this.searched.getClass().getName());
    @ ensures this.searched.getClass().getName() != \old(banned.getClass().getName());
    @ ensures this.goal.getClass().getName() == \old(start.getClass().getName());
    @ ensures this.goal.getClass().getName() == \old(end.getClass().getName());
    @ ensures this.goal.getClass().getName() != \old(banned.getClass().getName());
    @*/
    /**
     * Finds a path between two vertices in the graph.
     *
     * @param start     The starting vertex.
     * @param end       The ending vertex.
     * @param banned    A collection of sets this path can't pass through.
     * @return          The path between the two vertices.
     */
    public Graph<T> findPath( T start, T end, Collection<T> banned ) {
        searched.clear();
        searched.addAll( banned );
        result = new Graph<T>();
        goal = end;
        boolean pathFound = findPath( start );
        return pathFound ? result : null;
    }

    /*@
    @ private normal_behavior // Generated by Daikon
    @ requires this.next == this.prev;
    @ requires this.coloring == null;
    @ requires this.result != null;
    @ requires this.goal != null;
    @ requires this.next == null;
    @ requires v != null;
    @ requires this.goal.getClass().getName() == v.getClass().getName();
    @ ensures this.graph == \old(this.graph);
    @ ensures this.searched == \old(this.searched);
    @ ensures this.coloring == \old(this.coloring);
    @ ensures this.result == \old(this.result);
    @ ensures this.goal == \old(this.goal);
    @ ensures this.next == this.prev;
    @ ensures this.next == \old(this.next);
    @ ensures this.next == \old(this.prev);
    @ ensures this.coloring == null;
    @ ensures this.result != null;
    @ ensures this.goal != null;
    @ ensures this.next == null;
    @ ensures this.searched.getClass().getName() == \old(this.searched.getClass().getName());
    @ ensures this.goal.getClass().getName() == \old(this.goal.getClass().getName());
    @ ensures this.goal.getClass().getName() == \old(v.getClass().getName());
    @*/
    /**
     * Private worker function for findPath.
     *
     * @param v     The current node in the path.
     * @return      True if the path was found.
     */
    private boolean findPath( T v ) {
        searched.add( v );
        for ( T n : graph.getNeighbors( v ) ) {
            if ( n.equals( goal ) ) {
                result.addEdge( v, n );
                return true;
            } else if ( !searched.contains( n ) ) {
                result.addEdge( v, n );
                boolean pathFound = findPath( n );
                if ( pathFound ) return true;
                result.removeEdge( v, n );
            }
        }
        return false;
    }

    /*@
    @ public normal_behavior // Generated by Daikon
    @ requires this.next == this.prev;
    @ requires this != null;
    @ requires this.graph != null;
    @ requires this.searched != null;
    @ requires this.coloring == null;
    @ requires this.result == null;
    @ requires this.goal == null;
    @ requires this.next == null;
    @ ensures this.graph == \old(this.graph);
    @ ensures this.searched == \old(this.searched);
    @ ensures this.coloring == \old(this.coloring);
    @ ensures this.result == \result;
    @ ensures this.next == this.prev;
    @ ensures this.next == \old(this.next);
    @ ensures this.next == \old(this.prev);
    @ ensures this.graph != null;
    @ ensures this.searched != null;
    @ ensures this.coloring == null;
    @ ensures this.goal != null;
    @ ensures this.next == null;
    @ ensures \result != null;
    @ ensures this.searched.getClass().getName() == \old(this.searched.getClass().getName());
    @*/
    /**
     * Finds an arbitrary cycle in a biconnected graph.
     *
     * @return      A cycle.
     */
    public Graph<T> findCycle() {
        searched.clear();
        result = new Graph<T>();
        goal = graph.getVertices().iterator().next();
        return findCycle( goal );
    }

    /*@
    @ private normal_behavior // Generated by Daikon
    @ requires this.next == this.prev;
    @ requires this != null;
    @ requires this.graph != null;
    @ requires this.searched != null;
    @ requires this.coloring == null;
    @ requires this.result != null;
    @ requires this.goal != null;
    @ requires this.next == null;
    @ requires this.goal.getClass().getName() == v.getClass().getName();
    @ ensures this.graph == \old(this.graph);
    @ ensures this.searched == \old(this.searched);
    @ ensures this.coloring == \old(this.coloring);
    @ ensures this.result == \result;
    @ ensures this.goal == \old(this.goal);
    @ ensures this.next == this.prev;
    @ ensures this.next == \old(this.next);
    @ ensures this.next == \old(this.prev);
    @ ensures \result == \old(this.result);
    @ ensures this.graph != null;
    @ ensures this.searched != null;
    @ ensures this.coloring == null;
    @ ensures this.goal != null;
    @ ensures this.next == null;
    @ ensures \result != null;
    @ ensures this.searched.getClass().getName() == \old(this.searched.getClass().getName());
    @ ensures this.goal.getClass().getName() == \old(this.goal.getClass().getName());
    @ ensures this.goal.getClass().getName() == \old(v.getClass().getName());
    @*/
    /**
     * Private worker function for findCycle.
     *
     * @param v     The current node in the cycle.
     * @return      A cycle.
     */
    private Graph<T> findCycle( T v ) {
        searched.add( v );
        for ( T n : graph.getNeighbors( v ) ) {
            if ( n.equals( goal ) && result.numVertices() > 2 ) {
                result.addEdge( v, n );
                return result;
            } else if ( !searched.contains( n ) ) {
                result.addEdge( v, n );
                Graph<T> completedCycle = findCycle( n );
                if ( completedCycle != null ) return completedCycle;
                result.removeEdge( v, n );
            }
        }
        return null;
    }

    /*@
    @ public normal_behavior // Generated by Daikon
    @ requires this.next == this.prev;
    @ requires this.coloring == null;
    @ requires this.result == null;
    @ requires this.goal == null;
    @ requires this.next == null;
    @ ensures this.graph == \old(this.graph);
    @ ensures this.searched == \old(this.searched);
    @ ensures this.coloring == \old(this.coloring);
    @ ensures this.goal == \old(this.goal);
    @ ensures this.next == this.prev;
    @ ensures this.next == \old(this.next);
    @ ensures this.next == \old(this.prev);
    @ ensures this.coloring == null;
    @ ensures this.goal == null;
    @ ensures this.next == null;
    @ ensures \result.getClass().getName() == java.util.HashSet.class.getName();
    @ ensures this.searched.getClass().getName() == \result.getClass().getName();
    @ ensures \result.getClass().getName() == \old(this.searched.getClass().getName());
    @*/
    /**
     * Splits the graph into pieces using the given cycle.
     *
     * @param cycle     The cycle to split the graph with.
     * @return          A set containing all the pieces of the graph.
     */
    public Set<Graph<T>> splitIntoPieces ( Graph<T> cycle ) {
        searched.clear();
        Set<Graph<T>> pieces = new HashSet<Graph<T>>();
        for ( T v : cycle.getVertices() ) {
            searched.add( v );
            for ( T n : graph.getNeighbors( v ) ) {
                if (   !searched.contains( n ) && !cycle.hasEdge( n, v ) ) {
                    result = new Graph<T>();
                    result.addEdge( v, n );
                    makePiece( cycle, n );
                    pieces.add( result );
                }
            }
        }
        return pieces;
    }

    /*@
    @ private normal_behavior // Generated by Daikon
    @ requires this.next == this.prev;
    @ requires this.coloring == null;
    @ requires this.result != null;
    @ requires this.goal == null;
    @ requires this.next == null;
    @ requires cycle != null;
    @ requires v != null;
    @ requires v.getClass().getName() == java.lang.Integer.class.getName();
    @ requires this.searched.getClass().getName() != v.getClass().getName();
    @ ensures this.graph == \old(this.graph);
    @ ensures this.searched == \old(this.searched);
    @ ensures this.coloring == \old(this.coloring);
    @ ensures this.result == \old(this.result);
    @ ensures this.goal == \old(this.goal);
    @ ensures this.next == this.prev;
    @ ensures this.next == \old(this.next);
    @ ensures this.next == \old(this.prev);
    @ ensures this.coloring == null;
    @ ensures this.result != null;
    @ ensures this.goal == null;
    @ ensures this.next == null;
    @ ensures this.searched.getClass().getName() == \old(this.searched.getClass().getName());
    @ ensures this.searched.getClass().getName() != \old(v.getClass().getName());
    @*/
    /**
     * Private helper function for splitIntoPieces.  Creates a piece
     * (connected without going through the cycle) of the graph
     * from a cycle and a starting node.
     *
     * @param cycle     The separating cycle.
     * @param v         The current vertex.
     *
     * @return          This piece of the graph.
     */
    private void makePiece( Graph<T> cycle, T v ) {
        if ( cycle.hasVertex( v ) ) return;
        searched.add( v );
        for ( T n : graph.getNeighbors( v ) ) {
            if ( !result.hasEdge( n, v ) ) {
                result.addEdge( v, n );
                makePiece( cycle, n );
            }
        }
    }

} // GraphTraverser