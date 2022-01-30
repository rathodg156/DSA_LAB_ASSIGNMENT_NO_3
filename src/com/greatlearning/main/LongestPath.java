package com.greatlearning.main;

import java.util.ArrayList;

public class LongestPath {
	static class Node {
		int data;
		Node left, right;
		
		public Node( int data ) {
			this.data = data;
			left = right = null; 
		}
	}
	
	private static ArrayList findLongestPath( Node root ) {
		// reached a leaf node
		if( root.left == null && root.right == null ) {
			ArrayList a = new ArrayList();
			a.add( root.data );
			return a;
		}
		
		// L = the longest path in the left subtree (root.left) - make a recursive call 
		ArrayList L = findLongestPath( root.left );
		// R = the longest path in the right subtree (root.right) - make a recursive call 
		ArrayList R = findLongestPath( root.left );
		
		// compare the size of L, R (use the size() method)
		if( L.size() > R.size() ) {
			// pick the longer list, and add() to that list
			// return that list
			L.add( root.data );
			return L;
		} else {
			R.add( root.data );
			return R;
		}
	}
	
	public static void main( String[] args ) {
		Node root = new Node( 100 );
		root.left = new Node( 20 );
		root.right = new Node( 130 );
		root.left.left = new Node( 10 );
		root.left.right = new Node( 50 );
		root.right.left = new Node( 110 );
		root.right.right = new Node( 140 );
		root.left.left.left = new Node( 5 );
		
		ArrayList longestPath = findLongestPath( root );
		System.out.println( "Longest Path Size is :" + longestPath.size() );
		
		for( int i = longestPath.size() - 1; i >= 0; i-- ) {
			System.out.print( longestPath.get( i ) + " ");
		}
	}
}
