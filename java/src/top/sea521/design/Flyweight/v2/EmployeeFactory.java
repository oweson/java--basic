package top.sea521.design.Flyweight.v2;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by geely
 */
public class EmployeeFactory {
    // 1 对象池
    private static final Map<String, Employee> EMPLOYEE_MAP = new HashMap<>();
    // 常量大写，idea
    public static final Integer INTEGER = new Integer("100000");

    // 2 接口对象多态！！！
    public static Employee getManager(String department) {
        Manager manager = (Manager) EMPLOYEE_MAP.get(department);

        if (manager == null) {
            manager = new Manager(department);
            System.out.print("创建部门经理:" + department);
            // 外部传入，设置到对象的上面！！！
            String reportContent = department + "部门汇报:此次报告的主要内容是......";
            manager.setReportContent(reportContent);
            System.out.println(" 创建报告:" + reportContent);
            EMPLOYEE_MAP.put(department, manager);

        }
        return manager;
    }

}
