package ns;

import observer.TaskObserver;

import java.util.Date;

/**
 * Interface of notification system.
 * A timer. Notifies observer when
 * the task's time comes.
 */
public interface INotificationSystem {
    /**
     * Sets the link to controller connected
     * with this notification system
     */
   // void setController(IController controller);
    /**
     * Registers the task with identifier @param id
     * in the check list
     */
    void startTask(int id, Date time);
    /**
     * Deletes the task with identifier @param id
     * from the check list
     */
    void cancelTask(int id);

    /**
     * Updates the time of task with identifier @param id
     * and registers in the check list
     */
    void delayTask(int id, Date time);
    /**
     * Registers an observer which would be notified
     */
    void registerObserver(TaskObserver o);
}
