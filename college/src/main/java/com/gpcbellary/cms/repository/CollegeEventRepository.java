package com.gpcbellary.cms.repository;
import com.gpcbellary.cms.model.CollegeEvent;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
public interface CollegeEventRepository extends JpaRepository<CollegeEvent, Long> {
    List<CollegeEvent> findByBranchIgnoreCaseOrBranchIgnoreCaseOrderByEventDateAsc(String branch1, String branch2);
}
