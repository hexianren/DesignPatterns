package com.peter;

public class CommonEmployee extends Employee {
    private String job;

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
