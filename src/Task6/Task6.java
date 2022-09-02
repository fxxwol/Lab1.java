package Task6;

public class Task6 {
    public static void main(final String[] args) {
        final  User user1 = new User("Roksolana", "Protsiv", 18, "test1@gmail.com");
        final User user2 = new User("Arsen", "Kapanaiko", 19, "test2@gmail.com");
        final String equalitySign = user1.equals(user2) ? " == " : " != ";

        System.out.println(user1 + equalitySign + user2);
        System.out.println(user1.hashCode());
        System.out.println(user2.hashCode());
    }
}

