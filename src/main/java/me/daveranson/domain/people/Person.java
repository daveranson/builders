/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.daveranson.domain.people;

/**
 * A Person object that can be constructed using a <code>Builder</code>.
 *
 * @author dave ranson
 */
public class Person {

    private final String surname, firstname;

    /**
     * Constructs a Person with the given names.
     * 
     * @param surname
     * @param firstname 
     */
    public Person(final String surname, final String firstname) {
        this.surname = surname;
        this.firstname = firstname;
    }

    /**
     * Constructs the Person using a builder.
     * @param builder 
     */
    public Person(final Builder builder) {
        this(builder.surname, builder.firstname);
    }
        

    /**
     * Builder.
     */
    public static class Builder implements me.daveranson.builders.Builder<Person> {

        private String surname, firstname;

        @Override
        public Person build() {
            return new Person(this);
        }

        public Builder surname(final String surname) {
            this.surname = surname;
            return this;
        }

        public Builder firstname(final String firstname) {
            this.firstname = firstname;
            return this;
        }

    }
}
