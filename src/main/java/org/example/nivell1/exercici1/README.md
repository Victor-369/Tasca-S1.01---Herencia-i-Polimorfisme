### What is an initialization block (without static)?
It's a block of code within a class that is used to initialize objects when they are created. It has no name and doesn't need a specific keyword; it's simply written between { }.
### When does it execute?
It executes every time a new instance of the class is created, before the constructor.
### What's the difference between this and a `static` block?

| Initialization block `{ }` | `static { }` block |
|---|---|
| Belongs to the class instances. | Belongs to the class. |
| Executes every time an object is created. | Executes only once when the class is initialized. |
| Can directly access instance attributes. | Cannot directly access instance attributes. |
| Executes before the constructor. | Executes during class initialization. |

### Summary
- `{ }` → initializes **each object**.
- `static { }` → initializes **the class once**.