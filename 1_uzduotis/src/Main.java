import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Įveskite apelsino skersmenį: ");
        double d = Double.parseDouble(reader.nextLine());
        System.out.print("Įveskite apelsino žievelės storį: ");
        double a = Double.parseDouble(reader.nextLine());

       double r = (d - a * 2) / 2;
       double v = Math.round(4.0 / 3.0 * Math.PI * Math.pow(r, 3) * 100) / 100.0;

        System.out.println(v);
        reader.close();
    }
}
