package Celular.SmartPhone;

import Celular.Telefone.Conversa.Conversas;
import Celular.Telefone.Internet.Internet;
import Celular.Telefone.Musicas.ReproduzirMusica;

public class CelularMultifuncoes implements Conversas, Internet, ReproduzirMusica {
    public void Ligar() { System.out.println("Ligando via multifuncional");}

    public void Atender() {
        System.out.println("Atendendo via multifuncional ");
    }

    public void IniciarCorreioVoz() {
        System.out.println("Inicando conversa via multifuncional ");
    }

    public void ExibirPagina() {
        System.out.println("Exibindo pagina via multifuncional ");
    }

    public void AtualizarPagina() {
        System.out.println("Pagina atualizada  via multifuncional");
    }

    public void AdicionandoNovaAba() {
        System.out.println("Nova aba adicionada via multifuncional ");
    }

    public void tocar() {
        System.out.println("Tocando musica via multifuncional");
    }

    public void selecionarMusica() {
        System.out.println("Selecionando musica via multifuncional ");
    }

    public void pausar() {
        System.out.println("Parou musica via multifuncional ");
    }

}