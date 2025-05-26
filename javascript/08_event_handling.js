document.getElementById("registerBtn").onclick = function() {
    alert("User Registered!");
};

document.getElementById("categoryFilter").onchange = function(e) {
    console.log("Selected category:", e.target.value);
};

document.getElementById("searchInput").onkeydown = function(e) {
    console.log("Key pressed:", e.key);
};