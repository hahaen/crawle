package com.github.hcsp;

import java.sql.SQLException;

/**
 * @author hahaen
 * @data 22:48
 */
public class MyBatisCrawlerDao implements CrawlerDao{
    @Override
    public String getNextLink(String Sql) throws SQLException {
        return null;
    }

    @Override
    public String getNextLinkThenDelete() throws SQLException {
        return null;
    }

    @Override
    public void updataDatabash(String link, String sql) throws SQLException {

    }

    @Override
    public void inserNewsIntoDatabash(String url, String tiele, String content) throws SQLException {

    }

    @Override
    public boolean isLinkProcessed(String link) throws SQLException {
        return false;
    }
}
