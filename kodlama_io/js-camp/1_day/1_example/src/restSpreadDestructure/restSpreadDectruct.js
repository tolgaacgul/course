
//////// REST operatoru - rest(geriye kalanlar)
// [...product] aslında bir arraydir. bu "...product" prametresine ne gonderirsek array içine atar  

// rest
// params
// varArgs 

console.log("----REST - birletirir(diziye donusturur)------")

// veriyi dizi haline getirir. Geriye kalanlar demek
let showProducts = function (id,...products) {
    console.log("id: " + id)
    console.log("ürün: " +  products[2])
    console.log(products)
}
console.log("ShowProducts TYPE: " + typeof showProducts)
showProducts(23,"elma","armut","patlıcan")



console.log("--- SPREAD BÖLÜMÜNE AYRILMIŞTIR ----")
// SPREAD - Ayrıştırılmıs -- Elimizdeki veriyi ayrıştırıyoruz
let points = [1,2,3,1,13,2]
console.log(...points)          // array ı bu şekilde birbirinden ayırdık
console.log(Math.max(points));
console.log(Math.max()) //infinity Boş olduğu için
console.log(Math.max(...points))

console.log(..."ABC", "D",..."EFG", "T")



console.log("------ Destructuring ------")  //seklini bozma
//elimizdeki arrayları değişkenlere atama yöntemini barındırır
let populations = [100,200,300,[400,500]];
let [small,medium,hight,[veryHight, maximum]] = populations;
console.log(small)
console.log(medium)
console.log(hight)
console.log(veryHight);
console.log(maximum);

// Spreadı fonksiyon üzerinde deneyelim
console.log("------Spread Fonk Denemsi------")

let veri = ["ornek1","ornek2","ornek3"]
someFunction(veri,4)
function someFunction ([v1,v2,v3],number){
    console.log(v1,v2,v3,number) 
}

console.log("------Spread obje Denemsi------")

let category = {id:1, name:"Bilgisaya r"}
console.log(category.id)
console.log(category["name"])


console.log("-----objeleri destructuring etmek -----")
let {id,name} = category
console.log(id);
console.log(name)