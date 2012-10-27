package org.sirix.index.value.interfaces;

/**
 * Mutable AVLNode.
 * 
 * @author Johannes Lichtenberger
 * 
 */
public interface MutableAVLNode<K extends Comparable<? super K>, V> extends
		ImmutableAVLNode<K, V> {
	/**
	 * Set left child.
	 * 
	 * @param left
	 *          child pointer
	 */
	void setLeftChildKey(long left);

	/**
	 * Set right child.
	 * 
	 * @param right
	 *          child pointer
	 */
	void setRightChildKey(long right);

	/**
	 * Flag which determines if node is changed.
	 * 
	 * @param changed
	 *          flag which indicates if node is changed or not
	 */
	public void setChanged(boolean changed);
}
