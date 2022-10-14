public class Student extends Person implements Learner {

    private double totalStudyTime;

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
