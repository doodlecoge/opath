package me.hch;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by huaichao on 10/5/14.
 */
public class Hospital {
    private String name;
    private List<Department> departments = new ArrayList<Department>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addDepartment(Department department) {
        this.departments.add(department);
    }

}
