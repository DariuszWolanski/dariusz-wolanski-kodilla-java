package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {

    public static void main(String[] args) {
        Forum forum = new Forum();
        Map<Integer, ForumUser> theMapForum = forum.getUserList().stream()
                .filter(forumUser -> forumUser.getSexUser() == 'M')
                .filter(forumUser -> forumUser.getDateOfBirth().getYear() < 2001)
                .filter(forumUser -> forumUser.getNumberOfPosts() > 1)
                .collect(Collectors.toMap(ForumUser::getIdUser, forumUser -> forumUser));

        System.out.println("# elements: " + theMapForum.size());
        theMapForum.entrySet().stream()
                .map(integerForumUserEntry -> integerForumUserEntry.getKey()
                + " " + integerForumUserEntry.getValue())
                .forEach(System.out::println);
    }


}
