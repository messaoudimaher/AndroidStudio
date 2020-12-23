AndroidStudio exercices :) 
*****************************
Travail à faire pour les TP 1.1/2.1/2.2/2.3 (3ème SSE):

***************************************TP 1.1:
Q1
MainActivity.java
Q2
app_name
Q3
AVD Manager
Q4
info (log.i)

*************************************** TP 2.1
Q1
Le deuxième fichier de mise en page XML d'activité est créé et une classe Java ajoutée. Vous devez toujours définir la signature de la classe.
Q2
La deuxième activité n'apparaît plus lorsque vous essayez de la démarrer avec une intention (Intent) explicite.
Q3
new Intent(Context context, Class<?> class)
Q4
Comme extra d'intention (Intent)
Q5
Obtenez l'intention (Intent) avec laquelle l'activité a été lancée.

*************************************** TP 2.2
Q1
Le compteur est réinitialisé à 0, mais le contenu de l'EditText est préservé.
Q2
Android arrête votre activité en appelant onPause(), onStop() et onDestroy(), puis redémarre l'opération en appelant onCreate(), onStart() et onResume().
Q3
onSaveInstanceState() est appelée avant la méthode onStop().
Q4
onSaveInstanceState() est appelée avant la méthode onResume().
Q5
onPause() ou onStop()
*************************************** TP 2.3
Q1
new Intent(String action)
Q2
Ne spécifiez pas l'activité ou autre composant spécifique à lancer.
Q3
Intent takePicture = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
