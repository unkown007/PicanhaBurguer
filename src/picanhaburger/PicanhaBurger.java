package picanhaburger;

import java.io.*;

public class PicanhaBurger {

    public static void main(String[] args) throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        byte op;
        
        final byte SIMPLES  = (byte) 120;
        final byte COMPLETO = (byte) 150;
        
        // ingredientes extras
        final byte OVO = 50;
        final byte BATATA = 70;
        final byte FIAMBRE = 30;
        
        int qtdOvo;
        int qtdBatata;
        int qtdFiambre;
        
        qtdOvo = qtdBatata = qtdFiambre = 0;
        
        int qtdSimples;
        int qtdCompleto;
        
        qtdSimples = qtdCompleto = 0;
        
        int valorEmpresa = 0;
        
        int numVenda = 0;
        
        byte cod;
        char tipo;
        char extraIngr;
        float valor;
        
        do {
            System.out.println("1. Receber os dados da Venda");
            System.out.println("2. Visualizar o valor a pagar");
            System.out.println("3. Dados da venda");
            System.out.println("4. Valor da total recebido pela empresa");
            System.out.println("5. Quantidade de pedidos para cada tipo de hamburger");
            System.out.println("6. Visualizar o ingrediente mais solicitadoo");
            System.out.println("0. Sair");
            do {
                System.out.print("Opcao: ");
                op = Byte.parseByte(rd.readLine());
                if( op < 0 || op > 6)
                    System.out.println("Opcao ivalida");
            }while(op < 0 || op > 6);
            
            switch(op) {
                case 1:
                
                break;
                case 2:
                
                break;
                case 3:
                
                break;
                case 4:
                
                break;
                case 5:
                
                break;
                case 6:
                
                break;
            }
            
        }while(op != 0);
        
    }
    
}
