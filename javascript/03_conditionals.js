const events = [
    { name: "Music Fest", date: "2025-07-01", seats: 10 },
    { name: "Tech Expo", date: "2024-12-01", seats: 0 }
];

events.forEach(event => {
    const isUpcoming = new Date(event.date) > new Date();
    if (isUpcoming && event.seats > 0) {
        console.log("Upcoming Event:", event.name);
    }
});

try {
    // Simulate registration
    let available = false;
    if (!available) throw new Error("No seats left!");
} catch (e) {
    console.error("Registration failed:", e.message);
}