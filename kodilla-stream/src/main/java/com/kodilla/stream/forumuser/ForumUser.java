package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {
    private final int userId;
    private final String userName;
    private final char sex;
    private final LocalDate birth;
    private final int postsCount;

    public int getPostsCount() {
        return postsCount;
    }
    public int getUserId() {
        return userId;
    }
    public String getUserName() {
        return userName;
    }
    public char getSex() {
        return sex;
    }
    public LocalDate getbirth() {
        return birth;
    }
    public int getPostCount() {
        return postsCount;
    }

    public ForumUser(final int userId,final String userName, final char sex, final int year, final int month, final int day, final int postsCount) {
        this.userId = userId;
        this.userName = userName;
        this.sex = sex;
        this.birth = LocalDate.of(year, month, day);
        this.postsCount = postsCount;
    }
    @Override
    public String toString(){
        return  "Forum User " + userName + ", user ID : " + userId + ", sex: " + sex + ", date of birth " + birth +
                "number of posts " + postsCount;
    }
}