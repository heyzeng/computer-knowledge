package manager;

/*
 * 该类为 ： CustomerList为Customer对象的管理模块，内部用数组管理一组Customer对象
 */
public class CustomerList {

    private  Customer[] customers; //用来保存客户对象的数组
    private int total = 0 ;//记录已保存客户对象的数量

    /**
     * 构造器，用来初始化customers数组
     * @param totalCustomer
     */
    public CustomerList(int totalCustomer){
        customers = new Customer[totalCustomer];
    }

    /**
     * 添加指定的客户到数组中
     * @param customer
     * @return true 添加成功 false 添加失败
     */
    public boolean addCustomer(Customer customer){
        if (customer != null && total < customers.length){
            //添加
            customers[total] = customer;
            total++;
            // customers[total++] = customer;
            return true;
        }
        return false;
    }

    /**
     * 替换指定索引位置上的数组元素
     * @param index index从0开始
     * @param cust
     * @return
     */
    public boolean replaceCustomer(int index, Customer cust){;
        //先判断是否在范围内
        if (index >= 0 && index < total){
            customers[index] = cust;
            return true;
        }
        return false;
    }

    /**
     *
     * @param index
     * @return
     */
    public boolean deleteCustomer(int index){
        if (index >=0 && index <total){
            for (int i = index; i < total - 1; i++) {
                customers[i] = customers[i + 1];
            }
            customers[total - 1] = null;
            return true;
        }
        return false;
    }

    /**
     * 获取所有的customers对象构成的数组
     * @return
     */
    public Customer[] getAllCustomers(){
        Customer[] custs = new Customer[total];
        //给数组元素赋值
        for (int i = 0; i < custs.length; i++) {
            custs[i] = customers[i];
        }
        return custs;
    }

    /**
     * 返回指定索引位置上的Customer
     * @param index
     * @return 如果输入的index位置上的元素不存在，返回null
     */
    public Customer getCustomer(int index){
        if (index >=0 && index <total){
            return customers[index];
        }
        return null;
    }

    /**
     * 返回Customer对象的个数
     * @return
     */
    public int getTotal(){

        return total;
    }

}
