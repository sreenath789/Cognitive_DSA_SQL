package org.example.Question_19_oops.EncapsulationExample;

public class Main {
    public static void main(String[] args) {
        User user = new User();
        user.setId(1);
        user.setName("Sreenath");
        user.setSalary("100000");

        System.out.println(user.getId());
        System.out.println(user.getName());
        System.out.println(user.getSalary());

    }
}
