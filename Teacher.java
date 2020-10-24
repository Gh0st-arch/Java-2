package school;

public class Teacher extends People
{
	Teacher(int number, String name,String sex) 
	{
		super(number,name,sex);
	}
	public String toString()
	{
		return "±àºÅ:"+number+" ĞÕÃû:"+name+" ĞÔ±ğ:"+sex;
	}

}
