public class Main {
    public static void main(String[] args) {
        Casa c = new Casa(4,4);
        Casa c1 = new Casa();
        c1.setPortas(3);
        c1.setQuartos(3);


        System.out.println("quartos "+c.getQuartos() + " portas "+c.getPortas() + " Dono "+c.nomeDono());
        System.out.println("quartos "+c1.getQuartos() + " portas "+c1.getPortas()+ " Dono "+c1.nomeDono());
        System.out.println(c.toString());
        System.out.println(c1.toString());
    }
}
