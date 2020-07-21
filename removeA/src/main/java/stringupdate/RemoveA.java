package stringupdate;

public class RemoveA {

	public String remove(String s)
	{
		String ans="";
		if(s.length()>=2)
		{
			if(s.charAt(0)!='A')
				ans+=s.charAt(0);
			if(s.charAt(1)!='A')
				ans+=s.charAt(1);
			if(s.length()>2)
				ans+=s.substring(2);
		}
		else
		{
			if(s.length()==1)
			{
				if(s.charAt(0)!='A')
					return s;
			}
		}
		return ans;
	}

}
