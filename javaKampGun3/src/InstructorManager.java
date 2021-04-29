public class InstructorManager extends UserManager {

    @Override
    public void get(User user) {
        System.out.println(user.getFirstName() + " " + user.getLastName());

    }

    @Override
    public void add(User user) {
        System.out.println("Eğitmen eklendi");
    }

    @Override
    public void update(User user) {
        System.out.println(user.getFirstName() + " eğitmen güncellendi");
    }

    @Override
    public void delete(User user) {
        System.out.println(user.getFirstName() + " eğitmen silindi");
    }

}
