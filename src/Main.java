public class Main {
    public static void main(String[] args) {

        Casa minhaCasa = new Casa("Padre Cacique",230, 720);
        minhaCasa.exibirInformacoes();

        minhaCasa.setMetragem(200);
        minhaCasa.exibirInformacoes();

        minhaCasa.abrirJanela();

        minhaCasa.fecharJanela();
    }
}