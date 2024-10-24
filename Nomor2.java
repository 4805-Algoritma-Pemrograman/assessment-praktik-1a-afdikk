public class Nomor2 {
    public static void main(String[] args) {
        
        //Deklarasi Variabel
        int totalTrip = 0;
        int kilometerBeliau = 0;
        int kilometerKita = 0;
        int kilometerMereka = 0;
        int biayaPerKm = 13000;
        int namaDriver;
        int lamaTrip;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Masukkan Nama Driver [Beliau/Mereka/Kita]: ");
            namaDriver = scanner.nextInt();
            System.out.println("lama trip (km): ");
            lamaTrip = scanner.nextInt();
            
            switch (namaDriver) {
                case 1:
                    biayaPerKm *= lamaTrip;
                    break;
                case 2:
                    biayaPerKm *= lamaTrip;
                    break;
                case 3:
                    biayaPerKm *= lamaTrip;
                    break;
            
                default:
                    System.out.println("Driver Cuma 3");
                    break;
            }
            
            System.out.print("Input lagi [Y/N]? ");
            String pilihan = scanner.nextLine()
            if (pilihan.equalsIgnoreCase("N")) {
                break;
            }

        }






    }
}
