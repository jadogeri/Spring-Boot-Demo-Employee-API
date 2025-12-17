## **Express DI API**

**Version:** 1.10.0 </br>
**Date:** December 17, 2025

---

## Description

This is a beginner spring boot application using postres database.

## Authors

- [@jadogeri](https://www.github.com/jadogeri)

## Repository

- [source code ](https://github.com/jadogeri/Spring-Boot-Demo-Employee-API.git)

## Environment Variables

Note: use file application.properties.txt as template (or rename to application.properties) for global variables.

## Screenshots

---

| ![Screenshot 1](assets/images/screenshot1.png) | ![Screenshot 1](assets/images/screenshot2.png) |
| -------------------------------------------- | -------------------------------------------- |
| ![Screenshot 1](assets/images/screenshot3.png) | ![Screenshot 1](assets/images/screenshot4.png) |

## Table of Contents

<ul>
    <li><a href="#1-introduction">1. Introduction</a>
      <ul>
        <li><a href="#11-purpose">1.1 Purpose</a> </li>
      </ul>
    </li>
    <li><a href="#2-installation">2. Installation</a>  </li>
    <li><a href="#3-usage">3. Usage</a>
      <ul>
          <li><a href="#31-run-application">3.1 Run Application</a> </li>
          <ul>
            <li><a href="#311-run-locally">3.1.1 Run Locally</a> </li>
          </ul>
      </ul>
    </li>
    <li><a href="#4-api-documentation">4. API Documentation</a> </li>
    <li><a href="#5-references">5. References</a> </li>
</ul>

## **1. Introduction**

### **1.1 Purpose**

This document outlines the components, and design considerations for functionality to spring boot application.

## **2. Installation**

* [Download and install NodeJS](https://nodejs.org/en/download)

---

## **3. Usage**

**Prerequisites** :installation of NodeJS.

### **3.1 Run Application**
0 Open IntelliJ IDE

1 Open terminal.

2 Type command git clone https://github.com/jadogeri/Spring-Boot-Demo-Employee-API.git then press enter.

```bash
  git clone https://github.com/jadogeri/Spring-Boot-Demo-Employee-API.git
```

3 Enter command cd Spring-Boot-Demo-Employee-API then press enter.

```bash
  cd Spring-Boot-Demo-Employee-API
```

#### **3.1.1 Run Locally**

0 Click on Maven icon on the side of ide

1 Navigate to demo --> LifeCycle directory

2 Double click in order: `clean`, `compile` then `install`.



#### 4 API Documentation ####

Note: Assuming port is `8080`

| Method        | Description            | Endpoint                                        | Body      | Param      |
| ----------- |------------------------| -------------------------------------------------- | ------------------------ |------------|
| `GET`       | Returns all employees  | `http://localhost:8080/api/v1/employee/` | none       | none       |             
| `GET` | Return single employee | `http://localhost:8080/api/v1/employee/:id` | none  | id e.g `1` |   
| `POST`   | Creates an employee            | `http://localhost:8080/api/v1/employee/` | e.g `{"firstName": "Jack", "lastName": "Dawson", "age": 20,"dob": "1900-08-05", "email": "jdawson@aol.com"}`  | none    |                      
| `PUT`| Updates an employee    | `http://localhost:8080/api/v1/employee/:id` | e.g ` {"email": "eri@aol.com","lastName":"ado", }` | id e.g `1` |  
| `DELETE`| Removes an employee    |`http://localhost:8080/api/v1/employee/:id`  | none  | id e.g `1` |     


## **5. References**
* AweSome Open Source : [Awesome Readme Templates](https://awesomeopensource.com/project/elangosundar/awesome-README-templates)
* Readme.so : [The easiest way to create a README](https://readme.so/)



