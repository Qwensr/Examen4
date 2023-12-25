package Execise3;

public class User {
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int compareTo(User otherUser) {
        int ageComparison = Integer.compare(this.age, otherUser.age);
       if (ageComparison != 0) {
            return ageComparison;
        }
        return this.name.compareTo(otherUser.name);
    }
}



