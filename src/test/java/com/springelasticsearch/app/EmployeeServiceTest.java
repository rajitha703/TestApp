//package com.springelasticsearch.app;
//
//import static junit.framework.Assert.assertEquals;
//import static junit.framework.Assert.assertNotNull;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
//import org.springframework.test.context.junit4.SpringRunner;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//
//import org.junit.Before;
//
//
//import java.util.List;
//
///**
// * Created by rajithar on 12/8/18.
// */
//
//@RunWith(SpringRunner.class)
//@SpringBootTest(classes = SpringElasticsearchExample.class)
//public class EmployeeServiceTest {
//
//  @Autowired
//  private EmployeeService employeeService;
//
//  @Autowired
//  private ElasticsearchTemplate esTemplate;
//
//  @Before
//  public void before() {
//    esTemplate.deleteIndex(Employee.class);
//    esTemplate.createIndex(Employee.class);
//    esTemplate.putMapping(Employee.class);
//    esTemplate.refresh(Employee.class);
//  }
//
//  @Test
//  public void testSave() {
//
//    Employee employee = new Employee("1001", "Rajitha", 25);
//    Employee testEmployee = employeeService.save(employee);
//
//    assertNotNull(testEmployee.getId());
//    assertEquals(testEmployee.getAge(), employee.getAge());
//    assertEquals(testEmployee.getName(), employee.getName());
//
//  }
//
//  @Test
//  public void testFindOne() {
//
//    Employee employee = new Employee("1001", "Rajitha", 25);
//    employeeService.save(employee);
//
//    Employee testEmployee = employeeService.findOne(employee.getId());
//
//    assertNotNull(testEmployee.getId());
//    assertEquals(testEmployee.getAge(), employee.getAge());
//    assertEquals(testEmployee.getName(), employee.getName());
//  }
////
////  @Test
////  public void testFindByTitle() {
////
////    Employee employee = new Employee("1001", "Rajitha", 25);
////    employeeService.save(employee);
////
////    List<Employee> byTitle = employeeService.findEmployeesByName(employee.getName());
////    assertThat(byTitle.size(), is(1));
////  }
////
////  @Test
////  public void testFindByAuthor() {
////
////    List<Employee> employeeList = new ArrayList<>();
////
////    employeeList.add(new Employee("1001", "Elasticsearch Basics", "Rambabu Posa", "23-FEB-2017"));
////    employeeList.add(new Employee("1002", "Apache Lucene Basics", "Rambabu Posa", "13-MAR-2017"));
////    employeeList.add(new Employee("1003", "Apache Solr Basics", "Rambabu Posa", "21-MAR-2017"));
////    employeeList.add(new Employee("1007", "Spring Data + ElasticSearch", "Rambabu Posa", "01-APR-2017"));
////    employeeList.add(new Employee("1008", "Spring Boot + MongoDB", "Mkyong", "25-FEB-2017"));
////
////    for (Employee employee : employeeList) {
////      employeeService.save(employee);
////    }
////
////    Page<Employee> byAuthor = employeeService.findByAuthor("Rambabu Posa", new PageRequest(0, 10));
////    assertThat(byAuthor.getTotalElements(), is(4L));
////
////    Page<Employee> byAuthor2 = employeeService.findByAuthor("Mkyong", new PageRequest(0, 10));
////    assertThat(byAuthor2.getTotalElements(), is(1L));
////
////  }
////
////  @Test
////  public void testDelete() {
////
////    Employee employee = new Employee("1001", "Elasticsearch Basics", "Rambabu Posa", "23-FEB-2017");
////    employeeService.save(employee);
////    employeeService.delete(employee);
////    Employee testEmployee = employeeService.findOne(employee.getId());
////    assertNull(testEmployee);
////  }
//
//}
//
