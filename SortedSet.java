// Interfaccia SortedSet
// Metodi toArray, contains, add;

public interface SortedSet extends Container
{
	void add( Comparable c );
	
	boolean contains( Comparable c );
	
	Comparable[] toArray();
}
