package com.erfan.android_design_patterns.Creational.Builder;

/**
 * Created by erfanblkrt on 8/5/2018.
 */

public class User {
    private String firstName;
    private String lastName;
    private int age;

    private User(final Builder builder){
        firstName = builder.firstName;
        lastName = builder.lastName;
        age = builder.age;
    }

    public static class Builder {
        private String firstName;
        private String lastName;
        private int age;

        public Builder setFirstName(final String firstName){
            this.firstName = firstName;
            return this;
        }

        public Builder setLastName(final String lastName){
            this.lastName = lastName;
            return this;
        }

        public Builder setAge(final int age){
            this.age = age;
            return this;
        }

        public User create(){
            User user = new User(this);
            return user;
        }

    }
}


