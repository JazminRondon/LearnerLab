public class Instructor extends Person implements Teacher{


    @Override
    public void teach(Learner learner, Double numberOfHours) {
            learner.learn(numberOfHours);
    }

    @Override
    public void lecture(Learner[] learners, double numberOfHours) {
        for (int i = 0; i < learners.length; i++) {
            learners[i].learn(numberOfHours/ learners.length);
        }
    }
}
