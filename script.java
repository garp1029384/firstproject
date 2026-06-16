// Counter Animation

const counters = document.querySelectorAll(".counter");

counters.forEach(counter => {

    const updateCounter = () => {

        const target = +counter.getAttribute("data-target");

        const count = +counter.innerText;

        const increment = target / 100;

        if (count < target) {

            counter.innerText = Math.ceil(count + increment);

            setTimeout(updateCounter, 20);

        } else {

            counter.innerText = target;

        }

    };

    updateCounter();

});


// Scroll Reveal Animation

window.addEventListener("scroll", reveal);

function reveal(){

    const reveals = document.querySelectorAll(".reveal");

    for(let i = 0; i < reveals.length; i++){

        const windowHeight = window.innerHeight;

        const elementTop = reveals[i].getBoundingClientRect().top;

        const revealPoint = 100;

        if(elementTop < windowHeight - revealPoint){

            reveals[i].classList.add("active");

        }

    }

}

reveal();


// Navbar Background Change

window.addEventListener("scroll", () => {

    const navbar = document.querySelector(".navbar");

    if(window.scrollY > 50){

        navbar.style.background = "rgba(0,0,0,0.8)";

    }

    else{

        navbar.style.background = "rgba(0,0,0,0.3)";

    }

});
