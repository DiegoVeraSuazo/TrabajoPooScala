package main

class Software(protected var licencia: String, protected var version: String) extends Producto(1, "Scala") {

  var desarrollator = new Desarrollador("Ivan");


  def constructorConSinParametros() = {
    def this() {
      this("","");
      println("\nMo se entrego ningun dato")
    }
  }

  def settersAndGetters(x: String, y: String): String   = {
    licencia= x;
    version= y;

    return licencia+" "+version;
  }



}
