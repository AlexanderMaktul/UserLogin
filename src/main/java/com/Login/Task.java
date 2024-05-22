package com.Login;

public class Task {
    private String taskName;
    private int taskNumber;
    private String taskDescription;
    private String developerDetails;
    private int taskDuration;
    private String taskStatus;
    private String taskID;

    public Task(String taskName, int taskNumber, String taskDescription, String developerDetails, int taskDuration, String taskStatus) {
        this.taskName = taskName;
        this.taskNumber = taskNumber;
        this.taskDescription = taskDescription;
        this.developerDetails = developerDetails;
        this.taskDuration = taskDuration;
        this.taskStatus = taskStatus;
        this.taskID = createTaskID();
    }

    public boolean checkTaskDescription() {
        return this.taskDescription.length() <= 50;
    }

    public String createTaskID() {
        String[] devParts = developerDetails.split(" ");
        String devLastName = devParts[devParts.length - 1];
        return taskName.substring(0, 2).toUpperCase() + ":" + taskNumber + ":" + devLastName.substring(devLastName.length() - 3).toUpperCase();
    }

    public String printTaskDetails() {
        return "Task Status: " + taskStatus + "\n" +
                "Developer Details: " + developerDetails + "\n" +
                "Task Number: " + taskNumber + "\n" +
                "Task Name: " + taskName + "\n" +
                "Task Description: " + taskDescription + "\n" +
                "Task ID: " + taskID + "\n" +
                "Duration: " + taskDuration + " hours";
    }

    public int getTaskDuration() {
        return taskDuration;
    }
}
