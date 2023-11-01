package Tugas;

public class PerhitunganMain {
    public static void main(String[] args) {
        Perhitungan volumeKubus = new Perhitungan(6);
        Perhitungan luasKubus = new Perhitungan(10);
        Perhitungan volumeBalok = new Perhitungan(7,8,9);
        Perhitungan luasBalok = new Perhitungan(4,5,6);

        System.out.println("Volume kubus dgn panjang sisi 6 cm = " +  volumeKubus.VolumeKubus()+" cm^3");
        System.out.println("Luas kubus dgn panjang sisi 10 cm = " +  luasKubus.LuasKubus()+" cm^2");
        System.out.println("Volume balok dgn panjang 7 cm, lebar 8 cm, dan tinggi 9 cm = " +  volumeBalok.VolumeBalok()+" cm^3");
        System.out.println("Luas balok dgn panjang 4 cm, lebar 5 cm, dan tinggi 6 cm = " +  luasBalok.LuasBalok()+" cm^2");
    }
}
