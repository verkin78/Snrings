public class Main {
    public static void main(String[] args) {
        String firstname = "Иван";
        String middlename = "Иванович";
        String lastlename = "Иванов";
        firstname = firstname + " ";
        lastlename = lastlename + " ";
        String fullname = lastlename + firstname + middlename;
        System.out.println("ФИО сотрудника - " + fullname);
        fullname = fullname.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullname);


    }
}