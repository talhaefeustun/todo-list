package csc207.todo_list;

public class TodoItem {
  private String title;
  private boolean completed;

  public TodoItem(String title) {
    this(title, false);
  }

  public TodoItem(String title, boolean completed) {
    this.title = title;
    this.completed = completed;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public boolean isCompleted() {
    return completed;
  }

  public void toggleCompleted() {
    completed = !completed;
  }
}