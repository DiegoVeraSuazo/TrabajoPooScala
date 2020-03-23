package main

//Constructo Primario
class Software(protected var licencia: String, protected var version: String) extends Producto(1, "Scala") {

  var desarrollator = new Desarrollador("Ivan");

  //Constructor Secundario sin parametros
  def this() {
    this("","");
    println("\nNo se entrego ningun dato")
  }

  def constructorConSinParametros() = {

  }

  def settersAndGetters(x: String, y: String): String   = {
    licencia= x;
    version= y;

    return licencia+" "+version;
  }



}
