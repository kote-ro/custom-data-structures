# Тест №1 / количество данных - 10.000

|                   | MyArrayList | ArrayList | MyLinkedList | LinkedList |
|-------------------|-------------|-----------|--------------|------------|
| add(T elem)       | 10          | 3         | 357          | 3          |
| add(int index)    | 3           | 3         | 174          | 7          |
| remove(T elem)    | 234         | 11        | 123          | 4          |
| remove(int index) | 78          | 3         | 63           | 33         |
| contains(T elem)  | 0           | 0         | 2            | 0          |

# Тест №2 / количество данных - 50.000

|                   | MyArrayList | ArrayList | MyLinkedList | LinkedList |
|-------------------|-------------|-----------|--------------|------------|
| add(T elem)       | 31          | 29        | 5375         | 6          |
| add(int index)    | 5           | 7         | 3512         | 8          |
| remove(T elem)    | 4475        | 133       | 4123         | 9          |
| remove(int index) | 1848        | 58        | 1948         | 1055       |
| contains(T elem)  | 1           | 1         | 3            | 1          |

# Тест №3 / количество данных - 100.000

|                   | MyArrayList | ArrayList | MyLinkedList | LinkedList |
|-------------------|-------------|-----------|--------------|------------|
| add(T elem)       | 34          | 15        | 32448        | 14         |
| add(int index)    | 12          | 18        | 25203        | 20         |
| remove(T elem)    | 38261       | 546       | 21021        | 14         |
| remove(int index) | 18813       | 242       | 10054        | 3993       |
| contains(T elem)  | 2           | 6         | 2            | 2          |


> Данные представлены в **милисекундах**
