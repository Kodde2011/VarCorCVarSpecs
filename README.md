# Variable Specifications for SPLs in VarCorC
Repository for the master's thesis **Variable Specifications for Correct-by-Construction Software Product Lines** by [Maximilian Kodetzki](mailto:maximilian.kodetzki@mko-online.de).

The official repository of **CorC** can be found [here](https://github.com/TUBS-ISF/CorC/).

## Content

In this repository, we provide the source code of VarCorC which was used for the evaluation of the master's thesis **Variable Specifications for Correct-by-Construction Software Product Lines**. The code was used for 1. Proof of Concept: Variable Specifications, 2. Proof of Concept: Partial Proofs, and 3. Performance of Partial Proofs in VarCorC. Further, we provide a setup guide, the case studies used, and detailed results of the evaluation of the verification costs.

* Folder `Evaluation` contains the case studies **IntegerList**, **BankAccount**, and **Elevator**. 
* Folder `Evaluation/allDiagrams` contains .pdf-files of all CbC-diagrams implemented in the case studies.
* Files `Evaluation/EvaluationIntegerList.xlsx`, `Evaluation/BankAccount.xlsx`, and `EvaluationElevator.xlsx` contain all data collected for the evaluation of the verification costs. 
* File `Evaluation/EvaluationOverview.xlsx` contains the main results of the evaluation of the verification costs and the diagrams presented in the thesis.

## CorC Project Setup Guide & Case Study Introduction (Status: 2023-01-01)
Installation guide for plugins and properties for **development with VarCorC**.

### Setup
* **Eclipse** Install [Eclipse Modelling Tools](https://www.eclipse.org/downloads/packages/release/2021-06/r). Please use version 2021-06 (Eclipse 4.20.0).
* **Graphiti** Install Graphiti using the update site https://download.eclipse.org/graphiti/updates/0.18.0/
* **Xtext** Available in [Eclipse Marketplace](https://marketplace.eclipse.org/content/eclipse-xtext)
* **Mylyn** Available in [Eclipse Marketplace](https://marketplace.eclipse.org/content/mylyn) (Mylyn 3.23)
* **FeatureIDE** Available in [Eclipse Marketplace](https://marketplace.eclipse.org/content/featureide) or using the update site http://featureide.cs.ovgu.de/update/v3/
* **Jamopp** Available in [Eclipse Marketplace](https://marketplace.eclipse.org/content/jamopp) or in package `de.tu_bs.cs.isf.cbc.tool.update`

### Properties & Initialisation
1. Checkout master from https://github.com/Kodde2011/VarCorCVarSpecs
2. Open the following packages in Eclipse Modelling Tools:
* de.tu_bs.cs.isf.cbc.cbcclass.model
* de.tu_bs.cs.isf.cbc.statistics
* de.tu_bs.cs.isf.cbc.statistics.ui
* de.tu_bs.cs.isf.commands.toolbar
* de.tu-bs.cs.isf.cbc.model
* de.tu-bs.cs.isf.cbc.tool
* de.tu-bs.cs.isf.cbc.util
* de.tu-bs.cs.isf.cbcclass.tool
* de.tu-bs.cs.isf.wizards

3. Disable warnings for circular dependencies: 
Window -> Preferences -> Java -> Compiler -> Building -> Build path problems -> Circular dependencies -> Warning
4. If multiple referencing errors occur, uninstall Jamopp Plugins via Window -> Preferences -> Install/Update -> Uninstall or update. After uninstalling, reinstall via Marketplace package `de.tu_bs.cs.isf.cbc.tool.update`.
5. Select any package and run project as Eclipse Application.

---

Please do not hesitate to contact the author [Maximilian Kodetzki](mailto:maximilian.kodetzki@mko-online.de) if you have any questions.

The thesis was written at the **Institute of Software Engineering and Automotive Informatics** (TU Braunschweig) in cooperation with the **Institute of Information Security and Dependability** working group **Test, Validation and Analysis of Software-Intensive Systems** (KIT Karlsruhe). Supervised by **Dr.-Ing. habil Sandro Schulze** (TU BS), **Prof. Dr.-Ing. Ina Schaefer** (KIT), and **M.Sc. Tabea Bordis** (KIT).
January 2023.
