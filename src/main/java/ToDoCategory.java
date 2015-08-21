import java.util.ArrayList;

public class ToDoCategory {
  private static ArrayList<ToDoCategory> instances = new ArrayList<ToDoCategory>();

  private String mName;
  private int mId;
  private ArrayList<Task> mTaskList = new ArrayList<Task>();

  public ToDoCategory(String name) {
    mName = name;
    instances.add(this);
    mId = instances.size();
    mTaskList = new ArrayList<Task>();
  }

  public String getName() {
    return mName;
  }

  public int getId() {
    return mId;
  }

  public ArrayList<Task> getTasks() {
    return mTaskList;
  }

  public void addTask(Task task) {
    mTaskList.add(task);
  }

  public static ArrayList<ToDoCategory> all() {
    return instances;
  }

  public static void clear() {
    instances.clear();
  }

  public static ToDoCategory find(int id) {
    try {
      return instances.get(id - 1);
    } catch (IndexOutOfBoundsException exception) {
      return null;
    }
  }

}
