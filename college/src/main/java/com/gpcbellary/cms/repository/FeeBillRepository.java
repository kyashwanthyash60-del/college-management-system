package com.gpcbellary.cms.repository;
import com.gpcbellary.cms.model.FeeBill;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
public interface FeeBillRepository extends JpaRepository<FeeBill, Long> {
    List<FeeBill> findByBranchIgnoreCaseOrderByDueDateDesc(String branch);
    List<FeeBill> findByUsnIgnoreCaseOrderByDueDateDesc(String usn);
}
