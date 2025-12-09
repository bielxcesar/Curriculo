// Tabs
document.querySelectorAll('.tabs li').forEach(tab => {
  tab.addEventListener('click', () => {
    document.querySelectorAll('.tab-content').forEach(content => content.classList.remove('active'));
    document.getElementById(tab.dataset.tab).classList.add('active');
  });
});

// Carousel
let currentSlide = 0;
const slides = document.querySelectorAll('.carousel-slide');
const nextBtns = document.querySelectorAll('.nextBtn');
let slideInterval;

function showSlide(index) {
  slides.forEach((slide, i) => {
    slide.classList.remove('active');
    const bar = slide.querySelector('.progress-bar');
    bar.style.width = '0%'; // reset
    if (i === index) {
      slide.classList.add('active');
      // anima barra
      setTimeout(() => {
        bar.style.width = '100%';
      }, 50);
    }
  });
}

function nextSlide() {
  currentSlide = (currentSlide + 1) % slides.length;
  showSlide(currentSlide);
}

function startCarousel() {
  showSlide(currentSlide);
  slideInterval = setInterval(nextSlide, 10000);
}

nextBtns.forEach(btn => {
  btn.addEventListener('click', () => {
    clearInterval(slideInterval);
    nextSlide();
    startCarousel();
  });
});

startCarousel();

// Accordion
document.querySelectorAll(".accordion-toggle").forEach(btn => {
  btn.addEventListener("click", () => {
    btn.classList.toggle("active");
    btn.nextElementSibling.classList.toggle("open");
  });
});
