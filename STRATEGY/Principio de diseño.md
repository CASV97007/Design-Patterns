Identificar los aspectos de la aplicación, que varía contantemente o que suele cambiarse muy a menudo.

hay que tomar lo que varía y encapsularlo para que no afecte al resto del codigo.

Como resultado tenemos menos consecuencia no deseadas de los cambios del código y más flexibilidad en los sistemas

Otra forma de pensar en este principio es: Toma las partes que varían, encapsúlalas, para que mas tarde puedas modificar o extender las partes que varían sin afectar la las que no lo hacen.

  

Es simple el concepto y es la base de todos los patrones de diseño.

  

El principio de "programar hacia una interfaz" se refiere a escribir tu código en función de una abstracción (ya sea una interfaz o una clase abstracta) en lugar de depender directamente de implementaciones concretas. Esto te permite aprovechar el **polimorfismo**, de modo que el código no esté acoplado a una única implementación y puedas cambiar o extender comportamientos sin modificar la lógica de negocio.

  

### ¿Por qué se usa el término "interfaz"?

  

El término "interfaz" se utiliza de dos maneras en este contexto:

  

1. **Interfaz como contrato:** Es el conjunto de métodos que una clase (o un conjunto de clases) debe implementar. Es el contrato que garantiza qué operaciones estarán disponibles, sin importar cómo se realicen internamente.

  

2. **Constructo en Java:** Es la palabra clave `interface` que se usa para definir ese contrato en el lenguaje. Sin embargo, la idea de programar hacia una interfaz va más allá de este constructo, ya que también se puede aplicar usando clases abstractas u otros mecanismos de abstracción.

  

El enfoque clave es **abstraer el comportamiento**, de forma que el código interactúe con el "qué se hace" y no con el "cómo se hace".

  

### Ejemplo práctico

  

Considera el siguiente ejemplo con una clase abstracta y sus implementaciones:

  

```java
// Definición del contrato o supertipo.
abstract class Animal {

    // Método abstracto que las subclases deben implementar.
    abstract void makeSound();
}

// Implementación concreta: Dog.
class Dog extends Animal {

    @Override
    void makeSound() {
        System.out.println("Bark!");
    }
}

// Implementación concreta: Cat.

class Cat extends Animal {

    @Override
    void makeSound() {
        System.out.println("Meow!");
    }
}

```

  

**Programación a una implementación concreta (menos flexible):**

  

```java

Dog dog = new Dog();

dog.makeSound(); // Imprime: Bark!

```

  

Aquí, la variable `dog` es de tipo `Dog`, lo que fuerza al código a depender de la implementación concreta. Si en algún momento se requiere cambiar la implementación a `Cat`, tendrías que modificar el código que crea e interactúa con la instancia.

  

**Programación a la abstracción (más flexible):**

  

```java

Animal animal = new Dog();

animal.makeSound(); // Imprime: Bark!

```

  

En este caso, la variable se declara como `Animal`, el supertipo. Esto significa que puedes asignarle cualquier objeto que sea una subclase de `Animal`, ya sea un `Dog`, un `Cat` u otra futura implementación. Por ejemplo:

  

```java

Animal animal = getAnimalFromSomewhere(); // Podría devolver un Dog, Cat, etc.

animal.makeSound();

```

  

Con este enfoque, el método `getAnimalFromSomewhere()` podría decidir en tiempo de ejecución qué implementación concreta utilizar, lo que resulta en un código más **desacoplado** y **extensible**.

  

### Beneficios de programar hacia una interfaz/supertipo

  

- **Desacoplamiento:** La lógica de negocio no depende de implementaciones específicas, lo que facilita el mantenimiento y la evolución del sistema.

- **Flexibilidad:** Puedes intercambiar implementaciones sin tener que modificar el código que utiliza la abstracción.

- **Facilidad para pruebas:** Al depender de una abstracción, es más sencillo utilizar mocks o stubs para pruebas unitarias.

- **Cumplimiento del principio de inversión de dependencias (DIP):** Los módulos de alto nivel no deberían depender de módulos de bajo nivel, sino de abstracciones.

  

### Conclusión

  

"Programar hacia una interfaz" es una práctica clave en el desarrollo de software orientado a objetos que fomenta el uso de abstracciones para definir contratos de comportamiento. Al hacerlo, se consigue un sistema más flexible, fácil de mantener y preparado para evolucionar sin acoplar la lógica de negocio a implementaciones concretas. Este principio es esencial para construir arquitecturas escalables y robustas.