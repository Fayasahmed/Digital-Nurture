// Using then/catch
fetch("events.json")
  .then(res => res.json())
  .then(data => console.log(data))
  .catch(err => console.error(err));

// Async/await
async function loadEvents() {
    document.getElementById("spinner").style.display = "block";
    try {
        const res = await fetch("events.json");
        const data = await res.json();
        console.log(data);
    } catch (e) {
        console.error(e);
    } finally {
        document.getElementById("spinner").style.display = "none";
    }
}