import java.util.ArrayList;

public class Task {

  private static ArrayList<Task> instances = new ArrayList<Task>();

  private String mDescription;
  private int mId;

  public Task(String description) {
    mDescription = description;
    mId = instances.size();
    instances.add(this);
  }

  public String getDescription() {
      return mDescription;
    }


    public int getId() {
      return mId;
    }

  
    public static ArrayList<Task> getAll() {
      return instances;
    }

    public static Task find(int id) {
      try {
        return instances.get(id - 1);
      } catch (IndexOutOfBoundsException e) {
        return null;
      }
    }

    public static void clear() {
      instances.clear();
    }


}
