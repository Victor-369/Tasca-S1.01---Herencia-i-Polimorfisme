### Què és un bloc d’inicialització (sense static)?
És un bloc de codi dins d’una classe que s’utilitza per inicialitzar els objectes quan es creen. No té cap nom ni necessita una paraula clau específica, simplement s’escriu entre { }.
### Quan s’executa?
S’executa cada vegada que es crea una nova instància de la classe, abans del constructor.
### Quina diferència hi ha entre aquest i un bloc `static`?

| Bloc d’inicialització `{ }` | Bloc `static { }` |
|---|---|
| Pertany a les instàncies de la classe. | Pertany a la classe. |
| S’executa cada vegada que es crea un objecte. | S’executa una sola vegada quan s’inicialitza la classe. |
| Pot accedir directament als atributs d’instància. | No pot accedir directament als atributs d’instància. |
| S’executa abans del constructor. | S’executa durant la inicialització de la classe. |

### Resum
- `{ }` → inicialitza **cada objecte**.
- `static { }` → inicialitza **la classe una vegada**.
