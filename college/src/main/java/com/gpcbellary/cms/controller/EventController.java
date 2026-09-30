package com.gpcbellary.cms.controller;
import com.gpcbellary.cms.model.CollegeEvent;
import com.gpcbellary.cms.repository.CollegeEventRepository;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/events")
@CrossOrigin
public class EventController {
    private final CollegeEventRepository repo;
    public EventController(CollegeEventRepository repo){this.repo=repo;}
    @GetMapping public List<CollegeEvent> all(){return repo.findAll();}
    @GetMapping("/branch/{branch}") public List<CollegeEvent> byBranch(@PathVariable String branch){
        return repo.findByBranchIgnoreCaseOrBranchIgnoreCaseOrderByEventDateAsc(branch, "ALL");
    }
    @PostMapping public CollegeEvent create(@RequestBody CollegeEvent e){return repo.save(e);}
    @PutMapping("/{id}") public CollegeEvent update(@PathVariable Long id,@RequestBody CollegeEvent e){e.setId(id);return repo.save(e);}
    @DeleteMapping("/{id}") public void delete(@PathVariable Long id){repo.deleteById(id);}
}
