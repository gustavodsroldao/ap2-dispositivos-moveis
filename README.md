# Catálogo de Jogos em Jetpack Compose

> **Atividade Prática 2 (AP2)**  
> **Disciplina:** Desenvolvimento Mobile  
> **Tecnologias:** Kotlin, Jetpack Compose, Material 3, Navigation Compose, Coil

---

## 👥 Integrantes do Grupo

- Integrante 1:Eduardo Lopes Esfolha
- Integrante 2: Gustavo da Silveira Roldão

---

## 🎮 Tema Escolhido

Um catálogo moderno de jogos com capas oficiais da Steam, categorias, notas de avaliação e descrições detalhadas de cada título.

## 📂 Estrutura de Pastas do Projeto

```text
app/src/main/java/br/ulbra/jogos/
├── MainActivity.kt               ← Ponto de entrada do app (setContent e JogosTheme)
├── model/
│   └── Jogo.kt                   ← Data class com 7 campos
├── data/
│   └── JogoRepository.kt         ← Object repositório com 12 jogos e métodos de busca
└── ui/
    ├── Rotas.kt                  ← Rotas tipadas @Serializable (Lista e Detalhe)
    ├── JogoCard.kt               ← Componente Card com imagem Steam, título, gênero, ano e nota
    ├── CatalogoScreen.kt         ← Tela 1: Scaffold + TopAppBar + LazyColumn (key)
    ├── DetalheScreen.kt          ← Tela 2: Scaffold + TopAppBar + Imagem + Info + Scroll
    ├── AppNavHost.kt             ← Configuração de navegação com lambdas desacopladas
    └── theme/
        ├── Color.kt              ← Paleta de cores personalizada do grupo
        ├── Theme.kt              ← Configuração do MaterialTheme (Light e Dark)
        └── Type.kt               ← Tipografia customizada
```

---
- **Integrante C (Imagens & Design System):** Explica o uso do `AsyncImage` com Coil, o tratamento de proporção das capas da Steam (`aspectRatio(460f / 215f)`), a permissão de internet no `AndroidManifest.xml` e a paleta de cores customizada do Material 3 no `Color.kt` e `Theme.kt`.
