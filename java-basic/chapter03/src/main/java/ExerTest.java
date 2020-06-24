

/*
		后++ ：先运算（赋值）再自加1
		前++ ：先自加1  再运算（赋值）
		后-- ：先运算（赋值）再自减1
		前-- ：先自减1  再运算（赋值）
*/
public class ExerTest {
    public static void main(String[] args) {

        int x = 1;
        int y=1;

        if(x++==2 & ++y==2){
            x =7;
        }
        System.out.println("x="+x+",y="+y);
    }
}
