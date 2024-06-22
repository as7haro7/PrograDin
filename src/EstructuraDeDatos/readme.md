Estructuras de Datos Comunes

    Array (Arreglo)
        get(int index): Obtener el elemento en un índice específico.
        set(int index, T value): Establecer el valor en un índice específico.
        length(): Obtener el tamaño del arreglo.

    Stack (Pila)
        push(T element): Insertar un elemento en la cima de la pila.
        pop(): Eliminar y devolver el elemento en la cima de la pila.
        peek(): Devolver el elemento en la cima de la pila sin eliminarlo.
        isEmpty(): Verificar si la pila está vacía.
        size(): Devolver el número de elementos en la pila.

    Queue (Cola)
        enqueue(T element): Insertar un elemento al final de la cola.
        dequeue(): Eliminar y devolver el elemento al frente de la cola.
        peek(): Devolver el elemento al frente de la cola sin eliminarlo.
        isEmpty(): Verificar si la cola está vacía.
        size(): Devolver el número de elementos en la cola.

    Linked List (Lista Enlazada)
        add(T element): Añadir un elemento al final de la lista.
        remove(T element): Eliminar la primera aparición de un elemento en la lista.
        contains(T element): Verificar si un elemento está presente en la lista.
        get(int index): Obtener el elemento en un índice específico.
        size(): Devolver el número de elementos en la lista.
        isEmpty(): Verificar si la lista está vacía.

    Binary Search Tree (Árbol Binario de Búsqueda)
        insert(T element): Insertar un elemento en el árbol.
        search(T element): Buscar un elemento en el árbol.
        delete(T element): Eliminar un elemento del árbol.
        inorder(): Recorrer el árbol en orden ascendente.
        preorder(): Recorrer el árbol en preorden.
        postorder(): Recorrer el árbol en postorden.

    Hash Table (Tabla Hash)
        put(K key, V value): Insertar una clave-valor en la tabla.
        get(K key): Obtener el valor asociado a una clave.
        remove(K key): Eliminar una clave-valor de la tabla.
        containsKey(K key): Verificar si una clave está presente en la tabla.
        size(): Devolver el número de pares clave-valor en la tabla.
        isEmpty(): Verificar si la tabla está vacía.

    Heap (Montículo)
        insert(T element): Insertar un elemento en el montículo.
        delete(): Eliminar el elemento raíz del montículo.
        peek(): Devolver el elemento raíz sin eliminarlo.
        size(): Devolver el número de elementos en el montículo.
        isEmpty(): Verificar si el montículo está vacío.

    Graph (Grafo)
        addVertex(T vertex): Añadir un vértice al grafo.
        addEdge(T vertex1, T vertex2): Añadir una arista entre dos vértices.
        removeVertex(T vertex): Eliminar un vértice del grafo.
        removeEdge(T vertex1, T vertex2): Eliminar una arista entre dos vértices.
        getNeighbors(T vertex): Obtener los vecinos de un vértice.
        depthFirstSearch(T startVertex): Realizar una búsqueda en profundidad desde un vértice.
        breadthFirstSearch(T startVertex): Realizar una búsqueda en anchura desde un vértice.