public class Person {
    final long id=423;
    private String name;


    public Person(){
    }
    public Person(long id, String name) {

        this.name = name;
    }


    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
