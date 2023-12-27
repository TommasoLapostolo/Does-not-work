// Classe Map
// Metodi prima elencati
// Classe interna Pair



public class ArrayMap<T> implements Map
{
	// Classe interna Pair
	private class Pair<T>
	{
		// Variabili di esemplare
		private Comparable key;
		private T obj;
		
		// Costruttore
		public Pair( Comparable k, T o )
		{
			key = k;
			obj = o;
		}
		
		// Metodi di accesso
		public Comparable getKey()
		{
			return key;
		}
		
		public T getElement()
		{
			return obj;
		}
		
		// Metodi modificatori
		public void setKey( Comparable k )
		{
			key = k;
		}
	
		public void setElement( T e )
		{
			obj = e;
		}
	}

	// Variabili di esemplare
	private Pair<T>[] v;
	private int vSize;
	
	// Costruttore
	public ArrayMap()
	{
		v = new Pair[20]; // Valore arbitrario
		vSize = 0;
	}
	
	// Metodi implementati
	public void insert( Comparable key, T o )
	{
	
	}
	
	public T find( Comparable key)
	{
		return null;
	}
	 
	public T remove( Comparable key)
	{
		return null;
	}

	public boolean isEmpty()
	{
		return false;
	}
	
	public void makeEmpty()
	{
	
	}
}
