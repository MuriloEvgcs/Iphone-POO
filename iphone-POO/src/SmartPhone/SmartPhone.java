package SmartPhone;

import Functions.AparelhoTelefonico;
import Functions.NavegarWeb;
import Functions.ReprodutorMusical;

public class SmartPhone implements AparelhoTelefonico,NavegarWeb,ReprodutorMusical{
    public void tocar(){
        System.out.println("Tocando musica");
    }

    public void pausar(){
        System.out.println("Musica pausada");
    }

    public String selecionarMucica(String Musica){
        System.out.println("Tocando a musica " + Musica);
        return Musica;
    }

    public void atender(){
        pausar();
        System.out.println("Ligação atendida");
    }

    public String ligar(String numero){
        pausar();
        System.out.println("ligando para " + numero);
        return  numero;
    }

    public void iniciarCorreioDeVoz(){
        System.out.println("Correio de voz iniciado");
    }

    public String exibirPaginaWeb(String url){
        System.out.println("Página "+ url + " acessada");
        return url;
    }
     public void adicionarNovaAba(){
        System.out.println("Nova aba adicionada");
     }

     public void atualizarPagina(){
        System.out.println("Pagina atualizada");
     }
}
