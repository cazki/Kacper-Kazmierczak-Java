package com.kodilla.testing.forum.statistics;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ForumStatisticsTestSuite {
    @Test
    public void testCalculateAdvStatisticsZeroPosts(){
        //Given
        Statistics statisticsMock = mock (Statistics.class);
        ForumStatistics forumStatistics = new ForumStatistics();
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(0,forumStatistics.getPostQuantity());
        assertEquals(0.0,forumStatistics.getPostAvgUser(), 0.01);
        assertEquals(0.0,forumStatistics.getComentAvgPost(), 0.01);
    }
    @Test
    public void testCalculateAdvStatisticsThousandPosts(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.postsCount()).thenReturn(1000);
        ForumStatistics forumStatistics = new ForumStatistics();
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(1000, forumStatistics.getPostQuantity());
        assertEquals(0.0, forumStatistics.getPostAvgUser(), 0.01);
        assertEquals(0.0, forumStatistics.getComentAvgPost(), 0.01);
    }
    @Test
    public void testCalculateAdvStatisticsZeroComments(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ForumStatistics forumStatistics = new ForumStatistics();
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(0, forumStatistics.getComentQuantity());
        assertEquals(0.0, forumStatistics.getComentAvgUser(), 0.01);
        assertEquals(0.0, forumStatistics.getComentAvgPost(), 0.01);
    }
    @Test
    public void testCalculateAdvStatisticsLessCommentsThanPosts(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.commentsCount()).thenReturn(2);
        when(statisticsMock.postsCount()).thenReturn(10);
        ForumStatistics forumStatistics = new ForumStatistics();
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(10, forumStatistics.getPostQuantity());
        assertEquals(2, forumStatistics.getComentQuantity());
        assertEquals(0.0, forumStatistics.getPostAvgUser(), 0.01);
        assertEquals(0.0, forumStatistics.getComentAvgUser(), 0.01);
        assertEquals(0.2, forumStatistics.getComentAvgPost(), 0.01);
    }
    @Test
    public void testCalculateAdvStatisticsMoreCommentsThanPosts(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.commentsCount()).thenReturn(10);
        when(statisticsMock.postsCount()).thenReturn(2);
        ForumStatistics forumStatistics = new ForumStatistics();
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(2, forumStatistics.getPostQuantity());
        assertEquals(10, forumStatistics.getComentQuantity());
        assertEquals(0.0, forumStatistics.getPostAvgUser(), 0.01);
        assertEquals(0.0, forumStatistics.getComentAvgUser(), 0.01);
        assertEquals(5.0, forumStatistics.getComentAvgPost(), 0.01);
    }
    @Test
    public void testCalculateAdvStatisticsZeroUsers(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ForumStatistics forumStatistics = new ForumStatistics();
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(0, forumStatistics.getUserQuantity());
        assertEquals(0.0, forumStatistics.getComentAvgUser(), 0.01);
        assertEquals(0.0, forumStatistics.getPostAvgUser(), 0.01);

    }
    @Test
    public void testCalculateAdvStatisticsHundredUsers(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> userList = new ArrayList<>();
        for(int i = 0; i < 100; i++){
            userList.add("userExample");
        }
        when(statisticsMock.usersNames()).thenReturn(userList);
        ForumStatistics forumStatistics = new ForumStatistics();
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(100, forumStatistics.getUserQuantity());
        assertEquals(0.0, forumStatistics.getPostAvgUser(), 0.01);
        assertEquals(0.0, forumStatistics.getComentAvgUser(), 0.01);
    }
}
