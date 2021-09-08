package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public final class Forum {

    private final List<ForumUser> theUserList = new ArrayList<>();

    public Forum() {
        theUserList.add(new ForumUser(19840817, "Paweł", 'M', 1984, 8, 17, 206));
        theUserList.add(new ForumUser(19850719, "Marek", 'M', 1985, 7, 19, 105));
        theUserList.add(new ForumUser(19890917, "Grzegorz", 'M', 1989, 9, 17, 199));
        theUserList.add(new ForumUser(19740121, "Anna", 'K', 1974, 1, 21, 21));
        theUserList.add(new ForumUser(19770812, "Krystyna", 'K', 1977, 8, 12, 12));
        theUserList.add(new ForumUser(19440911, "Hanna", 'K', 1944, 9, 11, 1234));
        theUserList.add(new ForumUser(19641122, "Mirosław", 'M', 1964, 11, 22, 116));
    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(theUserList);
    }


    }

