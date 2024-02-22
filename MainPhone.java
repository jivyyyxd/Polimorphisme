import java.util.Scanner;

public class MainPhone {
    public static void main(String[] args) {
        

        // membuat objek hp
        Phone RedmiNote8 = new Xiaomi();

        // membuat objek user
        PhoneUser HANEP = new PhoneUser(RedmiNote8);

        // coba nyalain
        HANEP.turnOnThePhone();

        Scanner input = new Scanner(System.in);
        String aksi;

        while (true) {
            System.out.println("=== ACTION INTERFACE");
            System.out.println("[1] Nyalakan HP");
            System.out.println("[2] Matikan HP");
            System.out.println("[3] Perbesar Volume");
            System.out.println("[4] Kecilkan Volume");
            System.out.println("[0] Keluar");
            System.out.println("--------------------");
            System.out.print("Pilih aksi lo> ");
            aksi = input.nextLine();

            if(aksi.equalsIgnoreCase("1")){
                HANEP.turnOnThePhone();
            } else if (aksi.equalsIgnoreCase("2")){
                HANEP.turnOffThePhone();
            } else if (aksi.equalsIgnoreCase("3")){
                HANEP.makePhoneLouder();
            } else if (aksi.equalsIgnoreCase("4")){
                HANEP.makePhoneSilent();
            } else if (aksi.equalsIgnoreCase("0")){
                System.exit(0);
            } else {
                System.out.println("Salah aksi woee!!");
            }
        }
    }
}
