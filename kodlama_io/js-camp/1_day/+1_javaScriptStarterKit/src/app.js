
console.log("Merhaba kodlama.io")

// let keywordu c,c++,java dilleri gibi çalışır
let dolarBugun = 9
let dolarDun= 8
{
    let dolarDun = 7
}
console.log("Dolar Dün: " + dolarDun)

//Var ile let farkını console sonuçlarından bakabilirisin
var dolarB = 9
var dolarD= 8
{
    var dolarD = 7
}
console.log("Dolar Dün: " + dolarD)

// Constant veri yapısı 
{
    const dolar = 11;
}
var dolar = 12;
console.log("dolar: " + dolar)

//Diziler

let konutKredileri = ["Yurt Kredisi", "Emlak Kredisi", "Nefes Kredisi", "Bisiklet Kredisi"]
console.log(konutKredileri)

console.log("<ul>");
for (let i = 0; i < konutKredileri.length; i++) {  
    console.log("<li>" + konutKredileri[i] + "</li>")  
}
console.log("</ul>") 