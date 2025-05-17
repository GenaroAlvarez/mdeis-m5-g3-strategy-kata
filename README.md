# Strategy Kata

## Cuestionario

1. ¿Cuáles de las siguientes son desventajas de usar la herencia para proporcionar el comportamiento de Duck? (Seleccione todas las que correspondan).
   - B. Los cambios de comportamiento en tiempo de ejecución son difíciles. 
   - F. Los cambios pueden afectar involuntariamente a otros patos.
2. ¿Qué opinas de este diseño?
    - Mejora el diseño anterior, ya que los patos solo implementarán el comportamiento que necesitan.
3. Hay muchos factores que pueden impulsar el cambio. Enumera algunas razones por las que has tenido que cambiar el código de tus aplicaciones (incluimos un par de las nuestras para ayudarte a empezar).
    - Solicitaron cambios para adecuarse a la nueva normativa de facturación electrónica (entidades reguladoras).
    - Los clientes hacen cambios en algún flujo de negocios, lo que impacta directamente en el desarrollo.
    - Defectos, bugs, o comportamientos inesperados
    - Mantenimiento preventivo, ya sea por regulaciones o para considerar futuras adecuaciones al programa
4. Con nuestro nuevo diseño, ¿qué harías si necesitaras añadir "vuelo con propulsión a cohete" a la aplicación SimUDuck?
   - Tendríamos que crear una nueva clase `FlyWithRocketPower` que implemente `FlyBehaviour`, que se encargue de implementar el comportamiento de vuelo con propulsión a cohete.
5. ¿Se te ocurre alguna clase que quiera usar el comportamiento Quack que no sea el de un pato?
   - La clase `Ganzo` podría implementar el comportamiento Quack.
6. Un `Duck Call` es un dispositivo que los cazadores usan para imitar los graznidos de los patos. ¿Cómo implementarías tu `DuckCall` que no heredara de la clase `Duck`?
   - La implementación sería la siguiente:
   ```kotlin
   class DuckCall {
       var quackBehavior: QuackBehavior = Quack()
   
       fun performQuack() {
           quackBehavior.quack()
       }
   }
   ```