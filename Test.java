package school;
import java.util.Scanner;
public class Test 
{
	public static void main(String args[])
	{
	   	ProgramSy pg = new ProgramSy();
	   	pg.Studentchoose = -1;
		Teacher teacher1 = new Teacher(1,"С��","Ů");
		Course course1 = new Course("��ѧ",1,"��101","4:30", teacher1);
		Teacher teacher2 = new Teacher(2,"С��","��");
		Course course2 = new Course("����",2,"��102","5:30",teacher2);
		Teacher teacher3 = new Teacher(3,"����","Ů");
		Course course3 = new Course("Java",3,"��103","6:30",teacher3);
		Student student1 = new Student(123456,"����","��","δѡ��",123456);
		Student student2 = new Student(223456,"��÷÷","Ů","δѡ��",223456);
			System.out.println("Please input your password:");
			Scanner reader = new Scanner(System.in) ;
			
			while(true)
			{
				pg.inputPassword = reader.nextInt();
				
				if(pg.inputPassword == student1.Password)
				{
					System.out.println("Password right!System loading......");
					System.out.println(">>>>>>��ӭ-"+student1.name+"-����ѧ��ѡ��ϵͳ<<<<<<");
					System.out.println("����״̬: "+student1.choose_course);
					break;
				}
				if(pg.inputPassword == student2.Password)
				{
					System.out.println("Password right!System loading......");
					System.out.println(">>>>>>��ӭ-"+student2.name+"-����ѧ��ѡ��ϵͳ<<<<<<");
					System.out.println("����״̬: "+student2.choose_course);
					break;
				}
				else
				{
					System.out.println("û��ѧ����Ӧ�����룬���������Լ������룡");
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
					    	System.out.println("ѡ�γɹ�!");
					    	System.out.println(student1.toString());
					    	break;
					    }
					    if (pg.Studentchoose2 == 2)
					    {
					    	student1.choose_course = course2.name;
					    	System.out.println("ѡ�γɹ�!");
					    	System.out.println(student1.toString());
					    	break;
					    }
					    if (pg.Studentchoose2 == 3)
					    {
					    	student1.choose_course = course3.name;
					    	System.out.println("ѡ�γɹ�!");
					    	System.out.println(student1.toString());
					    	break;
					    }
					}
					

				}
				System.out.println("ѡ�ν���....���롰�˿Ρ������˳���ǰ�γ�....");
				while(true)
				{
					pg.tuike = reader.nextLine();
					pg.tuike = reader.nextLine();
					if (pg.tuike.equals("�˿�"))
					{
						if (pg.inputPassword == 123456)
						{
							System.out.println("�˿γɹ���");
							student1.choose_course = "δѡ��";
							System.out.println("����״̬: "+student1.choose_course);
							break;
						}
						if (pg.inputPassword == 223456)
						{
							System.out.println("�˿γɹ���");
							student2.choose_course = "δѡ��";
							System.out.println("����״̬: "+student2.choose_course);
							break;
						}
					}
					else
					{
						System.out.println("�����˳�..");
						break;
					}
				}
				System.out.println("�����˳�..");
				
			
		
		
		
		
		
		
		

	}
}

