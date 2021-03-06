# Java-2
Java实验3仓库

## 实验目的
  1.初步了解分析系统需求，从学生选课角度了解系统中实体及其关系，学会定义类中的属性以及方法；
  
  2.掌握面向对象的类设计方法（属性、方法）；
  
  3.掌握类的继承用法，通过构造方法实例化对象；
  
  4.学会使用super(),用于实例化子类;
  
  5.掌握使用Object根类的toString()方法，应用在相关对象的信息输出中。
## 实验要求
   1.说明：学校有“人员”，分为就“教师”和“学生”，教师教授“课程”，学生选择“课程”。从简化系统考虑，每名教师仅教授一门课程，每门课程的授课教师也仅有一位，每名学生选仅选一门课程。
   
   2.对象：
         人员（编号、姓名、性别）;
         教师（编号、姓名、性别）;
         课程（课程名称、编号、上课地点、上课时间、授课老师）;
         学生（编号、姓名、性别、选择课程、学生密码）;
         
   (1)编写上述实体类以及测试主类（注意类之间继承关系的适用）;
   
   (2)在测试主类中，实例化多个类试题，模拟学生选课操作、打印课程信息（信息包括：编号、课程名称、上课地点、时间、授课教师）;
   
   (3)模拟学生退课操作，再打印课程信息。
 ## 实验过程
   首先明确该实验程序里面所有使用的对象的类型，一共有测试主类(Test)、人员(People)、教师(Teacher)、学生(Student)、程序(ProgramSy)、课程(Course)这六类，然后找寻这六类之中存在的关系。
   
   1.主类是用以测试程序所用，他将运用人员类，教师类，学生类，并且由程序类的属性来贯穿测试这个程序。
   
   2.人员作为一个父类，因为无论是教师，学生，都是人员，将继承人员的属性，所以人员和教师学生这两类为主副类的关系，人员是父类，教师和学生为子类。
   
   3.课程类不属于人员，所以单独作为一类，但课程由老师教授，所以课程类里有老师类的老师属性。
   
   4.学生需要选择课程，所以学生类里拥有课程属性
   
   5.学校的人员里不可能只有一个学生，所以学生里属性还有一个密码，通过密码来判断你是哪个学生，然后每个学生都可以选自己想要的一门课程。
   
   6.系统类里拥有显示该选课系统列表的效果，提供学生选项以选择。还有一些用于判定的属性。
   
   明确了各个类型之间的关系后，开始编写Test主类。
   
   首先分别用学生、课程、教师这三个类型的构造方法，分别构造了2个学生，3个课程和3个老师。构造方法分别为Student、Course、Teacher，对应代码会在核心代码处展示。
   
   然后程序的最开始将会接收学生的密码，密码对应了不同的学生，只有输入正确的密码才能登入自己的选课系统，如果密码没有任何一个与之对应的学生，那么将会提示学生输入正确的密码，并且直到输入正确为止。
   
   密码输入后会显示欢迎界面由ProgramSy里的showsy()来完成(部分代码会再核心代码处展示)。
   
   showsy()显示出以下列表给学生提供选择(这里以其中之一的学生name为道哥的为例):
   ```
   您的状态: 未选课
   ①显示老师列表
   ②显示课程列表
   ③选择课程
   输入0退出程序
   ```
   学生可以先查看老师列表，会显示老师的一些信息，然后查看课程列表，显示每个课程的信息（包括这个课程是哪个老师教），然后选择3选项来选择课程。
   
   选择课程后，将会显示学生现在选择课程的状态。
   
   然后会进入退课阶段，如果学生想要退课，则直接输入“退课”即可（这里的if判定要用equals来完成，因为“退课”是String型而不是int型），如果不想退课可以直接按回车跳过该过程，然后程序结束。
 ## 流程图
 ![result](https://github.com/Gh0st-arch/Java-2/blob/main/img/1.jpg)
 ## 核心代码

1.
```
  Course(String name,int number,String place,String time,Teacher teacher)  //课程构造方法
	 {
		 this.name = name;
		 this.number = number;
		 this.place = place;
		 this.time = time;
		 this.teacher = teacher;
  	}
```
2.
```
   Teacher(int number, String name,String sex) //老师的构造方法
	{
		super(number,name,sex);//老师继承父类人员的属性，直接用super实例化子类
	}
```
3.
```
  Student (int number,String name,String sex,String choose_course,int Password)//学生类构造方法
	{
		super(number,name,sex);//用super来实例化子类的number name sex
		this.choose_course = choose_course;//学生不同于父类的特殊属性——选择课程，用以记录学生选择的哪个课程，构造时为“未选择”
		this.Password = Password;//学生不同于父类的特殊属性——密码，只有输入正确的密码才能找到对应的那个学生
	}
```
4.
```
  void showsy()//ProgramSy里的showsy()函数用以展示列表以提供学生选择
	{
		System.out.println("①显示老师列表");
		System.out.println("②显示课程列表");
		System.out.println("③选择课程");
		System.out.println("输入0退出程序");
		System.out.println("Please input your choose:");
	}
```
5.
```
    while(true)//对于一个密码对应一个学生的判定方式
			{
				pg.inputPassword = reader.nextInt();
				
				if(pg.inputPassword == student1.Password)//如果输入密码等于学生1的密码则显示学生1的信息
				{
					System.out.println("Password right!System loading......");
					System.out.println(">>>>>>欢迎-"+student1.name+"-来到学生选课系统<<<<<<");
					System.out.println("您的状态: "+student1.choose_course);
					break;
				}
				if(pg.inputPassword == student2.Password)//同上
				{
					System.out.println("Password right!System loading......");
					System.out.println(">>>>>>欢迎-"+student2.name+"-来到学生选课系统<<<<<<");
					System.out.println("您的状态: "+student2.choose_course);
					break;
				}
				else
				{
					System.out.println("没有学生对应该密码，请输入你自己的密码！");//若密码输入错误，没有一个对应的学生，则提示错误，并返回重新输入
				}
			}
```
6.
```
  public String toString()// Course类里的toString()方法输出，其余类同Course
	{
		return "编号:"+number+" 课程名称:"+name+" 上课地点:"+place+" 上课时间:"+time+" 老师:"+teacher.name;
	}
```

## 系统运行截图
![result](https://github.com/Gh0st-arch/Java-2/blob/main/img/QQ%E6%88%AA%E5%9B%BE20201024160116.png)
## 编程感想
   通过本次实验编程，我对于类之间的关系和逻辑更加清晰，初步的了解了分析系统需求，从学生选课角度了解系统中实体及其关系，学会定义类中的属性以及方法，掌握面向对象的类设计方法（属性、方法），并且掌握了类的继承用法，直到如何用extend来将类与类之间继承，懂得子类父类的属性关系，并通过构造方法实例化对象，其次，我学会了使用super(),用于实例化子类，最后，在实验的各种需要输出的地方，掌握了使用Object根类的toString()方法。编程整体罗思路更加清晰，对java这种面向对象的编程进一步熟悉。
