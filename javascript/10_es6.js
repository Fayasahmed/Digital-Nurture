const defaultSeats = 20;

function createEvent(name, seats = defaultSeats) {
    return { name, seats };
}

const event = createEvent("Food Fest");
const { name, seats } = event;

const eventList = [event];
const newList = [...eventList];

console.log(name, seats);