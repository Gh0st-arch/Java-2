package school;

public class Course 
{
	Teacher teacher;
	String name,place,time;
	int number;
	Course(String name,int number,String place,String time,Teacher teacher)
	{
		this.name = name;
		this.number = number;
		this.place = place;
		this.time = time;
		this.teacher = teacher;
	}
	public String toString()
	{
		return "编号:"+number+" 课程名称:"+name+" 上课地点:"+place+" 上课时间:"+time+" 老师:"+teacher.name;
	}

}
