package Principal;

import java.util.Scanner;

public class Teste5 {

    static String invercao(String palavra)
    {
        char strFinal[] = new char[palavra.length()];

        int j=0;
        for(int i=palavra.length()-1;i>=0;i--)
        {
            strFinal[j] = palavra.charAt(i);
            j++;
        }
        return new String(strFinal);
    }

    public static void main(String[] args) {
        String palavra;
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com a palavra");
        palavra = sc.nextLine();
        System.out.println(Teste5.invercao(palavra));

        }
    }

