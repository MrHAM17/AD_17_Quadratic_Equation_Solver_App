## AD_17_Quadratic_Equation_Solver_App

### 📱 Short Description

Application designed to **solve quadratic equations** (ax² + bx + c = 0) by fetching coefficients from the UI using the **Data Binding Library**.

---

### 🧩 Concepts Covered

* **Data Binding** implementation (including `layout` tag and variables)
* **Two-Way Data Binding** for Edit Texts (fetching coefficients A, B, C)
* **Method Binding** (linking button clicks to complex logic methods)
* Mathematical concepts of calculating the **discriminant** and **roots** of an equation

---

### 🎯 Learning / Discovery Points

* Utilizing the **Two-Way Data Binding** syntax (`@={variable.property}`) to synchronize data between the Edit Texts and the data model (`MyEquation` class).
* Implementing click event handling by referencing a method (`solveEquation`) defined directly in the data source class.
* Handling conditional logic (e.g., discriminant > 0, = 0, or < 0) to determine and display the nature of the roots (two real roots, double root, or no real solutions).

---

### ⚙️ App Features / Usage

* User inputs coefficients A, B, and C via Edit Texts.
* Clicks "Solve" to calculate the roots.
* Displays the calculated roots (X1 and X2) or a message indicating no real solutions.

---

### 📝 Note

This app demonstrates how to apply **Data Binding** to a practical mathematical task, showcasing its utility in managing input, calculating results, and updating the output UI declaratively.

---
