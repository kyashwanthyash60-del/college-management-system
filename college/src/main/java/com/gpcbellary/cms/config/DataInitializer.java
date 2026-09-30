package com.gpcbellary.cms.config;

import com.gpcbellary.cms.model.*;
import com.gpcbellary.cms.repository.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import java.math.BigDecimal;
import java.time.LocalDate;

@Configuration
public class DataInitializer {
    @Bean
    CommandLineRunner seed(DepartmentRepository departments, StudentRepository students,
                           TeacherRepository teachers, NoticeRepository notices,
                           CollegeEventRepository events, FeeBillRepository fees) {
        return args -> {
            if (departments.count() == 0) {
                departments.save(new Department("CSE","Computer Science & Engineering","Mrs. Meenakshi R","Software, web and computing technologies"));
                departments.save(new Department("ECE","Electronics & Communication Engineering","Dr. S. Kumar","Electronics and communication systems"));
                departments.save(new Department("ME","Mechanical Engineering","Mr. R. Prakash","Manufacturing, design and mechanical systems"));
                departments.save(new Department("CIVIL","Civil Engineering","Mrs. A. Kavitha","Construction, surveying and infrastructure"));
                departments.save(new Department("EEE","Electrical & Electronics Engineering","Mr. M. Ramesh","Electrical power and electronics"));
            }
            if (students.count() == 0) {
                students.save(new Student("GPC26CSE001","Aarav Kumar","CSE",5,"9876500001","aarav@gpcbellary.edu.in","2024"));
                students.save(new Student("GPC26CSE002","Ananya Rao","CSE",5,"9876500002","ananya@gpcbellary.edu.in","2024"));
                students.save(new Student("GPC26ECE001","Vivek Shetty","ECE",5,"9876500003","vivek@gpcbellary.edu.in","2024"));
                students.save(new Student("GPC26ME001","Rahul Patil","ME",5,"9876500004","rahul@gpcbellary.edu.in","2024"));
                students.save(new Student("GPC26CIV001","Sneha Devi","CIVIL",5,"9876500005","sneha@gpcbellary.edu.in","2024"));
                students.save(new Student("GPC26EEE001","Kiran Gowda","EEE",5,"9876500006","kiran@gpcbellary.edu.in","2024"));
            }
            if (teachers.count() == 0) {
                teachers.save(new Teacher("EMP001","Mrs. Meenakshi R","CSE","Assistant Professor","9000000001","meenakshi@gpcbellary.edu.in"));
                teachers.save(new Teacher("EMP002","Mr. Naveen Kumar","CSE","Lecturer","9000000002","naveen@gpcbellary.edu.in"));
                teachers.save(new Teacher("EMP003","Dr. S. Kumar","ECE","Head of Department","9000000003","skumar@gpcbellary.edu.in"));
                teachers.save(new Teacher("EMP004","Mr. R. Prakash","ME","Head of Department","9000000004","prakash@gpcbellary.edu.in"));
                teachers.save(new Teacher("EMP005","Mrs. A. Kavitha","CIVIL","Head of Department","9000000005","kavitha@gpcbellary.edu.in"));
                teachers.save(new Teacher("EMP006","Mr. M. Ramesh","EEE","Head of Department","9000000006","ramesh@gpcbellary.edu.in"));
            }
            if (notices.count() == 0) {
                notices.save(new Notice("SpringSpark 2026 Design Competition","Registration and project submission instructions for the Spring Boot Single Page Application Design Competition.","CSE",LocalDate.of(2026,9,29),"HIGH"));
                notices.save(new Notice("Internal Assessment Schedule","Students are requested to check the department notice board for internal assessment dates.","ALL",LocalDate.of(2026,9,25),"NORMAL"));
                notices.save(new Notice("Fee Payment Reminder","Students with pending fees should clear dues before the due date.","ALL",LocalDate.of(2026,9,20),"HIGH"));
            }
            if (events.count() == 0) {
                events.save(new CollegeEvent("SpringSpark 2026","Spring Boot Single Page Application Design Competition","CSE",LocalDate.of(2026,9,30),"CS LAB2","CSE Department"));
                events.save(new CollegeEvent("Electronics Project Expo","Student project exhibition and demonstration.","ECE",LocalDate.of(2026,10,7),"ECE LAB","ECE Department"));
                events.save(new CollegeEvent("Sports Meet","Annual inter-department sports activities.","ALL",LocalDate.of(2026,10,15),"College Ground","Physical Education"));
            }
            if (fees.count() == 0) {
                fees.save(new FeeBill("GB-2026-001","GPC26CSE001","Aarav Kumar","CSE","Tuition Fee",new BigDecimal("18000"),new BigDecimal("12000"),LocalDate.of(2026,10,10),LocalDate.of(2026,9,10),"PARTIAL"));
                fees.save(new FeeBill("GB-2026-002","GPC26CSE002","Ananya Rao","CSE","Tuition Fee",new BigDecimal("18000"),new BigDecimal("18000"),LocalDate.of(2026,10,10),LocalDate.of(2026,9,8),"PAID"));
                fees.save(new FeeBill("GB-2026-003","GPC26ECE001","Vivek Shetty","ECE","Tuition Fee",new BigDecimal("18000"),BigDecimal.ZERO,LocalDate.of(2026,10,10),null,"PENDING"));
            }
        };
    }
}
