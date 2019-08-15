package interview;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test {
	    public static void main( String[] args )
	    {
	        String s = "Today is the happiest day of my life";
	        String[] word = s.split( " " );
	        String str = " ";
	        for ( int i = 0; i < word.length; i++ )
	        {
	            if ( word[i].length() > str.length() )
	                str = word[i];

	        }
	        System.out.println( str );
	    }
}
	/*public static void main(String args[])throws IOException
	{
		String s,str;
		char b;
		int c=0,i,l,p=0,max=0;;
		InputStreamReader x=new InputStreamReader(System.in);
		BufferedReader y=new BufferedReader(x);
		System.out.println("ENTER A STRING");
		s=y.readLine();
		s=s.concat(" ");
		l=s.length();
		for(i=0;i<l;i++)
		{
			b=s.charAt(i);
			if(b!=' ')
			{
				c=c+1;
			}
			else
			{
				if(c>max)
				{
					max=c;
					p=i;
				}
				c=0;
			}
		}
		str=s.substring(p-max,p);
		System.out.println(str+" "+max);
		}
		}*/