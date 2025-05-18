## Atividade 3 POO

### Questão 4

#### a) Memória:

- Arrays de tipos primitivos como `int[]`, `double[]` armazenam diretamente os valores na memória de forma contígua.  
  Exemplo: `int[] numeros = {1, 2, 3};` → os valores 1, 2 e 3 estão diretamente no array.

- Arrays de objetos como `Aluno[]`, `Produto[]` armazenam **referências** aos objetos, e os próprios objetos ficam armazenados separadamente na memória heap.  
  Exemplo: `Aluno[] alunos = new Aluno[3];` cria um array com 3 posições nulas, até que cada `Aluno` seja instanciado.

#### b) Cuidados:

- Em arrays de objetos, é necessário garantir que cada posição do array foi inicializada com um objeto válido antes de acessar métodos ou atributos.

- Caso tente acessar algo como alunos[0].nome sem ter feito alunos[0] = new Aluno();, ocorrerá uma exceção do tipo `NullPointerException`.


