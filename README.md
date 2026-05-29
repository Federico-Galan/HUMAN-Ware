# 🧠 HUMAN-Ware - Sistema de Selección de Personal

Proyecto desarrollado para la materia **Ingeniería de Software**.

## 📌 Descripción

**HUMAN-Ware** es un sistema que permite gestionar y automatizar el proceso de selección de candidatos para ofertas laborales.

El objetivo principal es conectar **empresas** con **postulantes**, evaluando automáticamente la idoneidad de los candidatos en base a:

* Titulación requerida
* Habilidades (skills)
* Nivel de experiencia en dichas habilidades

---

## 🚀 Funcionalidades principales

### 👤 Postulantes

* Registro de usuario
* Creación de perfil personal y laboral
* Carga de:
  * Titulación
  * Habilidades (con nivel de 1 a 5)
* Postulación a ofertas laborales
* Gestión de solicitudes (Applications)

### 🏢 Empresas

* Registro de empresa
* Publicación de ofertas laborales
* Definición de:

  * Puesto
  * Descripción
  * Rango salarial
  * Jornada laboral
  * Requisitos (titulación + skills)

### ⚙️ Sistema

* Matching automático entre postulantes y ofertas
* Ranking de candidatos por idoneidad
* Envío de notificaciones:

  * A empresas (lista de candidatos)
  * A postulantes (selección)

---

## 🧩 Modelo del sistema

El sistema se basa en los siguientes conceptos principales:

* **Postulante**
* **Empresa**
* **Oferta Laboral**
* **Skill**
* **Titulación**
* **Application (Solicitud)**
* **Empleado (Publicador / Evaluador)**

### 🧠 Lógica de selección

Un candidato es mejor que otro si:

1. Cumple con la titulación requerida
2. Cumple con las habilidades mínimas
3. Tiene mayor puntaje total en las skills requeridas

---

## 🛠️ Tecnologías

*(Completar según tu proyecto)*

* Lenguaje: Java
* IDE: NetBeans
* Build Tool: Ant

---

## 📂 Estructura del proyecto

```bash
src/
 ├── model/
 ├── service/
 ├── repository/
 ├── controller/
 └── main/
```


---

## 🧪 Reglas importantes del sistema

* Un postulante puede tener entre **1 y 3 solicitudes activas**
* La titulación requerida es **obligatoria**
* Las skills deben cumplir el nivel mínimo requerido
* Las ofertas pueden estar:

  * Activas
  * Canceladas
  * Cubiertas

---

## 👥 Roles del sistema

* **Publicador**

  * Valida y publica ofertas

* **Evaluador**

  * Ejecuta el proceso de selección
  * Genera ranking de candidatos

---

## 📧 Flujo del sistema

1. Empresa publica oferta
2. Postulantes aplican
3. Evaluador ejecuta selección
4. Sistema:

   * Ordena candidatos
   * Notifica a empresa
   * Notifica a postulantes

---


