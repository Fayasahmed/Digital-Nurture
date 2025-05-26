function submitRegistration(data) {
    fetch("https://example.com/api/register", {
        method: "POST",
        headers: { "Content-Type": "application/json" },
        body: JSON.stringify(data)
    })
    .then(res => res.json())
    .then(result => alert("Success!"))
    .catch(() => alert("Failed!"));
}

setTimeout(() => {
    submitRegistration({ name: "Alice", event: "Art Show" });
}, 1000);