package Celular.Telefone.Conversa;

public class AparelhoTelefonico implements Conversas {

    @Override
    public void Ligar() {
        System.out.println("Ligando");
    }

    @Override
    public void Atender() {
        System.out.println("Atendendo ligação");
    }

    @Override
    public void IniciarCorreioVoz() {
        System.out.println("Mensagem de voz");
    }
}
