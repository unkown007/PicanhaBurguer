package picanhaburger;

import java.io.*;
import java.text.DecimalFormat;

public class PicanhaBurger {

    public static void main(String[] args) throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        DecimalFormat mt = new DecimalFormat("###,###,###.00 MT");
        byte op;
        
        final short SIMPLES  = 120;
        final short COMPLETO = 150;
        
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
        
        short cod = 0;
        char tipo = ' ';
        char extraIngr = ' ';
        float valor, valorPagar = 0, desconto = 0;
        
        char opHamb, opIng;
        
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
                    do {
                        System.out.print("Codigo: ");
                        cod = Short.parseShort(rd.readLine());
                        if(cod < 100 || cod > 999)
                            System.out.println("Codigo invalido");
                    }while(cod < 100 || cod > 999);
                    
                    do {
                        System.out.println("S - Simples");
                        System.out.println("C - Completo");
                        System.out.print("Opcao: ");
                        opHamb = rd.readLine().charAt(0);
                        if(opHamb != 'S' && opHamb != 'C')
                                System.out.println("Opcao invalida");
                    }while(opHamb != 'S' && opHamb != 'C');
                    
                    do {
                        System.out.println("O - Ovo");
                        System.out.println("B - Batata Frita");
                        System.out.println("F - Fiambre");
                        System.out.print("Opcao: ");
                        opIng = rd.readLine().charAt(0);
                        if(opIng != 'O' && opIng != 'B' && opIng != 'F')
                            System.out.println("Opcao invalida");
                    }while(opIng != 'O' && opIng != 'B' && opIng != 'F');
                    
                    if(opHamb == 'S'){
                        qtdSimples += 1;
                        valorPagar += SIMPLES;
                    }else {
                        qtdCompleto += 1;
                        valorPagar += COMPLETO;
                    }
                    
                    if(opIng == 'O') {
                        qtdOvo += 1;
                        valorPagar += OVO;
                    }else{
                        if(opIng == 'B') {
                            qtdBatata += 1;
                            valorPagar += BATATA;
                        }else{
                            if(opIng == 'F'){
                                qtdFiambre += 1;
                                valorPagar += FIAMBRE;
                            }
                        }
                    }
                    
                    if(numVenda <= 10) {
                        desconto = valorPagar*0.07f;
                        valorPagar -= desconto;
                    }
                    
                    System.out.println("Valor a pagar: " + mt.format(valorPagar));
                    
                    do {
                        System.out.print("Valor: ");
                        valor = Float.parseFloat(rd.readLine());
                        if(valor < valorPagar)
                            System.out.println("Valor incompleto");
                    }while(valor < valorPagar);
                    
                    numVenda += 1;
                break;
                case 2:
                
                break;
                case 3:
                    System.out.printf("\n%8s%10s%10s%s\n", " ==============","===========","==========================",
                            "=========================");
                    System.out.printf("%-10s%-20s%-25s%-20s  |\n", "| Codigo","| Tipo","| Extra","| Valor a pagar");
                    System.out.printf("%8s%10s%10s%s\n", " ==============","===========","=============================",
                            "======================");
                    System.out.printf("| %-7d%-3s%-14s%5s%14s%11s%17s    |\n", cod, " |", tipo, " |", extraIngr,
                                    " |", mt.format(valorPagar));
                    System.out.printf("%8s%10s%10s%s\n", " ==============","===========","==========================",
                            "=========================");
                    System.out.println("\n");
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
