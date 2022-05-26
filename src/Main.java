public class Main {

    public static void main(String[] args) {

        VeredaGT3000 prueba = new VeredaGT3000("HYL9430", 10, 5);

        System.out.println(prueba.status());
        prueba.move();
        System.out.println(prueba.energyLevel());
        System.out.println(prueba.status());

    }
}
