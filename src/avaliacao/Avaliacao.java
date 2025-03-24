package avaliacao;

public class Avaliacao {
    private int id;
    private int notaQtdArvores;
    private int notaQuaAr;
    private int notaAusPoluicaoSom;
    private int notaColeta;
    private int notaFacChegar;
    private int AreaVerde;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNotaQtdArvores() {
        return notaQtdArvores;
    }

    public void setNotaQtdArvores(int notaQtdArvores) {
        this.notaQtdArvores = notaQtdArvores;
    }

    public int getNotaQuaAr() {
        return notaQuaAr;
    }

    public void setNotaQuaAr(int notaQuaAr) {
        this.notaQuaAr = notaQuaAr;
    }

    public int getNotaAusPoluicaoSom() {
        return notaAusPoluicaoSom;
    }

    public void setNotaAusPoluicaoSom(int notaAusPoluicaoSom) {
        this.notaAusPoluicaoSom = notaAusPoluicaoSom;
    }

    public int getNotaColeta() {
        return notaColeta;
    }

    public void setNotaColeta(int notaColeta) {
        this.notaColeta = notaColeta;
    }

    public int getNotaFacChegar() {
        return notaFacChegar;
    }

    public void setNotaFacChegar(int notaFacChegar) {
        this.notaFacChegar = notaFacChegar;
    }

    public int getAreaVerde() {
        return AreaVerde;
    }

    public void setAreaVerde(int areaVerde) {
        AreaVerde = areaVerde;
    }

    @Override
    public String toString() {
        return "AvaliacaoRepository{" +
                "Id=" + id +
                ", Quantidade de árvores=" + notaQtdArvores +
                ", Qualidade do ar=" + notaQuaAr +
                ", Ausência de poluição sonora=" + notaAusPoluicaoSom +
                ", Coleta de resíduos=" + notaColeta +
                ", Facilidade de chegar com transporte público=" + notaFacChegar +
                ", AreaVerde=" + AreaVerde +
                '}';
    }

    public int media() {
        int m = (notaColeta+notaAusPoluicaoSom+notaFacChegar+notaQtdArvores+notaQuaAr)/5;
        return m;
    }
}
