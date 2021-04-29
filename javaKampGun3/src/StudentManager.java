public class StudentManager extends UserManager {
    @Override
    public void get(User user){
        System.out.println(user.getFirstName());
        System.out.println(user.getLastName());

    }
    @Override
    public void add(User user){
        System.out.println("Öğrenci eklendi");
    }
    @Override
    public void update(User user){
        System.out.println(user.getFirstName()+ " güncellendi");
    }
    @Override
    public void delete(User user){
        System.out.println(user.getFirstName()+" silindi ");
    }
}
