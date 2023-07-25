public class WCount
{
	public static void main(String args[])
	{
		String s="pwwkew";
        String res=String.valueOf(s.charAt(0));//a
        int temp=0;
        if(s.length()>1)
        {
        for(int i=1;i<s.length();i++)//bc
        {
            if(!res.contains(Character.toString(s.charAt(i))))//a!b,b!c
            {
                res+=String.valueOf(s.charAt(i));//abc
				//System.out.println(res.length());
            }
            else
            {
				//System.out.println(res.length());
                if(res.length()>temp)
                {
                    temp=res.length();
                }
                res="";
            }
        }
		 if(res.length()>temp)
                {
                    temp=res.length();
                }
             System.out.println(temp);
        }
        else
        {
           System.out.println("1");
        }
       

	}
}