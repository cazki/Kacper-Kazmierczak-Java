package com.kodilla.testing.forum.statistics;

public class ForumStatistics {
    private int userQuantity;
    private int postQuantity;
    private int comentQuantity;
    private double postAvgUser;
    private double comentAvgUser;
    private double comentAvgPost;

    public int getUserQuantity() {
        return userQuantity;
    }

    public int getPostQuantity() {
        return postQuantity;
    }

    public int getComentQuantity() {
        return comentQuantity;
    }

    public double getPostAvgUser() {
        return postAvgUser;
    }

    public double getComentAvgUser() {
        return comentAvgUser;
    }

    public double getComentAvgPost() {
        return comentAvgPost;
    }

    private double calculatePostsAvgPerUser() {
        if(userQuantity>0 && postQuantity>0){
            return (double)postQuantity/userQuantity;
        }
        else {
            return 0.0;
        }
    }
    private double calculateCommentsAvgPerUser(){
        if(comentQuantity>0 && userQuantity>0){
            return (double)comentQuantity/userQuantity;
        }
        else {
            return 0.0;
        }
    }
    private double calculateCommentsAvgPerPost(){
        if(comentQuantity>0 && postQuantity>0){
            return (double)comentQuantity/postQuantity;
        }
        else {
            return 0.0;
        }
    }

    public void calculateAdvStatistics(Statistics statistics) {
        postQuantity = statistics.postsCount();
        userQuantity = statistics.usersNames().size();
        comentQuantity = statistics.commentsCount();
        postAvgUser = calculatePostsAvgPerUser();
        comentAvgUser = calculateCommentsAvgPerUser();
        comentAvgPost = calculateCommentsAvgPerPost();
    }
    public void showStatistics(){
        System.out.println("User Quantity: ");
        System.out.println(userQuantity);
        System.out.println();

        System.out.println("Post Quantity: ");
        System.out.println(postQuantity);
        System.out.println();

        System.out.println("Comment Quantity: ");
        System.out.println(comentQuantity);
        System.out.println();

        System.out.println("Post AVG per User: ");
        System.out.println(postAvgUser);
        System.out.println();

        System.out.println("Comment AVG per User: ");
        System.out.println(comentAvgUser);
        System.out.println();

        System.out.println("Comments AVG per Post: ");
        System.out.println(comentAvgPost);
        System.out.println();
    }
}