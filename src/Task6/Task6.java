package Task6;

import Task6.User.User;

public class Task6 {
    public static void main(String[] args) {
        User user1 = new User("Roksolana", "Protsiv", 18, "test1@gmail.com");
        User user2 = new User("Arsen", "Kapanaiko", 19, "test2@gmail.com");
        String equalitySign = user1.equals(user2) ? " == " : " != ";

        System.out.println(user1 + equalitySign + user2);
        System.out.println(user1.hashCode());
        System.out.println(user2.hashCode());
    }
}

