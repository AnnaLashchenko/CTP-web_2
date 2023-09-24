import java.util.Scanner;
public class Patient {
    public String name;
    public String sex;
    public double age;
    private boolean availability;

    public Patient(String name, String sex, double age){
        this.name = name;
        this.sex = sex;
        this.age = age;
    }
    public Patient(){
        System.out.print("Введите фамилию пациента: ");
        Scanner s = new Scanner(System.in);
        String name_ = s.nextLine();
        name = name_;
        System.out.print("Введите возраст пациента: ");
        Scanner s1 = new Scanner(System.in);
        double age_ = s1.nextDouble();
        age = age_;
        System.out.print("Введите 1 если пациент находится на стационаре,2 - если пациент выписан: ");
        Scanner s2 = new Scanner(System.in);
        int choice = s2.nextInt();
        boolean availability;
        if(choice == 1) availability = true;
        else availability = false;
    }
    public void view_data(){
        System.out.println("------------------------------");
        System.out.println("Фамилия пациента: "+ this.name);
        System.out.println("Возраст пациента: "+ this.age);
        if(this.availability) {
            System.out.println("Пациент на стационаре");}
        else System.out.println("Пациент выписан");
    }
}


