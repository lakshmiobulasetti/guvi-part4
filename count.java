import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	String data = "luckyraj";

System.out.println("String to count the character is : "+ data);

int countUsingLength = data.length();

System.out.println("Uing String.length : "+ countUsingLength);

char[] charArr = data.toCharArray();

System.out.println("Using Array.length : "+ charArr.length);

Set<Character> uniqueCharSet = new HashSet<Character>();

int countUsingArray= 0 ;

int countWithoutSpace= 0 ;

Character space = new Character(' ');

for(char c : charArr) {

countUsingArray++;

if(new Character(c).equals(space)) {

continue;

}else {

countWithoutSpace++;

}

uniqueCharSet.add(c);

}

System.out.println("Using Array : "+ countUsingArray);

System.out.println("Without Space : "+countWithoutSpace);

System.out.println("Unique Count : "+uniqueCharSet.size());

	}
}
