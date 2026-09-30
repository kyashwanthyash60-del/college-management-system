package com.gpcbellary.cms.controller;
import com.gpcbellary.cms.model.Department;
import com.gpcbellary.cms.repository.DepartmentRepository;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/departments")
@CrossOrigin
public class DepartmentController {
    private final DepartmentRepository repo;
    public DepartmentController(DepartmentRepository repo){this.repo=repo;}
    @GetMapping public List<Department> all(){return repo.findAll();}
    @PostMapping public Department create(@RequestBody Department d){return repo.save(d);}
    @PutMapping("/{id}") public Department update(@PathVariable Long id,@RequestBody Department d){d.setId(id);return repo.save(d);}
    @DeleteMapping("/{id}") public void delete(@PathVariable Long id){repo.deleteById(id);}
}
