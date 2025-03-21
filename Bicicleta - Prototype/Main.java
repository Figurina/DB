public class Main {
    public static void main(String[] args) {
        // Creăm componente inițiale
        IComponenta furca = new Furca("Negru", 120.5);
        IComponenta sa = new Sa("Albastru", 30.0);
        IComponenta teavaSuperioara = new TeavaSuperioara("Gri", 60.0);
        IComponenta roata = new Roata("Rosu", 26.0);

        // Creăm stickere inițiale
        Sticker sticker1 = new Sticker(furca, "Rosu");
        Sticker sticker2 = new Sticker(sa, "Verde");
        Sticker sticker3 = new Sticker(teavaSuperioara, "Alb");
        Sticker sticker4 = new Sticker(roata, "Galben");

        // Clonăm stickerele
        Sticker sticker5 = sticker1.clone();
        Sticker sticker6 = sticker2.clone();
        Sticker sticker7 = sticker3.clone();
        Sticker sticker8 = sticker4.clone();

        // Afișăm stickerele
        System.out.println("Stickere originale:");
        System.out.println(sticker1);
        System.out.println(sticker2);
        System.out.println(sticker3);
        System.out.println(sticker4);

        System.out.println("\nStickere clonate:");
        System.out.println(sticker5);
        System.out.println(sticker6);
        System.out.println(sticker7);
        System.out.println(sticker8);
    }
}