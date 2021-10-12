package com.github.hcsp;

import java.sql.SQLException;

/**
 * @author hahaen
 * @data 22:19
 */
public interface CrawlerDao {
    String getNextLink(String Sql) throws SQLException;

    String getNextLinkThenDelete() throws SQLException;

    void updataDatabash(String link, String sql) throws SQLException;

    void inserNewsIntoDatabash(String url, String tiele, String content) throws SQLException;

    boolean isLinkProcessed(String link) throws SQLException;

}
