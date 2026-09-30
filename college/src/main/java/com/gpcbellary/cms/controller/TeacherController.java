package com.gpcbellary.cms.controller;
import com.gpcbellary.cms.model.Teacher;
import com.gpcbellary.cms.repository.TeacherRepository;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/teachers")
@CrossOrigin
public class TeacherController {
    private final TeacherRepository repo;
    public TeacherController(TeacherRepository repo){this.repo=repo;}
    @GetMapping public List<Teacher> all(){return repo.findAll();}
    @GetMapping("/department/{department}") public List<Teacher> byDepartment(@PathVariable String department){return repo.findByDepartmentIgnoreCaseOrderByNameAsc(department);}
    @PostMapping public Teacher create(@RequestBody Teacher t){return repo.save(t);}
    @PutMapping("/{id}") public Teacher update(@PathVariable Long id,@RequestBody Teacher t){t.setId(id);return repo.save(t);}
    @DeleteMapping("/{id}") public void delete(@PathVariable Long id){repo.deleteById(id);}
}
