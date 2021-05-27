#!/bin/bash
echo "Inicando docker "
sleep 1
	sudo systemctl start docker 
echo " Verificando os container ja instalados"
sleep 1
	docker ps -a 
echo "Inicando docker Getmobi"
	sudo docker start 2341ec68cfee  
sleep 2
	echo""
	echo "Processo finalizado :)"

