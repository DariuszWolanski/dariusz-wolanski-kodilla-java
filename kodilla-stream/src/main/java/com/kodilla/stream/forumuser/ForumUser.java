package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {

    private final int idUser;
    private final String nameUser;
    private final char sexUser;
    private final LocalDate dateOfBirth;
    private final int numberOfPosts;

    public ForumUser(final int idUser, final String nameUser,final char sexUser,
                     final int year, final int month, final int dayOfMonth ,final int numberOfPosts) {
        this.idUser = idUser;
        this.nameUser = nameUser;
        this.sexUser = sexUser;
        this.dateOfBirth = LocalDate.of(year, month, dayOfMonth);
        this.numberOfPosts = numberOfPosts;
    }

    public int getIdUser() {
        return idUser;
    }

    public String getNameUser() {
        return nameUser;
    }

    public char getSexUser() {
        return sexUser;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "idUser=" + idUser +
                ", nameUser='" + nameUser + '\'' +
                ", sexUser=" + sexUser +
                ", dateOfBirth=" + dateOfBirth +
                ", numberOfPosts=" + numberOfPosts +
                '}';
    }
}
