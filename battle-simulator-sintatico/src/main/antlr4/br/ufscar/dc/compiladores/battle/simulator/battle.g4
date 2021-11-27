grammar battle;
// PARSER
// Estrutura do programa
programa                        :       bons? maus? EOF;

// Podem haver mais de um heroi/vilao pro bloco bom/mau. Mas se o bloco for chamado, um deve ter.
bons                            :       'bom' DELIMITADOR herois+ 'fim_bom' FIM_INST;
maus                            :       'mau' DELIMITADOR viloes+ 'fim_mau' FIM_INST;

herois                          :       'heroi' DELIMITADOR corpo_heroi 'fim_heroi' FIM_INST;
viloes                          :       'vilao' DELIMITADOR corpo_vilao 'fim_vilao' FIM_INST;

corpo_heroi                     :       'nome' DELIMITADOR NOME 'classe' DELIMITADOR classes 'nivel' DELIMITADOR NUM_INT;
corpo_vilao                     :       'nome' DELIMITADOR NOME 'elemento' DELIMITADOR elementos 'vida' DELIMITADOR NUM_REAL;

// Podem haver mais de uma classe/elemento, separados por virgulas. Mas obrigatórimente uma deve ter.
classes                         :       VAR (VIRGULA VAR)*;
elementos                       :       VAR (VIRGULA VAR)*;

// LEXER
// Lista de palavras chaves
PALAVRA_CHAVE                   :       'bom' | 'heroi'  | 'nome' | 'classe' | 'nivel' | 'fim_heroi' | 'fim_bom' |
                                        'mau' | 'vilao'  | 'elemento' | 'vida' | 'fim_vilao' | 'fim_mau';

//Números Inteiros e Números Reais(separados por '.')
NUM_INT 			:	('0'..'9')+;
NUM_REAL 			: 	('0'..'9')+'.'('0'..'9')+;

//Identificadores, ou seja, as variáveis
VAR      			:	(('a'..'z')|('A'..'Z')|'_')(('a'..'z')|('A'..'Z')|'_'|('0'..'9'))*;

//Strings com ' ' entre as palavras, inicadas por '"'
NOME				:	'"' ( ~('\n') )*? '"';

//Comentários ignorados de forma não gulosa para reconhecimento de erro
COMENTARIO			:	'#' ~('\n')*? '#' -> skip;

//Espaços podem ser ignorados, junto tabulação e retorno. A linha é usada para impressão de mensagens de erro
ESPACO				:	( ' ' | '\t' | '\r') -> skip;
LINHA				:	'\n' -> skip;

//Simbolos Epspeciais utilizados
DELIMITADOR			: 	':';

//Operadores
VIRGULA				:	',';
FIM_INST 			:	'.';

//Todo símbolo especial não identificado, irá cair no ERRO
ERRO				:	.;