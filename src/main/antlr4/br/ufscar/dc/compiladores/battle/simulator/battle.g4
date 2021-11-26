lexer grammar battle;
// LEXER
// Lista de palavras chaves
PALAVRA_CHAVE                   :       'bom' | 'heroi'  | 'nome' | 'classe' | 'nivel' | 'fim_heroi' | 'fim_bom'
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