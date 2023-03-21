// Add code here for part 5-7

//This is a re-usable event function. I can use in any element I want
const mouseOver = (e) => {
    e.target.style.backgroundColor = 'limegreen';
    if (e.target.textContent.indexOf('background') === -1) {
        e.target.textContent += ", I have had my background changed on mouse over";
    } else {
        e.target.textContent = e.target.textContent.replace("out", "over");
    }
}

//This is a re-usable event function. I can use in any element I want
const mouseOut = (e) => {
    e.target.style.backgroundColor = 'yellow';
    if (e.target.textContent.indexOf('background') === -1) {
        e.target.textContent += ", I have had my background changed on mouse out";
    } else {
        e.target.textContent = e.target.textContent.replace("over", "out");
    }
}


// Do nt change the code between here and the next comment
const blueParagraph = document.querySelector("#blueText");

function blueToRed() {
    blueParagraph.style.color = "red";
    blueParagraph.textContent = blueParagraph.textContent.replace("blue", "red");
};

const greenParagraphs = document.querySelectorAll(".greenBg");

function greenToPink() {
    for(let greenParagraph of greenParagraphs) {
        greenParagraph.className = 'hotpinkBg';
        greenParagraph.textContent = greenParagraph.textContent.replace("green", "hotpink");
    }
}

const tnrParagraph = document.querySelector("#tnrParagraph");

function tnrToArial() {
    tnrParagraph.style.fontFamily = "arial";
    tnrParagraph.textContent = tnrParagraph.textContent.replace("Times New Roman", "Arial");
}

// Add the event handlers for mouse over, mouse out and click on tnrParagraph here and register them


textColour.addEventListener("click", blueToRed);

bgColour.addEventListener("click", greenToPink);

fonts.addEventListener("click", tnrToArial);

tnrParagraph.addEventListener("mouseover", mouseOver);
tnrParagraph.addEventListener("mouseout", mouseOut);

// const fonts = document.querySelector("#fonts");

const elementClick = (e) => {
    e.target.style.backgroundColor = "white";
    e.target.textContent = "I have no event listeners attached to me now";
    fonts.removeEventListener("click", tnrToArial);
    tnrParagraph.removeEventListener("mouseover", mouseOver);
    tnrParagraph.removeEventListener("mouseout", mouseOut);

    if (e.target.)

}


