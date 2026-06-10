public class ComputadorBuilder {

    private String processador;
    private String memoriaRAM;
    private String armazenamento;
    private String placaVideo;
    private String sistemaOperacional;

    public ComputadorBuilder setProcessador(String processador) {
        this.processador = processador;
        return this;
    }

    public ComputadorBuilder setMemoriaRAM(String memoriaRAM) {
        this.memoriaRAM = memoriaRAM;
        return this;
    }

    public ComputadorBuilder setArmazenamento(String armazenamento) {
        this.armazenamento = armazenamento;
        return this;
    }

    public ComputadorBuilder setPlacaVideo(String placaVideo) {
        this.placaVideo = placaVideo;
        return this;
    }

    public ComputadorBuilder setSistemaOperacional(String sistemaOperacional) {
        this.sistemaOperacional = sistemaOperacional;
        return this;
    }

    public Computador build() {
        return new Computador(
                processador,
                memoriaRAM,
                armazenamento,
                placaVideo,
                sistemaOperacional
        );
    }
}
