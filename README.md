# GameDex — Catálogo de Jogos em Jetpack Compose

> **Atividade Prática 2 (AP2)**  
> **Disciplina:** Desenvolvimento Mobile  
> **Tecnologias:** Kotlin, Jetpack Compose, Material 3, Navigation Compose, Coil

---

## 👥 Integrantes do Grupo

- **Integrante 1:** [Nome Completo aqui]
- **Integrante 2:** [Nome Completo aqui]
- **Integrante 3 (opcional):** [Nome Completo aqui]

---

## 🎮 Tema Escolhido

**GameDex**: Um catálogo moderno de jogos com capas oficiais da Steam, categorias, notas de avaliação e descrições detalhadas de cada título.

---

## 📱 Screenshots do Aplicativo

| 1. Tela de Catálogo (Lista) | 2. Tela de Detalhe |
| :---: | :---: |
| ![Catálogo](docs/screenshots/catalogo.png) | ![Detalhe](docs/screenshots/detalhe.png) |

> 💡 *Dica: tire os prints do emulador ou do celular e salve-os em `docs/screenshots/` com os nomes `catalogo.png` e `detalhe.png`.*

---

## ✅ Cumprimento de Todas as Premissas

| # | Premissa | Como foi cumprida no projeto | Arquivo(s) de Referência |
|---|---|---|---|
| **P1** | **Duas telas, com navegação** | Implementado com Navigation Compose e **rotas tipadas** (`@Serializable object Lista` e `@Serializable data class Detalhe(val jogoId: Int)`). Ao tocar em qualquer card, navega para o detalhe recebendo o `id`. As telas recebem funções lambda (`onJogoClick` e `onVoltar`) em vez de receber o `navController`. A seta na `TopAppBar` do detalhe volta para a lista via `popBackStack()`. | [`ui/Rotas.kt`](app/src/main/java/br/ulbra/gamedex/ui/Rotas.kt)<br>[`ui/AppNavHost.kt`](app/src/main/java/br/ulbra/gamedex/ui/AppNavHost.kt) |
| **P2** | **Dados próprios no código** | `data class Jogo` com **7 campos** (`id`, `titulo`, `genero`, `ano`, `nota`, `imagemUrl`, `descricao`). Repositório `JogoRepository` como `object` contendo **12 jogos** com dados completos e funções `listar()` e `buscarPorId(id)`. | [`model/Jogo.kt`](app/src/main/java/br/ulbra/gamedex/model/Jogo.kt)<br>[`data/JogoRepository.kt`](app/src/main/java/br/ulbra/gamedex/data/JogoRepository.kt) |
| **P3** | **Imagens reais** | Imagens reais das capas oficiais da Steam carregadas via internet com **`AsyncImage` (Coil)** tanto na lista quanto na tela de detalhe. Proporção original preservada sem distorção com `aspectRatio(460f / 215f)` e `ContentScale.Crop`. Permissão de internet configurada no manifest. | [`ui/JogoCard.kt`](app/src/main/java/br/ulbra/gamedex/ui/JogoCard.kt)<br>[`ui/DetalheScreen.kt`](app/src/main/java/br/ulbra/gamedex/ui/DetalheScreen.kt)<br>[`AndroidManifest.xml`](app/src/main/AndroidManifest.xml) |
| **P4** | **Lista eficiente com card próprio** | Uso de **`LazyColumn`** com parâmetro `key = { it.id }` para máxima performance na rolagem e reciclagem de componentes. Card customizado (`JogoCard`) exibindo a capa, título, gênero (tag estilizada), ano de lançamento e nota com ícone de estrela. | [`ui/CatalogoScreen.kt`](app/src/main/java/br/ulbra/gamedex/ui/CatalogoScreen.kt)<br>[`ui/JogoCard.kt`](app/src/main/java/br/ulbra/gamedex/ui/JogoCard.kt) |
| **P5** | **Material 3 com identidade** | Estrutura com **`Scaffold`** e **`TopAppBar`** em ambas as telas. Paleta de cores exclusiva criada para o GameDex (tons modernos de Teal Gamer, Indigo e detalhes em Amber Gold para as notas), fugindo totalmente do roxo padrão do template. Suporte a tema escuro e tema claro com contraste otimizado. Na tela de detalhes, o conteúdo possui rolagem (`verticalScroll`) para comportar textos longos. | [`ui/theme/Color.kt`](app/src/main/java/br/ulbra/gamedex/ui/theme/Color.kt)<br>[`ui/theme/Theme.kt`](app/src/main/java/br/ulbra/gamedex/ui/theme/Theme.kt) |

---

## 📂 Estrutura de Pastas do Projeto

```text
app/src/main/java/br/ulbra/gamedex/
├── MainActivity.kt               ← Ponto de entrada do app (setContent e GameDexTheme)
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

## 🚀 Como Executar o Projeto

### Pelo Android Studio
1. Abra o **Android Studio**.
2. Selecione **File > Open...** e aponte para a pasta deste projeto (`ap2-sexta`).
3. Aguarde o Gradle sincronizar as dependências.
4. Conecte um celular com Depuração USB ativada ou inicie um emulador.
5. Clique no botão **Run (Shift + F10)**.

### Pela Linha de Comando (PowerShell / Terminal)
Para compilar o APK de desenvolvimento:
```powershell
.\gradlew.bat assembleDebug
```
O APK gerado estará em:
```text
app/build/outputs/apk/debug/app-debug.apk
```

---

## 🎤 Dicas para a Apresentação (Até 5 minutos)

Durante a apresentação de até 5 minutos, cada integrante pode explicar com facilidade uma parte do projeto:
- **Integrante A (Navegação & Rotas):** Apresenta o `ui/Rotas.kt` e `ui/AppNavHost.kt`, mostrando como o `@Serializable` passa o `id` de forma segura e como a tela de detalhes consome esse ID com `JogoRepository.buscarPorId(jogoId)`.
- **Integrante B (Dados & Lista Eficiente):** Mostra o `model/Jogo.kt`, o `data/JogoRepository.kt` e o `ui/CatalogoScreen.kt`, explicando que a lista utiliza `LazyColumn` com `key = { it.id }` para reciclar views em vez de `Column` com `forEach`.
- **Integrante C (Imagens & Design System):** Explica o uso do `AsyncImage` com Coil, o tratamento de proporção das capas da Steam (`aspectRatio(460f / 215f)`), a permissão de internet no `AndroidManifest.xml` e a paleta de cores customizada do Material 3 no `Color.kt` e `Theme.kt`.
