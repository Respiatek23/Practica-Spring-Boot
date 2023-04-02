// JavaScript source code
var requestOptions = {
    method: 'GET',
    redirect: 'follow'
};
const search =function(event) {
    
    fetch("/gato",requestOptions)

        .then(response=>response.json())
        .then(o => {
            console.log(o);
            const imagen = document.createElement('img');
            imagen.setAttribute('src', o[0].url);
            imagen.setAttribute('style', 'width:100%;height:98%;');
            imagen.setAttribute('id', 'photo');

            const active = document.getElementsByClassName('carousel-item active');

            for (let i = 1; i < active[0].childElementCount; i++) {

                if (active[0].childNodes[i].nodeName === 'IMG')
                {
                    const Oldimg = active[0].childNodes[i];
                    active[0].replaceChild(imagen,Oldimg);
                    return;
                }
            }
        }

        )
        .catch(error => console.log('error', error));
}
