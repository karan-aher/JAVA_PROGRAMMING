class Stringbufferexample
{
	public static void main(String args[])
	{
		StringBuffer sb = new StringBuffer("Hello");
		
		sb.append("world");
		System.out.println(sb);
		
		sb.insert(5,",");
		System.out.println(sb);
		
		sb.delete(4,7);
		System.out.println(sb);
		
		sb.reverse();
		System.out.println(sb);
		
		 
	}
} 

/*
OUTPUT
=======
C:\Users\PL19\Desktop\Karan Aher SYCO>javac Stringbufferexample.java

C:\Users\PL19\Desktop\Karan Aher SYCO>java Stringbufferexample
Helloworld
Hello,world
Helloorld
dlroolleH

*/
