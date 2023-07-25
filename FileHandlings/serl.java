import java.io.*;
public class serl
{
	public static void main(String args[])
	{
		employee o=new employee("raja",24,"24,West Street");
		o.setX(10);
		try
		{
			FileOutputStream oFO=new FileOutputStream("seril.txt");
			ObjectOutputStream oObjOut= new ObjectOutputStream(oFO);
			oObjOut.writeObject(o);
			oFO.close();
			oObjOut.close();
			System.out.println("serialized"+o);
		}catch(IOException ex){System.out.println("expn");}
	try
		{
			FileInputStream oFI=new FileInputStream("seril.txt");
			ObjectInputStream oObjInp= new ObjectInputStream(oFI);
			employee oE=(employee)oObjInp.readObject();
			System.out.println("deserialized : "+oE);
			System.out.println("deserializedX : "+oE.getX());
			
			oFI.close();
			oObjInp.close();
		}catch(IOException x){System.out.println("expn");}
		catch(ClassNotFoundException fex){System.out.println("expn");}
	}
}
class employee implements Serializable
{
	String Name;
	int Age ;
	String Address;
	transient int X;
	public employee(String Name,int Age,String Address)
	{
		this.Name=Name;
		this.Age=Age;
		this.Address=Address;
	}
	public void setName(String Name)
	{
		this.Name=Name;
	}
	public void setAge(int Age)
	{
		this.Age=Age;
	}
	public void setAddress(String Address)
	{
		this.Address=Address;
	}
	public String getName()
	{
		return Name;
	}
	public void setX(int X)
	{
		this.X=X;
	}
	public int getX()
	{
		return X;
	}
	
	public int getAge()
	{
		return Age;
	}
	public String getAddress()
	{
		return Address;
	}
	public String toString()
	{
		return ("employee Name : "+Name+" ; Age : "+Age+" ; Address : "+Address);
	}	
}