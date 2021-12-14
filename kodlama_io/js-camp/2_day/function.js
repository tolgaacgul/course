function addToCart(quanty ,productName = "MacBook"){
    console.log(quanty + " adet " + productName + " eklendi.");
}


addToCart(12 ,"elma")
addToCart()
addToCart(9)


// arrow Fonk

let sayHello = ()=>{
    console.log("Selam Co")
}
sayHello();


// burada atama yapılan fonk. 'na isim verilmesine gerek yoktur. orn: say()
let sayHello2 = function say() {
    console.log("Selam CO22222")
}
sayHello2();


//---------- parametreleri teker teker terine obje ile gonderebiliriz -----------

function sepet(productName,quantity,unitPrice) {
    console.log(productName + "'den " + quantity + " adet " + unitPrice + " tl'den.!")
}
sepet("Elma", 5, 10);
sepet("Armut", 10, 34.32);

// bu yukarıdaki kod sıkıntılı, hangi parametreye ne gelecek şaşırılabilir.

let product1 = {productName:"Macbook", quantity: 3, unitPrice: 10}; 
function sepet2(urun) {
    console.log(urun.productName + " sepete eklendi " + urun.quantity + " adet")
}
sepet2(product1)