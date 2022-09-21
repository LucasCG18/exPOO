public class NumeroExtenso {
    NumeroExtenso(Caracteres caracteres, Numero numero){
        Unidade unidade = new Unidade();
        Dezena dezena = new Dezena();
        Centena centena = new Centena();
        Milhar milhar = new Milhar();
        unidade.unidade(caracteres, numero);
        dezena.dezena(caracteres, numero);
        centena.centena(caracteres, numero);
        milhar.milhar(caracteres, numero);
    }
}
