import java.awt.*;


public class Form1 extends Frame {
    private Panel p1;
    private Panel p2;
    private Button btn1;
    private TextField txt;
    private Label lbl;
    public Form1(){
        setLayout(new BorderLayout());
        p1 = new Panel();
        p2 = new Panel();
        txt = new TextField(10);
        btn1 = new Button("OK");
        lbl = new Label("                                                                               ");
        add("North", p1);
        add("South", p2);
        p1.add(txt);
        p1.add(btn1);
        p2.add(lbl);
        reshape(100, 100, 1000, 300);
        show();
    }
    public boolean action(Event evt, Object arg){
        if("OK".equals(arg)){
            Caracteres caracteres = new Caracteres();
            Numero numero = new Numero();
            numero.setNumero(Integer.parseInt(txt.getText()));
            Unidade num = new Unidade(caracteres, numero);
            ManipularCaracteres manipularCaracteres = new ManipularCaracteres(caracteres);
            lbl.setText(caracteres.getnumero_extenso());
        }
        return true;
    }
    public static void main(String[] args) {
        new Form1();
    }
}
