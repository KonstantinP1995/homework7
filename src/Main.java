public class Main {
    public static void main(String[] args) {

        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + ' ' + firstName + ' ' + middleName;
        System.out.println("��� ���������� - " + fullName);

        String fullNameUp = fullName.toUpperCase();
        System.out.println("��� ���������� - " + fullNameUp);

        fullName = "������ ���� ��������";
        fullName = fullName.replace("�", "�");
        System.out.println("��� ���������� - " + fullName);
    }
}