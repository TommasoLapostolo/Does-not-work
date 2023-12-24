// Tester di ArraySet

import java.util.Random; 
import java.util.Scanner;

public class TesterSortedArraySet
{
	public static void main(String[] args)
	{		
		// Caso 1
		// Creo l'oggetto Random
		/*
		Random rad = new Random();
		
		// Creo l'oggetto Set
		SortedSet set1 = new ArraySortedSet();
		
		//System.out.println(" vSize: " + set1.vSize );
		//System.out.println(" v.length: " + set1.v.length );
		
		for ( int i = 0; i < 22; i ++ )
		{
			Comparable z = (Comparable)(Integer.valueOf( rad.nextInt( 50 ) ));
			set1.add(z);
			//System.out.println(" vSize: " + set1.vSize );
			//System.out.println(" v.length: " + set1.v.length );
		}
		
		// Creo un altro oggetto Set
		SortedSet set2 = new ArraySortedSet();
		
		for ( int i = 0; i < 10; i ++ )
		{
			Comparable z = (Comparable)(Integer.valueOf( rad.nextInt( 50 ) ));
			set2.add(z);
		}
		
		// Stampo elementi di set1
		Comparable[] a = set1.toArray();
		System.out.println("Insieme 1: ");
		
		for ( int i = 0; i < a.length; i ++ )
		{
			System.out.print( a[i] + " " );
		}
		System.out.println();
	
		// Stampo elementi di set2
		a = set2.toArray();
		System.out.println("Insieme 2: ");
		
		for ( int i = 0; i < a.length; i ++ )
		{
			System.out.print( a[i] + " " );
		}
		System.out.println();
		
		// Stampo unione
		SortedSet f = (SortedSet)(ArraySortedSet.union( set1, set2 ));
		
		a = f.toArray();
		System.out.println("Insieme unione: ");
		
		for ( int i = 0; i < a.length; i ++ )
		{
			System.out.print( a[i] + " " );
		}
		System.out.println();
		
		// Stampo intersezione
		f = (SortedSet)(ArraySortedSet.intersection( set1, set2 ));
		
		a = f.toArray();
		System.out.println("Insieme intersezione: ");
		
		for ( int i = 0; i < a.length; i ++ )
		{
			System.out.print( a[i] + " " );
		}
		System.out.println();
		
		// Stampo il complementare
		f = (SortedSet)(ArraySortedSet.subtract( set1, set2 ));
		
		a = f.toArray();
		System.out.println("Insieme complementare: ");
		
		for ( int i = 0; i < a.length; i ++ )
		{
			System.out.print( a[i] + " " );
		}
		System.out.println();
		*/
		
		
		// Caso 2
		// Creo l'oggetto Set
		ArraySortedSet set1 = new ArraySortedSet();
		
		// Creo un altro oggetto Scanner
		Scanner console = new Scanner( System.in );
		
		System.out.println("Dammi 22 numeri interi: ");
		for ( int i = 0; i < 22; i ++ )
		{
			Comparable z = (Comparable)(Integer.valueOf( console.next() ));
			set1.add(z);
		}
		
		// Creo un altro oggetto Set
		ArraySortedSet set2 = new ArraySortedSet();
		
		System.out.println("Dammi 10 numeri interi: ");
		for ( int i = 0; i < 10; i ++ )
		{
			Comparable z = (Comparable)(Integer.valueOf( console.next() ));
			set2.add(z);
		}
		
		// Stampo elementi di set1
		Comparable[] a = set1.toArray();
		System.out.println("Insieme 1: ");
		
		for ( int i = 0; i < a.length; i ++ )
		{
			System.out.print( a[i] + " " );
		}
		System.out.println();
	
		// Stampo elementi di set2
		a = set2.toArray();
		System.out.println("Insieme 2: ");
		
		for ( int i = 0; i < a.length; i ++ )
		{
			System.out.print( a[i] + " " );
		}
		System.out.println();
		
		// Stampo unione
		ArraySortedSet f = (ArraySortedSet)(ArraySortedSet.union( set1, set2 ));
		
		a = f.toArray();
		System.out.println("Insieme unione: ");
		
		for ( int i = 0; i < a.length; i ++ )
		{
			System.out.print( a[i] + " " );
		}
		System.out.println();
		
		// Stampo intersezione
		f = (ArraySortedSet)(ArraySortedSet.intersection( set1, set2 ));
		
		a = f.toArray();
		System.out.println("Insieme intersezione: ");
		
		for ( int i = 0; i < a.length; i ++ )
		{
			System.out.print( a[i] + " " );
		}
		System.out.println();
		
		// Stampo il complementare
		f = (ArraySortedSet)(ArraySortedSet.subtract( set1, set2 ));
		
		a = f.toArray();
		System.out.println("Insieme complementare: ");
		
		for ( int i = 0; i < a.length; i ++ )
		{
			System.out.print( a[i] + " " );
		}
		System.out.println();	
			
	}
}
