// Interfaccia ArraySortedSet
// Manterremo l'insieme ordinato ad ogni inserimento

public class ArraySortedSet implements SortedSet
{
	// Variabili di esemplare
	private Comparable[] v;
	private int vSize;
	
	// Costruttore
	public ArraySortedSet()
	{
		v = new Comparable[20]; //Dimensione scelta arbitrariamente
		vSize = 0;
	}

	public boolean isEmpty()
	{
		return ( vSize == 0 );
	}
	
	public void makeEmpty()
	{
		vSize = 0;
	}

	public void add( Comparable c )
	{
		// Caso in cui l'ogetto sia già contenuto
		if ( this.contains( c ) )
			return;
			
		// Caso in cui sia pieno l'array
		if ( this.vSize == this.v.length )
			v = ArraySortedSet.resize( v );
			
		// Aggiungo ed riordino con insertionSort x1
		int t = vSize;
		v[vSize++] = c;
		
		while ( ( t > 0 ) && ( v[t].compareTo( v[t - 1] ) < 0 ) ) 
			v[t--] = v[t];
			
		// Inserisco
		v[t] = c;
	}
	
	public boolean contains( Comparable c ) // throws EmptyArraySortedSet
	{
		// if ( this.isEmpty() )
		//	throw new EmptyArraySortedSet();
	
		// binaryResearch
		return ArraySortedSet.binaryResearch( 0, ( this.vSize - 1 ), this.v, c );
	}
	
	// binaryResearch
	private static boolean binaryResearch( int inizio, int fine, Comparable[] a, Comparable c )
	{
		int mid = ( inizio + fine ) / 2;
		Comparable middle = a[mid];
		
		// Casi base
		if ( inizio > fine )
			return false;
		if ( middle.compareTo( c ) == 0 )
			return true;
		// Ricorsione
		if ( middle.compareTo( c ) > 0 )
			return  binaryResearch( inizio, ( mid - 1 ), a, c );
		else
			return  binaryResearch( ( mid + 1 ), fine, a, c );
	}
	
	public Comparable[] toArray() throws EmptyArraySortedSet
	{
		if ( this.isEmpty() )
			throw new EmptyArraySortedSet();
		
		Comparable[] x = new Comparable[vSize];
		System.arraycopy( this.v, 0, x, 0, vSize );
		return x;
	}
	
	private static Comparable[] resize( Comparable[] a )
	{
		Comparable[] x = new Comparable[2 * a.length];
		System.arraycopy( a, 0, x, 0, a.length );
		return x;
	}
	
	// Errore
	private class EmptyArraySortedSet extends RuntimeException
	{
		public EmptyArraySortedSet()
		{
			super();
		}
		
		public EmptyArraySortedSet( String s )
		{
			super( s );
		}
	}
	
	
	
	// Metodo unione
	public static SortedSet union( SortedSet set1, SortedSet set2 )
	{
		SortedSet x = new ArraySortedSet();
	
		Comparable[] s1 = set1.toArray();
		Comparable[] s2 = set2.toArray();
		int i = 0, j = 0;
		// Merge
		while ( ( i < s1.length ) && ( j < s2.length ) )
		{
			if ( s1[i].compareTo( s2[j] ) > 0 )
				x.add( s2[j++] ); 
			else if ( s1[i].compareTo( s2[j] ) < 0 )
				x.add( s1[i++] );
			else 
			{
				x.add( s1[i++] );
				j++;			
			}	
		}
		
		// Finisco di svuotare
		while ( i < s1.length )
			x.add( s1[i++] );
		while ( j < s2.length )
			x.add( s2[j++] );
			
		return x;
	}
	
	// Metodo intersezione
	public static SortedSet intersection( SortedSet set1, SortedSet set2 )
	{
		SortedSet x = new ArraySortedSet();
	
		Comparable[] s1 = set1.toArray();
		Comparable[] s2 = set2.toArray();
		
		// Intersezione
		for ( int i = 0, j = 0; i < s1.length; i++ )
		{
			while ( ( j < s2.length ) && ( s1[i].compareTo( s2[j] ) > 0 ) )
				j++;
				
			if ( j == s2.length )
				break;
				
			if ( s1[i].compareTo( s2[j] ) == 0 )
			{
				x.add( s1[i] );
				j++;
			}
		}	
	
		return x;
	}
	
	// Metodo complementare
	public static SortedSet subtract( SortedSet set1, SortedSet set2 )
	{
		SortedSet x = new ArraySortedSet();
	
		Comparable[] s1 = set1.toArray();
		Comparable[] s2 = set2.toArray();
		
		// Sottrazione
		int i = 0;
		for ( int j = 0; i < s1.length; i++ )
		{
			while ( ( j < s2.length ) && ( s1[i].compareTo( s2[j] ) > 0 ) )
				j++;
				
			if ( j == s2.length )
				break;
				
			if ( s1[i].compareTo( s2[j] ) != 0 )
			{
				x.add( s1[i] );
				j++;
			}
		}	
			while ( i < s1.length )
				x.add( s1[i++] );
	
		return x;
	}
}
