Algoritmo PoductividadMesConCasos
	Definir mes como cadena;
	Definir prod_mes, fac1, fact2, fact3,fact4, productividad como entero;
	
	Escribir "¿De que mes desea calcular la producción?";
	Escribir "ADVERTENCIA 1: Ingrese el mes únicamente en minusculas";
	Escribir "ADVERTENCIA 2: Los meses agosto y julio no están contemplados en la lista";
	leer mes;
	Limpiar Pantalla;
	
	
	fact1= 15 //factor de enero, febrero y marzo
	fact2=17 //factor de abril, mayo y junio
	fact3=20 //factor de septiembre, octubre y noviembre
	fact4=21 //factor para diciembre
	segun mes hacer
		"enero","febrero","marzo":
			Escribir "¿Cuál fue la producción del mes?"
			leer prod_mes
			productividad<-prod_mes*fact1
			Escribir "la productividad fue de ", productividad;
		"abril","mayo", "junio":
			Escribir "¿Cuál fue la producción del mes?"
			leer prod_mes
			productividad<-prod_mes*fact2
			Escribir "la productividad fue de ", productividad;
		"septiembre", "octubre", "noviembre":
			Escribir "¿Cuál fue la producción del mes?"
			leer prod_mes
			productividad<-prod_mes*fact3
			Escribir "la productividad fue de ", productividad;
			
		"diciembre":	
			Escribir "¿Cuál fue la producción del mes?"
			leer prod_mes
			productividad<-prod_mes*fact4
			Escribir "la productividad fue de ", productividad;
		De Otro Modo:
			Escribir "El mes solicitado no aplica "
		
	FinSegun
	
FinAlgoritmo
