package com.peter;

public class Visitor implements IVisitor {
    public void visit(CommonEmployee commonEmployee) {
        System.out.println(getCommonEmployee(commonEmployee));
    }

    public void visit(Manager manager) {
        System.out.println(getManagerInfo(manager));
    }

    private String getBasicInfo(Employee employee) {
        String info = "姓名：" + employee.getName() + "\t" + "性别：" + (employee.getSex() == Employee.FEMALE ? "女" : "男") + "\t" + "薪水：" + employee.getSalary() + "\t";
        return info;
    }

    private String getManagerInfo(Manager manager) {
        String basicInfo = getBasicInfo(manager);
        String otherInfo = "业绩：" + manager.getPerformance() + "\t";
        return basicInfo + otherInfo;
    }

    private String getCommonEmployee(CommonEmployee commonEmployee) {
        String basicInfo = getBasicInfo(commonEmployee);
        String otherInfo = "工作：" + commonEmployee.getJob() + "\t";
        return basicInfo + otherInfo;
    }
}
