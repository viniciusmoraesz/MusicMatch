# 🎶 MusicMatch 🎧

**MusicMatch** é um projeto de programação desenvolvido como parte do curso de **Programação Orientada a Objetos com Java** da **Alura**. O objetivo do projeto é simular um sistema simples de música e podcast, utilizando os conceitos de classes e objetos em Java, como encapsulamento, herança e polimorfismo.

## 🚀 Funcionalidades

O sistema implementa a gestão de **Músicas** e **Podcasts**, permitindo:

- 📈 A contagem de **reproduções** e **curtidas** para cada música ou podcast.
- ⭐ A exibição da **classificação** de músicas e podcasts com base no número de reproduções.
- ❤️ A **inclusão** de músicas e podcasts em uma lista de preferidos com base na classificação.

## 🧑‍💻 Estrutura do Projeto

O código está dividido em diferentes classes, cada uma com responsabilidades específicas:

### `Audio` (Classe Base)

A classe `Audio` serve como base para os objetos **Música** e **Podcast**. Contém os seguintes atributos e métodos:

#### Atributos:
- `titulo`: O título da música ou podcast.
- `totalReproducoes`: O número total de reproduções.
- `totalCurtidas`: O número total de curtidas.
- `classificacao`: A classificação do conteúdo (calculada dinamicamente).

#### Métodos:
- `reproduz()`: Incrementa o número de reproduções.
- `curte()`: Incrementa o número de curtidas.

---

### `Musica` 🎵 (Herda de `Audio`)

A classe `Musica` herda de `Audio` e adiciona um atributo extra: **gênero**, e o nome do **artista** e **álbum**. Ela compartilha os métodos da classe `Audio`, mas é mais específica para o contexto de músicas.

#### Atributos adicionais:
- `genero`: Gênero musical da música.
- `artista`: O artista da música.
- `album`: O álbum da música.

---

### `Podcast` 🎙️ (Herda de `Audio`)

A classe `Podcast` herda de `Audio` e implementa um método para calcular a classificação com base no número de reproduções.  
- Se o podcast tem mais de **7000 reproduções**, recebe uma classificação de **10**.
- Caso contrário, a classificação é **7**.

---

### `MinhasPreferidas` 💖

A classe `MinhasPreferidas` é responsável por incluir músicas e podcasts que são considerados **"sucessos absolutos"**. A inclusão é baseada na classificação do conteúdo:  
- Se a classificação for **8 ou superior**, o conteúdo é considerado um **sucesso absoluto**.

---

### `Principal` ⚙️

A classe `Principal` contém o método `main()`, onde o fluxo do programa é iniciado:

- Criação de uma música e um podcast.
- Reproduções e curtidas para ambos.
- Exibição das estatísticas de cada conteúdo.
- Inclusão dos conteúdos na lista de preferidos.

## 🛠️ Tecnologias Utilizadas
