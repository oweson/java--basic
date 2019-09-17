package top.sea521.design.Flyweight.v2;

/**
 * Created by geely
 */
public class Manager implements Employee {
    // 1 内部状态
    private String title = "部门经理";
    // 2 外部状态
    private String department;
    private String reportContent;

    @Override
    public void report() {
        System.out.println(reportContent);
    }

    public void setReportContent(String reportContent) {
        this.reportContent = reportContent;
    }

    public Manager(String department) {
        this.department = department;
    }


}
