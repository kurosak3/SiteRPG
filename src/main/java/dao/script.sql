drop database siteRpgTormenta;

create database siteRpgTormenta;

use siteRpgTormenta;

CREATE TABLE CADASTRO ( 
ID						INTEGER    PRIMARY KEY	AUTO_INCREMENT, 			
EMAIL					varchar(50)					  NOT NULL,			
SENHA					varchar 					  NOT NULL 			
);

=======================================================================================================
=======================================================================================================

CREATE TABLE USUARIO ( 
ID_USUARIO				INTEGER    PRIMARY KEY	AUTO_INCREMENT, 			
NOME					varchar(80),			
DATA_NASCIMENTO			timestamp,
ESTADO_CIVIL			VARCHAR(20),
TELEFONE				INTEGER,
DESCRICAO				VARCHAR(255),
SISTEMA_PREFERIDO		VARCHAR(255),
INTERESSES				VARCHAR(250),
ID_CADASTRO				INTEGER,
FOREIGN KEY (ID_CADASTRO) REFERENCES (ID) CADASTRO
);

INSERT INTO USUARIO VALUES(null,null,null,null,null,null,null,null,?);
UPDATE USUARIO SET NOME=?, DATA_NASCIMENTO=?, ESTADO_CIVIL=?, TELEFONE=?, DESCRICAO=?, SISTEMA_PREFERIDO=?, INTERESSES WHERE ID_USUARIO =? 

=======================================================================================================
=======================================================================================================

CREATE TABLE CLASSES ( 
ID_CLASSES				INTEGER    PRIMARY KEY	AUTO_INCREMENT, 			
NOME_CLASSE				varchar(255)				  NOT NULL,			
TIPO_DE_CLASSE			varchar(255)				  NOT NULL, 			
NIVEL_MAX				Integer, 		
PRE_REQUISITO;			varchar(255), 		
PV_INICIAL				varchar(255),
PV_NIVEL				varchar(255),
PERICIA_TREINADA		varchar(255),
PERICIA_CLASSE			varchar(255),
TALENTOS_ADICIONAIS		varchar(255)						
);

======================================================================================================
======================================================================================================

CREATE TABLE PROGRESSAO_CLASSES ( 
IDCLASSE				INTEGER    PRIMARY KEY	AUTO_INCREMENT, 			
NOME_CLASSE				VARCHAR(255),			
BBA_CLASSE				INTEGER, 			
NIVEL_CLASSE			INTEGER, 		
HABILIDADES_CLASSE		VARCHAR(255), 		
ID_CLASSES				INTEGER,
FOREIGN KEY (ID_CLASSES) REFERENCES (IDCLASSES) CLASSES						
);

======================================================================================================
======================================================================================================

CREATE TABLE TALENTOS(
IDTALENTO				INTEGER    PRIMARY KEY	AUTO_INCREMENT,
NOME_TALENTO			VARCHAR(50)					  NOT NULL,
PRE_REQUISITO_TALENTO	VARCHAR(255),
BENEFICIO				VARCHAR(50)
);

INSERT INTO TALENTOS VALUES(1,"TESTE","TESTE","TESTE");
UPDATE TALENTOS SET NOME_TALENTO = "", PRE_REQUISITO_TALENTO= "", BENEFICIO="" WHERE IDTALENTO = 1;
======================================================================================================
======================================================================================================

CREATE TABLE PERICIAS(
IDPERICIA				INTEGER    PRIMARY KEY	AUTO_INCREMENT,
NOME_PERICIA			VARCHAR(50)					  NOT NULL,
PERICIA_TREINADA		CHAR(1),
GRADUACAO				INTEGER,
MOD_ATRIBUTO			INTEGER,
PENALIDADE				INTEGER,
MOD_OUTROS				INTEGER
);

======================================================================================================
======================================================================================================

CREATE TABLE PRE_REQUISITOS_PERICIAS(
ID_REQ_PERICIA 		INTEGER 	PRIMARY KEY	AUTO_INCREMENT, 		
NOME_PERICIA	    INTEGER, 		
GRADUACAO           INTEGER,		
SUB_CATEGORIA_1     VARCHAR(20),
SUB_CATEGORIA_2     VARCHAR(20),
SUB_CATEGORIA_3     VARCHAR(20),
SUB_CATEGORIA_4     VARCHAR(20)	
);

======================================================================================================
======================================================================================================

CREATE TABLE PRE_REQUISITOS_TALENTOS(
IDREQUISITO 		INTEGER 	PRIMARY KEY	AUTO_INCREMENT,
NOME_TALENTO	    VARCHAR(50)					  NOT NULL, 		
NIVELPERSONAGEM     INTEGER, 		
CLASSE              VARCHAR,			
FORCA               INTEGER, 		
DESTREZA            INTEGER, 		
CONSTITUICAO	    INTEGER, 		
INTELIGENCIA        INTEGER, 		
SABEDORIA	        INTEGER, 		
CARISMA	            INTEGER, 		
BBA			        INTEGER, 		
ID_TALENTOS	        INTEGER,
ID_REQ_PERICIA      INTEGER,
FOREIGN KEY (ID_TALENTOS) 	 REFERENCES (IDTALENTO) TALENTOS,
FOREIGN KEY (ID_REQ_PERICIA) REFERENCES (ID_REQ_PERICIA) PRE_REQUISITOS_PRESTIGIO		
);

======================================================================================================
======================================================================================================

CREATE TABLE PRE_REQUISITOS_PRESTIGIO(		
ID_REQUISITO 					INTEGER 	PRIMARY KEY	AUTO_INCREMENT, 		
NIVEL_PERSONAGEM     			INTEGER, 		
CLASSE              			VARCHAR,			
FORCA               			INTEGER, 		
DESTREZA            			INTEGER, 		
CONSTITUICAO	    			INTEGER, 		
INTELIGENCIA        			INTEGER, 		
SABEDORIA	        			INTEGER, 		
CARISMA	            			INTEGER, 		
BBA			        			INTEGER,		
SEXO                			CHAR(1), 			
RACA                			VARCHAR(20),			
NIVEL_MAGIA          			INTEGER, 		
TIPO_MAGIA           			VARCHAR(10), 			
TENDENCIA           			CHAR(2),  		
DEVOTO              			VARCHAR(10),
ESPECIAL            			VARCHAR(255),
ID_REQ_PERICIA			        INTEGER,  			
ID_TALENTOS	        			INTEGER,
FOREIGN KEY (ID_REQ_PERICIA)    REFERENCES (ID_REQ_PERICIA) PRE_REQUISITOS_PRESTIGIO,
FOREIGN KEY (ID_TALENTOS) 	    REFERENCES (IDTALENTO) TALENTOS
);	

======================================================================================================
======================================================================================================

create table raca();

======================================================================================================
======================================================================================================

CREATE TABLE MAGIAS(	
ID_MAGIA                 INTEGER		PRIMARY KEY	AUTO_INCREMENT,
NOME_MAGIA               VARCHAR(50)					  NOT NULL,
NIVEL_MAGIA              INTEGER,
TIPO_MAGIA               VARCHAR(20), 
ESCOLA_MAGIA             VARCHAR(20),
TEMPO_EXECUCAO           VARCHAR(20),
ALCANCE                  VARCHAR(10),
AREA                     VARCHAR(10),
DURACAO                  VARCHAR(15),
TESTE_RESISTENCIA		 VARCHAR(20),
DESCRICAO_MAGIA			 VARCHAR
);

======================================================================================================
======================================================================================================

CREATE TABLE ESCUDOS(	
IDESCUDO			    INTEGER 		PRIMARY KEY	AUTO_INCREMENT,
NOMEESCUDO			    VARCHAR(50)						  NOT NULL,
PRECOESCUDO				DOUBLE,
PESOESCUDO			    DOUBLE,
DESCRICAOESCUDO			VARCHAR(255),
DEFESAESCUDO			INTEGER,
MAXIMOESCUDO			INTEGER,
PENALIDADEESCUDO		INTEGER,
TIPOESCUDO			    VARCHAR(50), 
TAMANHOESCUDO			VARCHAR(10),  
MATERIAESPECIALESCUDO	VARCHAR(15) 	
);

======================================================================================================
======================================================================================================

CREATE TABLE ARMADURAS(	
ID_ARMADURA					INTEGER			PRIMARY KEY	AUTO_INCREMENT,
NOME_ARMADURA				VARCHAR(50)						  NOT NULL, 
PRECO_ARMADURA				DOUBLE,
PESO_ARMADURA				DOUBLE,
DESCRICAO_ARMADURA			VARCHAR(50), 
DEFESA_ARMADURA				INTEGER,
MAXIMO_DESTREZA				INTEGER,
PENALIDADE_ARMADURA			INTEGER,
TIPO_ARMADURA				VARCHAR(50), 
TAMANHO_ARMADURA			VARCHAR(50), 
MATERIA_ESPECIAL_ARMADURA 	VARCHAR(50), 
);

======================================================================================================
======================================================================================================

CREATE TABLE ARMAS(	
ID_ARMA              		INTEGER       PRIMARY KEY	AUTO_INCREMENT,
NOME_ARMA            		VARCHAR(50)						  NOT NULL, 
PRECO_ARMA           		DOUBLE,
PESO_ARMA            		DOUBLE,
DESCRICAO_ARMA       		VARCHAR(50), 
DANO_ARMA            		VARCHAR(50), 
DISTANCIA_ARMA       		VARCHAR(50), 
CRITICO_ARMA         		VARCHAR(50), 
TIPO_ARMA            		VARCHAR(50), 
TAMANHO_ARMA         		VARCHAR(50), 
CATEGORIA_ARMA       		VARCHAR(50), 
MATERIA_ESPECIAL_ARMA		VARCHAR(50), 		
);

======================================================================================================
======================================================================================================

======================================================================================================
======================================================================================================

create table equipamento();

======================================================================================================
======================================================================================================

CREATE TABLE PERSONAGEM (
 IDPERSONAGEM          	INTEGER    PRIMARY KEY	AUTO_INCREMENT,	 
 NOMEPERSONAGEM        	VARCHAR(255)				  NOT NULL,
 NOMEJOGADOR           	VARCHAR(255)				  NOT NULL,
 SEXO                  	CHAR						  NOT NULL,
 NIVELPERSONAGEM       	INTEGER, 	 
 IDADE                 	INTEGER, 	 
 TAMANHO               	VARCHAR(10),
 DESLOCAMENTO          	INTEGER, 	 
 COROLHOS              	VARCHAR(10),
 DIVINDADE             	VARCHAR(50),
 TENDENCIA             	VARCHAR(10),
 CORCABELO             	VARCHAR(20),
 ORIGINALFORCA         	INTEGER, 	 
 ORIGINALDESTREZA      	INTEGER, 	 
 ORIGINALCONSTITUICAO  	INTEGER, 	 
 ORIGINALINTELIGENCIA  	INTEGER, 	 
 ORIGINALSABEDORIA     	INTEGER, 	 
 ORIGINALCARISMA       	INTEGER, 	 
 FORCA                 	INTEGER, 	 
 DESTREZA              	INTEGER, 	 
 CONSTITUICAO          	INTEGER, 	 
 INTELIGENCIA          	INTEGER, 	 
 SABEDORIA             	INTEGER, 	 
 CARISMA               	INTEGER, 	 
 MODFORCA              	INTEGER, 	 
 MODDESTREZA           	INTEGER, 	 
 MODCONSTITUICAO       	INTEGER, 	 
 MODINTELIGENCIA       	INTEGER, 	 
 MODSABEDORIA          	INTEGER, 	 
 MODCARISMA            	INTEGER, 	 
 PONTOVIDA             	INTEGER, 	 
 PONTOMAGIA            	INTEGER, 	 
 PONTOVIDAATUAIS       	INTEGER, 	 
 PONTOMAGIAATUAIS      	INTEGER, 	 
 CLASSEARMADURA        	INTEGER, 	 
 DEFARMADURA           	INTEGER, 	 
 DEFESCUDO             	INTEGER, 	 
 MODTAMANHADEFESA      	INTEGER, 	 
 OUTROSDEFESA          	INTEGER, 	 
 OUTROSDEFESA2         	INTEGER, 	 
 FORTITUDE             	INTEGER, 	 
 REFLEXO               	INTEGER, 	 
 VONTADE               	INTEGER, 	 
 OUTROSFORTITUDE       	INTEGER, 	 
 OUTROSREFLEXO         	INTEGER, 	 
 OUTROSVONTADE         	INTEGER, 	 
 CORPOACORPO           	INTEGER, 	 
 DISTANCIA             	INTEGER, 	 
 MANOBRA               	INTEGER, 	 
 MODTAMANHAATAQUE      	INTEGER, 	 
 OUTROSATAQUE          	INTEGER, 	 
 DINHEIRO              	INTEGER, 	 
 HISTORIA              	VARCHAR,
 APARENCIA             	VARCHAR,
 PERSONALIDADE         	VARCHAR,
 IDIOMAS				VARCHAR(200),
 NOTAS                 	VARCHAR,
 EXPERIENCIA           	INTEGER,
 ID_ARMADURA           	INTEGER, 
 ID_BRACADEIRA         	INTEGER, 
 ID_ESCUDO             	INTEGER, 
 ID_RACA               	INTEGER, 
 ID_ARMAS              	INTEGER,  
 ID_PERICIAS		   	INTEGER,
 ID_IDIOMAS            	INTEGER,
 ID_ITENS              	INTEGER,
 ID_CLASSE             	INTEGER,
 ID_TALENTOS           	INTEGER,
 ID_MAGIAS             	INTEGER,
 FOREIGN KEY (ID_ARMADURA) 	 REFERENCES (IDARMADURA) ARMADURA,
 FOREIGN KEY (ID_BRACADEIRA) REFERENCES (IDBRACADEIRA) OUTRASARMADURAS,
 FOREIGN KEY (ID_ESCUDO) 	 REFERENCES (IDESCUDO) ESCUDO,
 FOREIGN KEY (ID_RACA) 	 	 REFERENCES (IDRACA) RACA,
 FOREIGN KEY (ID_ARMAS) 	 REFERENCES (IDARMAS) ARMAS,
 FOREIGN KEY (ID_PERICIAS) 	 REFERENCES (IDPERICIAS) PERICIA,
 FOREIGN KEY (ID_ITENS) 	 REFERENCES (IDITENS) ITENS,
 FOREIGN KEY (ID_CLASSE) 	 REFERENCES (IDCLASSE) CLASSE,
 FOREIGN KEY (ID_TALENTOS) 	 REFERENCES (IDTALENTOS) ARMADURA,
 FOREIGN KEY (ID_MAGIAS) 	 REFERENCES (IDMAGIAS) ARMADURA
 );
 
========================================================================================================
************************************MOSTRA TABELDA DE CLASSE********************************************
========================================================================================================

SELECT PC.NIVEL_CLASSE AS NIVEL, PC.BBA_CLASSE AS BBA, PC.HABILIDADES_CLASSE AS HABILIDADES_DE_CLASSE
FROM PROGRESSAO_CLASSES PC INNER JOIN  CLASSES C
ON
PC.ID_CLASSES = C.IDCLASSES
ORDER BY NIVEL ASC;

========================================================================================================
********************************************************************************************************
========================================================================================================




