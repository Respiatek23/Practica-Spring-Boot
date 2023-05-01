
var requestOptions = {
    method: 'GET',
    redirect: 'follow'
};
const search =function(event) {

    fetch("/Users",requestOptions)

        .then(response=>response.json())
        .then(o => {
            console.log(o);

        }

        )
        .catch(error => console.log('error', error));
}
