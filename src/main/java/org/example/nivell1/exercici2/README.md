### Quin d’aquests atributs pot ser inicialitzat des del constructor?
- final int power.
### Quin no es pot modificar mai?
- static final String brand;
- final int power.
### Quin afecta totes les instàncies de la classe?
- static String model (per ser `static`).
- static final String brand (per ser `static`).

### Reflexió sobre els atributs
- `brand` és `static final`, per tant pertany a la classe i no es pot modificar després de ser inicialitzat.
- `model` és `static`, per tant és compartit per totes les instàncies de `Car`. Si canviem el seu valor, el canvi afecta tots els cotxes.
- `power` és `final` però no és `static`, per tant cada instància té el seu propi valor. Es pot inicialitzar des del constructor però no modificar posteriorment.

### Comprovació
He creat dues instàncies de `Car` amb diferents valors de `power`.
`car1` té una potència de 150 i `car2` té una potència de 250, demostrant que `power` és diferent per a cada instància.

En canvi, `model` és `static`. Quan canvio: `Car.model = "Ferrari";` el nou valor és visible des de totes les instàncies. 
Això demostra que `model` és compartit per tots els objectes de la classe.

També he comprovat que el mètode estàtic `brake()` es pot cridar directament amb: `Car.brake();` sense necessitat de crear cap objecte.
El mètode `accelerate()`, en canvi, és no estàtic i s'ha de cridar des d'una instància: `car1.accelerate();`
