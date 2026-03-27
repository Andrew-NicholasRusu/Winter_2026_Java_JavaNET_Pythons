# Calculator Project

**Students:** Maxime Bergeron and Alexandra Wintle  
**Repository:** https://github.com/TheSult/simple-calculator-N33-Fall-2025

This repository contains a simple calculator program with several modifications and improvements made in **Program.cs** and in the overall project structure.

---

## Changes Made

### Change 1
- Converted the **string-to-double conversion class** into a **static class**.  
- This allows methods to be accessed without creating an object instance.

### Change 2
- Applied the same **static modification** to the **operator handling** functionality.

### Change 3
- Enhanced the result output to be **human-readable**:  
  - Used **string formatting** and **StringBuilder**.  
  - Displayed results with a **decimal precision of 2**.

### Change 4
- Refactored the `CalculatorEngine` class into its **own project**.  
- Built a **DLL** from this project.  
- Added the DLL reference back into the main project.

### Change 5
- Implemented an additional calculator function: **Modulus (%)**.  
- The calculator now supports the following operations:
  - Addition  
  - Subtraction  
  - Multiplication  
  - Division  
  - **Modulus**

---

## Notes
- This `README.md` was created as part of the project requirements.  
- It documents all the modifications and improvements clearly for future reference.  
