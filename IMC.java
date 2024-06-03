import javax.swing.*;

public class Code1 {

    public static void main(String[] args) {
            //delcara sx do tipo inteiro
        int k;
            //declara sx do tipo String
        String sk;

            //faz leitura e grava em sx
        sk = JOptionPane.showInputDialog("Digite seu peso em Kg:");
            //converte sx(string)inteiro
        k = Integer.parseInt(sk);
            //delcara sx do tipo String
        int c;
        String sc;
        sc = JOptionPane.showInputDialog("Digite sua altura em cm:");
        //converte sx(string)inteiro
        c = Integer.parseInt(sc);


            //mostra o resultado na janela grafica
        JOptionPane.showMessageDialog (null, "O Seu IMC é: " + (c * c) / k );
    }
}
