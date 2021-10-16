package com.github.hcsp;

import org.apache.http.HttpHost;
import org.elasticsearch.action.search.SearchRequest;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.index.query.MultiMatchQueryBuilder;
import org.elasticsearch.search.builder.SearchSourceBuilder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Stream;

public class ElasticserchEngine {
    public static void main(String[] args) throws IOException {
        while (true) {
            System.out.println("请输入一个关键字：");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            Stream<String> keyword = bufferedReader.lines();
            search(keyword);
        }
    }

    private static void search(Stream<String> keyword) throws IOException {
        try (RestHighLevelClient client = new RestHighLevelClient(RestClient.builder(new HttpHost("localhost", 9200, "http")))) {
            SearchRequest searchResult = new SearchRequest("news");
            searchResult.source(new SearchSourceBuilder().query(new MultiMatchQueryBuilder(keyword, "title", "content")));

            SearchResponse result = client.search(searchResult, RequestOptions.DEFAULT);
            result.getHits().forEach(hit -> System.out.println(hit.getSourceAsString()));
        }
    }
}
