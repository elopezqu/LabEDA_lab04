<div align="center">
<table>
    <theader>
        <tr>
            <td><img src="https://github.com/rescobedoq/pw2/blob/main/epis.png?raw=true" alt="EPIS" style="width:50%; height:auto"/></td>
            <th>
                <span style="font-weight:bold;">UNIVERSIDAD NACIONAL DE SAN AGUSTIN</span><br />
                <span style="font-weight:bold;">FACULTAD DE INGENIERÍA DE PRODUCCIÓN Y SERVICIOS</span><br />
                <span style="font-weight:bold;">ESCUELA PROFESIONAL DE INGENIERÍA DE SISTEMAS</span>
            </th>
            <td><img src="https://github.com/rescobedoq/pw2/blob/main/abet.png?raw=true" alt="ABET" style="width:50%; height:auto"/></td>
        </tr>
    </theader>
    <tbody>
        <tr><td colspan="3"><span style="font-weight:bold;">Formato</span>: Guía de Práctica de Laboratorio</td></tr>
        <tr><td><span style="font-weight:bold;">Aprobación</span>:  2022/03/01</td><td><span style="font-weight:bold;">Código</span>: GUIA-PRLD-001</td><td><span style="font-weight:bold;">Página</span>: 1</td></tr>
    </tbody>
</table>
</div>
<div align="center">
 <h3>INFORME DE LABORATORIO</h3>
</div>
<table>
 <theader>
  <tr><th colspan="6" bgcolor="red">INFORMACIÓN BÁSICA</th></tr>
 </theader>
 <tbody>
  <tr><td>ASIGNATUA:</td><td colspan="5">Estructura de Datos y Algoritmos</td></tr>
  <tr><td>TÍTULO DE LA PRACTICA:</td><td colspan="4">Sort y Listas Enlazadas<td></tr>
  <tr><td>NÚMERO DE PRÁCTICA:</td><td>Practica de Laboratorio 04</td><td>AÑO LECTIVO:</td><td>2022 A</td><td>NRO. SEMESTRE:</td><td>III</td></tr>
  <tr><td>FECHA DE PRESENTACIÓN:</td><td>12-Jun-2022</td><td>HORA DE PRESENTACIÓN:</td><td colspan="3">11:30 p.m.</td></tr>
  <tr><td>INTEGRANTES:</td><td colspan="3">-Diego Ivan Pacori Anccasi<br>-Edson Joel López Quispe<br>-Oliver Alessandro Mayta Nolasco<br>-Edwin Francisco Aguilar Tancayo<br>-Jordy Emanuel Ayma Cutipa</td><td>NOTA:</td><td>...</td></tr>
  <tr><td>DOCENTE:</td><td colspan="5">Richart Smith Escobedo Quispe - rescobedoq@unsa.edu.pe</td></tr>
 </tbody>
</table>
<table>
 <theader>
  <tr><th>SOLUCIÓN Y RESULTADOS</th></tr>
 </theader>
 <tbody>
  <tr><td><strong>I. SOLUCIÓN DE EJERCICIOS/PROBLEMAS:</strong><br>
  <ul>
    <ol>
        <li>Ordenar Lista Simple</li>
<em>-> Antes de probar las clases se debe intalar la libreria externa "JavaPlot".</em><br>
	    <em>-> La ruta de creacion del archivo insercion.txt varía de acuerdo al sistema operativo.</em>
	    <p>La clase <em>"Lista"</em> presenta los métodos:<br> insert(inserta un nodo al final)<br> isEmpy(verifica si la lista esta vacía)<br> size(retorna el tamaño)<br> get(retorna el nodo según un indice)<br> remove(elimina un nodo según un indice)</p>
	    <p>La clase <em>"Test"</em>(que tiene el main), tiene los siguiente métodos: </p>
	    <p>"generarPeorCaso()": retorna una lista enlazada con el peor caso de ordenamiento, con "t"elementos.</p>
            <p>"InsertionSort()": retorna el tiempo de ejecución para el ordenamiento de una lista enlazada.</p>
	    <em>Al ejecutar</em><br>
	    <img src="Imagenes/500.jpeg"><br>
	    <img src="Imagenes/1000.jpeg"><br>
	    <em>En la consola: </em><br>
	    <img src="Imagenes/consola.jpeg"><br>
        <li>Ordenar Lista Doble</li>
            <p>Se crea la clase Node, añadiendo lo explicado en clase(los contructores) y se completa con los seters y geters, respectivamente</p>
            <p>Para la clase <em>Lista</em> se consideron los metodos, isEmty, getTamaño, agregarAdelante y Atras, getIncio y Atras, y por último un toString</p>
            <p>La clase Test está basada en lo implementado en clase, el algoritmo de  inserción con el métodos de peor caso</p>
            <p>Ejemplo de Ejecución:</p>
            <img src="Imagenes/ejemplo.jpg">
    </ol>
  </ul>

  </td></tr>
  <tr><td><strong>II. CUESTIONARIO:</strong><br>¿Cómo se ejecutaría sus implementaciones desde terminal(consola)?
   <br>Se agrega desde la terminal con el siguiente comando: <em>java -classpath nombreLibreria</em>.<br>
  </td></tr>


  <tr><td><strong>III. CONCLUSIONES:</strong><br>- Podemos concluir que  existen muchas formas de guardar datos, variando simplemente la forma de hacerlo, por ejemplo: Array y Listas Enlazadas.<br>
  - Se puede realizar ordenamientos con datos gereticos(TDA), favoreciendo así, la genericidad.<br>
  - Es beneficioso encontrar el peor caso de cualquier algoritmo, ya que nos proporciona una perspectiva clara, acerca de que tan eficiente es el mismo.
  <br>- Java Plot nos ayuda, a ver ,graficamente ,como se va variando el tiempo de ejecución de cierto algoritmo, lo cual nos proporciona grandes facilidades y por otro lado nos muestra la tendencia de crecimiento.
  </td>
  </tr>
 </tbody>
</table>

<table>
 <theader>
  <tr><td><strong>III. RETROALIMENTACIÓN GENERAL</strong><br>
  </td><tr>
 </theader>
 <tbody>
  <tr><td>El algoritmo de ordenamiento por inserción es fácil de aplicar y permite como su mismo nombre lo dice ordenar una lista,<br>asigna un valor como clave y lo compara con el resto insertándolo en el lugar adecuado esto en cada iteración.<br>Se hicieron uso de listas simples y dobles enlazadas con datos genéricos<br>y se utilizaron los peores casos para tener una visión más amplia de la eficiencia de nuestro algoritmo.<br>Además de hacer uso de la libreria Plot para hacer una gráfica de los tiempos de ejecución.
  </td></tr>
 </tbody>
</table>


<table>
 <theader>
  <tr><td>REFERENCIAS Y BIBLIOGRAFÍA</td><tr>
 </theader>
 <tbody>
  <tr><td>-https://www.w3schools.com/java/</td></tr>
  <tr><td>-https://javaplot.panayotis.com/</td></tr>
  <tr><td>-https://www.fceia.unr.edu.ar/estruc/2005/listendo.htm</td></tr>
  <tr><td>-https://ccia.ugr.es/~jfv/ed1/tedi/cdrom/docs/ldoble.html</td></tr>
 </tbody>
</table>
