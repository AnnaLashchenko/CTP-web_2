public class lab1 {
    public static void main(String[] args){

        Patient s1 = new Patient();
        System.out.println("Инфа о пациентах:");
        s1.view_data();
        Patient s2 = new Patient("Лащенко","женский",19);
        s2.view_data();
        Patient s3 = new Patient("Абакумов","мужской",20);
        writeInfo wr = new writeInfo(s3);
        wr.take_class();
//        Object ob1 = new Object()
    }
}
