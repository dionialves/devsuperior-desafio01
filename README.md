# DevSuperior - Desafio 01

Este desafio, proposto pelo Professor Nélio Alves, consiste de forma simples representar a injeção de dependencias e como componentes e serviços
se relacionam em um projeto Sprinb Boot.

Neste desafio é proposto criar um objeto chamado order, que conteria os atributos de codigo, valor e porcentagem de desconto. E a logica ficaria a cargo das
classes de serviço, OrdemService para controle do pedido e ShippingService para controlar a taxa de frete. No final, o objetivo é calcular o valor subtraindo o 
desconto e acrescentando o valor de frete.

### Relacionamentos

Abaixo as imagens dos relacionamentos entre, na primeira a entidade que representaria o objeto. Na segunda imagem as classes de serviço e o relacionamento entre elas.

![Snake-Java Preview](https://github.com/dionialves/devsuperior-desafio01/blob/main/src/main/resources/images/order.png)

![Snake-Java Preview](https://github.com/dionialves/devsuperior-desafio01/blob/main/src/main/resources/images/services.png)
