// Get elements
const loginForm = document.getElementById("loginForm");
const registerForm = document.getElementById("registerForm");
const signInBanner = document.getElementById("sign-in-banner");
const loginToggle = document.getElementById("loginToggle");

// Initial toggle content
window.onload = () => {
  loginToggle.innerHTML = `<p class="message">Not registered? <a href="#" id="showRegisterForm">Create an account</a></p>`;
};

// Event delegation for toggling forms
loginToggle.addEventListener("click", function(event) {
  event.preventDefault(); // Prevent default link action

  if (event.target.id === "showRegisterForm") {
    // Show Register Form, Hide Login Form
    loginToggle.innerHTML = `<p class="message">Already registered? <a href="#" id="showLoginForm">Sign In</a></p>`;
    signInBanner.innerText = "Welcome To StimpTech!";
    loginForm.style.display = "none"; 
    registerForm.style.display = "block"; 
  } else if (event.target.id === "showLoginForm") {
    // Show Login Form, Hide Register Form
    loginToggle.innerHTML = `<p class="message">Not registered? <a href="#" id="showRegisterForm">Create an account</a></p>`;
    signInBanner.innerText = "Sign In To Your Account";
    registerForm.style.display = "none";
    loginForm.style.display = "block";
  }
});

// Initial state: login form visible, register form hidden
registerForm.style.display = "none";
