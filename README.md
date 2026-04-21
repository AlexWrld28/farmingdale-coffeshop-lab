# farmingdale-coffeshop-lab

## Campus Coffee Shop Order Builder — Lab Assignment

**Course:** Object-Oriented Programming
**Team Size:** 2 students per group
**Repository Name:** `farmingdale-coffeshop-lab`
**Project Name:** `RamsBrewOrderSystem`

---

## Overview

This lab assignment tasks you with designing and implementing a simple order management system for **The Ram's Brew Coffee Shop** at Farmingdale State College. You will apply one or more **design patterns** to model a menu of customizable beverages and multiple order types.

---

## Menu

| Beverage | Available As |
|---|---|
| Coffee | Hot / Iced |
| Latte | Hot / Iced |
| Cappuccino | Hot only |
| Tea | Hot / Iced |

### Customization Options

| Option | Choices | Applies To |
|---|---|---|
| Size | Small, Medium, Large | All drinks |
| Milk | Whole, Skim, Almond, Oat, Soy | All drinks |
| Shots | 1, 2, 3 | Espresso drinks only (Latte, Cappuccino) |
| Sweetener | Sugar, Honey, Stevia, None | All drinks |

---

## Design Pattern Requirements

Your first task as a team is to **identify and justify** the design pattern(s) your system will use. Your implementation must:

- Create different beverage types cleanly
- Build customized beverages step-by-step
- Handle different order/service types (e.g. dine-in, takeout, mobile)

> 💡 **Hint:** Think about which patterns deal with object construction, object families, or adding behavior incrementally.

---

## Required Classes

You must implement **at minimum** the following:

```
RamsBrewOrderSystem/
├── Beverage              # Abstract class or interface — the base type for all drinks
├── Coffee                # Concrete beverage
├── Latte                 # Concrete beverage
├── Cappuccino            # Concrete beverage
├── Tea                   # Concrete beverage
├── BeverageBuilder       # Interface defining the step-by-step build contract
├── CoffeeBuilder         # Concrete builder for each beverage type
├── LatteBuilder          #   ...
├── CappuccinoBuilder     #   ...
├── TeaBuilder            #   ...
├── BeverageDirector      # Orchestrates the building process
├── Order                 # Holds one or more beverages + service type
└── OrderDriver           # main() entry point — creates and prints sample orders
```

> The class names using `XXXXX` placeholders in the spec correspond to your chosen pattern's roles (e.g., `BeverageBuilder`, `BeverageDirector`). Name them to reflect the pattern you chose.

---

## GitHub Collaboration Workflow

Follow these steps **in order**:

1. **Partner A** creates a new IntelliJ project named `RamsBrewOrderSystem`
2. **Partner A** creates a GitHub repository named `farmingdale-coffeshop-lab`
3. Initialize git locally, add the remote, and push the initial commit
4. **Partner A** adds **Partner B** as a collaborator on GitHub
5. **Partner B** clones the repository to their machine
6. Both partners develop and commit — use **branches** and **pull requests** where possible

---

## Submission

Submission is **individual**.

1. **Fork** the shared team repository to your personal GitHub account
2. Ensure your fork contains the complete, working implementation
3. Submit the link to **your fork** on Brightspace

---

## Implementation Checklist

- [ ] Design pattern(s) selected and documented (add a short note in a `DESIGN.md` or at the top of `OrderDriver`)
- [ ] `Beverage` abstraction defined
- [ ] All four concrete beverage classes implemented
- [ ] Builder/Factory interface and all concrete implementations created
- [ ] Shot customization restricted to espresso-based drinks only
- [ ] `Order` class supports multiple beverages and a service type
- [ ] `OrderDriver` demonstrates at least **3 distinct orders**
- [ ] Repository has meaningful commit history from **both** partners
- [ ] Each partner submits their own forked repo link

---

## Grading Notes

- Correct application of the chosen design pattern carries significant weight
- Code should be clean, well-named, and follow OOP principles
- Both partners must show commit contributions — a repo with only one author's commits will be penalized
- The system should compile and run without errors

---

*The Ram's Brew thanks you for your service. ☕*
