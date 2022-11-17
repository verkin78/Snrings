public class Main {
    public static void main(String[] args) {
        String firstname = "Семён";
        String middlename = "Семёнович";
        String lastlename = "Иванов";
        firstname = firstname + " ";
        lastlename = lastlename + " ";
        String fullname = lastlename + firstname + middlename;
        fullname = fullname.replace ("ё", "е");

        System.out.println("ФИО сотрудника - " + fullname);
        fullname = fullname.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullname);
    }
}