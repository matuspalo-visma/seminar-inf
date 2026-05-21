package gymnazium.sturova.seminarinf;

import gymnazium.sturova.seminarinf.dto.StudentDTO;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SeminarInfApplication {

    public static void main(String[] args) {
        SpringApplication.run(SeminarInfApplication.class, args);
        System.out.println("Application started successfully.");

        StudentDTO student = new StudentDTO();
        student.setId(1);
        student.setSurname("Novak");
        student.setName("Jan");
        student.setEmail("fdgj");
        student.setPhoneNumber("123456789");
        student.setAge(20);

        System.out.println(student);

    }

}
