 
var xhr;

if (XMLHttpRequest)
	xhr = new XMLHttpRequest();
else
	xhr = new ActiveXObject("Microsoft.XMLHTTP");

xhr.onload = function () {

    if (xhr.status === 200) {
        document.getElementById( 'logintest' ).innerHTML = xhr.responseText; 
    }
};

xhr.open('GET', 'indextest/login' , true );
xhr.send(null); 


 

 

