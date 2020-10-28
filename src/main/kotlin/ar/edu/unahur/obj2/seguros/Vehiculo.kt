package ar.edu.unahur.obj2.seguros

abstract class Vehiculo(val valor: Int, val antiguedad: Int) {
  abstract fun puedeContratar(seguro: Seguro): Boolean

  fun contratar(seguro: Seguro) {
    TODO("Not yet implemented")
  }
}

class Auto(valor: Int, antiguedad: Int) : Vehiculo(valor, antiguedad) {
  override fun puedeContratar(seguro: Seguro): Boolean {
    TODO("Not yet implemented")
  }
}

class Camion(valor: Int, antiguedad: Int) : Vehiculo(valor, antiguedad) {
  override fun puedeContratar(seguro: Seguro): Boolean {
    TODO("Not yet implemented")
  }
}

class Taxi(valor: Int, antiguedad: Int) : Vehiculo(valor, antiguedad) {
  override fun puedeContratar(seguro: Seguro): Boolean {
    TODO("Not yet implemented")
  }
}
