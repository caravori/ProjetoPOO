package Controller;


public class GlobalFlag {
    private static boolean Gerente;

    public static boolean isGerente() {
        return Gerente;
    }

    public static void setGerente(boolean gerente) {
        Gerente = gerente;
    }
}
