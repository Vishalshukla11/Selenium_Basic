document.getElementById("submitForm").addEventListener("click", function (event) {
    event.preventDefault();
    alert("Form submitted successfully!");
});

document.getElementById("addToCart1").addEventListener("click", function () {
    const quantity = document.getElementById("quantity1").value;
    alert(`Added ${quantity} of Product 1 to the cart!`);
});

document.getElementById("addToCart2").addEventListener("click", function () {
    const quantity = document.getElementById("quantity2").value;
    alert(`Added ${quantity} of Product 2 to the cart!`);
});
