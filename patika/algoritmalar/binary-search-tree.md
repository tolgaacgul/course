# [7, 5, 1, 8, 3, 6, 0, 9, 4, 2] dizisinin Binary-Search-Tree aşamalarını yazınız.
## Örnek: root x'dir. root'un sağından y bulunur. Solunda z bulunur vb.

## Cevap

##### root 7 olarak belirledik
7 root
root'un solunda 5 - sağında 8
5'in solunda 1 - sağında 6
1'in solunda 0 - sağında 3
0'ın sağı solu boş
3'un solunda 2 - sağında 4
2 ve 4'un sağı solu boş (üst node'a geç)
6'nın sağı solu boş (üst node'a geç)
8'in solunda boş- sağında 9
9'un sağı solu boş (tree tamamlandı çizim bitti)

##### çizim
                        7

                5               8

        1           6               9 

    0       3

         2    4   



