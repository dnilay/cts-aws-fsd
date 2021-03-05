package org.example.facade;

import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * DwarvenMineWorker is one of the goldmine subsystems.
 */
public abstract class DwarvenMineWorker {

  private static final Logger LOGGER = LoggerFactory.getLogger(DwarvenMineWorker.class);

  public void goToSleep() {
    LOGGER.info("{} goes to sleep.", name());
    System.out.println("goes to sleep."+name());
  }

  public void wakeUp() {
    LOGGER.info("{} wakes up.", name());
    System.out.println("wake up."+name());
  }

  public void goHome() {
    LOGGER.info("{} goes home.", name());
    System.out.println("goes home"+name());
  }

  public void goToMine() {
    LOGGER.info("{} goes to the mine.", name());
    System.out.println("goes to mine"+name());
  }

  private void action(Action action) {
    switch (action) {
      case GO_TO_SLEEP:
        goToSleep();
        break;
      case WAKE_UP:
        wakeUp();
        break;
      case GO_HOME:
        goHome();
        break;
      case GO_TO_MINE:
        goToMine();
        break;
      case WORK:
        work();
        break;
      default:
        LOGGER.info("Undefined action");
        System.out.println("Undefiened action");
        break;
    }
  }

  /**
   * Perform actions.
   */
  public void action(Action... actions) {
    Arrays.stream(actions).forEach(this::action);
  }

  public abstract void work();

  public abstract String name();

  enum Action {
    GO_TO_SLEEP, WAKE_UP, GO_HOME, GO_TO_MINE, WORK
  }
}
