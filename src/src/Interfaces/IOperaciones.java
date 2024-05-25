package Interfaces;

public interface IOperaciones<E> {

    void cargarHashMap(E clave, E valor); // carga un hashmap
    void listarHashMap(); // muestra un hashmap

    void cargarHashSet(E valor); // carga un hashset
    void listarHashSet(); // muestra un hashset
}
