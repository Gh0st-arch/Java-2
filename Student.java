package school;

public class Student extends People
{
	int Password;
	String choose_course;
	Student (int number,String name,String sex,String choose_course,int Password)
	{
		super(number,name,sex);
		this.choose_course = choose_course;
		this.Password = Password;
	}
	public String toString()
	{
		return "编号:"+number+" 姓名:"+name+" 性别:"+sex+" 选择课程:"+choose_course;
	}
}
