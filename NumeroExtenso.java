import java.util.*;
public class NumeroExtenso {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Caracteres caracteres = new Caracteres();
        Numero numero = new Numero();
        numero.setNumero(Integer.parseInt(scanner.nextLine()));
        Unidade num = new Unidade(caracteres, numero);
        ManipularCaracteres manipularCaracteres = new ManipularCaracteres(caracteres);
        System.out.println(caracteres.getnumero_extenso());
    }
}
