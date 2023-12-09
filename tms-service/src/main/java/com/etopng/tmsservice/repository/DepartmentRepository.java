package com.etopng.tmsservice.repository;

import com.etopng.tmsservice.model.Terminal;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class DepartmentRepository {
    private List<Terminal> departments
            = new ArrayList<>();

    public Terminal addDepartment(Terminal department) {
        departments.add(department);
        return department;
    }

    public Terminal findById(Long id) {
        return departments.stream()
                .filter(department ->
                        department.getId().equals(id))
                .findFirst()
                .orElseThrow();
    }

    public List<Terminal> findAll() {
        return departments;
    }

}
