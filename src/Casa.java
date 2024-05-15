/**
 * @author cintia
 */

public class Casa {

    private String endereco;
    private int numero;
    private int metragem;

    //contrututor

    public Casa (String endereco, int numero, int metragem) {
        this.endereco = endereco;
        this.numero = numero;
        this.metragem = metragem;
    }

    //gets
    // Método para obter o endereco da casa
    public String getEndereco() {
        return endereco;
    }

    public int getNumero() {
        return numero;
    }

    public int getMetragem() {
        return metragem;
    }


    //sets

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setMetragem(int metragem) {
        this.metragem = metragem;
    }

    //algumuns metodos de funcao

    public void abrirJanela(){
        System.out.println("Abrindo a janela");
    }

    public void fecharJanela(){
        System.out.println("Fechando a janela");
    }

    // Método para exibir informações sobre o carro
    public void exibirInformacoes() {
        System.out.println("Endereco: " + endereco);
        System.out.println("Numero: " + numero);
        System.out.println("Metragem: " + metragem + "m2");
    }
}

