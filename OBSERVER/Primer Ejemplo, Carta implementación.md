Congratulations!
Your team has just won the contract to build
Weather-O-Rama, Inc.’s next generation,
Internet-based Weather Monitoring Station.
Weather-O-Rama, Inc.
100 Main Street
Tornado Alley, OK 45021
Statement of Work
Congratulations on being selected to build our next generation
Internet-based Weather Monitoring Station!
The weather station will be based on our patent pending
WeatherData object, which tracks current weather conditions
(temperature, humidity, and barometric pressure). Weʼd like
for you to create an application that initially provides three
display elements: current conditions, weather statistics and a
simple forecast, all updated in real time as the WeatherData
object acquires the most recent measurements.
Further, this is an expandable weather station. Weather-O-
Rama wants to release an API so that other developers can
write their own weather displays and plug them right in. Weʼd
like for you to supply that API!
Weather-O-Rama thinks we have a great business model: once
the customers are hooked, we intend to charge them for each
display they use. Now for the best part: we are going to pay
you in stock options.
We look forward to seeing your design and alpha application.
Sincerely,
Johnny Hurricane, CEO
P.S. We are overnighting the WeatherData source ﬁ les to you.

Este texto plantea el **escenario** de un proyecto de software para la empresa ficticia “Weather-O-Rama, Inc.”. Han contratado a tu equipo para desarrollar la próxima generación de una **estación de monitoreo del clima** basada en Internet. A grandes rasgos, el “Statement of Work” (la carta del CEO) dice:

1. **Objeto principal: “WeatherData”**
    
    - Es un componente que provee datos meteorológicos: temperatura, humedad y presión barométrica.
    - Esperan que tu aplicación use este objeto para mostrar _información en tiempo real_, con varias “pantallas” o _displays_ (por ejemplo, condiciones actuales, estadísticas, etc.).
2. **Expansión y API**
    
    - El sistema debe ser **ampliable** para que otros desarrolladores creen y agreguen sus propios componentes de visualización.
    - En otras palabras, quieren exponer un **API** que permita “enchufar” nuevas pantallas de datos meteorológicos.
3. **Modelo de negocio**
    
    - Weather-O-Rama planea cobrar a los clientes por cada uso de la aplicación (o por las consultas realizadas).
    - Destacan que para el desarrollo ofrecen “stock options” (opciones sobre acciones) en lugar de un pago tradicional.
4. **Detalles prácticos**
    
    - El CEO, Johnny Hurricane, te enviará (“overnighting” = envío rápido) el **código fuente** de `WeatherData`.
    - Esperan ver pronto el _diseño_ y un prototipo funcional (“alpha application”).

En otras palabras, esta carta **enmarca** el **ejemplo** que se usará para demostrar el **Patrón Observer** (y otros principios de diseño OO). El “WeatherData object” es el **Sujeto** (Observable) y cada “display” de condiciones (condiciones actuales, estadísticas, pronóstico, etc.) sería un **Observador** que se actualiza automáticamente cuando cambian los datos.

Nuestro trabajo es implementar measurementsChanged() para que actualice las tres pantallas de condiciones actuales, estadísticas meteorológicas y pronóstico.

