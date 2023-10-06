import IphoneClass.Musica.ReprodutorMusical;
import IphoneClass.Navegador.NavegadorInternet;
import IphoneClass.Telefone.AparelhoTelefonico;

// Iphone

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    // Implementação dos métodos das interfaces
    @Override
    public void tocar() {
        // Implementação da reprodução de música
    }

    @Override
    public void pausar() {
        // Implementação da pausa na reprodução de música
    }

    @Override
    public void selecionarMusica(String musica) {
        // Implementação da seleção de música
    }

    @Override
    public void ligar(String numero) {
        // Implementação da função de ligar
    }

    @Override
    public void atender() {
        // Implementação da função de atender chamada
    }

    @Override
    public void iniciarCorreioVoz() {
        // Implementação da função de iniciar correio de voz
    }

    @Override
    public void exibirPagina(String url) {
        // Implementação da exibição de página na Internet
    }

    @Override
    public void adicionarNovaAba() {
        // Implementação da adição de uma nova aba no navegador
    }

    @Override
    public void atualizarPagina() {
        // Implementação da atualização da página no navegador
    }
    
}
