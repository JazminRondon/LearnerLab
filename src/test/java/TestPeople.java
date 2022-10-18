import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class TestPeople {

    @Test
    public void testAdd(){
        List<Person> personList=new ArrayList<>();
        Person p1=new Person(1,"Jaz");
        Person p2=new Person(2,"Ralph");

        personList.add(p1);
        personList.add(p2);
        Assertions.assertTrue(personList.contains(p1));
    }

    @Test
    public void testRemove(){
        List<Person> personList=new ArrayList<>();
        Person p1= new Person(1,"Jaz");

        personList.remove(p1);
        Assertions.assertFalse(personList.contains(p1));
    }

    @Test
    public void testFindById(){
        People people=new People();
        ArrayList<Person> personList=new ArrayList<>();
        
    }





}
