#!/bin/bash

PURPLE=echo
VERSAO=11
	
echo  "Verificando aqui se você possui o Java instalado..."

sleep 2
echo""
echo""
java -version

sleep 2
if [ $? -eq 0 ]
	then
		echo""
		sleep 2
		echo "Olá você já tem o java instalado!!, configure para versão 11 do Java"
			
			sudo update-alternatives --config java

	else
		echo "Opa! Não identifiquei nenhuma versão do Java instalado, irei resolver isso agora!"
		sleep 1
	fi
		echo "Confirme para mim se realmente deseja instalar o Java (S/N)?"
	read inst
	if [ \"$inst\" == \"s\" ]
		then
			echo "Você escolheu instalar o Java!"
			echo "Adicionando o repositório!"
			sleep 2
			sudo add-apt-repository ppa:webupd8team/java 
			
			echo "Atualizando! Quase lá."
			sleep 2
			sudo apt update 
			clear
			
			if [ $VERSAO -eq 11 ]
				then
					echo "Preparando para instalar a versão 11 do Java. Confirme a instalação quando solicitado ;D"
					apt install openjdk-11-jdk
					sleep 2
					java -version 
					clear
				else  
					echo "Java instalado com sucesso!, por favor selecione a versao 11 do java"
					sudo update-alternatives --config java
				fi
		else 	
			echo "Você optou por não instalar o Java por enquanto, até a próxima então!"
			exit 1
	fi



echo "Fazendo requisição do nosso github, isso pode demorar um pouco"
	echo""
		echo""
			echo""

				git clone https://github.com/Luis-Silva80/Arquivos.git

				cd Arquivos

				chmod +x api-captura-get-1.0-SNAPSHOT-jar-with-dependencies.jar

				java -jar api-captura-get-1.0-SNAPSHOT-jar-with-dependencies.jar



# ===================================================================
# Todos direitos reservados para o autor: Dra. Profa. Marise Miranda.
# Sob licença Creative Commons @2020
# Podera modificar e reproduzir para uso pessoal.
# Proibida a comercialização e a exclusão da autoria.
# ===================================================================
