package school;
import java.util.Scanner;
public class Test 
{
	public static void main(String args[])
	{
	   	ProgramSy pg = new ProgramSy();
	   	pg.Studentchoose = -1;
		Teacher teacher1 = new Teacher(1,"小红","女");
		Course course1 = new Course("数学",1,"教101","4:30", teacher1);
		Teacher teacher2 = new Teacher(2,"小明","男");
		Course course2 = new Course("语文",2,"教102","5:30",teacher2);
		Teacher teacher3 = new Teacher(3,"杨涛","女");
		Course course3 = new Course("Java",3,"教103","6:30",teacher3);
		Student student1 = new Student(123456,"道哥","男","未选课",123456);
		Student student2 = new Student(223456,"韩梅梅","女","未选课",223456);
			System.out.println("Please input your password:");
			Scanner reader = new Scanner(System.in) ;
			
			while(true)
			{
				pg.inputPassword = reader.nextInt();
				
				if(pg.inputPassword == student1.Password)
				{
					System.out.println("Password right!System loading......");
					System.out.println(">>>>>>欢迎-"+student1.name+"-来到学生选课系统<<<<<<");
					System.out.println("您的状态: "+student1.choose_course);
					break;
				}
				if(pg.inputPassword == student2.Password)
				{
					System.out.println("Password right!System loading......");
					System.out.println(">>>>>>欢迎-"+student2.name+"-来到学生选课系统<<<<<<");
					System.out.println("您的状态: "+student2.choose_course);
					break;
				}
				else
				{
					System.out.println("没有学生对应该密码，请输入你自己的密码！");
				}
			}
			pg.showsy();
				while (pg.Studentchoose != 0)
				{
					pg.Studentchoose = reader.nextInt();
					if(pg.Studentchoose == 1)
					{
						System.out.println(teacher1.toString());
						System.out.println(teacher2.toString());
						System.out.println(teacher3.toString());
					}
					if(pg.Studentchoose == 2)
					{
						System.out.println(course1.toString());
						System.out.println(course2.toString());
						System.out.println(course3.toString());
					}
					if(pg.Studentchoose == 3)
					{
						System.out.println("Please input your course what you want to choose:");
					    pg.Studentchoose2 = reader.nextInt();
					    if (pg.Studentchoose2 == 1)
					    {
					    	student1.choose_course = course1.name;
					    	System.out.println("选课成功!");
					    	System.out.println(student1.toString());
					    	break;
					    }
					    if (pg.Studentchoose2 == 2)
					    {
					    	student1.choose_course = course2.name;
					    	System.out.println("选课成功!");
					    	System.out.println(student1.toString());
					    	break;
					    }
					    if (pg.Studentchoose2 == 3)
					    {
					    	student1.choose_course = course3.name;
					    	System.out.println("选课成功!");
					    	System.out.println(student1.toString());
					    	break;
					    }
					}
					

				}
				System.out.println("选课结束....输入“退课”可以退出当前课程....");
				while(true)
				{
					pg.tuike = reader.nextLine();
					pg.tuike = reader.nextLine();
					if (pg.tuike.equals("退课"))
					{
						if (pg.inputPassword == 123456)
						{
							System.out.println("退课成功！");
							student1.choose_course = "未选课";
							System.out.println("您的状态: "+student1.choose_course);
							break;
						}
						if (pg.inputPassword == 223456)
						{
							System.out.println("退课成功！");
							student2.choose_course = "未选课";
							System.out.println("您的状态: "+student2.choose_course);
							break;
						}
					}
					else
					{
						System.out.println("程序退出..");
						break;
					}
				}
				System.out.println("程序退出..");
				
			
		
		
		
		
		
		
		

	}
}

