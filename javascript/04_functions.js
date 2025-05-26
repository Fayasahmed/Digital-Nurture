function addEvent(event) {
    console.log("Event added:", event.name);
}

function registerUser(user) {
    console.log(user.name + " registered!");
}

function filterEventsByCategory(events, category) {
    return events.filter(e => e.category === category);
}

function createCategoryCounter() {
    let count = 0;
    return function() {
        count++;
        return count;
    };
}

const categoryCount = createCategoryCounter();
console.log(categoryCount());