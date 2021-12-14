//var saf javascript keywordudur
//var,let,const
//js dosya bazlı (filebase) bir dildir yani yukarıdan aşağı taranır

//bu kod tip güvenli değil
//birden fazla aynı isimli tanımlamaya izin veriir
var sayi1 = 10
var sayi1 = "tolga "
console.log(sayi1)

//birden fazla aynı isimli tanımlamaya izin vermezzzz
//tip güvenli değildir...

let sayi2 = 10
//let sayi2 = "tolga "
sayi2 =  "sayi2"
console.log(sayi2)

let student = {id:1, name:"Tolga"};
console.log(student)

function save(ogr, puan = 55) {
    console.log(ogr.name + ": " + puan)
}
save(student, 33)


//default parametre sona gelir. gelmezse de bu şekil yapılabilir.
function save2(puan = 55, ogr) {
    console.log(ogr.name + ": " + puan)
}
save2(undefined, student)


//arraylat
let studends = ["tolga","gokhan","ersam"]
console.log(studends)

let studends2 = [student,{id:4,name:"gıdımanlı"}, "ankata", {city:"ankara"}]
console.log(studends2)

