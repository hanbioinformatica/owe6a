package boom;

// Klasse voor een knoop voor een binaire boom
// Met boomwandelingen pre-order en level-order
import java.util.*;

public class BinNode<E> {
  private BinNode<E> parent, leftChild, rightChild;
  private E userObject;
  private static StringBuffer buffer;
  private Queue<BinNode<E>> q; // queue voor level-order wandeling
  
  public static final int LEFT = 0;  // public constanten voor het 
  public static final int RIGHT = 1; // toevoegen van linker- of rechterkind

  // Constructors
  public BinNode() {
    this( null );
  }

  public BinNode( E userObject ) {
    parent = null;
    leftChild = null;
    rightChild = null;
    this.userObject = userObject;
  }

  public String preOrderToString() {
    buffer = new StringBuffer();
    preOrder();            // roep recursieve methode aan
    return buffer.toString();
  }
  
  private void preOrder() {
    buffer.append( userObject.toString() );
    if( leftChild != null )
      leftChild.preOrder();
    if( rightChild != null )
      rightChild.preOrder();
  }
  public String postOrderToString() {
    buffer = new StringBuffer();
    postOrder();            // roep recursieve methode aan
    return buffer.toString();
  }
  
  private void postOrder() {
    if( leftChild != null )
      leftChild.preOrder();
    if( rightChild != null )
      rightChild.preOrder();
    buffer.append( userObject.toString() );
  }
  
  
  // levelOrderToString() levert het resultaat van
  // een level-order wandeling af in een string
  public String levelOrderToString() {
    buffer = new StringBuffer();
    //q = new ArrayDeque< BKnoop<E> >();
    q = new LinkedList<BinNode<E> >();
    q.add( this );
    levelOrder();   
    return buffer.toString();
  }
  
  private void levelOrder() {
    while( !q.isEmpty() ) {
      BinNode<E> knoop = q.remove();
      buffer.append( knoop.userObject.toString() );
      if( knoop.leftChild != null )
        q.add( knoop.leftChild );
      if( knoop.rightChild != null )
        q.add( knoop.rightChild );
    }
  }
  
  
  
  
  public void add( BinNode<E> newChild ) {
    if( leftChild == null ) 
      insert( newChild, LEFT );
    else
      if( rightChild == null )
        insert( newChild, RIGHT );
      else
        throw new IllegalArgumentException( 
                         "Meer dan 2 kinderen" );
  }

  public E get() {
    return userObject;
  }

  public BinNode<E> getLeftChild() {
    return leftChild;
  }

  public BinNode<E> getRightChild() {
    return rightChild;
  }

  public BinNode<E> getParent() {
    return parent;
  }

  public void insert( BinNode<E> newChild, int childIndex ) {
    if( isAncestor( newChild ) )
      throw new IllegalArgumentException( 
                "Nieuw kind is voorouder" );
    if( childIndex != LEFT && 
        childIndex != RIGHT )
      throw new IllegalArgumentException(
                "Index moet 0 of 1 zijn" );

     if( newChild != null ) {
      BinNode<E> oldParent = newChild.getParent();
      if( oldParent != null )
        oldParent.remove( newChild );
    }

    newChild.parent = this;
    if( childIndex == LEFT )
      leftChild = newChild;
    else
      rightChild = newChild;
  }
  
  public boolean isChild( BinNode<E> aNode ) {
    return aNode == null? 
           false :
           aNode.getParent() == this;
  }

  public boolean isAncestor( BinNode<E> aNode ) {
    BinNode<E> ancestor = this;
    while( ancestor != null && ancestor != aNode )
      ancestor = ancestor.getParent();
    return ancestor != null;
  }

  public void remove( BinNode<E> aChild ) {
    if( aChild == null )
      throw new IllegalArgumentException(
                "Argument is null" );

    if( !isChild( aChild ) )
      throw new IllegalArgumentException(
                "Argument is geen kind" );

    if( aChild == leftChild ) {
      leftChild.parent = null;
      leftChild = null;
    }
    else {
      rightChild.parent = null;
      rightChild = null;
    }
  }

  public String toString() {
    return userObject.toString();
  }
}
