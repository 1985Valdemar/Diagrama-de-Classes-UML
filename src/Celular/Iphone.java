package Celular;

import Celular.SmartPhone.CelularMultifuncoes;

public class Iphone {
    public static void main(String[] args) {
        CelularMultifuncoes celularMultifuncoes = new CelularMultifuncoes();

        System.out.println("Liga o aparelho");
        celularMultifuncoes.Ligar();
        celularMultifuncoes.Atender();
        celularMultifuncoes.IniciarCorreioVoz();

        System.out.println("Internet");
        celularMultifuncoes.AtualizarPagina();
        celularMultifuncoes.ExibirPagina();
        celularMultifuncoes.AdicionandoNovaAba();

        System.out.println("Musicas");
        celularMultifuncoes.tocar();
        celularMultifuncoes.pausar();
        celularMultifuncoes.selecionarMusica();
    }
}