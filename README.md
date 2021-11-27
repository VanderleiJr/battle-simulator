# battle-simulator
Analisador Léxico e Sintático para o gerador de um simulador de batalha entre heróis e vilões construído com a ANTLR4.

*Grupo composto por Vanderlei de Brito Junior, 636932*

### Pré-requisitos
```
(Mínimo) Java 11.0 OU Java 1.8
```

### Executando
Leia o README.md de onde deseja relaizar o teste. O *analisador léxico*, imprime todos os tokens até um erro ser encontrado. O *analisador sintático*, também avalia os erros léxicos, porém, caso o programa execute corretamente, não será impresso nada no arquivo de saída.

### Regras
Obrigatóriamente:
1. O conjunto *bom* devem vir primeiro, se ele for incluído.
2. O conjunto *bom* e/ou *mau* podem ser omitidos, com isso, um arquivo vazio é aceito pelo programa
3. Mais de um *herói* pode ser adicionado por vez no conjunto *bom*.
4. Assim como, mais de um *vilão* pode ser adicionado por vez no conjunto *mau*.
5. Comentários são adicionados entre # # (cerquilhas ou a famosa hashtag).
6. Acentos são somente aceitos nos *nomes*, que devem vir entre " " (áspas).

Em ambas as pastas, há casos de testes. Não esqueça de conferir!

### Demonstração
Um código de exemplo da linguagem:
```bs
bom:
	heroi:
		nome: "Vanderlei"
		classe: Guerreiro
		nivel: 150
	fim_heroi.
fim_bom.

mau:
	vilao:
		nome: "Lucredio"
		elemento: Fogo
		vida: 15000.0
	fim_vilao.
   	vilao:
        	nome: "Wanderley"
        	elemento: Fogo, Treva #Elemento que faz sentido#
        	vida: 12000.0
    	fim_vilao.
fim_mau.
```
