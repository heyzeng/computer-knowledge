package annotation;

/**
 * Author:ZJF
 * Date:2021-01-22 上午9:24
 */
public class annotation01 {
    public static void main(String[] args) {

        int i = 10;
    }
}

class Father{//父类
    public void fly(){
        System.out.println("Father fly...");
    }
}


class Son extends Father {//子类

	/*
	 *  //@Target 就是一个元注解(修饰说明注解的注解)：指定注解使用在哪些元素 ElementType.METHOD
	 * 	@Target(ElementType.METHOD)
	 *  //@Retention  表示注解的作用范围 ：比如这里 RetentionPolicy.SOURCE说明 Override在源码有效(即编译)
		@Retention(RetentionPolicy.SOURCE)
		public @interface Override { //@interface 表示后面是一个注解
		}
	 *
	 */

    @Override   //说明重写父类的方法
    public void fly() {
        System.out.println("Son fly....");
    }
}
