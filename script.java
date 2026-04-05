function calculate() {

    let battery = document.getElementById("battery").value;
    let energy = document.getElementById("energy").value;
    let price = document.getElementById("price").value;
    let action = document.getElementById("action").value;

    battery = Number(battery);
    energy = Number(energy);
    price = Number(price);

    if (battery <= 0 || energy <= 0 || price <= 0) {
        document.getElementById("result").innerText = "⚠️ Please enter valid values";
        return;
    }

    let total = energy * price;

    if (action === "sell") {

        if (battery < 20) {
            document.getElementById("result").innerText =
                "⚠️ Low battery! You should not sell power.";
        } else {
            document.getElementById("result").innerText =
                "💰 You will earn ₹" + total;
        }

    } else {

        document.getElementById("result").innerText =
            "⚡ You need to pay ₹" + total;
    }
}
