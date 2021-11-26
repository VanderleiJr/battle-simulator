package br.ufscar.dc.compiladores.battle.simulator;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.exit;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;

public class main {
    public static void main(String args[]) throws IOException{
        CharStream cs = CharStreams.fromFileName(args[0]);
        battleLexer lex = new battleLexer(cs);

        Token t = null;
        //Criação e Abertura do arquivo de saída
        BufferedWriter outputFile = new BufferedWriter(new FileWriter(args[1]));
        
        while ((t=lex.nextToken()).getType() != Token.EOF) {
            //Se o tipo do token for 25 (ERRO), entra no if que categoriza o erro
            if(t.getType() == 25){
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
                outputFile.append("Fim da compilacao\n");
                //Fecha o arquivo, salvando as modificações
                outputFile.close();
                //Após a impressão do erro, finaliza o programa
                exit(0);
            }  
        }
        //Resetamos a stream dos Tokens, para ser verificado a sintatica
        lex.reset();
        //Iniciamos o modo de impressão passando o argumento recebido no terminal
        PrintWriter pw = new PrintWriter(new File(args[1]));
        CommonTokenStream tokens = new CommonTokenStream(lex);
        battleParser parser  = new battleParser(tokens);

        MyCustomErrorListener pegaErro = new MyCustomErrorListener(pw);
        //Remover o tratamento de erro padrão do ANTLR4
        parser.removeErrorListeners();
        //Adicionar o nosso tratamento de erro
        parser.addErrorListener(pegaErro);

        parser.programa();
    }
}
