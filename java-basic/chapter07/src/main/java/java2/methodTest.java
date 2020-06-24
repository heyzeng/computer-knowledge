package java2;/*

 	方法：

 		一 常见的方法格式案例：
 				public void show(){} //无返回值无参
 				public int getAge(){} //有返回值无参
 				public void setAge(int age){} //有参无返回值
 				public String getInfo(String name){}//有参且有返回值

 		二 方法的格式
 				权限修饰符    返回值类型   方法名（形参列表）{
 						方法体;
 				}

 		 说明：
 		 	1.权限修饰符 ：可以使用四种权限修饰符-public protected private 缺省的
 		 	2.返回值类型 ：void （无返回值）/ 具体的类型(基本数据类型和引用数据)
 		 			具体的类型 ：必须在方法的最后进行return返回一个具体的数据
 		 			return的作用 ： 1.返回一个结果  2.结束当前方法
 		 	3.方法名只要遵守标识符的规则和规范即可。（xxxYyyZzz）
 		 	4.形参列表 ：可以是0个1个或多个。多个之间用","分开
 				作用：形参列表是为了告诉方法的调用者，调用此方法需要传递数据和传递的数据类型
 			5.方法体 ：方法功能的具体的实现。如果不调用方法，方法体不执行。
 */

public class methodTest {
    public static void main(String[] args) {

        Method method = new Method();
        int age  = method.getAge();
        System.out.println(age);

        method.run();

        method.test();

        method.say();

        method.info(10,"Jude");

        method.plus(1,3);

        String xxx = method.getName();
        System.out.println(xxx);




    }
}

class Method{

    /*
     * return在无返回值方法中的作用
     */
    public void test(){
        for (int i = 0; i <100; i++) {

            System.out.println(i);

            if(i == 5){
                return; //作用 ：结束当前方法
            }
        }

        System.out.println("over");
    }


    public void run(){
        System.out.println("run......");
        say();
        System.out.println("......run....");
        //run();不要自己调用自己（除递归外），会发生StackOverFlowError
    }


    void say(){
        System.out.println("say.......");
    }



    public void info(int age,String name){
        System.out.println(age + " " + name);
    }

    //方法作用 ：用来计算两个数的和
    public void plus(int a,int b){ //形参列表是为了告诉方法的调用者，调用此方法需要传递数据和传递的数据类型。
        System.out.println(a + b);
    }

    /*
     * 有返回值
     */
    public int getAge(){

        //如何返回一个数据 - return
//		return 10;
        int a = 30;
        return a; //必须是一个具体的值 或者是含有有具体值的变量。
    }


    public String getName(){

        boolean boo = false;
		/*
		if(boo){
			return "aaa"; //作用 ： 1.返回一个结果  2.结束当前方法
		}

		return "bbb";
		*/

        if(boo){
            return "aaa";
        }else{
            return "bbb";
        }

		/*
		 * 下面的两种方式完全不一样
		if(boo){
			System.out.println("aaa");
		}
		System.out.println("bbb");

		if(boo){
			System.out.println("aaa");
		}else{
			System.out.println("bbb");
		}
		*/
    }

    private void demo(int a,int b){

    }

    public void show(int a){

    }
}
















