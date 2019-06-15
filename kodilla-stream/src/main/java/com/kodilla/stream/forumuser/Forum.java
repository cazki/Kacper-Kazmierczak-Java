package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public class Forum {
    private final List<ForumUser> forumUser = new ArrayList<>();

    public Forum() {
        forumUser.add(new ForumUser(1, "Ala", 'M',2000,01,02, 10));
        forumUser.add(new ForumUser(2, "Ma", 'F', 1990, 02, 03, 20));
        forumUser.add(new ForumUser(3, "Kota", 'M', 1930, 03, 04, 30));
        forumUser.add(new ForumUser(4, "Arek", 'M',2010, 04,05, 120));
        forumUser.add(new ForumUser(5, "Tez", 'F', 1980, 05, 06, 0));
    }
    public List<ForumUser> getUserList(){
        return new  ArrayList<ForumUser>(forumUser);
    }


}