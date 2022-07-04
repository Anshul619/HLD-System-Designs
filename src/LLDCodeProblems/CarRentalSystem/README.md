# Requirements
- The system will support the renting of different automobiles like cars, trucks, SUVs, vans, and motorcycles.
- Each vehicle should be added with a unique barcode and other details, including a parking stall number which helps to locate the vehicle.
- The system should be able to retrieve information like which member took a particular vehicle or what vehicles have been rented out by a specific member.
- The system should collect a late-fee for vehicles returned after the due date.
- Members should be able to search the vehicle inventory and reserve any available vehicle.
- The system should be able to send notifications whenever the reservation is approaching the pick-up date, as well as when the vehicle is nearing the due date or has not been returned within the due date.
- The system will be able to read barcodes from vehicles.
- Members should be able to cancel their reservations.
- The system should maintain a vehicle log to track all events related to the vehicles.
- Members can add rental insurance to their reservation.
- Members can rent additional equipment, like navigation, child seat, ski rack, etc.
- Members can add additional services to their reservation, such as roadside assistance, additional driver, wifi, etc.

# Actors
- Receptionist: Mainly responsible for adding and modifying vehicles and workers. Receptionists can also reserve vehicles.
- Member: All members can search the catalog, as well as reserve, pick-up, and return a vehicle.
- System: Mainly responsible for sending notifications about overdue vehicles, canceled reservation, etc.
- Worker: Mainly responsible for taking care of a returned vehicle and updating the vehicle log.

# Use Cases
- Add/Remove/Edit vehicle: To add, remove or modify a vehicle.
- Search catalog: To search for vehicles by type and availability.
- Register new account/Cancel membership: To add a new member or cancel an existing membership.
- Reserve vehicle: To reserve a vehicle.
- Check-out vehicle: To rent a vehicle.
- Return a vehicle: To return a vehicle which was checked-out to a member.
- Add equipment: To add an equipment to a reservation like navigation, child seat, etc.
- Update car log: To add or update a car log entry, such as refueling, cleaning, damage, etc.

# References
- https://www.educative.io/courses/grokking-the-object-oriented-design-interview/gxM3gRxmr8Z