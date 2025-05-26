const eventName = "Local Art Fair";
const eventDate = "2025-06-15";
let seats = 50;

console.log(`${eventName} is scheduled for ${eventDate}. Seats available: ${seats}`);

function register() {
    if (seats > 0) {
        seats--;
        console.log("Registered! Seats left: " + seats);
    }
}