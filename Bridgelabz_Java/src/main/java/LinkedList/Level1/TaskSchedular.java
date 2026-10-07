package LinkedList;

class Task{
    int task_id;
    String task_name;
    int priority;
    String due_date;
    Task next;

    Task(int task_id, String task_name, int priority, String due_date){
        this.task_id = task_id;
        this.task_name = task_name;
        this.priority = priority;
        this.due_date = due_date;
        this.next = null;
    }
}

class taskOperations{
    Task head = null;
    public void addAtBeginning(int task_id, String task_name, int priority, String due_date){
        Task task = new Task(task_id,task_name,priority,due_date);
        if(head==null){
            head = task;
            task.next = head;
        }else{
            task.next = head;
            head = task;
        }
    }

    public void addAtEnd(int task_id, String task_name, int priority, String due_date){
        Task current = head;
        Task task = new Task(task_id,task_name,priority,due_date);
        while(current.next!=head){
            current = current.next;
        }
        current.next = task;
        task.next = head;
    }

    public void addAtPosition(int task_id, String task_name, int priority, String due_date, int pos){
        Task current = head;
        Task task = new Task(task_id,task_name,priority,due_date);
        int i=1;
        while(i<pos-1){
            current = current.next;
            i++;
        }
        task.next = current.next;
        current.next = task;
    }

    public void removeTask(int task_id){
        Task current = head,tail = head;
        if(head==null){
            return;
        }

        while(current.next!=head && current.task_id != task_id){
            tail = current;
            current = current.next;
        }

        if(current==head){
            head = current.next;
            current.next = null;
            return;
        }

        if(current.next==head){
            tail.next = head;
        }

        tail.next = current.next;
        current.next = null;

    }

    public void viewCurrentTask(String task_name){
        Task current = head;

        while(current.next!=head){
            if(current.task_name.equals(task_name)) {
                System.out.println("Task id: " + current.task_id);
                System.out.println("Task Name: " + current.task_name);
                System.out.println("Priority: " + current.priority);
                System.out.println("Due Date: " + current.due_date);
                System.out.println();
                return;
            }else{
                current = current.next;
            }
        }
        System.out.println("Task id: " + current.task_id);
        System.out.println("Task Name: " + current.task_name);
        System.out.println("Priority: " + current.priority);
        System.out.println("Due Date: " + current.due_date);
        System.out.println();

    }

    public void viewTasks(){
        Task current = head;
        while(current.next!=head){
            System.out.println("Task id: " + current.task_id);
            System.out.println("Task Name: " + current.task_name);
            System.out.println("Priority: " + current.priority);
            System.out.println("Due Date: " + current.due_date);
            System.out.println();
            current = current.next;
        }
    }

    public void searchByPriority(int priority){
        Task current = head;
        while(current.next!=head){
            if(current.priority==priority){
                System.out.println("Task id: " + current.task_id);
                System.out.println("Task Name: " + current.task_name);
                System.out.println("Priority: " + current.priority);
                System.out.println("Due Date: " + current.due_date);
                System.out.println();
                return;
            }
        }
        System.out.println("Task id: " + current.task_id);
        System.out.println("Task Name: " + current.task_name);
        System.out.println("Priority: " + current.priority);
        System.out.println("Due Date: " + current.due_date);
        System.out.println();
    }

}


public class TaskSchedular {
    public static void main(String[] args){
        taskOperations task = new taskOperations();
        task.addAtBeginning(122,"debugging",3,"23-09-2026");
        task.addAtEnd(132,"building",2,"15-09-2026");
        task.addAtPosition(142,"architecture",1,"23-09-2026",1);
        task.removeTask(142);

        task.viewCurrentTask("building");
        task.viewTasks();
        task.searchByPriority(1);


    }
}
