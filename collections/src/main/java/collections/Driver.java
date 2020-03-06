package collections;

import java.util.Scanner;

import org.apache.logging.log4j.LogManager;

public class Driver {
	private static final org.apache.logging.log4j.Logger priya2 =LogManager.getLogger(Driver.class);

	public static void main(String args[])
	{
		
		Define<Integer> l=new Define<Integer>();
		while(true)
		{
			Scanner s=new Scanner(System.in);
			String ch=s.next();
		
			if (ch.equals("1"))
			{
				priya2.info(l);
			}
			else if(ch.equals("2"))
			{
				while(true) {
					int num=s.nextInt();
					if(num==0)
					{   System.out.println("hhhhhh");
						break;
					}
					else {
						l.add(num);
					}
				}
			}
			else if(ch.equals("3"))
			{
				int pos=s.nextInt();
				l.remove(pos);
			}
			else if(ch.equals("4"))
			{
				priya2.info(l.get(s.nextInt()));
			}
			else {
				break;
			}
		}
		
	}

}
