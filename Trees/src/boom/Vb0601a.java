package boom;

// Voorbeeld 6.1a Boomwandeling
import java.util.*;

public class Vb0601a {
  public static void main( String args[] ) {
      BinNode<String> root;
    BKnoop_1 <String> knoopB, knoopC, knoopD,
                   knoopE, knoopF, knoopG;

    // Maak eerst alle knopen
    root = new BinNode<String>( "A" );
    knoopB = new BinNode<String>( "B" );
    knoopC = new BinNode<String>( "C" );
    knoopD = new BinNode<String>( "D" );
    knoopE = new BinNode<String>( "E" );
    knoopF = new BinNode<String>( "F" );
    knoopG = new BinNode<String>( "G" );

    // Verbind nu ouders en kinderen met elkaar
    root.add( knoopB );
    root.add( knoopC );

    knoopB.add( knoopD );
    knoopB.add( knoopE );

    knoopE.add( knoopF );
    knoopE.add( knoopG );
    //System.out.println( root.preOrderToString() );
    
    //knoopC.insert( knoopE, BKnoop.LEFT );
    //System.out.println( root.preOrderToString() );
    
    System.out.println( root.levelOrderToString());
  }
}


