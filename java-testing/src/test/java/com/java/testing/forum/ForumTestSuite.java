package com.java.testing.forum;

import com.java.testing.user.SimpleUser;
import org.junit.Assert;
import org.junit.Test;

public class ForumTestSuite {
    @Test
    public void testCaseUsername() {

        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        Assert.assertEquals("theForumUser", result);
    }
}