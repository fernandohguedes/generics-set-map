
###Problema Exemplo:

- Um site de internet registra um log de acessos dos usuários. Um registro de log consiste no nome de usuário(apenas uma palavra)
e o instante em que o usuário acessou o site no padrão ISO 8601, separados por espaço, conforme exemplo. Fazer um programa 
que leia o log de acessos a partir de um arquivo, e dai informa quantos usuários distintos acessaram o site.

###Resolução:

## Criar um objeto:
   - LogUser
        - String `nameUser`;
        - LocalDateTime `timeStamp`;
        
###Regra 1:
 - O Programa deve ler o arquivo `logs.txt` que deve conter os logs, o arquivo dever seguir o seguinte padrão:
   - nome1 2022-08-20T20:45:08Z
   - nome2 2022-08-21T20:45:08Z
   - nome3 2022-08-22T20:45:08Z
   - nome3 2022-08-23T20:45:08Z
 
###Regra 2 
 - Após concluir a leitura do arquivo o programa deve informar quando os usuários diferentes acessaram o sistema;
 - O mesmo usuário pode acessar o sistema vários vezes, mas o mesmo deve ser contabilizado apenas uma vez;