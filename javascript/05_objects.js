function Event(name, seats) {
    this.name = name;
    this.seats = seats;
}

Event.prototype.checkAvailability = function() {
    return this.seats > 0;
};

const e1 = new Event("Yoga Retreat", 5);
console.log(Object.entries(e1));
console.log(e1.checkAvailability());