Asked in Titan.email on 4-June-2022

Design a booking Platform where a user wishes to book a move from a theater in a given city
City → Theater → (Date, Show) → Seats

Scopes
- View movies (screens) for a given date
- Lock Set<Seat> seats for x minutes
- Proceed with the booking

Different classes
- Seat
    - Boolean IsAvailable => 1
    - SeatNumber
    - Price
- Show
    - Date
    - List<Seats>
        - Example
            - 23-10-2022
            - S1,S2, S3 etc. are the seats
- Theater
    - List<Shows>
- City
    - List<Theaters>
- ShowsData
    - List<Seats> seats = new Seats() -> S1, S2
    - List<Shows> SH1, SH2 = new Show(date, seats);
- BookShow class
    - availableSeats(date, show) {
            - ShowsData return the seats
            - }
    - viewMovie (date) {
        - Return the list of shows;
        - List of shows on that date
        - }

    - bookMovie(date, show) {
        - synchrnoized SeatObject
            - //Payment - Mock code
            - sleep(3)
            - Seat => 0
        - exit

Other questions
- User1 - S1, S2, S3
      - 3 Semaphors
      -
- User2 - S3, S4
    - S3 is on the conflict
    - We can wait for 5 mins
        - S3 is 

# References
- https://akshay-iyangar.github.io/system-design/grokking-ood/examples/java/movie-ticket-booking-system.html