import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class People implements Iterator {

    private List<Person> personList=new ArrayList<>();

    public void add(Person person){
        personList.add(person);
    }

    public void remove(long id){
        for (Person person:
             personList) {
            if(person.getId()== id){
                personList.remove(person);
            }

        }
    }

    public int count(){
        return personList.size();
    }

    public void removeAll(){
        personList.clear();
    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Object next() {
        return null;
    }

    public Person findById(long id){
        for (Person person:
             personList) {
            if(person.getId()==id){
               return person;
            }
        }
        return null;
    }


    public Iterator iterator() {
        Iterator<Person> iterator = personList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        return null;
    }
    public Person[] toArray(){
        return personList.toArray(new Person[0]);
    }

}
