package com.gpcbellary.cms.repository;
import com.gpcbellary.cms.model.Notice;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
public interface NoticeRepository extends JpaRepository<Notice, Long> {
    List<Notice> findByBranchIgnoreCaseOrBranchIgnoreCaseOrderByPublishedDateDesc(String branch1, String branch2);
}
