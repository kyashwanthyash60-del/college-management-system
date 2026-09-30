package com.gpcbellary.cms.controller;
import com.gpcbellary.cms.model.Notice;
import com.gpcbellary.cms.repository.NoticeRepository;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/notices")
@CrossOrigin
public class NoticeController {
    private final NoticeRepository repo;
    public NoticeController(NoticeRepository repo){this.repo=repo;}
    @GetMapping public List<Notice> all(){return repo.findAll();}
    @GetMapping("/branch/{branch}") public List<Notice> byBranch(@PathVariable String branch){
        return repo.findByBranchIgnoreCaseOrBranchIgnoreCaseOrderByPublishedDateDesc(branch, "ALL");
    }
    @PostMapping public Notice create(@RequestBody Notice n){return repo.save(n);}
    @PutMapping("/{id}") public Notice update(@PathVariable Long id,@RequestBody Notice n){n.setId(id);return repo.save(n);}
    @DeleteMapping("/{id}") public void delete(@PathVariable Long id){repo.deleteById(id);}
}
