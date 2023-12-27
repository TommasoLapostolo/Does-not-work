// Interfaccia di Map
// Metodi: insert, find, remove;

public interface Map<T> extends Container
{
	void insert( Comparable key, T o );
	
	T find( Comparable key);
	 
	T remove( Comparable key);
}
