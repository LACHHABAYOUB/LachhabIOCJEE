FR

# LachhabIOCJEE


	Application web JEE une application web JEE qui permet de : 
		- Afficher une liste de données de type double provenant de différentes sources de données. 
		- Effectuer un calcul sur  cette liste de données et retourner un résultat de type double qui pourrait être la moyenne, la somme, le maximum, le minimum et….  



	Création de La couche DAO qui :  
	
	Contient une opération getData() qui permet de retourner un tableau de 10 nombres de type double. Dans une première implémentation de cette couche, on suppose que ces données sont générées d’une manière aléatoire. Chaque élément du tableau est un nombre aléatoire compris entre 0 et 1000. Nous prévoyons, dans le futur, de créer d’autres implémentations dont les données seront récupérées à partir de d’autres sources de données (Fichier Texte, Base de données, Web service, etc…) 
	
	Création de La couche métier qui contient deux opérations : 
		- Une opération sui retourne le même tableau de données retourné par la couche dao. 
		- Une opération qui permet d’effectuer un calcul sur le tableau de données qui est retourné par la couche dao. Dans un premier temps, ce calcul consiste à effectuer une moyenne des nombres de la liste, mais nous prévoyons d’ajouter d’autres implémentations de ce calcul (Somme, maximum, le minimum etc…) 
	
	Création de La couche présentation qui permet d’effectuer l’injection des dépendances en 4 versions : 
		- Une version sous forme d’une application de type console qui permet de tester la couche métier en faisant l’instanciation statique. 
		- Une version sous forme d’une application de type console qui permet de tester la couche métier en faisant l’instanciation dynamique. Les noms des différentes classes à instancier seront stockés dans un fichier texte que vous créez dans votre projet.
		- Une version sous forme d’une application de type console qui permet de tester la couche métier en faisant en utilisant Spring Framework avec ses deux versions XML et Annotations. 
	
	Création d'une application web qui permet de : 

		- Au démarrage du serveur, on fait appel à Spring IOC pour faire l’injection de dépendances.  
		- Une servlet qui représente le contrôleur de l’application. Ce contrôleur devrait permettre de faire appel à la couche métier et de préparer les données à afficher dans le contexte de la requête http (L’objet request) 
	
	Création d'une vue JSP qui permet de:
		- Afficher la liste des données dans un tableau HTML • Afficher la moyenne de ces données.  
