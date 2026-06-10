public class Computador {

    private String processador;
    private String memoriaRAM;
    private String armazenamento;
    private String placaVideo;
    private String sistemaOperacional;

    public Computador(String processador, String sistemaOperacional, String placaVideo, String armazenamento, String memoriaRAM) {
        this.processador = processador;
        this.sistemaOperacional = sistemaOperacional;
        this.placaVideo = placaVideo;
        this.armazenamento = armazenamento;
        this.memoriaRAM = memoriaRAM;
    }

    @Override
    public String toString() {
        return "Processador: " + processador +
                "\nRAM: " + memoriaRAM +
                "\nArmazenamento: " + armazenamento +
                "\nPlaca de vídeo: " +
                (placaVideo == null ? "N/A" : placaVideo) +
                "\nSistema operacional: " +
                (sistemaOperacional == null ? "N/A" : sistemaOperacional);
    }
}
