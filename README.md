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

### Screenshots
<table style="width:100%;"> 
  <tr> 
    <td align="center" style="width:50%;"> 
      <strong>Main Screen
        <br>
      </strong>
      <br> 
      <img src="https://github.com/MrHAM17/AD_17_Quadratic_Equation_Solver_App/blob/main/Result%20Pics/01%20Main%20Screen.jpg" height="510" width="240"> 
  </td> 
    <td align="center" style="width:50%;"> 
      <strong>User Input
        <br>
      </strong>
      <br> 
      <img src="https://github.com/MrHAM17/AD_17_Quadratic_Equation_Solver_App/blob/main/Result%20Pics/02%20User%20Input.jpg" height="510" width="240"> 
  </td> 
    <td align="center" style="width:50%;"> 
      <strong>Result
        <br>
      </strong>
      <br> 
      <img src="https://github.com/MrHAM17/AD_17_Quadratic_Equation_Solver_App/blob/main/Result%20Pics/03%20Result.jpg" height="510" width="240"> </td> </tr> </table>

---
