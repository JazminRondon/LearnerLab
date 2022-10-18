import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestInstructor {



    @Test
    public void testImplementation(){
        Instructor instructor=new Instructor();
        Assertions.assertTrue(instructor instanceof Teacher);
    }

    @Test
    public void testInheritance(){
        Instructor instructor=new Instructor();
        Assertions.assertTrue(instructor instanceof Person);
    }

    @Test
    public void testTeach(){
        Student student=new Student(03,"Jazmin",20.0);
        Instructor instructor=new Instructor();

        Double expected= 30.0;
        instructor.teach(student,10.0);
        Double actual= student.getTotalStudyTime();

        Assertions.assertEquals(expected,actual);

    }
    @Test
    public void testLecture(){
        Student student=new Student();
        Student student1=new Student();
        Instructor instructor=new Instructor();
        Student[] students={student,student1};
        instructor.lecture(students,10);
        Double expected= 10.0;
        Double actual=10.0;
        Assertions.assertEquals(expected,actual);



    }


}
