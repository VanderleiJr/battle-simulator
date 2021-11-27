package br.ufscar.dc.compiladores.battle.simulator;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.Token;

public class main {
    public static void main(String args[]) throws IOException{
        CharStream cs = CharStreams.fromFileName(args[0]);
        battle lex = new battle(cs);

        Token t = null;
        //Criação e Abertura do arquivo de saída
        BufferedWriter outputFile = new BufferedWriter(new FileWriter(args[1]));
        
        while ((t=lex.nextToken()).getType() != Token.EOF) {
            //Se o tipo do token for 12 (ERRO), entra no if que categoriza o erro
            if(t.getType() == 12){
                outputFile.append("Linha " + t.getLine() + ": ");
                //Cadeia literal não fechada
                if(t.getText().equals("\"")){
                    outputFile.append("cadeia literal nao fechada\n");
                //Comentário não fechado
                } else if(t.getText().equals("#")){
                    outputFile.append("comentario nao fechado\n");
                //Símbolo não identificado
                } else {
                    outputFile.append(t.getText() + " - simbolo nao identificado\n");
                }
                //Após a impressão do erro, finaliza do WHILE
                break;
            //Caso nenhum erro seja encontrado a impressão do token é feita
            } else {
                outputFile.append("<'" + t.getText() + "'," + battle.VOCABULARY.getDisplayName(t.getType()) + ">\n");
            }
        }  
    //Fecha o arquivo, salvando as modificações
    outputFile.close();
    }
}
