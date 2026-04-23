const quotes = [
    "\"Debugging is like being the detective in a crime movie where you are also the murderer.\"",
    "\"Talk is cheap. Show me the code.\" - Linus Torvalds",
    "\"It's not a bug, it's an undocumented feature!\"",
    "\"First, solve the problem. Then, write the code.\" - John Johnson",
    "\"Biar lambat asal kelar, karena error syntax satu titik koma itu menyiksa.\""
];

const motivationBtn = document.getElementById('motivationBtn');
const quoteDisplay = document.getElementById('quoteDisplay');

motivationBtn.addEventListener('click', function() {
    const randomIndex = Math.floor(Math.random() * quotes.length);
    quoteDisplay.style.opacity = 0; 
    
    setTimeout(() => {
        quoteDisplay.textContent = quotes[randomIndex];
        quoteDisplay.style.opacity = 1;
        quoteDisplay.style.transition = "opacity 0.5s";
    }, 200);
});