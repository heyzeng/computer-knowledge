

public class familyAccount {
    public static void main(String[] args) {

		/*
		 * -----------------家庭收支记账软件-----------------

                   1 收支明细
                   2 登记收入
                   3 登记支出
                   4 退    出

                   	请选择(1-4)：4
		 */
        // 控制循环
        boolean flag = true;
        //初金额
        int balance = 10000;
        //明细
        String details = "收支\t账户金额\t收支金额\t说    明";

        do {
            //登录页面
            System.out.println(" -----------------家庭收支记账软件-----------");
            System.out.println(" -----------------1 收支明细----------------");
            System.out.println("------------------2 登记收入----------------");
            System.out.println("------------------3 登记支出----------------");
            System.out.println("------------------4 退    出----------------");
            System.out.println("------------------请选择(1-4)：--------------");


            //选择读取菜单栏
            char menuSelection = Utility.readMenuSelection();
            switch (menuSelection){
                case '1': //读取收支明细
                    System.out.println("当前收支明细");
                    System.out.println(details);
                    System.out.println("----------");
                    break;
                case '2': //登记收入
                    System.out.println("当前收入金额：");
                    int income = Utility.readNumber();
                    System.out.println("本次收入说明：");
                    String newDetails = Utility.readString();
                    balance += income;
                    details = "\n收入\t" + balance + "\t" + "说明\t" + newDetails;
                    System.out.println(details);
                    break;

                case '3': //登记支出
                    System.out.println("当前支出：");
                    int outcome = Utility.readNumber();
                    balance -= outcome;
                    System.out.println("本次支出说明：");
                    String newDetail = Utility.readString();
                    details = "\n支出\t" + balance + "\t" + "说明\t" + newDetail;
                    System.out.println(details);
                    break;

                case '4'://退出
                    System.out.print("确认是否退出(Y/N)：");
                    char change = Utility.readConfirmSelection();
                    if (change == 'Y'){
                        flag = false;
                    }
                    break;
            }

        }while (flag);
    }
}
