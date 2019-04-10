package example;

//http://localhost:8080/webserviceaxisDemo_war_exploded/services
public class HelloWorld {
  public String sayHelloWorldFrom(String from) {
    String result = "Hello, world, from " + from;
    System.out.println(result);
    return result;
  }

  public String sayGoodbye(String str){
    String result="你是谁,"+str;
    System.out.println(result);
    return result;
  }
}
