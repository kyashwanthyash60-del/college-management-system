package com.gpcbellary.cms.controller;
import com.gpcbellary.cms.model.FeeBill;
import com.gpcbellary.cms.repository.FeeBillRepository;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/fees")
@CrossOrigin
public class FeeBillController {
    private final FeeBillRepository repo;
    public FeeBillController(FeeBillRepository repo){this.repo=repo;}
    @GetMapping public List<FeeBill> all(){return repo.findAll();}
    @GetMapping("/branch/{branch}") public List<FeeBill> byBranch(@PathVariable String branch){return repo.findByBranchIgnoreCaseOrderByDueDateDesc(branch);}
    @GetMapping("/student/{usn}") public List<FeeBill> byStudent(@PathVariable String usn){return repo.findByUsnIgnoreCaseOrderByDueDateDesc(usn);}
    @PostMapping public FeeBill create(@RequestBody FeeBill f){return repo.save(f);}
    @PutMapping("/{id}") public FeeBill update(@PathVariable Long id,@RequestBody FeeBill f){f.setId(id);return repo.save(f);}
    @DeleteMapping("/{id}") public void delete(@PathVariable Long id){repo.deleteById(id);}
}
