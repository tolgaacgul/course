fncName()
showTime();




// isim bilgisi alınır
function fncName(){
    let myName = prompt("Adını Gir");
    myName =  myName == ""  ? "Tolga Açgül" :  myName
    writeToDom("#myName",myName)
}
// İstenen Tam Saat Gun
function showTime(){
    let tarih = new Date();
    let saat = twoDigits(tarih.getHours())
    let dakika = twoDigits(tarih.getMinutes())
    let saniye = twoDigits(tarih.getSeconds())
    let dayName = fncGunName(tarih.getDay())

    // console.log("1." + dayName)
    // console.log("2." + tarih.getDay())

    let istenenSaat = `${saat}:${dakika}:${saniye} ${dayName}`;
    writeToDom("#myClock",istenenSaat);
    setInterval(showTime, 1000);

}// Doma bilgi yazdırmak için
function writeToDom(idOrClass, info){
    let dom = document.querySelector(`${idOrClass}`)
    dom.innerHTML = info;
}
// Gün için türkçe olarak isim belirler
function fncGunName(gunSayi){
    switch(gunSayi){
        case 1:
            return "Pazartesi"
            break;
        case 2:
            return "Salı"
            break;
        case 3:
            return "Çarşamba"
            break;
        case 4:
            return "Perşembe"
            break;
        case 5:
            return "Cuma"
            break;
        case 6:
            return "Cumartesi"
            break;
        case 0:
            return "Pazar"
            break;
        default:
            return "Gün Hatası"
    }
}
// çift hane
function twoDigits(a){
    let x = a.toString()
    if(x.length<2){
        return "0"+x;
    }else{
        return x
    }
}