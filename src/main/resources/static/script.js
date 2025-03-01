// Get elements
const loginForm = document.getElementById("loginForm");
const registerForm = document.getElementById("registerForm");
const showRegisterFormLink = document.getElementById("showRegisterForm");
const showLoginFormLink = document.getElementById("showLoginForm");

// Event listener to show the register form and hide the login form
showRegisterFormLink.addEventListener("click", function(event) {
  event.preventDefault(); // Prevent default link action
  loginForm.style.display = "none"; // Hide login form
  registerForm.style.display = "block"; // Show register form
});

// Event listener to show the login form and hide the register form
showLoginFormLink.addEventListener("click", function(event) {
  event.preventDefault(); // Prevent default link action
  registerForm.style.display = "none"; // Hide register form
  loginForm.style.display = "block"; // Show login form
});

// Initial state: login form visible, register form hidden
registerForm.style.display = "none";