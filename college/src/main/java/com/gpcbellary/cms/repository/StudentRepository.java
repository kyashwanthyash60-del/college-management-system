package com.gpcbellary.cms.repository;
import com.gpcbellary.cms.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
public interface StudentRepository extends JpaRepository<Student, Long> {
    List<Student> findByBranchIgnoreCaseOrderByNameAsc(String branch);
}
