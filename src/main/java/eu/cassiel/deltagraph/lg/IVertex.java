//	$Id$
//	$Source$

package eu.cassiel.deltagraph.lg;


/**	Vertex, carrying property map.

	@author Nick Rothwell, nick@cassiel.com / nick@loadbang.net
 */

public interface IVertex extends IExtensible<IVertex> {
	/**	Get the vertex's ID - either globally unique, or (depending on underlying
 		implementation) referring to the graph. Currently used only in tests.
 	
		@return the ID
	 */

	int getId();
}
