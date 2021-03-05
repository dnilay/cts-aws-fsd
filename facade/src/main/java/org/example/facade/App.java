package org.example.facade;

public class App {

  /**
   * Program entry point.
   *
   * @param args command line args
   */
  public static void main(String[] args) {
    var facade = new DwarvenGoldmineFacade();
    facade.startNewDay();
    facade.digOutGold();
    facade.endDay();
  }
}
