const events = [];
events.push({ name: "Dance Night", category: "Music" });

const musicEvents = events.filter(e => e.category === "Music");

const eventCards = events.map(e => `Event: ${e.name}`);
console.log(eventCards);