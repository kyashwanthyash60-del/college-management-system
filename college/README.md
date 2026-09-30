# Government Polytechnic College Bellary — Professional College Management System

A ready-to-run Spring Boot + MySQL college management project for Government Polytechnic College Bellary.

## Modules
1. Dashboard
2. Branch-wise students
3. Departments
4. Department-wise teachers
5. Notices
6. Branch-wise events
7. College fee billing
8. Online admission for new students
9. Last-year results notice board
10. Placement cell / job companies
11. College rules and regulations

## Technology
Java 17 • Spring Boot 3.5.5 • Spring Web • Spring Data JPA • MySQL 8 • HTML/CSS/JavaScript • Bootstrap 5

## Run
Install Java 17+, Maven 3.9+ and MySQL 8+. Update `src/main/resources/application.properties` if your MySQL username/password is different.

```bash
mvn spring-boot:run
```
Open `http://localhost:8080`.

Default DB: `gpc_bellary`, username `root`, password `root`, port `3306`.

JPA creates/updates tables automatically. Demo data is supplied for all modules.

## REST APIs
`/api/dashboard`, `/api/students`, `/api/departments`, `/api/teachers`, `/api/notices`, `/api/events`, `/api/fees`, `/api/admissions`, `/api/results`, `/api/companies`, `/api/rules`.

The main entities expose POST/PUT/DELETE endpoints for future full CRUD administration.

## Production checklist
Before public deployment, replace demo data with verified institutional data; add Spring Security/roles, CAPTCHA/OTP and document uploads for public admissions, payment gateway + PDF receipts, audit logs, HTTPS, backups and environment-based production credentials.
