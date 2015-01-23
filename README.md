XY-INC, projeto escrito em Java Web.

Tecnologias sugeridas para rodar o projeto:

- Java EE IDE (Eclipse)
- XAMPP (mySQL)
- Tomcat 7.0

Importando o projeto para o eclipse:

- Abra o eclipse
- Clique em Import 
- Git -> Projects from Git e da next
- Existing Local Repository e next
- Add o projeto XY Inc, da next e da finish

OU

- No import vá em General e Existing Projects in Workspace e baixa o projeto. 
- O importante é aparecer aquele navegador em cima do projeto à esquerda, que identifica que o projeto é do tipo WEB.

Pronto, instalou o projeto! Agora é hora de configurar o projeto.

- Botão direito no projeto XY Inc
- Propriedades
- Java Build Path
- Add Jar
- vai no projeto projeto  XY Inc e expanda-o até o conteúdo \WebContent\WEB-INF\lib e selecionar todos os JARS e da OK

- Ative o XAMPP e lige dentro dele o Apache e o mySQL (Start)

Agora é hora de criar as tabelas!

- No seu XAMPP e na seção de mySQL clique em "Admin"
- Se tudo der certo vai aparecer o seu painel de administrador que tem como senha e usuário padrão (usuário: "root", senha: "").
- Crie uma base de dados chamada xyinc.
- Crie uma tabela chamada poi que contém 4 colunas, sendo elas:

"id bigint primary key not null
nomePOI varchar(255) not null
coordenadaX int not null
coordenadaY int not null"

- Veja as configurações do BD(usuario, senha, nome do BD e porta) que estão em src/br/com/xy/config/ConnectionFactory.java isso está contido dentro do projeto.

Agora é adicionar o TOMCAT no eclipse, depois dê add

- clica no botão direito dele em "servers" 
- clica em "Adicionar e Remover" 
- adiciona como configurado o projeto que irá ser rodado (XY Inc), dê OK.
- Rode o TOMCAT.

Agora no projeto XY Inc. Web Contenct/views e clique com botão direito em "bem-vindo.jsp", vá em Run As e Run on Server, dê finish. 

Nessa área você irá poder testar cada funcionalidade do sistema. Obrigado pelo seu tempo e agradeço contribuições.


