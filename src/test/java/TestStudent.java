import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestStudent {

    @Test
    public void testImplementation(){
        //given
        Student student=new Student();
        //when

        Assertions.assertTrue(student instanceof Learner);
    }
    @Test
    public void testInheritance(){
        Student student=new Student();
        Assertions.assertTrue(student instanceof Person);
    }

    @Test
    public void testLearn(){
   //given
    Student student=new Student();
    Double expected=9.0;
    //when
    student.learn(9);
    double actual=student.getTotalStudyTime();
    //then
    Assertions.assertEquals(expected,actual);
    }




}
