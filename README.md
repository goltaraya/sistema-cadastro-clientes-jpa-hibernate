# Sistema Cadastro Clientes
Sistema CLI utilizando JPA/Hibernate que permite cadastrar clientes, seus endereços e informações de contato.

### O que é esta aplicação? 🤔
Essa é uma aplicação que roda em CLI. Ela serve para cadastrar clientes em um banco de dados MariaDB/MySQL e é um produto dos meus estudos para fortalecer conceitos de comunicação e persistência de dados usando Java + JPA/Hibernate

### O que é necessário para rodar a aplicação? 💡
Para rodar a aplicação, são necessários os seguintes requisitos:
1. Java JDK +17
2. MariaDB +10
3. IDE Java de sua preferência

### Como rodar a aplicação? 🚶
Bem, por ser uma aplicação simples que roda em uma CLI, basta possuir o Java JDK, SGBD MariaDB (ou o MySQL) e a IDE.

1. Primeiro é necessário criar o banco de dados da aplicação. Para isso, abra o seu SGBD e digite:
```
CREATE DATABASE siscc;
```

2. Agora, você precisará editar as seguintes linhas do arquivo persistence.xml. Eu te ajudarei:
```
cd sistema-cadastro-clientes-jpa-hibernate/src/main/resources/META-INF/
nano persistence.xml
```

3. Nas linhas:
```
<property name="javax.persistence.jdbc.user" value="{insira-o-usuario-admin-do-seu-sgbd}" />
<property name="javax.persistence.jdbc.password" value="{insira-a-senha-do-usuario-admin-do-seu-sgbd}" />
```

4. Após isso, tudo estará apto para funcionar normalmente!
