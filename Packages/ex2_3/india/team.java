package india;
public class team
{
     String pname;
     String pos;
     String nickname;

     public void display(String tpname,String tpos,String tnickname)
	 {
		 pname=tpname;
	pos=tpos;
	nickname=tnickname;
         System.out.println("The Player Name is "+pname+" and his position is "+pos+" and his nickname is "+nickname);
     }
}