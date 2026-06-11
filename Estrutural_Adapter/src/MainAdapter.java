public class MainAdapter {
    public static void main(String[] args) {
        FilmeDVD dvd = new FilmeDVD();

        FilmeStreaming streaming = new FilmeAdapter(dvd);

        streaming.assistirFilme("Vingadores: Ultimato");
    }
}
