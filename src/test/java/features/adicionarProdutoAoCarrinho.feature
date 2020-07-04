# language: pt

Funcionalidade: Adicionar produto ao carrinho
    Como cliente das Casas Bahia
    Quero adicionar um produto no carrinho
    Para reservar meu produto

    Cenario: Adicionar um Iphone XR no carrinho
    Dado que esteja na pagina do Iphone XR
    Quando clicar em comprar
    E clicar em continuar sem garantia extendida
    Entao o Iphone XR devera ir para o carrinho
