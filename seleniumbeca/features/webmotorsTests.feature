# language: pt

Funcionalidade: Testar página de usuário do Webmotors

  Um cliente deseja fazer login no site e verificar se está na página Minha Garagem

  @evidencia
    Cenario: Verificar footer
      Dado que eu acesso a pagina inicial da WebMotors
      Quando eu clico no botão mais informações
      Entao a página mostra os dados do footer

  @evidencia
    Cenario: Validar link financiar
      Dado que eu acesso a pagina inicial da WebMotors
      Quando eu clico no link financiar
      Entao a página é redirecionada e muda o titulo

  @evidencia
  Cenario: Validar página de ofertas
    Dado que eu acesso a pagina inicial da WebMotors
    Quando eu clico no botão ver ofertas
    Entao é redirecionado para a página de ofertas

  @evidencia
  Cenario: Validar link de vender
    Dado que eu acesso a pagina inicial da WebMotors
    Quando eu clicar no link de vender
    Entao o usuário será redirecionado e deve contar na página o titulo respectivamente

  @evidencia
  Cenario: Validar barra de busca
    Dado que eu acesso a pagina inicial da WebMotors
    Quando eu clicar na barra de busca e pesquisar o produto
    Entao o usuário será redirecionado para o item pesquisado

  @evidencia
  Cenario: Verificar elementos na tela
    Dado que eu acesso a pagina inicial da WebMotors
    Quando eu verifico os itens na tela
    Entao deve conter todos os itens

  @evidencia
  Cenario: Validar se o usuário faz login
    Dado que eu navego até a página de login do Webmotors
    Quando eu preencho os meus dados
    E clico no botão entrar
    Entao eu estou logado

  @evidencia
  Cenario: Validar se abre a tela de login com conta do Google
    Dado que eu navego até a página de login do Webmotors
    Quando eu clico em Entrar com Google
    Entao uma nova janela para login abre

  @evidencia
  Cenario: Validar se o usuário faz login com dados inválidos
    Dado que eu navego até a página de login do Webmotors
    Quando eu preencho com dados inválidos
    E clico no botão entrar
    Entao o login não é realizado

  @evidencia
  Cenario: Validar alteração de gênero do usuário
    Dado que eu faço login na página Webmotors
    Quando navego até Editar Perfil
    E altero Sexo Masculino para Feminino
    E clico em Salvar Alterações
    Então a página recarrega com o dado atualizado

  @evidencia
    Cenario: Validar alteração de telefone principal do usuário
    Dado que eu faço login na página Webmotors
    Quando navego até Editar Perfil
    E altero o Telefone Principal
    E clico em Salvar Alterações
    Entao a página recarrega com o telefone atualizado
