public class AplikasiTodolist {

    public static String[] model = new String[10];

    public static void main(String[] args) {

    }

    /**
     * Menampilkan todo list
     */
    public  static void showTodoList(){
        for (var i = 0; i < model.length; i++){
            var todo  = model[i];
            var no = i + 1;

            if(todo != null){
                System.out.println(no + ". " + todo);
            }
        }
    }

    public static void testShowTodoList(){
        model[0] = "Belajar Java Dasar";
        model[1] = "Studi Kasus Java Basic : Aplikasi Todolist";
        showTodoList();
    }


    /**
     * Menambah todo list
     */
    public static void addTodoList(String todo){
        // cek apakah model penuh?
        var isFull = true;
        for (int i = 0; i < model.length; i++){
            if (model[i] == null) {
                isFull = false;
                break;
            }
        }

        // jika penuh. kita resize ukuran array 2x lipat
        if (isFull) {
            var temp = model;
            model = new String[model.length * 2];

            for (int i = 0; i < temp.length; i++){
                model[i] = temp[i];
            }
        }

        // tambahkan ke posisi yang data array nya NULL
        for (var i = 0; i < model.length; i++){
            if (model[i] == null) {
                model[i] = todo;
                break;
            }
        }
    }

    /**
     * Menghapus todo dari list
     */
    public static boolean removeTodoList(Integer number) {
        return true;
    }

    /**
     * Menampilkan view todo list
     */
    public static void viewShowTodoList(){

    }

    /**
     * Menampilkan view menambahkan todo list
     */
    public static void viewAddTodoList(){

    }

    /**
     * Menampilkan view menghapus todo list
     */
    public static void viewRemoveTodoList() {

    }
}
