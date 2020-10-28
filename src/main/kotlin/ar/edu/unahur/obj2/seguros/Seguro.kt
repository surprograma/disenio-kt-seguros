package ar.edu.unahur.obj2.seguros

interface Seguro {
  fun costoPara(vehiculo: Vehiculo): Double
}

class ContraTerceros : Seguro {
  override fun costoPara(vehiculo: Vehiculo): Double {
    TODO("Not yet implemented")
  }
}

class RoboHurto: Seguro {
  override fun costoPara(vehiculo: Vehiculo): Double {
    TODO("Not yet implemented")
  }
}

class TodoRiesgo: Seguro {
  override fun costoPara(vehiculo: Vehiculo): Double {
    TODO("Not yet implemented")
  }
}
