Cadastro de Anúncio 

Objetivo: Cadastrar anúncios e obter relatórios 

Banco de dados criado no mySQL e código desenvolvido em java no IDE Netbeans

Rotina
Criar um banco de dados no MySQL conforme script abaixo

-------------------------------------------------------------------------------------------------------------------------------------------

-- linha de criação do banco de dados
create database dbdivulgatudo;
-- a linha abaixo escolhe o banco de dados a ser usado
use dbdivulgatudo;
-- o bloco de instruções abaixo cria uma tabela
create table tbanuncio(
iduser int primary key,
nomedoanuncio varchar(50) not null,
cliente varchar(50) not null,
datadeinicio date not null,
datadetermino date not null,
investimentopordia double not null
);

-- o comando abaixo descreve a tabela
describe tbanuncio;

-- A linha abaixo insere dados na tabela (CRUD)
-- create -> insert	 
insert into tbanuncio(iduser,nomedoanuncio,cliente,datadeinicio,datadetermino,investimentopordia)
values(1,'Outono-Inverno','NaturezArLivre','2021-05-14','2021-06-14','35');

-- A linha abaixo exibe os dados da tabela (CRUD)
-- read -> select
select	* from tbanuncio;

-- linha insere mais 2 clientes
insert into tbanuncio(iduser,nomedoanuncio,cliente,datadeinicio,datadetermino,investimentopordia)
values(2,'SuperMãe','Langerie','2021-05-14','2021-06-14','35');
insert into tbanuncio(iduser,nomedoanuncio,cliente,datadeinicio,datadetermino,investimentopordia)
values(3,'VendoPão','Art Brod','2021-05-14','2021-06-14','35');

-- A linha abaixo modifica dados na tabela (CRUD)
-- update -> update
update	tbanuncio set investimentopordia='45' where iduser=3;

-- A linha abaixo apaga o registro da tabela
-- delete -> delete
delete from tbanuncio where iduser=2;

insert into tbanuncio(iduser,nomedoanuncio,cliente,datadeinicio,datadetermino,investimentopordia)
values(4,'QueroAcertar','Interface','2021-05-14','2021-06-16','10');

-------------------------------------------------------------------------------------------------------------------------------------------
- Utilizado o IDE Netbeans
- Projeto spCapgemini
	- Pacotes:
		br.com.divulgatudo.dal -> camada de acesso de dados
		br.com.divulgatudo.icones -> icones usados na tela
		br.com.divulgatudo.telas -> MolduloConexão.java e TelaLoin.java
- Criado um módulo de conexão direta com o java - ModuloConexao.java
- Criado TelaLogin para inserção dos dados - TelaLogin.java
- Executar o TelaLogin para o formulário de cadastro (criado um CRUD)
- Inserção dos dados e exibição dos relatórios ainda em desenvolvimento
