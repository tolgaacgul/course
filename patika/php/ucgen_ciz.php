<?php
/*
Parametre olarak aldığı değer kadar SATIRI olan bir üçgen çizen bir FONKSIYON yazın. Fonksiyon içerisinde WHİLE ve FOR döngülerinin her ikisini de kullanın.

ucgen(15);
15 sayısı için örnek ekren çıktısı;
*/

function ucgen($satir){
    for($i = 1; $i<=$satir; $i++){
        $yildiz = 1;
        while($yildiz <= $i){
            echo "  0  ";
            $yildiz++;
        }
        echo "<br>";
    }
}

ucgen(15);