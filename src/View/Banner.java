package View;

public class Banner {
    public static  void mostrarBanner() {
        String art = """
            ███████╗ ██████╗ ███╗   ███╗      ██╗  ██╗ ██████╗███╗   ███╗
            ██╔════╝██╔════╝ ████╗ ████║      ██║  ██║██╔════╝████╗ ████║
            ███████╗██║  ███╗██╔████╔██║█████╗███████║██║     ██╔████╔██║
            ╚════██║██║   ██║██║╚██╔╝██║╚════╝██╔══██║██║     ██║╚██╔╝██║
            ███████║╚██████╔╝██║ ╚═╝ ██║      ██║  ██║╚██████╗██║ ╚═╝ ██║
            ╚══════╝ ╚═════╝ ╚═╝     ╚═╝      ╚═╝  ╚═╝ ╚═════╝╚═╝     ╚═╝
                                                                         
                """;
                for(int i =0; i < art.length(); i++) {
                    System.out.print(art.charAt(i));
                }
    }
}