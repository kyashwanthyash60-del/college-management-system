package com.gpcbellary.cms.controller;
import com.gpcbellary.cms.model.Student;
import com.gpcbellary.cms.repository.StudentRepository;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/students")
@CrossOrigin
public class StudentController {
    private final StudentRepository repo;
    public StudentController(StudentRepository repo){this.repo=repo;}
    @GetMapping public List<Student> all(){return repo.findAll();}
    @GetMapping("/branch/{branch}") public List<Student> byBranch(@PathVariable String branch){return repo.findByBranchIgnoreCaseOrderByNameAsc(branch);}
    @PostMapping public Student create(@RequestBody Student s){return repo.save(s);}
    @PutMapping("/{id}") public Student update(@PathVariable Long id,@RequestBody Student s){s.setId(id);return repo.save(s);}
    @DeleteMapping("/{id}") public void delete(@PathVariable Long id){repo.deleteById(id);}
}
