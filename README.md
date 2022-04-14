# Trabalho Final de Sistemas de Informação

> Guardião da Velha Guarda
> Professora Fernanda Lima - Turma B

<details>
<summary>Grupo 09</summary>
+ <b>Douglas Samuel Thomazi Azevedo - 180119109</b><br/>
+ <b>Guilherme Araújo de Oliveira - 190125748</b><br/>
+ <b>Lucas Vinicius Magalhaes - 170061001</b><br/>
+ <b>Maria Júlia Dias Lima - 170151140</b><br/>
+ <b>Moises Felipe Jaco - 190018364</b>
</details>

## Visão Geral

- Este trabalho tem o objetivo de facilitar o registro e a identificação médica de anomia em pacientes idosos, que podem sofrer perdas de memórias conforme a idade vai avançando, daí notamos a necessidade de ter um meio de transição de dados entre médico-paciente-familia.

### Referencias

> [Remembering a name - Neuropsychological validity studies and a computer proposal for detection of anomia](https://capes-primo.ez54.periodicos.capes.gov.br/primo-explore/fulldisplay?docid=TN_cdi_doaj_primary_oai_doaj_org_article_31635b4f65c8469b869121cce7be534f&context=PC&vid=CAPES_V3&lang=pt_BR&search_scope=default_scope&adaptor=primo_central_multiple_fe&tab=default_tab&query=any,contains,controle%20computador&facet=tlevel,include,peer_reviewed&facet=searchcreationdate,include,2016%7C,%7C2022&offset=10)

- O desenvolvimento do projeto foi baseado no artigo acima, principalmente na parte em que o artigo fala da identificação de anomia e sua correlação com traumas cerebrais em determinado lado do cérebro.
- Embora o planejamento inicial não considere a ideia como um todo, o projeto passou a ser desenvolvido a partir do ponto em que _"identificar traços de anomia"_ teve maior importância e é de mais fácil verificação para um usuário comum, sem conhecimento médico aprofundado.
- Apesar disso, o projeto possui uma aba direcionada à um médico cadastrado no sistema, em que é possível ter a integração desse tipo de informação, bem como outros dados a respeito de traumas e acidentes que possam desencadear ou intensificar estados de anomia.

## Objetivos

- Facilitar o registro do estado de saúde de idosos;
- Facilitar a analise do estado de saúde mental do paciente;
- Facilitar a emissão de relatórios médicos com dados coletados;

## Tecnologias Utilizadas

- Java
  - Version 1.8.0-321
- Android Studio

## Passo a passo para execução

- Para executar a aplicação tem de fazer o download do Android Studio.

  - [Windows](https://developer.android.com/studio)
  - [Ubuntu](https://tiagoaguiar.co/android-studio-ubuntu-linux-como-instalar)

- Já com o Android Studio instalado abra o projeto.
- Daí podemos testar de três maneiras:
  - via Emulador de Android;
  - via USB;
  - via Wi-fi;

### [Emulador de Android](https://www.zoom.com.br/pc-computador/deumzoom/emulador-de-android-para-pc#:~:text=O%20emulador%20de%20Android%20para,seus%20apps%20favoritos%20do%20celular.)

- É possível criar um emulador no próprio Android Studio, basta seguir os seguintes passos:
  - Clique em "Device Manager" no canto superior direito;
  - Cria um serviço;
  - Daí fica faltando configurar o mesmo com configurações como tamanho da tela, resolução, etc.

### USB

- É preciso ativar o <b>modo desenvolvedor</b> no smartphone;
- Também é preciso ativar a <b>depuração USB</b> e selecionar a opção <b>"Instalar aplicativos via USB"</b>;
- Daí conectando qualquer tipo de cabo USB é possível ter acesso a aplicação;

### Wi-fi

- Mesmo procedimento para [USB](https://github.com/guilhermea23/trabalho-SI-2021-2/edit/master/README.md#usb).
