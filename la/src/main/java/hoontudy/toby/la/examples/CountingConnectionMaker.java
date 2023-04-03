package hoontudy.toby.la.examples;

import java.sql.Connection;

public class CountingConnectionMaker implements ConnectionMaker {

  int counter = 0;
  private ConnectionMaker realConnectionMaker;

  public CountingConnectionMaker(ConnectionMaker realConnectionMaker) {
    this.realConnectionMaker = realConnectionMaker;
  }

  @Override
  public Connection makeConnection() throws Exception {
    this.counter++;
    return realConnectionMaker.makeConnection();
  }

  public int getCounter() {
    return counter;
  }
}
