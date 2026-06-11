public class FilmeAdapter implements FilmeStreaming {
    private FilmeDVD filmeDVD;

    public FilmeAdapter(FilmeDVD filmeDVD) {
        this.filmeDVD = filmeDVD;
    }

    @Override
    public void assistirFilme(String titulo) {
        filmeDVD.reproduzirDVD(titulo);
    }
}
