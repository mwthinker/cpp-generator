# cpp-generator [![CI build](https://github.com/mwthinker/cpp-generator/actions/workflows/ci.yml/badge.svg)](https://github.com/mwthinker/cpp-generator/actions/workflows/ci.yml) [![codecov](https://codecov.io/gh/mwthinker/cpp-generator/graph/badge.svg?token=AXPMDCRSGC)](https://codecov.io/gh/mwthinker/cpp-generator) [![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)
A java spring-boot application based on JDK 21 and maven. Create a singe page vue3 page to generate c++ template project, similiar to https://start.spring.io/.

## Developer enviroment
Uses java with JDK21 and [maven](https://maven.apache.org/what-is-maven.html). Frontend is dependent on [nodejs](https://nodejs.org/en/learn/getting-started/introduction-to-nodejs) and [npm](https://docs.npmjs.com/about-npm). But the spring-boot application will use a local npm and node version.

Frontend uses [vue3](https://vuejs.org/) and [typescript](https://www.typescriptlang.org/).

### Windows
To be able to hande multiple versions of node and npm it could be good to use [nvm](https://github.com/coreybutler/nvm-windows).

## How to run standalone server

```bash
mvn package
java -jar target/cpp-generator-0.0.1-SNAPSHOT.jar
```

## How to run frontend locally
Frontend code is found in [src/vueapp/.](src/vueapp/.). Recomended is to use the same version of node and npm that is specified in (pom.xml)[./pom.xml].

Commands are defined in [package.json](./src/vueapp/package.json) under "scripts".

Run frontend:
```bash
cd  src/vueapp/
npm run dev
```

Run backend:
```bash
mvn spring-boot:run
```

## License
MIT
