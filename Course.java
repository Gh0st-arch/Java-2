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
		return "���:"+number+" �γ�����:"+name+" �Ͽεص�:"+place+" �Ͽ�ʱ��:"+time+" ��ʦ:"+teacher.name;
	}

}
