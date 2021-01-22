package annotation;

/**
 * Author:ZJF
 * Date:2021-01-22 上午9:26
 */
public class Annotation02 {
}

@Deprecated
class AA {

    @Deprecated
    private int num1 = 300;

	/*
	 *  @Documented
		@Retention(RetentionPolicy.RUNTIME)
		@Target(value={CONSTRUCTOR, FIELD, LOCAL_VARIABLE, METHOD, PACKAGE, PARAMETER, TYPE})
		public @interface Deprecated {
		}
	 */

    @Deprecated
    public void hi() { //方法过时
        System.out.println("hi");
    }

    public AA() {

    }

    @Deprecated
    public AA(String name) {

    }
}
