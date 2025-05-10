# Sistema de Gerenciamento de Biblioteca

Sistema ERP desenvolvido para otimizar o gerenciamento de bibliotecas comunitárias, oferecendo uma solução completa para controle de acervo, empréstimos e gestão de usuários.

## 📋 Índice
- [Visão Geral](#visão-geral)
- [Funcionalidades](#funcionalidades)
- [Stack Tecnológica](#stack-tecnológica)
- [Arquitetura](#arquitetura)
- [Infraestrutura](#infraestrutura)
- [Documentação](#documentação)
- [Desenvolvimento](#desenvolvimento)
- [Deploy](#deploy)
- [Monitoramento](#monitoramento)
- [Suporte](#suporte)

## 📖 Visão Geral
O Sistema de Gerenciamento de Biblioteca é uma solução robusta desenvolvida para automatizar e otimizar processos. A plataforma oferece uma interface web moderna e responsiva, com planos de expansão para aplicativo mobile. Desenvolvida utilizando tecnologias de ponta, o sistema visa proporcionar uma experiência eficiente tanto para gestores quanto para usuários.

## ✨ Funcionalidades
- Gestão completa do acervo bibliográfico
- Sistema de doações integrado
- Busca avançada por múltiplos critérios
- Controle automatizado de empréstimos
- Gestão de usuários e permissões
- Interface responsiva e acessível
- Relatórios e estatísticas em tempo real

## 🚀 Stack Tecnológica

### Backend
- Java 21
- Spring Boot 3.x
- Spring Security
- JWT Authentication
- Oracle Database
- Maven
- JUnit 5
- Swagger/OpenAPI

### Frontend
- Next.js 14
- TypeScript
- Tailwind CSS
- React Query
- Material-UI

### Infraestrutura
- Oracle Cloud Infrastructure (OCI)
- Nginx
- GitHub Actions
- Vercel

## 🏗️ Arquitetura

### Backend
- API RESTful com Spring Boot
- Autenticação e autorização via JWT
- Proxy Reverso e balanceamento de carga com Nginx
- Banco de dados Oracle com otimizações
- Cache distribuído
- Logging centralizado

### Frontend
- Arquitetura baseada em componentes
- Gerenciamento de estado com Next
- Roteamento dinâmico
- Deploy otimizado na Vercel
- PWA capabilities

## 🌐 Infraestrutura

### Ambiente de Produção
- **Região**: Oracle Cloud São Paulo
- **Infraestrutura**:
  - Compute Instance: VM.Standard.E4.Flex
  - Banco de Dados: Oracle MySQL HeatWave
  - Armazenamento: Diretamente na instancia
  - Proxy Reverso e balanceamento de carga: Nginx

### Configuração do Nginx
- **Portas**:
  - 80 (HTTP)
  - 443 (HTTPS)
  - 8080 (Aplicação Spring Boot)

- **Configurações de Segurança**:
  - SSL/TLS
  - Headers de segurança
  - Rate limiting
  - Proteção contra DDoS
  - Fail2Ban para proteção contra ataques de força bruta
    - Bloqueio automático de IPs maliciosos
    - Regras personalizadas para SSH e aplicação
    - Logs de tentativas de acesso suspeitas
    - Tempo de banimento configurável
    - Whitelist para IPs confiáveis

- **Otimizações**:
  - Compressão gzip
  - Cache de arquivos estáticos
  - Balanceamento de carga (se necessário)

### Ambientes
1. **Produção**
   - Banco: Oracle Autonomous Database (Production)
   - Monitoramento 24/7
   - Backup automático

2. **Homologação**
   - Banco: Oracle Autonomous Database (Development)
   - Ambiente de testes
   - CI/CD integrado

## 📚 Documentação

### API
- [Swagger UI](https://minha1api.duckdns.org/swagger-ui/index.html#/)
- [Documentação Técnica](endpoints.md)

### Frontend
- [Repositório](https://github.com/viniciusciconebarbosa/erp-system-library-front)
- [Aplicação](https://erp-system-library-front.vercel.app/login)

## 🔧 Desenvolvimento

### Pré-requisitos
- Java 21
- Node.js 18+
- Maven
- Oracle Database
- Git

### Configuração do Ambiente
1. Clone o repositório:
```bash
git clone https://github.com/seu-usuario/biblioteca.git
```

2. Configure as variáveis de ambiente:
```bash
cp .env.example .env
```

3. Configure as credenciais do Oracle Cloud:
```properties
ORACLE_CLOUD_USERNAME=seu_usuario
ORACLE_CLOUD_PASSWORD=sua_senha
ORACLE_CLOUD_TENANCY=seu_tenancy
ORACLE_CLOUD_REGION=sao-paulo
```

4. Execute o projeto:
```bash
./mvnw spring-boot:run
```

## 📦 Deploy

### Pipeline de Produção (GitHub Actions)
1. Validação de código
2. Build e testes automatizados
3. Deploy na Oracle Cloud
4. Validação do ambiente
5. Notificação de status

## 🔍 Monitoramento

### Métricas
- CPU, memória e disco
- Latência de requisições
- Taxa de erros
- Uso de banco de dados

### Alertas
- CPU > 80%
- Memória > 85%
- Latência > 500ms
- Erros HTTP > 1%

### Backup
- Backup diário automatizado
- Retenção de 30 dias
- Restauração via console

### Manutenção
- Janela: Domingo 01:00-03:00
- Notificação: 48h antes
- Rollback automático

## 📞 Suporte
- Email: viniciuscicone@gmail.com.br
- Documentação: [Wiki do Projeto](link-para-wiki)
- Issues: [GitHub Issues](link-para-issues)

# ERP Controle de Estoque - Biblioteca Comunitária

## 🌐 API Pública
Acesse a documentação Swagger da API:  
🔗 [Swagger UI](https://minha1api.duckdns.org/swagger-ui/index.html#/)

## 🖥️ Repositório do Frontend  
O código-fonte do frontend está disponível no GitHub:  
🔗 [Repositório do Frontend](https://github.com/viniciusciconebarbosa/erp-system-library-front)

## 📄 Página  
 🔗 [Pagina da Aplicaçao](https://erp-system-library-front.vercel.app/login)
 
 ## 🖥️ Aplicaçao Desktop JavaFX  
 🔗 [Aplicaçao Desktop JavaFX](https://github.com/viniciusciconebarbosa/erp-system-library-desktop)

## Sobre o Projeto
Este é um projeto ERP web e android para gerenciar o estoque de uma biblioteca, permitindo cadastrar um livro doado, busca livros em estoque e tambem livros locados. Será Desenvolvido em Java (Spring Boot) e Next.js,
o projeto visa melhorar minhas habilidades em desenvolvimento de software.

## Funcionalidades
- Cadastrar livros ou realizar doações.
- Gerenciar Usuarios no sistema.
- Buscar livros por título ou autor.
- Registrar locaçoes com atualização automática do estoque.
- Interface responsiva e intuitiva para desktop e celular.
*Nota*: Este é o backlog inicial, que pode evoluir com novas prioridades.


## Cronograma
- Semana data: Planejamento e configuração do projeto.
- Semanas d-data: Desenvolvimento do cadastro e busca.
- Semana data: Implementação de locaçoes e testes.
- Semana data: Ajustes finais e deploy.

## Tecnologias Utilizadas
- **Back-end**: Java (Spring Boot) para a API REST.
- **Front-end**: Next.js para a interface web.
- **Banco de Dados**: MySQL para armazenar livros e vendas.
- **Ferramentas**: VS Code, Git, GitHub, Vercel e Oracle (deploy).

## Arquitetura
O sistema segue uma arquitetura cliente-servidor:
- **Front-end**: Next.js faz requisições HTTP à API.
- **Back-end**: Spring Boot gerencia lógica.
- **Banco**: armazena tabelas de livros e vendas.




