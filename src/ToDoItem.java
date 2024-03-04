public class ToDoItem {
    private String description;
    private boolean isDone;

    public String getDescription()
    {
        return description;
    }
    public void setDescription(String description)
    {
        this.description = description;
    }

    public boolean getDone()
    {
        return isDone;
    }
    public void setDone(boolean isDone)
    {
        this.isDone = isDone;
    }
    // TODO Now:
    // Add a constructor to initialize the item with the description, and isDone as false, with a single parameter for the description
    // Add getters and setters for each field
    public ToDoItem (String description)
    {
        setDescription(description);
        setDone(false);
    }
}
