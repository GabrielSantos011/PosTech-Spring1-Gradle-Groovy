# PosTech - Spring - Gradle groovy
<hr>
- Projeto SpringBoot inicializado pelo spring initializr;<br>
- Adicionada dependência do Spring Web, Spring Data JPA, Spring Dev Tools e H2 Database;<br>
- Versão do java: 17;
<hr>

<h3>Aula 1</h3>
-Gradle é um outro gerenciador de dependências<br>
-No lugar do pom.xml temos o build.gradle<br>
-Montagem do ambiente por meio do application.properties<br>
-Montagem da entidade Usuario<br>
-Montagem do repository (Spring Data Jpa) para Usuario<br>
-Montagem da sevice de Usuario<br>
-Listar todos com paginação<br>
-Montagem da Controller de Usuario<br>
-Montagem de uma exception - ControllerNotFoundException<br>
-Montagem de um StandardError (apresentação mais bonita de erro para o client)<br>
-Montagem de um Handler - ControllerExceptionHandler 
(classe que captura o erro na Controller - intercepta e joga o nosso StandardError)<br>
-Adicionando dependência do bean Validation (biblioteca de validação de formulários)<br>
-Usando o NotBlank do BeanValidation (colocamos no atributo de entrada - no caso nosso DTO- e o @Valid na controller)<br>
-Fazendo um tratamento de erro para MethodArgumentNotValidException (caso o campo seja reprovado pelo bean)