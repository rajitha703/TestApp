package com.springelasticsearch.app;

import java.net.URISyntaxException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.elasticsearch.client.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.elasticsearch.core.ElasticsearchOperations;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.data.elasticsearch.core.query.IndexQuery;

@Configuration

@SpringBootApplication
public class SpringElasticsearchExample  implements CommandLineRunner {
  @Autowired
  private ElasticsearchOperations es;

  @Autowired
  private EntityServiceCustom entityService;


  public static void main(String[] args) throws URISyntaxException, Exception {
    System.out.println("Load context");
    SpringApplication.run(SpringElasticsearchExample.class, args);
  }

  @Override
  public void run(String... strings) throws Exception {
    printElasticSearchInfo();

    entityService.save(new Show("1","Avatar", "a1", "d1", "fantasy", "english"));
    entityService.save(new Show("2","Titanic", "a2", "d2","romance", "english"));
    entityService.save(new Show("3","JambalakadiPamba", "a3", "d3", "drama", "telugu"));
    entityService.save(new Show("6","Titan", "a1", "d2", "dummy", "english"));


    List<Show> shows =  entityService.findByTitle("Titanic");
    System.out.println("PRINTING");
    shows.forEach(x -> System.out.println(x));

    shows =  entityService.findByTitleLike("Ti");
    System.out.println("Start with ti");
    shows.forEach(x -> System.out.println(x));


    shows =  entityService.findByActor("a1");
    System.out.println("a1 acted in : ");
    shows.forEach(x -> System.out.println(x));

    shows =  entityService.findByDirector("d2");
    System.out.println("d2 directed : ");
    shows.forEach(x -> System.out.println(x));


    shows =  entityService.findByLanguage("telugu");
    System.out.println("Telugu movies : ");
    shows.forEach(x -> System.out.println(x));


  }


  //useful for debug, print elastic search details
  private void printElasticSearchInfo() {

    System.out.println("--ElasticSearch--");
    Client client = es.getClient();
    Map<String, String> asMap = client.settings().getAsMap();

    asMap.forEach((k, v) -> {
      System.out.println(k + " = " + v);
    });
    System.out.println("--ElasticSearch--");
  }
}
