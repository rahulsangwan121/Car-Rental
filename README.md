🚗 Building a Robust Vehicle Rental System in Java | Deep Dive into OOPs 🛵




Key Technical Highlights of the Project:
🔹 Abstraction: Used an abstract class Vehicle to define a strict contract for all vehicle types. It ensures that any new vehicle added must implement its own rent calculation logic. 
🔹 Encapsulation: Kept data secure using private modifiers and used constructor chaining (super()) to keep the code DRY (Don't Repeat Yourself). 
🔹 Inheritance: Extended the base class into Car and Bike to reuse common properties like plate numbers and availability status. 
🔹 Exception Handling: Implemented try-catch blocks to handle invalid user inputs and custom logical constraints (like preventing hourly rentals exceeding 24 hours).
