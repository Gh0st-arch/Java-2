package school;

public class ProgramSy 
{
	String tuike;
	int inputPassword;
	void inputPassword(int p)
	{
		this.inputPassword = p;
	}
	int Studentchoose;
	void Studentchoose(int a)

	{
		this.Studentchoose = a;
	}
	int Studentchoose2;
	void Studentchoose2(int b)
	{
		this.Studentchoose2 = b;
	}
	void showsy()
	{
		System.out.println("①显示老师列表");
		System.out.println("②显示课程列表");
		System.out.println("③选择课程");
		System.out.println("输入0退出程序");
		System.out.println("Please input your choose:");
	}
}
