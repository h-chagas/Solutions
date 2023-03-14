const colours = ['red', 'green', 'blue', 'orange', 'lime','olive', 'black', 'yellow'];


const buildP = function(placeholder, num) {
    let i = 0;

    do {
        const p = document.createElement('p');
        const text = document.createTextNode('Hi, my name is Hugo');
        p.style.color = colours[parseInt(Math.random() * colours.length)];
        p.appendChild(text);
        placeholder.appendChild(p);
        i++;
    } while (i < num);

}

buildP(document.querySelector('#placeholder'), 5);