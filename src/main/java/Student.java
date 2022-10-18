public class Student extends Person implements Learner {

    private double totalStudyTime;

    public Student(double totalStudyTime) {
        this.totalStudyTime = totalStudyTime;
    }
    public Student(){

    }

    public Student(long id, String name, double totalStudyTime) {
        super(id, name);
        this.totalStudyTime = totalStudyTime;
    }

    @Override
    public void learn(double numberOfHours) {

        totalStudyTime=totalStudyTime+numberOfHours;
        System.out.println(totalStudyTime);
    }

    @Override
    public Double getTotalStudyTime() {
        return totalStudyTime;
    }
}
