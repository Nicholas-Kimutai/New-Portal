# NEWS PORTAL API
### By: Nicholas Kimutai
## Table of Content
-   [Description](#description)
-   [Installation Requirement](#installation)
-   [Technology Used](#technologies)
-   [Authors Info](#author-info)
-   [License](#License)
## Description
This is a REST API for querying and retrieving scoped news and information.
## Installation
### Requirements
-   A computer
-   Installed Java, IntelliJ, Postgres, gradle, Junit, Jdk and sdk.
-   An access to the Internet
### 1. Local Repository
-   Make sure you have a stable internet to have the ability to clone the repository.
-   Type the following command in your terminal to clone this repository
```
git clone https://github.com/Nicholas-Kimutai/New-Portal.git
```
If you are using SSH, use the following command
```
git clone git@github.com:Nicholas-Kimutai/New-Portal.git
```
When you run the commands successfully, you should have a local version of this repository.

For psql

* CREATE DATABASE news_site;
* CREATE TABLE users (id serial primary key, name varchar, position varchar, role varchar, department varchar);
* CREATE TABLE news (id serial primary key, title varchar, description varchar, type varchar, author varchar);
* CREATE TABLE departments (id serial primary key, name varchar, description varchar, totalemployees int);
* CREATE TABLE departments_users (id serial primary key, deptid int, userid int);
* CREATE TABLE departments_news (id serial primary key, deptid int, newsid int, userid int);
* CREATE DATABASE news_site_test WITH TEMPLATE news_site;

### 2. Online Repository
-   Make sure you have a stable internet for forking this repository.
-   According to the license, you can fork this project. You need ibkt click on the forking icon and it will be added as one of your repositories
Happy coding!
## Technologies
* Java
* Postgres
* Spark
* Gson
* Postman
* JUnit



## Author Info
-   Linkedin - [Nicholas Kimutai](https://www.linkedin.com/in/nicholas-kimutai-1b629a127/)

## License
[MIT License](./LICENSE)

Copyright (c) 2022 Nicholas Kimutai