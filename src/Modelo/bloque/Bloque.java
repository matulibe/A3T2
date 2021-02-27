package Modelo.bloque;

import Modelo.personaje.Personaje;

public  interface Bloque {
      void ejecutarInstruccionSobrePersonaje(Personaje personaje);
      //Faltan las pruebas
      void ejecutarInstruccionOpuestaSobrePersonaje(Personaje personaje);
}
