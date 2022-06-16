package com.ruoyi.demoTest.designPattern.compositePatternDemo;

/**
 * 您想表示对象的部分-整体层次结构（树形结构）
 * 实例化的对象有一定的层级关系，用户自己可以选择需要的层级
 */
public class CompositePatternTest {
    public static void main(String[] args) {
        Employee CEO = new Employee("John","CEO", 30000);

        //销售主管
        Employee headSales = new Employee("Robert","Head Sales", 20000);

        //市场主管
        Employee headMarketing = new Employee("Michel","Head Marketing", 20000);

        Employee clerk1 = new Employee("Laura","Marketing", 10000);
        Employee clerk2 = new Employee("Bob","Marketing", 10000);

        Employee salesExecutive1 = new Employee("Richard","Sales", 10000);
        Employee salesExecutive2 = new Employee("Rob","Sales", 10000);

        //CEO管理市场主管和销售主管两个部门
        CEO.add(headSales);
        CEO.add(headMarketing);

        //销售主管负责管理销售员工
        headSales.add(salesExecutive1);
        headSales.add(salesExecutive2);

        //市场主管部门管理市场员工
        headMarketing.add(clerk1);
        headMarketing.add(clerk2);

        //打印所有部门
/*        System.out.println(CEO);
        for (Employee headEmployee : CEO.getSubordinates()) {
            System.out.println(headEmployee);
            for (Employee employee : headEmployee.getSubordinates()) {
                System.out.println(employee);
            }
        }*/

        //打印销售部门所有人员
        System.out.println(headSales);
        for (Employee pp : headSales.getSubordinates()) {
            System.out.println(pp);
        }
    }
}
