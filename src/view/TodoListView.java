package view;

import service.TodoListService;
import util.InputUtil;

public class TodoListView {

    private TodoListService todoListService;

    public TodoListView(TodoListService todoListService) {
        this.todoListService = todoListService;
    }

    // create view
    public void showTodoList(){
        while(true) {
            todoListService.showTodoList();

            System.out.println("MENU : ");
            System.out.println("1. Tambah");
            System.out.println("2. Hapus");
            System.out.println("3. Keluar(x)");

            var input = InputUtil. input("Pilih");

            if(input.equals("1")){
               addTodoList();
            } else if (input.equals("2")) {
                removceTodoList();
            } else if (input.equals("x")) {
                break;
            } else {
                System.out.println("Pilihan tidak dimengerti");
            }
        }
    }

    public void addTodoList(){

    }

    public void removceTodoList(){

    }
}
